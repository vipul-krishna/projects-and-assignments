/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neu.controller;


import com.neu.beans.Books;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.sql.DataSource;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.ResultSetHandler;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

/**
 *
 * @author Lenovo
 */
public class AdditionSuccessController extends AbstractController {
    
    public AdditionSuccessController() {
    }
    
    protected ModelAndView handleRequestInternal(
            HttpServletRequest request,
            HttpServletResponse response) throws Exception {
        //throw new UnsupportedOperationException("Not yet implemented");
        int result=0;
        DataSource ds  = (DataSource)this.getApplicationContext().getBean("myDataSource");
        ModelAndView mv = new ModelAndView();
        HttpSession session = request.getSession();
        int count  = (Integer)(session.getAttribute("count"));

        try{
            
            QueryRunner run = new QueryRunner(ds);
            ResultSetHandler<Books> books = new BeanHandler<Books>(Books.class);
        
            for(int i = 1 ; i<=count ; i++){
            
                String isbnField = "isbn"+i;
                String titleField="title"+i;
                String authorField="author"+i;
                String priceField="price"+i;
          
                String isbn = request.getParameter(isbnField).replaceAll("<|>|@|;|,|=|}|$|&", "");
                String title = request.getParameter(titleField).replaceAll("<|>|@|;|,|=|}|$|&", "");
                String author = request.getParameter(authorField).replaceAll("<|>|@|;|,|=|}|$|&", "");
                float price = Float.parseFloat(request.getParameter(priceField).replaceAll("<|>|@|;|,|=|}|$|&", ""));
                
                
                    Object[] params = new Object[4];
                    params[0] = isbn;
                    params[1] = title;
                    params[2] = author;
                    params[3] = price;
                    
                    result = run.update("Insert into books(isbn,title,authors,price) values(?,?,?,?)",params);
                    
                    
                
            }
        }catch(Exception ex){
                    System.out.println("Details Not Added In DB!! " + ex.getMessage());
        }
        if(result>0){
            mv.setViewName("success");
        }else{
            mv.setViewName("error");
        }
        return mv;
    }
    
}

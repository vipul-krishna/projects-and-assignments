/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neu.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.sql.DataSource;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

/**
 *
 * @author Lenovo
 */
public class AdditionDetailsController extends AbstractController {
    
    public AdditionDetailsController() {
    }
    
    protected ModelAndView handleRequestInternal(
            HttpServletRequest request,
            HttpServletResponse response) throws Exception {
       //throw new UnsupportedOperationException("Not yet implemented");
        
       
       DataSource ds = (DataSource) this.getApplicationContext().getBean("myDataSource");
        int count = Integer.parseInt(request.getParameter("count"));
        ModelAndView mv = new ModelAndView();
        HttpSession session = request.getSession();
        session.setAttribute("count", count);
        mv.setViewName("addbooks");
        return mv;
        
        
    }
    
}

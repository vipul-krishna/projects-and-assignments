package com.yusuf.spring.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


import com.yusuf.spring.pojo.Books;


@Controller
public class BooksController extends MyController {
	
	
	@RequestMapping(value = "/error.htm", method = RequestMethod.POST)
	public String showErrorPage() {
		return "add-error";
		//return "advert-form";
	}
	
	
	// add advert. This is like SimpleFormController
	@RequestMapping(value = "/booksform.htm", method = RequestMethod.GET)
	public ModelAndView showFormPage(HttpServletRequest request) {
		
		int count = Integer.parseInt(request.getParameter("count"));
		//return "books-form";
		return new ModelAndView("books-form", "count", count);
	}

	@RequestMapping(value = "/addbooks.htm", method = RequestMethod.POST)
	public ModelAndView showSuccesPage(HttpServletRequest request) {
		
		
		int count = Integer.parseInt(request.getParameter("count"));
		System.out.println("Count is: "+count);
		
		Session hibernateSession = getSession();
		//hibernateSession.beginTransaction();
		
		for(int i = 1; i<=count; i++){
			
		  try{
				  	String isbnField = "isbn"+i;
		            String titleField="title"+i;
		            String authorField="author"+i;
		            String priceField="price"+i;
		             
		            String isbn = request.getParameter(isbnField);
		            String title = request.getParameter(titleField);
		            String author = request.getParameter(authorField);
		            float price = Float.parseFloat(request.getParameter(priceField));
		            if(price<=0){
		            	return new ModelAndView("add-error");
		            }
		            Books book  = new Books(isbn, title, author, price); 
					
				try{
						
					hibernateSession.beginTransaction();
					hibernateSession.save(book);
					hibernateSession.getTransaction().commit();
					System.out.println("Book of row: "+i+" TITLE is: " +book.getTitle());
					
						
				  }
				catch(HibernateException e){
					System.out.println("Hibernate Exception occured: "+e);
					hibernateSession.getTransaction().rollback();
					return new ModelAndView("add-error");
					
				}
			}catch(NumberFormatException e){
				
				System.out.println("Book of row which caused issue: "+i+ " Exception is: "+e);
				return new ModelAndView("add-error");
			}
		}	
		System.out.println("No of books to be added: " +count);
		hibernateSession.close();
		return new ModelAndView("books-success", "count", count);
		
	}

	
	
	//*********************************************************************************
	
}













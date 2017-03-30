package com.yusuf.spring.controller;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class DataFilter implements Filter{

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		int count = Integer.parseInt(request.getParameter("count"));
		int check = 0;
		//String pattern= "^[a-zA-Z0-9]*$";
		String pattern = "(?=.*[^ ])[a-zA-Z0-9 ]+" ;
		for(int i = 1; i<=count; i++){
			
		
					  	String isbnField = "isbn"+i;
			            String titleField="title"+i;
			            String authorField="author"+i;
			            //String priceField="price"+i;
			             
			            String isbn = request.getParameter(isbnField);
			            System.out.println("Checking Regex: "+isbn.matches(pattern));
			            String title = request.getParameter(titleField);
			            String author = request.getParameter(authorField);
			            //float price = Float.parseFloat(request.getParameter(priceField));
			            if(!isbn.matches(pattern) || !title.matches(pattern) ||!author.matches(pattern)){
			    			check = 1;
			    			break;
			    		}
			            
		}
		
		if(check==1){
			RequestDispatcher rd = request.getRequestDispatcher("error.htm");
			rd.forward(request, response);
		}
		else{
			chain.doFilter(request, response);
		}
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		
		
	}

}

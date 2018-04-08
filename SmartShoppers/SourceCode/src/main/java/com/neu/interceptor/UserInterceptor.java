package com.neu.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.ModelAndViewDefiningException;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.neu.pojo.Product;
import com.neu.pojo.Vendor;

public class UserInterceptor extends HandlerInterceptorAdapter{

	String errorPage="login";

    public String getErrorPage() {
        return errorPage;
    }

    public void setErrorPage(String errorPage) {
        this.errorPage = errorPage;
    }
    
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {

        HttpSession session = (HttpSession) request.getSession();
        
        if(session.getAttribute("vendor") != null || session.getAttribute("customer") != null){
            System.out.println("in interceptor");
            return true;
        }
        if(session.getAttribute("vendor") == null && session.getAttribute("customer") == null){
        System.out.println("no user");
        ModelAndView mav = new ModelAndView("redirect: /edu");
       
        throw new ModelAndViewDefiningException(mav);
        }
        //response.sendRedirect(errorPage);
        return false;
        
        
        
        
    }
	
}

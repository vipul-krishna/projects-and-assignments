
package com.neu.servlet;

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;


public class AuthenticationFilter implements Filter {
    
    private static final boolean debug = true;

    private FilterConfig filterConfig = null;
    
    public AuthenticationFilter() {
    }    
    

   public void init(FilterConfig filterConfig) {        
//        this.filterConfig = filterConfig;
//        if (filterConfig != null) {
//            if (debug) {                
//                log("AuthenticationFilter:Initializing filter");
//            }
//        }
    }
 
    public void doFilter(ServletRequest request, ServletResponse response,
            FilterChain chain)
            throws IOException, ServletException {
        
        if(request.getParameter("title").equals("")||request.getParameter("actor").equals("")||
                    request.getParameter("actress").equals("")||request.getParameter("genre").equals("")||
                    request.getParameter("year").equals("")){
                    
                
                RequestDispatcher rd = request.getRequestDispatcher("AddError.jsp");
                rd.forward(request, response);
        }   
        else{
            
            chain.doFilter(request, response);
        }
        
  
    }




    public void destroy() {        
    }

}

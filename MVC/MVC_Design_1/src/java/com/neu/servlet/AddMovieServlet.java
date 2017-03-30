/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neu.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Lenovo
 */
public class AddMovieServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        

            response.setContentType("text/html;charset=UTF-8");
            
            
//            if(request.getParameter("title").equals("")||request.getParameter("actor").equals("")||
//                    request.getParameter("actress").equals("")||request.getParameter("genre").equals("")||
//                    request.getParameter("year").equals("")){
//                    
//                
//                RequestDispatcher rd = request.getRequestDispatcher("AddError.jsp");
//                rd.forward(request, response);
//                return;
//                
//                
//            }
            
            //("<|>|@|;|,|=", "")
            String title  = request.getParameter("title").replaceAll("<|>|@|;|,|=|}|$", "");
            String actor = request.getParameter("actor").replaceAll("<|>|@|;|,|=|}|$", "");
            String actress = request.getParameter("actress").replaceAll("<|>|@|;|,|=|}|$", "");
            String genre = request.getParameter("genre").replaceAll("<|>|@|;|,|=|}|$", "");
            int year = Integer.parseInt(request.getParameter("year").replaceAll("<|>|@|;|,|=|}|$", ""));
            
            //("<|>|@|;|,|=", "")
        
//        System.out.println(title);
//        System.out.println(actor);
//        System.out.println(actress);
//        System.out.println(genre);
//        System.out.println(year);
        
        
        
        try (PrintWriter out = response.getWriter()) {
            

            try {
                //Do the Database code here
   
                Class.forName("com.mysql.jdbc.Driver");
                Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/moviedb", "root", "user");
                
                String queryLogin = "INSERT INTO movies (title,actor,actress,genre,year) VALUES ('" + title + "','" + actor + "','" + actress + "','" + genre + "','" + year + "')";

                Statement statement = connection.createStatement();
                int result = statement.executeUpdate(queryLogin);
                
                
                
                if (result > 0) {
                    RequestDispatcher rd = request.getRequestDispatcher("AddSuccess.jsp");
                    rd.forward(request, response);
                    //response.sendRedirect("AddSuccess.jsp");
                }
                
                
            } catch (ClassNotFoundException ex) {
                System.out.println("ClassNotFoundException! " + ex.getMessage());
            } catch (SQLException ex) {
                System.out.println("SQL Connection Exception! " + ex.getMessage());
            }
            
            
            //response.sendRedirect("AddSuccess.jsp");
            
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

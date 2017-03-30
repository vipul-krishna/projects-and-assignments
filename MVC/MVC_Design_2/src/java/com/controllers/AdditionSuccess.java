
package com.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AdditionSuccess extends HttpServlet {


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            HttpSession session  =  request.getSession();
            int count  = (Integer)session.getAttribute("count");
            
            for(int i = 1; i<= count ; i++){
                
                String isbnField = "isbn"+i;
                String titleField="title"+i;
                String authorField="author"+i;
                String priceField="price"+i;
                
                System.out.println(isbnField);
                
                String isbn = request.getParameter(isbnField).replaceAll("<|>|@|;|,|=|}|$|&", "");
                String title = request.getParameter(titleField).replaceAll("<|>|@|;|,|=|}|$|&", "");
                String author = request.getParameter(authorField).replaceAll("<|>|@|;|,|=|}|$|&", "");
                float price = Float.parseFloat(request.getParameter(priceField).replaceAll("<|>|@|;|,|=|}|$|&", ""));

                try {
                    
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/booksdb", "root", "user");
                    
                    //String queryLogin = "INSERT INTO books (isbn,title,authors,price) VALUES ('" + isbn + "','" + title + "','" + author + "','" + price + "')";

                    //Statement statement = connection.createStatement();
                    //int result = statement.executeUpdate(queryLogin);
                    
                    
                    //String query = "INSERT INTO books (isbn,title,authors,price) VALUES ('?','?','?','?')";
                    
                    String query = "INSERT INTO books"
                            + "(isbn, title, authors, price) VALUES"
                            + "(?,?,?,?)";
                    PreparedStatement preparedStatement;
                    preparedStatement = connection.prepareStatement(query);
                    
                    preparedStatement.setString(1, isbn);
                    preparedStatement.setString(2, title);
                    preparedStatement.setString(3, author);
                    preparedStatement.setFloat(4, price);
                    
                    int result = preparedStatement.executeUpdate();
                    
                    
                    /*
                        String insertTableSQL = "INSERT INTO DBUSER"
                            + "(USER_ID, USERNAME, CREATED_BY, CREATED_DATE) VALUES"
                            + "(?,?,?,?)";
                        PreparedStatement preparedStatement = dbConnection.prepareStatement(insertTableSQL);
                        preparedStatement.setInt(1, 11);
                        preparedStatement.setString(2, "mkyong");
                        preparedStatement.setString(3, "system");
                        preparedStatement.setTimestamp(4, getCurrentTimeStamp());
                        // execute insert SQL stetement
                        preparedStatement .executeUpdate();
                    
                    ---------------------------------------------------------------------
                    if (connection != null) {
                   
                    String query = "select * from userstable where UserName=? and UserPassword=?";
                    PreparedStatement pst;
                    pst = connection.prepareStatement(query);
                    pst.setString(1, user);
                    pst.setString(2, password);
                    System.out.println("Prepared Statement query:" + pst);
                    ResultSet rs = pst.executeQuery();
                    
                    */
                    
                    
                    
                    if (result > 0) {
                    RequestDispatcher rd = request.getRequestDispatcher("Success.jsp");
                    rd.forward(request, response);
                    }
     
                } catch (ClassNotFoundException ex) {
                System.out.println("ClassNotFoundException" + ex.getMessage());
                } catch (SQLException ex) {
                System.out.println("SQLException" + ex.getMessage());
                }
                
                
            }
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

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

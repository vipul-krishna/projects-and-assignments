/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neu.servlet;

import bean.Movie;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class SearchMovieServlet extends HttpServlet {

//Global object belongs to every users.
//Be careful, do not put anything here that you don't want to share.
//Later this will come from the database.

    
    
    
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
          
            String searchWord = request.getParameter("searchWord").replaceAll("<|>|@|;|,|=|}|$", "");
            String searchType = request.getParameter("searchType");
            
            HttpSession session = request.getSession();
            
            session.setAttribute("searchWord", searchWord);
            session.setAttribute("searchType", searchType);
            
            //searchWord = searchWord.replaceAll("[^\\dA-Za-z ]", "").replaceAll("\\s+", "+").trim();
            
            
            try {
                
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/moviedb", "root", "user"); 
            String queryLogin = "select * from movies";
            Statement statement = connection.createStatement();
            
            ResultSet resultSet = statement.executeQuery(queryLogin);
            ArrayList<Movie> movieList = new ArrayList<>();
            
            while (resultSet.next()) {
                
                    if(searchType.equals("title")){
                        String movieName = resultSet.getString("title");
                        
                        if(movieName.contains(searchWord)){
                            Movie movie = new Movie();
                            movie.setName(resultSet.getString("title"));
                            movie.setActor(resultSet.getString("actor"));
                            movie.setActress(resultSet.getString("actress"));
                            movie.setGenre(resultSet.getString("genre"));
                            movie.setYear(resultSet.getString("year"));
                            movieList.add(movie);
                            
                        }
                        
                     }
                    
                    
                    else if(searchType.equals("actor")){
                        String actorName = resultSet.getString("actor");
                        
                        if(actorName.contains(searchWord)){
                            Movie movie = new Movie();
                            movie.setName(resultSet.getString("title"));
                            movie.setActor(resultSet.getString("actor"));
                            movie.setActress(resultSet.getString("actress"));
                            movie.setGenre(resultSet.getString("genre"));
                            movie.setYear(resultSet.getString("year"));
                            movieList.add(movie);
                            
                        }
                        
                     }
                    
                    else{
                        String actressName = resultSet.getString("actress");
                        
                        if(actressName.contains(searchWord)){
                            Movie movie = new Movie();
                            movie.setName(resultSet.getString("title"));
                            movie.setActor(resultSet.getString("actor"));
                            movie.setActress(resultSet.getString("actress"));
                            movie.setGenre(resultSet.getString("genre"));
                            movie.setYear(resultSet.getString("year"));
                            movieList.add(movie);
                            
                        }
                        
                     }
                    
            }
            
            session.setAttribute("searchResult", movieList);
            RequestDispatcher rd = request.getRequestDispatcher("SearchResult.jsp");
            rd.forward(request, response);

            
            
            } catch (ClassNotFoundException ex) {
                System.out.println("ClassNotFoundException! " + ex.getMessage());
            } catch (SQLException ex) {
                System.out.println("SQL Connection Exception! " + ex.getMessage());
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

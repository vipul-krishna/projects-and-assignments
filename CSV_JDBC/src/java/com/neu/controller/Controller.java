/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neu.controller;

import com.neu.beans.SalesOrder;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
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
public class Controller extends AbstractController {

    public Controller() {
    }

    protected ModelAndView handleRequestInternal(
            HttpServletRequest request,
            HttpServletResponse response) throws Exception {
        //throw new UnsupportedOperationException("Not yet implemented");

        //DataSource ds = (DataSource) this.getApplicationContext().getBean("myDataSource");//from applicationContext.xml
        
        List<SalesOrder> orderList = new ArrayList<SalesOrder>();
        String action = request.getParameter("action");//hidden field in index.jsp
        
        
        ModelAndView mv = new ModelAndView();
        //System.out.println(action);
        
        HttpSession session = request.getSession();

        if (action == null) {
            mv.setViewName("index");
            
            
        } 
        
        else if (action.equals("stepone")) {

            //------------CSV JDBC BELOW----------------//
            
            String CSVDirectory = "E://Study_MS//Semester_2//STUDY_WEBTOOLS//Lecture4//Assignment4//";

            //CSV JDBC CODE GOES HERE
            //Fetching details from csv
            try {
                Class.forName("org.relique.jdbc.csv.CsvDriver");
                Connection conn = DriverManager.getConnection("jdbc:relique:csv:" + CSVDirectory);
                Statement stmt = conn.createStatement();
                
                String fileName = request.getParameter("filename").replaceAll("<|>|@|;|,|=|}|$|&", "");
                ResultSet results = stmt.executeQuery("SELECT * from "+fileName+" LIMIT 100");
//                while (results.next()) {
//                    System.out.println("Name= " + results.getString("Name") + "   Id= " + results.getString("Id"));
//                }
                

                while(results.next()){
                    
                    SalesOrder order = new SalesOrder();
                    order.setSalesOrderID(results.getString("SalesOrderID"));
                    order.setRevisionNumber(results.getString("RevisionNumber"));
                    order.setOrderDate(results.getString("OrderDate"));
                    order.setDueDate(results.getString("DueDate"));
                    order.setShipDate(results.getString("ShipDate"));
                    order.setStatus(results.getString("Status"));
                    order.setOnlineOrderFlag(results.getString("OnlineOrderFlag"));
                    order.setSalesOrderNumber(results.getString("SalesOrderNumber"));
                    order.setPurchaseOrderNumber(results.getString("PurchaseOrderNumber"));
                    order.setAccountNumber(results.getString("AccountNumber"));
                    order.setCustomerID(results.getString("CustomerID"));
                    order.setSalesPersonID(results.getString("SalesPersonID"));
                    order.setTerritoryID(results.getString("TerritoryID"));
                    order.setBillToAddressID(results.getString("BillToAddressID"));
                    order.setShipToAddressID(results.getString("ShipToAddressID"));
                    order.setShipMethodID(results.getString("ShipMethodID"));
                    order.setCreditCardID(results.getString("CreditCardID"));
                    order.setCreditCardApprovalCode(results.getString("CreditCardApprovalCode"));
                    order.setCurrencyRateID(results.getString("CurrencyRateID"));
                    order.setSubTotal(results.getString("SubTotal"));
                    order.setTaxAmt(results.getString("TaxAmt"));
                    order.setFreight(results.getString("Freight"));
                    order.setTotalDue(results.getString("TotalDue"));
                    order.setComment(results.getString("Comment"));
                    order.setModifiedDate(results.getString("ModifiedDate"));
                    
                    orderList.add(order);
                }
                int size=orderList.size();
                //System.out.println("Size is "+size);
                session.setAttribute("rows", size);
                session.setAttribute("orderList", orderList);


                conn.close();

            } catch (Exception e) {
                System.out.println("Exception :" + e.getMessage());
                mv.addObject("error", "true");
                    mv.setViewName("index");
                    return mv;
            }

            request.setAttribute("action", "stepone");
            mv.setViewName("index");
            
        } 
        
        else if (action.equals("steptwo")) {

           // Batch queries go here
           
           int rows = (Integer)session.getAttribute("rows");
           
//           int salesOrderId = Integer.parseInt(request.getParameter("orderId").replaceAll("<|>|@|;|,|=|}|$|&", ""));
//           int revisionNumber = Integer.parseInt(request.getParameter("revisionNumber").replaceAll("<|>|@|;|,|=|}|$|&", ""));
//           String orderDate = request.getParameter("orderDate").replaceAll("<|>|@|;|,|=|}|$|&", "");
//           String dueDate = request.getParameter("dueDate").replaceAll("<|>|@|;|,|=|}|$|&", "");
//           String shipDate = request.getParameter("shipDate").replaceAll("<|>|@|;|,|=|}|$|&", "");
           
           try {
                    
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/orderdetails", "root", "user");

                    String query = "INSERT INTO orders VALUES"+"(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                    PreparedStatement preparedStatement;
                    preparedStatement = connection.prepareStatement(query);
                    
                    connection.setAutoCommit(false);
                    for(int i = 1; i<=rows; i++){
                        
                       String orderIdField = "orderID"+i;
                       String revisionField = "revisionNumber"+i;
                       String orderDateField = "orderDate"+i;
                       String dueDateField = "dueDate"+i;
                       String shipDateField = "shipDate"+i;
                       String statusField = "status"+i;
                       String onlineOrderFlagField = "onlineOrderFlag"+i;
                       String salesOrderNumberField = "salesOrderNumber"+i;
                       String purchaseOrderNumberField = "purchaseOrderNumber"+i;
                       String accountNumberField = "accountNumber"+i;
                       String customerIDField = "customerID"+i;
                       String salesPersonIDField = "salesPersonID"+i;
                       String territoryIDField = "territoryID"+i;
                       String billToAddressIDField = "billToAddressID"+i;
                       String shipToAddressIDField = "shipToAddressID"+i;
                       String shipMethodIDField = "shipMethodID"+i;
                       String creditCardIDField = "creditCardID"+i;
                       String creditCardApprovalCodeField = "creditCardApprovalCode"+i;
                       String currencyRateIDField = "currencyRateID"+i;
                       String subTotalField = "subTotal"+i;
                       String taxAmtField = "taxAmt"+i;
                       String freightField = "freight"+i;
                       String totalDueField = "totalDue"+i;
                       String commentField = "comment"+i;
                       String modifiedDateField = "modifiedDate"+i;
                       
                       String salesOrderID = request.getParameter(orderIdField).replaceAll("<|>|@|;|,|=|}|$|&", "");
                       String revisionNumber = request.getParameter(revisionField).replaceAll("<|>|@|;|,|=|}|$|&", "");
                       String orderDate = request.getParameter(orderDateField).replaceAll("<|>|@|;|,|=|}|$|&", "");
                       String dueDate = request.getParameter(dueDateField).replaceAll("<|>|@|;|,|=|}|$|&", "");
                       String shipDate = request.getParameter(shipDateField).replaceAll("<|>|@|;|,|=|}|$|&", "");
                       String status = request.getParameter(statusField).replaceAll("<|>|@|;|,|=|}|$|&", "");
                       String onlineOrderFlag = request.getParameter(onlineOrderFlagField).replaceAll("<|>|@|;|,|=|}|$|&", "");
                       String salesOrderNumber = request.getParameter(salesOrderNumberField).replaceAll("<|>|@|;|,|=|}|$|&", "");
                       String purchaseOrderNumber = request.getParameter(purchaseOrderNumberField).replaceAll("<|>|@|;|,|=|}|$|&", "");
                       String accountNumber = request.getParameter(accountNumberField).replaceAll("<|>|@|;|,|=|}|$|&", "");
                       String customerID = request.getParameter(customerIDField).replaceAll("<|>|@|;|,|=|}|$|&", "");
                       String salesPersonID = request.getParameter(salesPersonIDField).replaceAll("<|>|@|;|,|=|}|$|&", "");
                       String territoryID = request.getParameter(territoryIDField).replaceAll("<|>|@|;|,|=|}|$|&", "");
                       String billToAddressID = request.getParameter(billToAddressIDField).replaceAll("<|>|@|;|,|=|}|$|&", "");
                       String shipToAddressID = request.getParameter(shipToAddressIDField).replaceAll("<|>|@|;|,|=|}|$|&", "");
                       String shipMethodID = request.getParameter(shipMethodIDField).replaceAll("<|>|@|;|,|=|}|$|&", "");
                       String creditCardID = request.getParameter(creditCardIDField).replaceAll("<|>|@|;|,|=|}|$|&", "");
                       String creditCardApprovalCode = request.getParameter(creditCardApprovalCodeField).replaceAll("<|>|@|;|,|=|}|$|&", "");
                       String currencyRateID = request.getParameter(currencyRateIDField).replaceAll("<|>|@|;|,|=|}|$|&", "");
                       String subTotal = request.getParameter(subTotalField).replaceAll("<|>|@|;|,|=|}|$|&", "");
                       String taxAmt = request.getParameter(taxAmtField).replaceAll("<|>|@|;|,|=|}|$|&", "");
                       String freight = request.getParameter(freightField).replaceAll("<|>|@|;|,|=|}|$|&", "");
                       String totalDue = request.getParameter(totalDueField).replaceAll("<|>|@|;|,|=|}|$|&", "");
                       String comment = request.getParameter(commentField).replaceAll("<|>|@|;|,|=|}|$|&", "");
                       String modifiedDate = request.getParameter(modifiedDateField).replaceAll("<|>|@|;|,|=|}|$|&", "");
                       
                        preparedStatement.setString(1, salesOrderID);
                        preparedStatement.setString(2, revisionNumber);
                        preparedStatement.setString(3, orderDate);
                        preparedStatement.setString(4, dueDate);
                        preparedStatement.setString(5, shipDate);
                        preparedStatement.setString(6, status);
                        preparedStatement.setString(7, onlineOrderFlag);
                        preparedStatement.setString(8, salesOrderNumber);
                        preparedStatement.setString(9, purchaseOrderNumber);
                        preparedStatement.setString(10, accountNumber);
                        preparedStatement.setString(11, customerID);
                        preparedStatement.setString(12, salesPersonID);
                        preparedStatement.setString(13, territoryID);
                        preparedStatement.setString(14, billToAddressID);
                        preparedStatement.setString(15, shipToAddressID);
                        preparedStatement.setString(16, shipMethodID);
                        preparedStatement.setString(17, creditCardID);
                        preparedStatement.setString(18, creditCardApprovalCode);
                        preparedStatement.setString(19, currencyRateID);
                        preparedStatement.setString(20, subTotal);
                        preparedStatement.setString(21, taxAmt);
                        preparedStatement.setString(22, freight);
                        preparedStatement.setString(23, totalDue);
                        preparedStatement.setString(24, comment);
                        preparedStatement.setString(25, modifiedDate);
                        
                        preparedStatement.addBatch();
                               
                        
                    }
                    
                    
                    //int result = preparedStatement.executeUpdate();
                    int[] count = preparedStatement.executeBatch();
                    connection.commit();
                    System.out.println("Total No of batches: "+count);
                    
                    request.setAttribute("action", "steptwo");
                    mv.setViewName("index");
           
                }
            catch (ClassNotFoundException ex) {
                    System.out.println("ClassNotFoundException" + ex.getMessage());
                } 
            catch (SQLException ex) {
                    System.out.println("SQLException" + ex.getMessage());
                }
           
           
//            request.setAttribute("action", "steptwo");
//            mv.setViewName("index");
        }

        return mv;

    }
}

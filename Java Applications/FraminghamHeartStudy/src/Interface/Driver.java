/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Business.Configuration;
import java.util.Scanner;


public class Driver {
    
    public static void main(String args[]){
        
        DisplayResults displayResults = new DisplayResults();
        
        //-----------------DISPLAY GENERAL DETAILS--------------------------
        //displayResults.displayCommunity();
        //displayResults.displayHouse();
        //displayResults.displayFamily();
        //displayResults.displayFamilyMember();
        //displayResults.displayVitalSigns();
        //displayResults.displayGeneralAttributes();
        
        
        //-----------------DISPLAY REPORTS OF ALL RESIDENTS OF FRAMINGHAM CITY--------------------------
        
        //displayResults.displayReports();
        
        //-----------------DISPLAY REPORTS AT ALL LEVELS--------------------------
        
        //displayResults.displayReportsForOneRandomPerson();
        //displayResults.displayReportsOfOneFamily();
        //displayResults.displayReportsOfOneHouse();
        //displayResults.displayReportsOfOneCommunity();
        
        
        //-----------------DISPLAY RISK PROBABILITY AT ALL LEVELS--------------------------
        
        //displayResults.displayRiskRatioOfFamily();
        displayResults.displayRiskRatioOfHouse();
        //displayResults.displayRiskRatioOfCommunity();
        //displayResults.displayRiskRatioOfCity();
        
        
        //////
        
        System.out.println("*********WELCOME TO FRAMINGHAM HEART MONITORING SYSTEM********");
            
           System.out.println("Please Enter your Choice of View");
           System.out.println("Enter 1 : For City Level report");
           System.out.println("Enter 2 : For Community Level report");
           System.out.println("Enter 3 : For House Level report");
           System.out.println("Enter 4 : For Family Level report");
           System.out.println("Enter 5 : For Individual report");
           Scanner in = new Scanner(System.in);
           int i = in.nextInt();
           switch (i) {
           case 1:
               displayResults.displayReports();
               break;
               
           case 2:
               displayResults.displayReportsOfOneCommunity();
               break;
               
           case 3:
               displayResults.displayReportsOfOneHouse();
               break;
               
           case 4:
               displayResults.displayReportsOfOneFamily();
               break;
               
           case 5:
               displayResults.displayReportsForOneRandomPerson();
               break;
               
           default:
               System.out.println("Please Enter a Valid Value");
           }
        }       
        
        
    }
    

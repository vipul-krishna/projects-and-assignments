/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface;

import Business.College;
import Business.Course;
import Business.CourseCatalog;
import Business.Department;
import Business.Initialization;
import Business.Student;
import Business.University;
import Business.UniversityCatalog;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Driver 
{ 
    
    public static void main(String[] args) 
        {
            DisplayResults displayResults = new DisplayResults();
            //displayResults.displayUniversity();
            //displayResults.displayCollege();
            //displayResults.displayDepartment();
            //displayResults.displayStudent();
            //displayResults.displayCourseCatalog();
            //displayResults.displayCourseSchedule();
            //displayResults.displayCourseOfferingInASemester();
            //displayResults.displayTranscript();
            //displayResults.displayCouseLoad();
            
            //PLACEMENT PERCENTAGE
            //----------------------------------------------------------------------------------
            //displayResults.displayPlacementPercentageOfOneDepartment();
            //displayResults.displayPlacementPercentageOfAllDepartments();
            //displayResults.displayPlacementPercentageOfAllColleges();
            //displayResults.displayPlacementPercentageOfAllUniveristy();
            //----------------------------------------------------------------------------------
            
            //STUDENT FACULTY RATIO
            //----------------------------------------------------------------------------------
            //displayResults.displayStudentFacultyRatio();
            //displayResults.displayStaffOfOneDepartment();
            //displayResults.displayStaffEmployementRatioOfOneDepartment();
            //----------------------------------------------------------------------------------
            
            
            
            //GRADUATION PERCENTAGE
            
            //----------------------------------------------------------------------------------
            //displayResults.displayStudentGraduationPercentageOfOneDepartment();
            //displayResults.diplayStudentGraduationPercentageOfAllDepartments();
            //displayResults.displayStudentGraduationPercentageOfAllColleges();
            //displayResults.displayStudentGraduationPercentageOfAllUniversities();
            //---------------------------------------------------------------------------------
            
            //Faculty
            //---------------------------------------------------------------------------------
            //displayResults.displayFaculty();
            //---------------------------------------------------------------------------------
            
            //Displaying Phd's 
            //----------------------------------------------------------------------------------
            //displayResults.displayPHDInOneDepartment();
            //displayResults.displayPHDInOneCollege();
            //displayResults.displayPHDInOneUniversity();
            //displayResults.displayPHDInOneEcosystem();
            //----------------------------------------------------------------------------------
            
            //Calculating Revenue
            //----------------------------------------------------------------------------------
            //displayResults.displayStudentRevenue();
            //displayResults.displayStudentRevenueForOneDepartment();
            //----------------------------------------------------------------------------------
            
            
            //GPA of Specific Student
            //----------------------------------------------------------------------------------
            //displayResults.displayGPA();
            //----------------------------------------------------------------------------------
            
            //Seat Reaminig In a Course
            //----------------------------------------------------------------------------------
            //displayResults.displayRemainingSeatCourseWise();
            //----------------------------------------------------------------------------------
            
          
           System.out.println("*********WELCOME TO UNIVERSITY REPORT GENERATION SYSTEM********");
            
           System.out.println("Please Enter your Choice of View");
           System.out.println("Enter 1 : For EcoSystem Level report");
           System.out.println("Enter 2 : For University Level report");
           System.out.println("Enter 3 : For College Level report");
           System.out.println("Enter 4 : For Department Level report");
           Scanner in = new Scanner(System.in);
           int i = in.nextInt();
           switch (i) {
           case 1:
               displayResults.displayUniversity();
               displayResults.displayStudentGraduationPercentageOfAllUniversities();
               displayResults.displayPlacementPercentageOfAllUniveristy(); 
               displayResults.displayPHDInOneEcosystem();
               break;
           case 2:
               displayResults.displayCollege();
               displayResults.displayStudentGraduationPercentageOfAllColleges();
               displayResults.displayPlacementPercentageOfAllColleges();
               displayResults.displayPHDInOneUniversity();
               
               break;
               
               
           case 3:
               displayResults.displayDepartment();
               displayResults.diplayStudentGraduationPercentageOfAllDepartments();
               displayResults.displayPlacementPercentageOfAllDepartments();
               displayResults.displayPHDInOneCollege();
               
               break;
               
           case 4:
               
               displayResults.displayStudentGraduationPercentageOfOneDepartment();
               displayResults.displayPlacementPercentageOfOneDepartment();
               displayResults.displayPHDInOneDepartment();
               break;
           default:
               System.out.println("Please Enter a Valid Value");
           }
        }       
}
    
    


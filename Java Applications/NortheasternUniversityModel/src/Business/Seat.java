/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author kkgarg
 */
public class Seat {
    private ArrayList<Course> listOfStudentCourses;
    
    private static int aedSeats = 20;
    private static int dbmsSeats = 20;
    private static int webToolsSeats = 20;
    
    public Seat(ArrayList<Course> listOfStudentCourses){
      
        this.listOfStudentCourses = listOfStudentCourses;
    }
    
    

    public static int getAedSeats() {
        return aedSeats;
    }

    public static int getDbmsSeats() {
        return dbmsSeats;
    }

    public static int getWebToolsSeats() {
        return webToolsSeats;
    }
    
    
    
    public void courseViseSeatLeft(){
    
        for(Course course : listOfStudentCourses)
        {
            if(course.getCourseName().equalsIgnoreCase("AED"))
            {
                aedSeats--;
            }
            else if(course.getCourseName().equalsIgnoreCase("DBMS"))
            {
                dbmsSeats--;
            }
            else if(course.getCourseName().equalsIgnoreCase("Web Tools"))
            {
                webToolsSeats--;
            }
        }
    }
}

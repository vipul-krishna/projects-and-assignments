/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;
import java.util.Map;

/**
 *
 * @author kkgarg
 */
public class CourseLoad {
   
    private float sum;
    private int courseLoad;
    private ArrayList<Course> listOfStudentCourses;
    private StudentAccount studentAccount;
    private SeatAssignment seatAssignment;
    
    
    public CourseLoad(ArrayList<Course> listOfStudentCourses){
        this.listOfStudentCourses = listOfStudentCourses;
        //totalCourseLoadOfStudent();
        //calculateGpa();
        studentAccount = new StudentAccount();
        seatAssignment = new SeatAssignment(listOfStudentCourses);
        
    }

    public StudentAccount getStudentAccount() {
        return studentAccount;
    }

    

    public SeatAssignment getSeatAssignment() {
        return seatAssignment;
    }

    public void setSeatAssignment(SeatAssignment seatAssignment) {
        this.seatAssignment = seatAssignment;
    }

    
    
    
    
    public int totalCourseLoadOfStudent(){
    for(Course course : listOfStudentCourses)
        {    
            courseLoad = Integer.parseInt(course.getCourseCredits())+ courseLoad;
        }

    return courseLoad;
    
    }
    
    
}

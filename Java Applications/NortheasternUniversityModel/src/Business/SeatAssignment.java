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
public class SeatAssignment {
    private ArrayList<StudentGradeDetails> studentGradeList;
    private ArrayList<Course> listofStudentCourses;
    private Seat seat;

    

    public SeatAssignment(ArrayList<Course> listOfStudentCourses) {
        
       studentGradeList = new ArrayList<StudentGradeDetails>();
       this.listofStudentCourses = listOfStudentCourses;
       this.seat = new Seat(listOfStudentCourses);
    }

    public ArrayList<StudentGradeDetails> getStudentGradeList() {
        return studentGradeList;
    }

    public void setStudentGradeList(ArrayList<StudentGradeDetails> studentGradeList) {
        this.studentGradeList = studentGradeList;
    }

    public Seat getSeat() {
        return seat;
    }

    public void setSeat(Seat seat) {
        this.seat = seat;
    }
    
    
    
    public StudentGradeDetails addStudentGrade(){
        StudentGradeDetails studentGradeDetails = new StudentGradeDetails();
        studentGradeList.add(studentGradeDetails);
        return studentGradeDetails;
    }
    
    
    
    
    public float calculateGPA(){
        float load = 0.0f;
        float sumCredits = 0.0f;
        for(StudentGradeDetails sgd : studentGradeList){
            
            for(Course course : listofStudentCourses){
                if(course.getCourseName().equalsIgnoreCase(sgd.getSubject()))
                {
                  load = Float.parseFloat(sgd.getGrade())*Float.parseFloat(course.getCourseCredits())+load;
                  sumCredits = Float.parseFloat(course.getCourseCredits())+sumCredits;
                }
            }
            
        }
        
        float GPA = load/sumCredits;
        return GPA;
        
    }
}

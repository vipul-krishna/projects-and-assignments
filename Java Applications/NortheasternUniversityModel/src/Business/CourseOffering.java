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
public class CourseOffering {
    
    private ArrayList<String> courseOfferingList;
    
    public CourseOffering(){
        
    this.courseOfferingList = new ArrayList<String>();
    //seatList = new SeatList(courseOfferingList);
    }
    
    

    public ArrayList<String> getCourseOfferingList() {
        return courseOfferingList;
    }

    public void setCourseOfferingList(ArrayList<String> courseOfferingList) {
        this.courseOfferingList = courseOfferingList;
    }
    
    public ArrayList addCourseOffering(ArrayList<CourseSchedule> filterThis, String semesterName){
        
        for(CourseSchedule courseSchedule : filterThis){
        if(courseSchedule.getSemesterName().equalsIgnoreCase(semesterName)){
            courseOfferingList.add(courseSchedule.getCourseName());
          }
        }
        return courseOfferingList;

    }
    
}

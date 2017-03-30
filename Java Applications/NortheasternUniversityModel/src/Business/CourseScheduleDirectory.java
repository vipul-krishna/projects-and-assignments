/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author kkgarg
 */
public class CourseScheduleDirectory {
    
    private ArrayList<CourseSchedule>  courseScheduleList;
    
    public CourseScheduleDirectory(){
    
        this.courseScheduleList = new ArrayList<CourseSchedule>();
    }

    public ArrayList<CourseSchedule> getCourseScheduleList() {
        return courseScheduleList;
    }
    
    public CourseSchedule addCourseSchedule(){
    
        CourseSchedule courseSchedule = new CourseSchedule();
        courseScheduleList.add(courseSchedule);
        return courseSchedule;
    }
    
    public int addingListToSet(){
    ArrayList<String> facultyNameList = new ArrayList<String>();
    for(CourseSchedule courseSchedule : courseScheduleList){
        facultyNameList.add(courseSchedule.getTeacherName());
    }
    Set<String> uniqueFacultySet = new HashSet<String>(facultyNameList);
    return uniqueFacultySet.size();
    
    }
    
    
    
}

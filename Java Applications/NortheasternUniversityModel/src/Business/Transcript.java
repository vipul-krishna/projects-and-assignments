/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author Lenovo
 */
public class Transcript {
    
    private CourseLoad courseLoad;
    
    private ArrayList<Course> listOfStudentCourses;
    
    
    public Transcript(){
    this.listOfStudentCourses = new ArrayList<Course>();
    courseLoad = new CourseLoad(listOfStudentCourses);
    }

    public ArrayList<Course> getListOfStudentCourses() {
        return listOfStudentCourses;
    }

    public CourseLoad getCourseLoad() {
        return courseLoad;
    }

    public void setCourseLoad(CourseLoad courseLoad) {
        this.courseLoad = courseLoad;
    }
    
    

    public Course addCourseToTranscript(){
    
        Course course = new Course();
        listOfStudentCourses.add(course);
        return course;
    }
    
    
    
    
    
}

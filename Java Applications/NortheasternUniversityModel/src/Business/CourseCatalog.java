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
public class CourseCatalog {
    
    private ArrayList<Course> courseCatatogList;
    
    public CourseCatalog(){
    
        this.courseCatatogList = new ArrayList<Course>();
    
    }

    public ArrayList<Course> getCourseCatatogList() {
        return courseCatatogList;
    }

    public void setCourseCatatogList(ArrayList<Course> courseCatatogList) {
        this.courseCatatogList = courseCatatogList;
    }
    
    public Course addCourse(){
    Course course = new Course();
    courseCatatogList.add(course);
    return course;
    }
    
    
    
    
}

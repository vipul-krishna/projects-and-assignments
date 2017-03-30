/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author kkgarg
 */
public class Semester {
    
    private String semesterName;
    private String calendarYear;
    private String semesterDate;
    private CourseOffering courseOffering;
    
    
    
    public Semester(){
    this.courseOffering = new CourseOffering();
    }

    public CourseOffering getCourseOffering() {
        return courseOffering;
    }

    
    

    public String getSemesterName() {
        return semesterName;
    }

    public void setSemesterName(String semesterName) {
        this.semesterName = semesterName;
    }
    

    public String getCalendarYear() {
        return calendarYear;
    }

    public void setCalendarYear(String calendarYear) {
        this.calendarYear = calendarYear;
    }

    public String getSemesterDate() {
        return semesterDate;
    }

    public void setSemesterDate(String semesterDate) {
        this.semesterDate = semesterDate;
    }
    
    
    
    

    
    
    
}

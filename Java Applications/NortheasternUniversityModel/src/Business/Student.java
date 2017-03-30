/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author Lenovo
 */
public class Student {
    
    private String studentName;
    private String studentID;
    private String yearGraduated;
    private int studentAge;
    private String placementStatus;
    private Transcript studentTranscript;
    
    
    public Student(){
        
        studentTranscript = new Transcript();
        
    }

    
    
    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getYearGraduated() {
        return yearGraduated;
    }

    public void setYearGraduated(String yearGraduated) {
        this.yearGraduated = yearGraduated;
    }

    
    
    public int getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }

    public Transcript getStudentTranscript() {
        return studentTranscript;
    }

    public String getPlacementStatus() {
        return placementStatus;
    }

    public void setPlacementStatus(String placementStatus) {
        this.placementStatus = placementStatus;
    }
    
    
    
}

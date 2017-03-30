/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author prash
 */
public class Department {
    private String deptName;
    private StudentDirectory studentDirectory;
    private CourseCatalog coursecatalog;
    private CourseScheduleDirectory courseScheduleDirectory;
    private StaffDirectory staffDirectory;
    private FacultyDirectory facultyDirectory;
    

    public Department() {
        studentDirectory = new StudentDirectory();
        coursecatalog = new CourseCatalog();
        courseScheduleDirectory = new CourseScheduleDirectory();
        staffDirectory = new StaffDirectory();
        facultyDirectory = new FacultyDirectory();
    }

    public CourseScheduleDirectory getCourseScheduleDirectory() {
        return courseScheduleDirectory;
    }

    public StaffDirectory getStaffDirectory() {
        return staffDirectory;
    }

    public void setStaffDirectory(StaffDirectory staffDirectory) {
        this.staffDirectory = staffDirectory;
    }

    public FacultyDirectory getFacultyDirectory() {
        return facultyDirectory;
    }

    public void setFacultyDirectory(FacultyDirectory facultyDirectory) {
        this.facultyDirectory = facultyDirectory;
    }
    
    

    
    
    
    
    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }
    
    
    
    public String getDeptName() {
        return deptName;
    }

    public StudentDirectory getStudentDirectory() {
        return studentDirectory;
    }

    public void setStudentDirectory(StudentDirectory studentDirectory) {
        this.studentDirectory = studentDirectory;
    }

    public CourseCatalog getCoursecatalog() {
        return coursecatalog;
    }

    public void setCoursecatalog(CourseCatalog coursecatalog) {
        this.coursecatalog = coursecatalog;
    }
    
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import static java.lang.Math.abs;
import java.util.ArrayList;
import static java.lang.Math.abs;
import static java.lang.Math.abs;
import static java.lang.Math.abs;

/**
 *
 * @author Lenovo
 */
public class Initialization {
    
  
  
    // Adding University to Ecosystem
    
    public static UniversityCatalog addUniversity(){
        
        UniversityCatalog universityCatalog = new UniversityCatalog();
        University university = universityCatalog.addUniversity();
        university.setUnivName("BU");
        University university1=universityCatalog.addUniversity();
        university1.setUnivName("Northeastern");
        return universityCatalog;
        
    }
    
    //Adding college to specific university
    
    public static UniversityCatalog addCollege(){
    UniversityCatalog universityCatalog = addUniversity();
    for(University university : universityCatalog.getUniversityCatalogList()){
        if(university.getUnivName().equals("BU"))
        {
        
            College college = university.getCollegeCatalog().addCollege();
            college.setCollegeName("BU COE");
            college = university.getCollegeCatalog().addCollege();
            college.setCollegeName("BU Management");
            
        }
        else if(university.getUnivName().equals("Northeastern"))
        {
        
            College college = university.getCollegeCatalog().addCollege();
            college.setCollegeName("NEU COE");
            college = university.getCollegeCatalog().addCollege();
            college.setCollegeName("NEU Management");
        }
    }
    return universityCatalog;
    }
    
    //Adding Department to Specific College
    
    public static UniversityCatalog addDepartment()
    {
        UniversityCatalog universityCatalog = addCollege();
        for(University university : universityCatalog.getUniversityCatalogList()){
            if(university.getUnivName().equals("BU"))
            {
                for(College college : university.getCollegeCatalog().getCollegeCatalogList())
                {
                    if(college.getCollegeName().equalsIgnoreCase("BU COE"))
                    {
                        Department department = college.getDepartmentCatalog().addDepartment();
                        department.setDeptName("CS");
                        department = college.getDepartmentCatalog().addDepartment();
                        department.setDeptName("IS");
                    }
                    if(college.getCollegeName().equalsIgnoreCase("BU Management"))
                    {
                        Department department = college.getDepartmentCatalog().addDepartment();
                        department.setDeptName("HR");
                    }
                }
            }
            if(university.getUnivName().equals("Northeastern"))
            {
                for(College college : university.getCollegeCatalog().getCollegeCatalogList())
                {
                    if(college.getCollegeName().equalsIgnoreCase("NEU COE"))
                    {
                        Department department = college.getDepartmentCatalog().addDepartment();
                        department.setDeptName("ECE");
                        department = college.getDepartmentCatalog().addDepartment();
                        department.setDeptName("CIVIL");
                    }
                     if(college.getCollegeName().equalsIgnoreCase("NEU Management"))
                    {
                        Department department = college.getDepartmentCatalog().addDepartment();
                        department.setDeptName("FINANCE");
                    }
                }
            }
        }
        return universityCatalog;
    
    }
    
    //Adding Student to Specific Department
    
    public static UniversityCatalog addStudent()
    {
        UniversityCatalog universityCatalog = addDepartment();
        for(University university : universityCatalog.getUniversityCatalogList()){
            if(university.getUnivName().equals("BU"))
            {
                for(College college : university.getCollegeCatalog().getCollegeCatalogList())
                {
                    if(college.getCollegeName().equalsIgnoreCase("BU COE"))
                    {
                        for(Department department : college.getDepartmentCatalog().getDepartmentCatalogList())
                        {
                            if(department.getDeptName().equalsIgnoreCase("CS"))
                            {
                                Student student = department.getStudentDirectory().addStudent();
                                student.setStudentID("S1");
                                student.setStudentAge(21);
                                student.setYearGraduated("2016");
                                student.setStudentName("Joy");
                                student.setPlacementStatus("Yes");
                                student = department.getStudentDirectory().addStudent();
                                student.setStudentID("S2");
                                student.setStudentAge(24);
                                student.setYearGraduated("2015");
                                student.setStudentName("Tom");
                                student.setPlacementStatus("Yes");
                                student = department.getStudentDirectory().addStudent();
                                student.setStudentID("S13");
                                student.setStudentAge(24);
                                student.setYearGraduated("2015");
                                student.setStudentName("Jatin");
                                student.setPlacementStatus("No");
                                student = department.getStudentDirectory().addStudent();
                                student.setStudentID("S14");
                                student.setStudentAge(22);
                                student.setYearGraduated("2016");
                                student.setStudentName("Anwar");
                                student.setPlacementStatus("Yes");
                                student = department.getStudentDirectory().addStudent();
                                student.setStudentID("S15");
                                student.setStudentAge(27);
                                student.setYearGraduated("2016");
                                student.setStudentName("Hardik");
                                student.setPlacementStatus("Yes");
                            }
                             if(department.getDeptName().equalsIgnoreCase("IS"))
                            {
                                Student student = department.getStudentDirectory().addStudent();
                                student.setStudentID("S3");
                                student.setStudentAge(21);
                                student.setYearGraduated("2015");
                                student.setStudentName("Jerry");
                                student.setPlacementStatus("No");
                                student = department.getStudentDirectory().addStudent();
                                student.setStudentID("S4");
                                student.setStudentAge(24);
                                student.setYearGraduated("2015");
                                student.setStudentName("Chris");
                                student.setPlacementStatus("Yes");
                                student = department.getStudentDirectory().addStudent();
                                student.setStudentID("S100");
                                student.setStudentAge(24);
                                student.setYearGraduated("2016");
                                student.setStudentName("Shane");
                                student.setPlacementStatus("Yes");
                            }
                        }
                    }
                    
                    //
                    
                     if(college.getCollegeName().equalsIgnoreCase("BU Management"))
                    {
                        for(Department department : college.getDepartmentCatalog().getDepartmentCatalogList())
                        {
                            if(department.getDeptName().equalsIgnoreCase("HR"))
                            {
                                Student student = department.getStudentDirectory().addStudent();
                                student.setStudentID("S5");
                                student.setStudentAge(21);
                                student.setYearGraduated("2016");
                                student.setStudentName("Hillary");
                                student.setPlacementStatus("Yes");
                                student = department.getStudentDirectory().addStudent();
                                student.setStudentID("S6");
                                student.setStudentAge(24);
                                student.setYearGraduated("2016");
                                student.setStudentName("Trump");
                                student.setPlacementStatus("No");
                            }
                        }
                    }
                }
            }
            
            else if(university.getUnivName().equals("Northeastern"))
            {
                for(College college : university.getCollegeCatalog().getCollegeCatalogList())
                {
                    if(college.getCollegeName().equalsIgnoreCase("NEU COE"))
                    {
                        for(Department department : college.getDepartmentCatalog().getDepartmentCatalogList())
                        {
                            if(department.getDeptName().equalsIgnoreCase("ECE"))
                            {
                                Student student = department.getStudentDirectory().addStudent();
                                student.setStudentID("S7");
                                student.setStudentAge(21);
                                student.setYearGraduated("2015");
                                student.setStudentName("Bill");
                                student.setPlacementStatus("Yes");
                                student = department.getStudentDirectory().addStudent();
                                student.setStudentID("S8");
                                student.setStudentAge(24);
                                student.setYearGraduated("2016");
                                student.setStudentName("Kim");
                                student.setPlacementStatus("Yes");
                            }
                            else if(department.getDeptName().equalsIgnoreCase("CIVIL"))
                            {
                                Student student = department.getStudentDirectory().addStudent();
                                student.setStudentID("S9");
                                student.setStudentAge(21);
                                student.setYearGraduated("2015");
                                student.setStudentName("Sunny");
                                student.setPlacementStatus("Yes");
                                student = department.getStudentDirectory().addStudent();
                                student.setStudentID("S10");
                                student.setStudentAge(24);
                                student.setYearGraduated("2016");
                                student.setStudentName("Shannon");
                                student.setPlacementStatus("No");
                            }
                        }
                    }
                    
                    //
                    
                    else if(college.getCollegeName().equalsIgnoreCase("NEU Management"))
                    {
                        for(Department department : college.getDepartmentCatalog().getDepartmentCatalogList())
                        {
                            if(department.getDeptName().equalsIgnoreCase("FINANCE"))
                            {
                                Student student = department.getStudentDirectory().addStudent();
                                student.setStudentID("S11");
                                student.setStudentAge(21);
                                student.setYearGraduated("2016");
                                student.setStudentName("Roger");
                                student.setPlacementStatus("Yes");
                                student = department.getStudentDirectory().addStudent();
                                student.setStudentID("S12");
                                student.setStudentAge(24);
                                student.setYearGraduated("2016");
                                student.setStudentName("Sachin");
                                student.setPlacementStatus("Yes");
                            }
                        }
                    }
                }
            }
            
        }
        return universityCatalog;
    
    }
    //Adding Courses to Course Catalog
    public static UniversityCatalog addCourseInCourseCatalog()
    {
       UniversityCatalog universityCatalog = addDepartment();
        for(University university : universityCatalog.getUniversityCatalogList()){
            if(university.getUnivName().equals("BU"))
            {
                for(College college : university.getCollegeCatalog().getCollegeCatalogList())
                {
                    if(college.getCollegeName().equalsIgnoreCase("BU COE"))
                    {
                        for(Department department : college.getDepartmentCatalog().getDepartmentCatalogList())
                        {
                            if(department.getDeptName().equalsIgnoreCase("CS"))
                            {
                                Course course = department.getCoursecatalog().addCourse();
                                course.setCourseName("AED");
                                course.setCourseID("C1");
                                course.setCourseCredits("4");
                                course = department.getCoursecatalog().addCourse();
                                course.setCourseName("DBMS");
                                course.setCourseID("C2");
                                course.setCourseCredits("4");
                                course = department.getCoursecatalog().addCourse();
                                course.setCourseName("Web Tools");
                                course.setCourseID("C3");
                                course.setCourseCredits("5");
                            }
                            
                            else if(department.getDeptName().equalsIgnoreCase("IS"))
                            {
                                Course course = department.getCoursecatalog().addCourse();
                                course.setCourseName("OOPS");
                                course.setCourseID("C4");
                                course.setCourseCredits("4");
                                course = department.getCoursecatalog().addCourse();
                                course.setCourseName("Data Mining");
                                course.setCourseID("C5");
                                course.setCourseCredits("4");
                                course = department.getCoursecatalog().addCourse();
                                course.setCourseName("Advance DBMS");
                                course.setCourseID("C6");
                                course.setCourseCredits("4");
                            }
                        }
                    }
                    
                    if(college.getCollegeName().equalsIgnoreCase("BU Management"))
                    {
                        for(Department department : college.getDepartmentCatalog().getDepartmentCatalogList())
                        {
                            if(department.getDeptName().equalsIgnoreCase("HR"))
                            {
                                Course course = department.getCoursecatalog().addCourse();
                                course.setCourseName("Recruiters");
                                course.setCourseID("C7");
                                course.setCourseCredits("4");
                                course = department.getCoursecatalog().addCourse();
                                course.setCourseName("Business Skills");
                                course.setCourseID("C8");
                                course.setCourseCredits("4");
                                course = department.getCoursecatalog().addCourse();
                                course.setCourseName("Presentation");
                                course.setCourseID("C9");
                                course.setCourseCredits("4");
                            }
                        }
                    }
                }
            }
            
            //
            if(university.getUnivName().equals("NEU"))
            {
                for(College college : university.getCollegeCatalog().getCollegeCatalogList())
                {
                    if(college.getCollegeName().equalsIgnoreCase("NEU COE"))
                    {
                        for(Department department : college.getDepartmentCatalog().getDepartmentCatalogList())
                        {
                            if(department.getDeptName().equalsIgnoreCase("ECE"))
                            {
                                Course course = department.getCoursecatalog().addCourse();
                                course.setCourseName("Complier Design");
                                course.setCourseID("C10");
                                course.setCourseCredits("4");
                                course = department.getCoursecatalog().addCourse();
                                course.setCourseName("Networking");
                                course.setCourseID("C11");
                                course.setCourseCredits("4");
                                course = department.getCoursecatalog().addCourse();
                                course.setCourseName("Microprocessor");
                                course.setCourseID("C12");
                                course.setCourseCredits("4");
                            }
                            
                            else if(department.getDeptName().equalsIgnoreCase("CIVIL"))
                            {
                                Course course = department.getCoursecatalog().addCourse();
                                course.setCourseName("Steel Design");
                                course.setCourseID("C13");
                                course.setCourseCredits("4");
                                course = department.getCoursecatalog().addCourse();
                                course.setCourseName("Concrete Technology");
                                course.setCourseID("C14");
                                course.setCourseCredits("4");
                                course = department.getCoursecatalog().addCourse();
                                course.setCourseName("Bridge Design");
                                course.setCourseID("C15");
                                course.setCourseCredits("4");
                            }
                        }
                    }
                    
                    if(college.getCollegeName().equalsIgnoreCase("NEU Management"))
                    {
                        for(Department department : college.getDepartmentCatalog().getDepartmentCatalogList())
                        {
                            if(department.getDeptName().equalsIgnoreCase("Finance"))
                            {
                                Course course = department.getCoursecatalog().addCourse();
                                course.setCourseName("Financial Marketing");
                                course.setCourseID("C16");
                                course.setCourseCredits("4");
                                course = department.getCoursecatalog().addCourse();
                                course.setCourseName("Debt Analysis");
                                course.setCourseID("C17");
                                course.setCourseCredits("4");
                                course = department.getCoursecatalog().addCourse();
                                course.setCourseName("International Market");
                                course.setCourseID("C18");
                                course.setCourseCredits("4");
                            }
                        }
                    }
                }
            }
        }
        return universityCatalog; 
    
    }
    
    //Adding Course Schedule to a specific Department
    public static UniversityCatalog courseSchedule()
    {
        UniversityCatalog universityCatalog = addCourseInCourseCatalog();
        for(University university : universityCatalog.getUniversityCatalogList()){
            if(university.getUnivName().equals("BU"))
            {
                for(College college : university.getCollegeCatalog().getCollegeCatalogList())
                {
                    if(college.getCollegeName().equalsIgnoreCase("BU COE"))
                    {
                        for(Department department : college.getDepartmentCatalog().getDepartmentCatalogList())
                        {
                            if(department.getDeptName().equalsIgnoreCase("CS"))
                            {
                                for(Course course : department.getCoursecatalog().getCourseCatatogList())
                                {
                                    if(course.getCourseID().equalsIgnoreCase("C1")){
                                    CourseSchedule courseSchedule = department.getCourseScheduleDirectory().addCourseSchedule();
                                    courseSchedule.setCourseID("C1");
                                    courseSchedule.setCourseName("AED");
                                    courseSchedule.setRoomNumber("West Village F");
                                    courseSchedule.setTeacherName("Kal");
                                    courseSchedule.setSemesterName("Fall 2016");
                                    }
                                }
                                
                                
                                for(Course course : department.getCoursecatalog().getCourseCatatogList())
                                {
                                    if(course.getCourseID().equalsIgnoreCase("C2")){
                                        CourseSchedule courseSchedule = department.getCourseScheduleDirectory().addCourseSchedule();
                                        courseSchedule.setCourseID("C2");
                                        courseSchedule.setCourseName("DBMS");
                                        courseSchedule.setRoomNumber("Shillman");
                                        courseSchedule.setTeacherName("Yusuf");
                                        courseSchedule.setSemesterName("Spring 2015"); 
                                    }
                                }
                                for(Course course : department.getCoursecatalog().getCourseCatatogList())
                                {
                                    if(course.getCourseID().equalsIgnoreCase("C3")){
                                        CourseSchedule courseSchedule = department.getCourseScheduleDirectory().addCourseSchedule();
                                        courseSchedule.setCourseID("C3");
                                        courseSchedule.setCourseName("Web Tools");
                                        courseSchedule.setRoomNumber("Beharikis");
                                        courseSchedule.setTeacherName("Richard");
                                        courseSchedule.setSemesterName("Fall 2016");
                                        
                                    }
                                }
                                
                                
                            }
                            //
                            
                            if(department.getDeptName().equalsIgnoreCase("IS"))
                            {
                                for(Course course : department.getCoursecatalog().getCourseCatatogList())
                                {
                                    if(course.getCourseID().equalsIgnoreCase("C4")){
                                    CourseSchedule courseSchedule = department.getCourseScheduleDirectory().addCourseSchedule();
                                    courseSchedule.setCourseID("C4");
                                    courseSchedule.setCourseName("OOPS");
                                    courseSchedule.setRoomNumber("West Village G");
                                    courseSchedule.setTeacherName("Kate");
                                    courseSchedule.setSemesterName("Fall 2016");
                                    }
                                }
                                
                                
                                for(Course course : department.getCoursecatalog().getCourseCatatogList())
                                {
                                    if(course.getCourseID().equalsIgnoreCase("C5")){
                                        CourseSchedule courseSchedule = department.getCourseScheduleDirectory().addCourseSchedule();
                                        courseSchedule.setCourseID("C5");
                                        courseSchedule.setCourseName("Data Mining");
                                        courseSchedule.setRoomNumber("Shillman A");
                                        courseSchedule.setTeacherName("Chawla");
                                        courseSchedule.setSemesterName("Spring 2015"); 
                                    }
                                } 
                            }
                        }
                    }
                    //
                    
                    if(college.getCollegeName().equalsIgnoreCase("BU Management"))
                    {
                        for(Department department : college.getDepartmentCatalog().getDepartmentCatalogList())
                        {
                            if(department.getDeptName().equalsIgnoreCase("HR"))
                            {
                                for(Course course : department.getCoursecatalog().getCourseCatatogList())
                                {
                                    if(course.getCourseID().equalsIgnoreCase("C7")){
                                    CourseSchedule courseSchedule = department.getCourseScheduleDirectory().addCourseSchedule();
                                    courseSchedule.setCourseID("C7");
                                    courseSchedule.setCourseName("Recruiters");
                                    courseSchedule.setRoomNumber("West Village K");
                                    courseSchedule.setTeacherName("Ricky");
                                    courseSchedule.setSemesterName("Fall 2016");
                                    }
                                }
                                
                                
                                for(Course course : department.getCoursecatalog().getCourseCatatogList())
                                {
                                    if(course.getCourseID().equalsIgnoreCase("C8")){
                                        CourseSchedule courseSchedule = department.getCourseScheduleDirectory().addCourseSchedule();
                                        courseSchedule.setCourseID("C8");
                                        courseSchedule.setCourseName("Business Skills");
                                        courseSchedule.setRoomNumber("Shillman");
                                        courseSchedule.setTeacherName("Adam");
                                        courseSchedule.setSemesterName("Spring 2015"); 
                                    }
                                }
                            }
                            
                        }
                    }
                }
            }
            
            //
            
            if(university.getUnivName().equals("Northeastern"))
            {
                for(College college : university.getCollegeCatalog().getCollegeCatalogList())
                {
                    if(college.getCollegeName().equalsIgnoreCase("NEU COE"))
                    {
                        for(Department department : college.getDepartmentCatalog().getDepartmentCatalogList())
                        {
                            if(department.getDeptName().equalsIgnoreCase("ECE"))
                            {
                                for(Course course : department.getCoursecatalog().getCourseCatatogList())
                                {
                                    if(course.getCourseID().equalsIgnoreCase("C10")){
                                    CourseSchedule courseSchedule = department.getCourseScheduleDirectory().addCourseSchedule();
                                    courseSchedule.setCourseID("C10");
                                    courseSchedule.setCourseName("Compiler Design");
                                    courseSchedule.setRoomNumber("West Village F");
                                    courseSchedule.setTeacherName("Martin");
                                    courseSchedule.setSemesterName("Fall 2016");
                                    }
                                }
                                
                                
                                for(Course course : department.getCoursecatalog().getCourseCatatogList())
                                {
                                    if(course.getCourseID().equalsIgnoreCase("C11")){
                                        CourseSchedule courseSchedule = department.getCourseScheduleDirectory().addCourseSchedule();
                                        courseSchedule.setCourseID("C11");
                                        courseSchedule.setCourseName("Networking");
                                        courseSchedule.setRoomNumber("Shillman");
                                        courseSchedule.setTeacherName("Luther");
                                        courseSchedule.setSemesterName("Fall 2016"); 
                                    }
                                } 
                            }
                            //
                            
                            if(department.getDeptName().equalsIgnoreCase("CIVIL"))
                            {
                                for(Course course : department.getCoursecatalog().getCourseCatatogList())
                                {
                                    if(course.getCourseID().equalsIgnoreCase("C13")){
                                    CourseSchedule courseSchedule = department.getCourseScheduleDirectory().addCourseSchedule();
                                    courseSchedule.setCourseID("C13");
                                    courseSchedule.setCourseName("Steel Design");
                                    courseSchedule.setRoomNumber("West Village G");
                                    courseSchedule.setTeacherName("Michael");
                                    courseSchedule.setSemesterName("Fall 2016");
                                    }
                                }
                                
                                
                                for(Course course : department.getCoursecatalog().getCourseCatatogList())
                                {
                                    if(course.getCourseID().equalsIgnoreCase("C14")){
                                        CourseSchedule courseSchedule = department.getCourseScheduleDirectory().addCourseSchedule();
                                        courseSchedule.setCourseID("C14");
                                        courseSchedule.setCourseName("Concrete Technology");
                                        courseSchedule.setRoomNumber("Shillman A");
                                        courseSchedule.setTeacherName("Glen");
                                        courseSchedule.setSemesterName("Spring 2015"); 
                                    }
                                } 
                            }
                        }
                    }
                    //
                    
                    if(college.getCollegeName().equalsIgnoreCase("NEU Management"))
                    {
                        for(Department department : college.getDepartmentCatalog().getDepartmentCatalogList())
                        {
                            if(department.getDeptName().equalsIgnoreCase("Finance"))
                            {
                                for(Course course : department.getCoursecatalog().getCourseCatatogList())
                                {
                                    if(course.getCourseID().equalsIgnoreCase("C16")){
                                    CourseSchedule courseSchedule = department.getCourseScheduleDirectory().addCourseSchedule();
                                    courseSchedule.setCourseID("C16");
                                    courseSchedule.setCourseName("Financial Marketing");
                                    courseSchedule.setRoomNumber("West Village K");
                                    courseSchedule.setTeacherName("Shoaib");
                                    courseSchedule.setSemesterName("Fall 2016");
                                    }
                                }
                                
                                
                                for(Course course : department.getCoursecatalog().getCourseCatatogList())
                                {
                                    if(course.getCourseID().equalsIgnoreCase("C17")){
                                        CourseSchedule courseSchedule = department.getCourseScheduleDirectory().addCourseSchedule();
                                        courseSchedule.setCourseID("C17");
                                        courseSchedule.setCourseName("Debt Analysis");
                                        courseSchedule.setRoomNumber("Shillman");
                                        courseSchedule.setTeacherName("Shahid");
                                        courseSchedule.setSemesterName("Fall 2016"); 
                                    }
                                }
                                
                                for(Course course : department.getCoursecatalog().getCourseCatatogList())
                                {
                                    if(course.getCourseID().equalsIgnoreCase("C18")){
                                        CourseSchedule courseSchedule = department.getCourseScheduleDirectory().addCourseSchedule();
                                        courseSchedule.setCourseID("C18");
                                        courseSchedule.setCourseName("International Marketing");
                                        courseSchedule.setRoomNumber("Shillman");
                                        courseSchedule.setTeacherName("Salman");
                                        courseSchedule.setSemesterName("Spring 2015"); 
                                    }
                                }
                            }
                            
                        }
                    }
                }
            }
        }
        return universityCatalog; 
    
        
        
    }
    
    
    public static UniversityCatalog courseOfferingInASemester()
    {
        UniversityCatalog universityCatalog = courseSchedule();
        
        for(University university : universityCatalog.getUniversityCatalogList())
        {
            if(university.getUnivName().equals("BU"))
            {
                for(College college : university.getCollegeCatalog().getCollegeCatalogList())
                {
                    if(college.getCollegeName().equalsIgnoreCase("BU COE"))
                    {
                        for(Department department : college.getDepartmentCatalog().getDepartmentCatalogList())
                        {
                            if(department.getDeptName().equalsIgnoreCase("CS"))
                            {
                                CourseOffering courseOffering = new CourseOffering();
                                ArrayList<CourseSchedule> filterThisList = department.getCourseScheduleDirectory().getCourseScheduleList();
                                ArrayList<String> coursesOfferedList =courseOffering.addCourseOffering(filterThisList,"Fall 2016");
                                System.out.println("Displaying Courses offered in "+department.getDeptName()+" in Fall 2016: ");
                                for(String courseName : coursesOfferedList)
                                {
                                    System.out.println(courseName);
                                }
                                   
                            }       
                        }
                    }
                }
            }
        }
        return universityCatalog;     
    }
    
    //Adding Course to Student Transcript
     public static UniversityCatalog addingCoursesToTranscript()
    {
        UniversityCatalog universityCatalog = addStudent();
        for(University university : universityCatalog.getUniversityCatalogList())
        {
            if(university.getUnivName().equals("BU"))
            {
                for(College college : university.getCollegeCatalog().getCollegeCatalogList())
                {
                    if(college.getCollegeName().equalsIgnoreCase("BU COE"))
                    {
                        for(Department department : college.getDepartmentCatalog().getDepartmentCatalogList())
                        {
                            if(department.getDeptName().equalsIgnoreCase("CS"))
                            {
                                for(Student student : department.getStudentDirectory().getStudentList())
                                {
                                    if(student.getStudentID().equals("S1"))
                                    {
                                        Course course = student.getStudentTranscript().addCourseToTranscript();
                                        course.setCourseName("AED");
                                        course.setCourseCredits("4");
                                        //
                                        Course course1 = student.getStudentTranscript().addCourseToTranscript();
                                        course1.setCourseName("DBMS");
                                        course1.setCourseCredits("4");
                                        //
                                        CourseLoad courseLoad = new CourseLoad(student.getStudentTranscript().getListOfStudentCourses());
                                        //System.out.println("GPA of the student is  "+courseLoad.getGpa());
                                    }
                                    
                                    else if(student.getStudentID().equals("S2"))
                                    {
                                        Course course = student.getStudentTranscript().addCourseToTranscript();
                                        course.setCourseName("AED");
                                        course.setCourseCredits("4");
                                        course = student.getStudentTranscript().addCourseToTranscript();
                                        course.setCourseName("Web Tools");
                                        course.setCourseCredits("5");
                                        //
                                        CourseLoad courseLoad = new CourseLoad(student.getStudentTranscript().getListOfStudentCourses());
                                        //System.out.println("GPA of the student is  "+courseLoad.getGpa());
                                    }
                                    
                                    else if(student.getStudentID().equals("S13"))
                                    {
                                        Course course = student.getStudentTranscript().addCourseToTranscript();
                                        course.setCourseName("AED");
                                        course.setCourseCredits("4");
                                        course = student.getStudentTranscript().addCourseToTranscript();
                                        course.setCourseName("Web Tools");
                                        course.setCourseCredits("5");
                                        course = student.getStudentTranscript().addCourseToTranscript();
                                        course.setCourseName("DBMS");
                                        course.setCourseCredits("4");
                                        //
                                        CourseLoad courseLoad = new CourseLoad(student.getStudentTranscript().getListOfStudentCourses());
                                        //System.out.println("GPA of the student is  "+courseLoad.getGpa());
                                    }
                                    
                                    else if(student.getStudentID().equals("S14"))
                                    {
                                        Course course = student.getStudentTranscript().addCourseToTranscript();
                                        course.setCourseName("AED");
                                        course.setCourseCredits("4");
                                        course = student.getStudentTranscript().addCourseToTranscript();
                                        course.setCourseName("Web Tools");
                                        course.setCourseCredits("5");
                                        course = student.getStudentTranscript().addCourseToTranscript();
                                        course.setCourseName("DBMS");
                                        course.setCourseCredits("4");
                                        //
                                        CourseLoad courseLoad = new CourseLoad(student.getStudentTranscript().getListOfStudentCourses());
                                        //System.out.println("GPA of the student is  "+courseLoad.getGpa());
                                    }
                                    
                                    else if(student.getStudentID().equals("S15"))
                                    {
                                        Course course = student.getStudentTranscript().addCourseToTranscript();
                                        course.setCourseName("Web Tools");
                                        course.setCourseCredits("5");
                                        course = student.getStudentTranscript().addCourseToTranscript();
                                        course.setCourseName("DBMS");
                                        course.setCourseCredits("4");
                                        //
                                        CourseLoad courseLoad = new CourseLoad(student.getStudentTranscript().getListOfStudentCourses());
                                        //System.out.println("GPA of the student is  "+courseLoad.getGpa());
                                    }
                                }
                                   
                            }
                            
                            //
                            if(department.getDeptName().equalsIgnoreCase("IS"))
                            {
                                for(Student student : department.getStudentDirectory().getStudentList())
                                {
                                    if(student.getStudentID().equals("S3"))
                                    {
                                        Course course = student.getStudentTranscript().addCourseToTranscript();
                                        course.setCourseName("OOPS");
                                        course.setCourseCredits("4");
                                        //
                                        Course course1 = student.getStudentTranscript().addCourseToTranscript();
                                        course1.setCourseName("Data Mining");
                                        course1.setCourseCredits("4");
                                        //
                                        CourseLoad courseLoad = new CourseLoad(student.getStudentTranscript().getListOfStudentCourses());
                                        //System.out.println("GPA of the student is  "+courseLoad.getGpa());
                                    }
                                    
                                    else if(student.getStudentID().equals("S4"))
                                    {
                                        Course course = student.getStudentTranscript().addCourseToTranscript();
                                        course.setCourseName("OOPS");
                                        course.setCourseCredits("4");
                                        course = student.getStudentTranscript().addCourseToTranscript();
                                        course.setCourseName("Advanced DBMS");
                                        course.setCourseCredits("4");
                                        //
                                        CourseLoad courseLoad = new CourseLoad(student.getStudentTranscript().getListOfStudentCourses());
                                        //System.out.println("GPA of the student is  "+courseLoad.getGpa());
                                    }
                                    
                                }
                                   
                            } 
                        }
                    }
                    //
                    
                    if(college.getCollegeName().equalsIgnoreCase("BU Management"))
                    {
                        for(Department department : college.getDepartmentCatalog().getDepartmentCatalogList())
                        {
                            if(department.getDeptName().equalsIgnoreCase("HR"))
                            {
                                for(Student student : department.getStudentDirectory().getStudentList())
                                {
                                    if(student.getStudentID().equals("S5"))
                                    {
                                        Course course = student.getStudentTranscript().addCourseToTranscript();
                                        course.setCourseName("Recruiter");
                                        course.setCourseCredits("4");
                                        //
                                        Course course1 = student.getStudentTranscript().addCourseToTranscript();
                                        course1.setCourseName("Business Skills");
                                        course1.setCourseCredits("4");
                                        //
                                        CourseLoad courseLoad = new CourseLoad(student.getStudentTranscript().getListOfStudentCourses());
                                        //System.out.println("GPA of the student is  "+courseLoad.getGpa());
                                    }
                                    
                                    else if(student.getStudentID().equals("S6"))
                                    {
                                        Course course = student.getStudentTranscript().addCourseToTranscript();
                                        course.setCourseName("Recruiter");
                                        course.setCourseCredits("4");
                                        course = student.getStudentTranscript().addCourseToTranscript();
                                        course.setCourseName("Presentation");
                                        course.setCourseCredits("4");
                                        //
                                        CourseLoad courseLoad = new CourseLoad(student.getStudentTranscript().getListOfStudentCourses());
                                        //System.out.println("GPA of the student is  "+courseLoad.getGpa());
                                    }
                                }
                                   
                            } 
                        }
                    }
                    
                }
            }
            //
            
            if(university.getUnivName().equals("Northeastern"))
            {
                for(College college : university.getCollegeCatalog().getCollegeCatalogList())
                {
                    if(college.getCollegeName().equalsIgnoreCase("NEU COE"))
                    {
                        for(Department department : college.getDepartmentCatalog().getDepartmentCatalogList())
                        {
                            if(department.getDeptName().equalsIgnoreCase("ECE"))
                            {
                                for(Student student : department.getStudentDirectory().getStudentList())
                                {
                                    if(student.getStudentID().equals("S7"))
                                    {
                                        Course course = student.getStudentTranscript().addCourseToTranscript();
                                        course.setCourseName("Compiler Design");
                                        course.setCourseCredits("4");
                                        //
                                        Course course1 = student.getStudentTranscript().addCourseToTranscript();
                                        course1.setCourseName("Networking");
                                        course1.setCourseCredits("4");
                                        //
                                        Course course2 = student.getStudentTranscript().addCourseToTranscript();
                                        course1.setCourseName("Microprocessor");
                                        course1.setCourseCredits("4");
                                        //
                                        CourseLoad courseLoad = new CourseLoad(student.getStudentTranscript().getListOfStudentCourses());
                                        //System.out.println("GPA of the student is  "+courseLoad.getGpa());
                                    }
                                    
                                    else if(student.getStudentID().equals("S8"))
                                    {
                                        Course course = student.getStudentTranscript().addCourseToTranscript();
                                        course.setCourseName("Networking");
                                        course.setCourseCredits("4");
                                        course = student.getStudentTranscript().addCourseToTranscript();
                                        course.setCourseName("Compiler Design");
                                        course.setCourseCredits("4");
                                        //
                                        CourseLoad courseLoad = new CourseLoad(student.getStudentTranscript().getListOfStudentCourses());
                                        //System.out.println("GPA of the student is  "+courseLoad.getGpa());
                                    }
                                   
                                }
                                   
                            }
                            
                            //
                            if(department.getDeptName().equalsIgnoreCase("CIVIL"))
                            {
                                for(Student student : department.getStudentDirectory().getStudentList())
                                {
                                    if(student.getStudentID().equals("S9"))
                                    {
                                        Course course = student.getStudentTranscript().addCourseToTranscript();
                                        course.setCourseName("Steel Design");
                                        course.setCourseCredits("4");
                                        //
                                        Course course1 = student.getStudentTranscript().addCourseToTranscript();
                                        course1.setCourseName("Bridge Design");
                                        course1.setCourseCredits("4");
                                        //
                                        CourseLoad courseLoad = new CourseLoad(student.getStudentTranscript().getListOfStudentCourses());
                                        //System.out.println("GPA of the student is  "+courseLoad.getGpa());
                                    }
                                    
                                    else if(student.getStudentID().equals("S10"))
                                    {
                                        Course course = student.getStudentTranscript().addCourseToTranscript();
                                        course.setCourseName("Steel Design");
                                        course.setCourseCredits("4");
                                        course = student.getStudentTranscript().addCourseToTranscript();
                                        course.setCourseName("Bridge Design");
                                        course.setCourseCredits("4");
                                        course = student.getStudentTranscript().addCourseToTranscript();
                                        course.setCourseName("Concrete Technology");
                                        course.setCourseCredits("4");
                                        //
                                        CourseLoad courseLoad = new CourseLoad(student.getStudentTranscript().getListOfStudentCourses());
                                        //System.out.println("GPA of the student is  "+courseLoad.getGpa());
                                    }
                                    
                                }
                                   
                            } 
                        }
                    }
                    //
                    
                    if(college.getCollegeName().equalsIgnoreCase("NEU Management"))
                    {
                        for(Department department : college.getDepartmentCatalog().getDepartmentCatalogList())
                        {
                            if(department.getDeptName().equalsIgnoreCase("Finance"))
                            {
                                for(Student student : department.getStudentDirectory().getStudentList())
                                {
                                    if(student.getStudentID().equals("S11"))
                                    {
                                        Course course = student.getStudentTranscript().addCourseToTranscript();
                                        course.setCourseName("Financial Marketing");
                                        course.setCourseCredits("4");
                                        //
                                        Course course1 = student.getStudentTranscript().addCourseToTranscript();
                                        course1.setCourseName("Debt Analysis");
                                        course1.setCourseCredits("4");
                                        //
                                        CourseLoad courseLoad = new CourseLoad(student.getStudentTranscript().getListOfStudentCourses());
                                        //System.out.println("GPA of the student is  "+courseLoad.getGpa());
                                    }
                                    
                                    else if(student.getStudentID().equals("S12"))
                                    {
                                        Course course = student.getStudentTranscript().addCourseToTranscript();
                                        course.setCourseName("Financial Marketing");
                                        course.setCourseCredits("4");
                                        course = student.getStudentTranscript().addCourseToTranscript();
                                        course.setCourseName("Debt Analysis");
                                        course.setCourseCredits("4");
                                        course = student.getStudentTranscript().addCourseToTranscript();
                                        course.setCourseName("International Marketing");
                                        course.setCourseCredits("4");
                                        //
                                        CourseLoad courseLoad = new CourseLoad(student.getStudentTranscript().getListOfStudentCourses());
                                        //System.out.println("GPA of the student is  "+courseLoad.getGpa());
                                    }
                                }
                                   
                            } 
                        }
                    }
                    
                }
            }
        }
        return universityCatalog;     
    }
   
       //Adding Course Load of a Student
      public static UniversityCatalog courseLoad()
    {
        UniversityCatalog universityCatalog = addingCoursesToTranscript();
       
        return universityCatalog;     
    }
   
      
        //Calculating Placement Percentage of ONE DEPARTMENT of A COLLEGE
      public static UniversityCatalog placementPercentageOfOneDepartment()
    {
        UniversityCatalog universityCatalog = addStudent();
        
        for(University university : universityCatalog.getUniversityCatalogList())
        {
            if(university.getUnivName().equals("BU"))
            {
                for(College college : university.getCollegeCatalog().getCollegeCatalogList())
                {
                    if(college.getCollegeName().equalsIgnoreCase("BU COE"))
                    {
                        for(Department department : college.getDepartmentCatalog().getDepartmentCatalogList())
                        {
                            if(department.getDeptName().equalsIgnoreCase("IS"))
                            {
                                
                                System.out.println("University: "+university.getUnivName()+", "+"College: "+college.getCollegeName());
                                float placementRate = department.getStudentDirectory().placementPercentage();
                                System.out.println("Placement percentage of "+department.getDeptName()+ " is " +placementRate+"%");
                            }       
                        }
                    }
                }
            }
        }
        return universityCatalog;     
    }
      
       public static UniversityCatalog placementPercentageOfAllDepartments()
    {
        UniversityCatalog universityCatalog = addStudent();
        
        for(University university : universityCatalog.getUniversityCatalogList())
        {
            if(university.getUnivName().equals("BU"))
            {
                
                System.out.println("University: "+university.getUnivName());
                for(College college : university.getCollegeCatalog().getCollegeCatalogList())
                {
                    if(college.getCollegeName().equalsIgnoreCase("BU COE"))
                    {
                        System.out.println("-----Displaying placement rate of "+college.getCollegeName()+"-----");
                        for(Department department : college.getDepartmentCatalog().getDepartmentCatalogList())
                        {
                            
                            
                                float placementRate = department.getStudentDirectory().placementPercentage();
                                System.out.println("Placement percentage of "+department.getDeptName()+ " is " +placementRate+"%");
                                  
                        }
                    }
                }
            }
        }
        return universityCatalog;     
    }
       
       
    //
    public static UniversityCatalog placementPercentageOfAllColleges()
    {
        UniversityCatalog universityCatalog = addStudent();
        
        for(University university : universityCatalog.getUniversityCatalogList())
        {
            if(university.getUnivName().equals("BU"))
            {
                System.out.println("******Displaying placement rate of "+university.getUnivName()+"******");
                for(College college : university.getCollegeCatalog().getCollegeCatalogList())
                {
                        System.out.println("-----Displaying placement rate of "+college.getCollegeName()+"-----");
                        for(Department department : college.getDepartmentCatalog().getDepartmentCatalogList())
                        {
                            
                            
                                float placementRate = department.getStudentDirectory().placementPercentage();
                                System.out.println("Placement percentage of "+department.getDeptName()+ " is " +placementRate+"%");
                                  
                        }
                    
                }
            }
        }
        return universityCatalog;     
    }
    
    
    public static UniversityCatalog placementPercentageOfAllUniversity()
    {
        UniversityCatalog universityCatalog = addStudent();
        System.out.println("******* Displaying placement Rate of Complete Ecosystem *******");
        for(University university : universityCatalog.getUniversityCatalogList())
        {
                System.out.println("*Displaying placement rate of "+university.getUnivName()+"*");
                for(College college : university.getCollegeCatalog().getCollegeCatalogList())
                {
                        System.out.println("-----Displaying placement rate of "+college.getCollegeName()+"-----");
                        for(Department department : college.getDepartmentCatalog().getDepartmentCatalogList())
                        {
                            
                            
                                float placementRate = department.getStudentDirectory().placementPercentage();
                                System.out.println("Placement percentage of "+department.getDeptName()+ " is " +placementRate+"%");
                                  
                        }
                    
                }   
        }
        return universityCatalog;     
    }
       
    //Add Staff
    
    public static UniversityCatalog addStaff()
    {
        UniversityCatalog universityCatalog = addDepartment();
        for(University university : universityCatalog.getUniversityCatalogList()){
            if(university.getUnivName().equals("BU"))
            {
                for(College college : university.getCollegeCatalog().getCollegeCatalogList())
                {
                    if(college.getCollegeName().equalsIgnoreCase("BU COE"))
                    {
                        for(Department department : college.getDepartmentCatalog().getDepartmentCatalogList())
                        {
                            if(department.getDeptName().equalsIgnoreCase("CS"))
                            {
                               Staff staff = department.getStaffDirectory().addStaff();
                               staff.setStaffName("Harry");
                               staff.setStaffID("A1");
                               staff.setActiveYear("2016");
                               staff = department.getStaffDirectory().addStaff();
                               staff.setStaffName("James");
                               staff.setStaffID("A2");
                               staff.setActiveYear("2015");
                               staff = department.getStaffDirectory().addStaff();
                               staff.setStaffName("Garry");
                               staff.setStaffID("A3");
                               staff.setActiveYear("2016");
                               staff = department.getStaffDirectory().addStaff();
                               staff.setStaffName("Potter");
                               staff.setStaffID("A4");
                               staff.setActiveYear("2016");
                            }
                        }
                    }
                }
            }
        }
        return universityCatalog; 
    
        
        
    }
    
    //Calculating Student/Faculty ratio of a given department
    
    public static UniversityCatalog calculatingStudentFacultyRatio()
    {
        UniversityCatalog universityCatalog1 = addFaculty();
        int numberOfFaculty=0;
        for(University university : universityCatalog1.getUniversityCatalogList()){
            if(university.getUnivName().equals("BU"))
            {
                for(College college : university.getCollegeCatalog().getCollegeCatalogList())
                {
                    if(college.getCollegeName().equalsIgnoreCase("BU COE"))
                    {
                        for(Department department : college.getDepartmentCatalog().getDepartmentCatalogList())
                        {
                            if(department.getDeptName().equalsIgnoreCase("CS"))
                            {
                              numberOfFaculty = department.getFacultyDirectory().getFacultyList().size();
                            }
                        }
                    }
                }
            }
        }
        
        UniversityCatalog universityCatalog = addStudent();
        for(University university : universityCatalog.getUniversityCatalogList()){
            if(university.getUnivName().equals("BU"))
            {
                for(College college : university.getCollegeCatalog().getCollegeCatalogList())
                {
                    if(college.getCollegeName().equalsIgnoreCase("BU COE"))
                    {
                        for(Department department : college.getDepartmentCatalog().getDepartmentCatalogList())
                        {
                            if(department.getDeptName().equalsIgnoreCase("CS"))
                            {
                              
                              System.out.println("University: "+university.getUnivName()+", "+"College: "+college.getCollegeName()+", "+"Department: "+department.getDeptName());
                              int numberOfStudents =  department.getStudentDirectory().getStudentList().size();
                              System.out.println("Student Faculty Ratio is: "+numberOfStudents+"/"+numberOfFaculty);
                            }
                        }
                    }
                }
            }
        }
        return universityCatalog; 
    
        
        
    }
    
    //calculating change in staff employement percentange of a specific department
    
    public static UniversityCatalog calculateStaffEmployementPercentageChangeOfDepartment()
    {
        UniversityCatalog universityCatalog = addStaff();
        for(University university : universityCatalog.getUniversityCatalogList()){
            if(university.getUnivName().equals("BU"))
            {
                for(College college : university.getCollegeCatalog().getCollegeCatalogList())
                {
                    if(college.getCollegeName().equalsIgnoreCase("BU COE"))
                    {
                        for(Department department : college.getDepartmentCatalog().getDepartmentCatalogList())
                        {
                            if(department.getDeptName().equalsIgnoreCase("CS"))
                            {
                                
                                System.out.println("University: "+university.getUnivName()+", "+"College: "+college.getCollegeName());
                                float percentage = department.getStaffDirectory().jobOpeningRatioOfDepartment();
                                if(percentage>0)
                                {
                                    System.out.println("For "+department.getDeptName()+", The Staff Employement Rate is Increased by "+percentage+"% as compared to Previous Year.");
                                }
                                else if(percentage<0)
                                {
                                    System.out.println("For "+department.getDeptName()+", The Staff Employement Rate is Decreased by "+abs(percentage)+"% as compared to Previous Year.");
                                }
                                else
                                {
                                    System.out.println("For "+department.getDeptName()+", The Staff Employement Rate is Unchanged.");
                                }
                               
                            }
                        }
                    }
                }
            }
        }
        return universityCatalog; 
    
        
        
    }
    
    
    
    //Calculating Student Gradutaion Percentage of a Specific Department
    
     public static UniversityCatalog calculateStudentGraduationPercentageOfOneDepartment()
    {
        UniversityCatalog universityCatalog = addStudent();
        for(University university : universityCatalog.getUniversityCatalogList()){
            if(university.getUnivName().equals("BU"))
            {
                for(College college : university.getCollegeCatalog().getCollegeCatalogList())
                {
                    if(college.getCollegeName().equalsIgnoreCase("BU COE"))
                    {
                        for(Department department : college.getDepartmentCatalog().getDepartmentCatalogList())
                        {
                            if(department.getDeptName().equalsIgnoreCase("CS"))
                            {
                                System.out.println("University: "+university.getUnivName()+", "+"College: "+college.getCollegeName());
                                float percentage = department.getStudentDirectory().gradutaionRate();
                                if(percentage>0)
                                {
                                    System.out.println("For "+department.getDeptName()+", The Student Gradutaion Rate is Increased by "+percentage+"% as compared to Previous Year.");
                                }
                                else if(percentage<0)
                                {
                                    System.out.println("For "+department.getDeptName()+", The Student Gradutaion Rate is Decreased by "+abs(percentage)+"% as compared to Previous Year.");
                                }
                                else
                                {
                                    System.out.println("For "+department.getDeptName()+", The Student Gradutaion Rate is Unchanged.");
                                }
                               
                            }
                        }
                    }
                }
            }
        }
        return universityCatalog; 
    
        
        
    }
     
      public static UniversityCatalog calculateStudentGraduationPercentageOfAllDepartments()
    {
        UniversityCatalog universityCatalog = addStudent();
        for(University university : universityCatalog.getUniversityCatalogList()){
            if(university.getUnivName().equals("BU"))
            {
                for(College college : university.getCollegeCatalog().getCollegeCatalogList())
                {
                    if(college.getCollegeName().equalsIgnoreCase("BU COE"))
                    {
                        for(Department department : college.getDepartmentCatalog().getDepartmentCatalogList())
                        {
                            System.out.println("University: "+university.getUnivName()+", "+"College: "+college.getCollegeName());
                                float percentage = department.getStudentDirectory().gradutaionRate();
                                if(percentage>0)
                                {
                                    System.out.println("For "+department.getDeptName()+", The Student Gradutaion Rate is Increased by "+percentage+"% as compared to Previous Year.");
                                }
                                else if(percentage<0)
                                {
                                    System.out.println("For "+department.getDeptName()+", The Student Gradutaion Rate is Decreased by "+abs(percentage)+"% as compared to Previous Year.");
                                }
                                else
                                {
                                    System.out.println("For "+department.getDeptName()+", The Student Gradutaion Rate is Unchanged.");
                                }
                               
                            
                        }
                    }
                }
            }
        }
        return universityCatalog;
    
    }
     
  public static UniversityCatalog calculateStudentGraduationPercentageOfAllColleges()
    {
        UniversityCatalog universityCatalog = addStudent();
        for(University university : universityCatalog.getUniversityCatalogList()){
            if(university.getUnivName().equals("BU"))
            {
                System.out.println("University: "+university.getUnivName());
                for(College college : university.getCollegeCatalog().getCollegeCatalogList())
                {
                        System.out.println("College: "+college.getCollegeName());
                        for(Department department : college.getDepartmentCatalog().getDepartmentCatalogList())
                        {
                            
                                float percentage = department.getStudentDirectory().gradutaionRate();
                                if(percentage>0)
                                {
                                    System.out.println("For "+department.getDeptName()+", The Student Gradutaion Rate is Increased by "+percentage+"% as compared to Previous Year.");
                                }
                                else if(percentage<0)
                                {
                                    System.out.println("For "+department.getDeptName()+", The Student Gradutaion Rate is Decreased by "+abs(percentage)+"% as compared to Previous Year.");
                                }
                                else
                                {
                                    System.out.println("For "+department.getDeptName()+", The Student Gradutaion Rate is Unchanged.");
                                }
                               
                            
                        }
                    
                }
            }
        }
        return universityCatalog;
    }
  
  public static UniversityCatalog calculateStudentGraduationPercentageOfAllUniversities()
    {
        UniversityCatalog universityCatalog = addStudent();
        for(University university : universityCatalog.getUniversityCatalogList()){
                System.out.println("Displaying Graduation Rate of "+university.getUnivName()+" Univerisity");
                for(College college : university.getCollegeCatalog().getCollegeCatalogList())
                {
                    
                        System.out.println("For "+college.getCollegeName());
                        for(Department department : college.getDepartmentCatalog().getDepartmentCatalogList())
                        {
                            
                                float percentage = department.getStudentDirectory().gradutaionRate();
                                if(percentage>0)
                                {
                                    System.out.println("For "+department.getDeptName()+", The Student Gradutaion Rate is Increased by "+percentage+"% as compared to Previous Year.");
                                }
                                else if(percentage<0)
                                {
                                    System.out.println("For "+department.getDeptName()+", The Student Gradutaion Rate is Decreased by "+abs(percentage)+"% as compared to Previous Year.");
                                }
                                else
                                {
                                    System.out.println("For "+department.getDeptName()+", The Student Gradutaion Rate is Unchanged.");
                                }
                               
                            
                        }
                    
                }
            
        }
        return universityCatalog;
    }
  
    //Adding Faculty to a Specific Department
  public static UniversityCatalog addFaculty()
    {
        UniversityCatalog universityCatalog = addDepartment();
        for(University university : universityCatalog.getUniversityCatalogList()){
            if(university.getUnivName().equals("BU"))
            {
                for(College college : university.getCollegeCatalog().getCollegeCatalogList())
                {
                    if(college.getCollegeName().equalsIgnoreCase("BU COE"))
                    {
                        for(Department department : college.getDepartmentCatalog().getDepartmentCatalogList())
                        {
                            if(department.getDeptName().equalsIgnoreCase("CS"))
                            {
                               Faculty faculty = department.getFacultyDirectory().addFaculty();
                               faculty.setTeacherName("Kal");
                               faculty.setTecherID("F1");
                               faculty.setTeacherQualification("PHD");
                               faculty = department.getFacultyDirectory().addFaculty();
                               faculty.setTeacherName("Yusuf");
                               faculty.setTecherID("F2");
                               faculty.setTeacherQualification("Masters");
                               faculty = department.getFacultyDirectory().addFaculty();
                               faculty.setTeacherName("Richard");
                               faculty.setTecherID("F3");
                               faculty.setTeacherQualification("PHD");
                               
                            }
                            else if(department.getDeptName().equalsIgnoreCase("IS"))
                            {
                               Faculty faculty = department.getFacultyDirectory().addFaculty();
                               faculty.setTeacherName("Kate");
                               faculty.setTecherID("F4");
                               faculty.setTeacherQualification("PHD");
                               faculty = department.getFacultyDirectory().addFaculty();
                               faculty.setTeacherName("Chawla");
                               faculty.setTecherID("F5");
                               faculty.setTeacherQualification("Masters");
                               faculty = department.getFacultyDirectory().addFaculty();
                               faculty.setTeacherName("Dan");
                               faculty.setTecherID("F6");
                               faculty.setTeacherQualification("PHD");
                               
                            }
                        }
                    }
                    
                    else if(college.getCollegeName().equalsIgnoreCase("BU Management"))
                    {
                        for(Department department : college.getDepartmentCatalog().getDepartmentCatalogList())
                        {
                            if(department.getDeptName().equalsIgnoreCase("HR"))
                            {
                               Faculty faculty = department.getFacultyDirectory().addFaculty();
                               faculty.setTeacherName("Ricky");
                               faculty.setTecherID("F7");
                               faculty.setTeacherQualification("PHD");
                               faculty = department.getFacultyDirectory().addFaculty();
                               faculty.setTeacherName("Adam");
                               faculty.setTecherID("F8");
                               faculty.setTeacherQualification("Masters");
                               faculty = department.getFacultyDirectory().addFaculty();
                               faculty.setTeacherName("Mathew");
                               faculty.setTecherID("F9");
                               faculty.setTeacherQualification("Masters");
                               
                            }
                            
                        }
                    }
                }
            }
            
            //
            
            if(university.getUnivName().equals("Northeastern"))
            {
                for(College college : university.getCollegeCatalog().getCollegeCatalogList())
                {
                    if(college.getCollegeName().equalsIgnoreCase("NEU COE"))
                    {
                        for(Department department : college.getDepartmentCatalog().getDepartmentCatalogList())
                        {
                            if(department.getDeptName().equalsIgnoreCase("ECE"))
                            {
                               Faculty faculty = department.getFacultyDirectory().addFaculty();
                               faculty.setTeacherName("Damien");
                               faculty.setTecherID("F10");
                               faculty.setTeacherQualification("PHD");
                               faculty = department.getFacultyDirectory().addFaculty();
                               faculty.setTeacherName("Martin");
                               faculty.setTecherID("F11");
                               faculty.setTeacherQualification("PHD");
                               faculty = department.getFacultyDirectory().addFaculty();
                               faculty.setTeacherName("Luther");
                               faculty.setTecherID("F12");
                               faculty.setTeacherQualification("PHD");
                               
                            }
                            else if(department.getDeptName().equalsIgnoreCase("CIVIL"))
                            {
                               Faculty faculty = department.getFacultyDirectory().addFaculty();
                               faculty.setTeacherName("Michael");
                               faculty.setTecherID("F13");
                               faculty.setTeacherQualification("PHD");
                               faculty = department.getFacultyDirectory().addFaculty();
                               faculty.setTeacherName("Beven");
                               faculty.setTecherID("F14");
                               faculty.setTeacherQualification("Masters");
                               faculty = department.getFacultyDirectory().addFaculty();
                               faculty.setTeacherName("Glen");
                               faculty.setTecherID("F15");
                               faculty.setTeacherQualification("Masters");
                            }
                        }
                    }
                    
                    else if(college.getCollegeName().equalsIgnoreCase("NEU Management"))
                    {
                        for(Department department : college.getDepartmentCatalog().getDepartmentCatalogList())
                        {
                            if(department.getDeptName().equalsIgnoreCase("Finance"))
                            {
                               Faculty faculty = department.getFacultyDirectory().addFaculty();
                               faculty.setTeacherName("Shoaib");
                               faculty.setTecherID("F16");
                               faculty.setTeacherQualification("Masters");
                               faculty = department.getFacultyDirectory().addFaculty();
                               faculty.setTeacherName("Shahid");
                               faculty.setTecherID("F17");
                               faculty.setTeacherQualification("PHD");
                               faculty = department.getFacultyDirectory().addFaculty();
                               faculty.setTeacherName("Salman");
                               faculty.setTecherID("F18");
                               faculty.setTeacherQualification("Masters");
                               
                            }
                            
                        }
                    }
                }
            }
        }
        return universityCatalog; 
    }
  
    
//calculating Revenue of One Student
  
  public static UniversityCatalog calucatingRevenueAtStudentLevel()
    {
       UniversityCatalog universityCatalog = addingCoursesToTranscript();
        for(University university : universityCatalog.getUniversityCatalogList()){
            if(university.getUnivName().equals("BU"))
            {
                for(College college : university.getCollegeCatalog().getCollegeCatalogList())
                {
                    if(college.getCollegeName().equalsIgnoreCase("BU COE"))
                    {
                        for(Department department : college.getDepartmentCatalog().getDepartmentCatalogList())
                        {
                            if(department.getDeptName().equalsIgnoreCase("CS"))
                            {
                               System.out.println("University: "+university.getUnivName()+", "+"College: "+college.getCollegeName()+", "+"Department: "+department.getDeptName());
                               for(Student student : department.getStudentDirectory().getStudentList())
                               {
                                   if(student.getStudentID().equalsIgnoreCase("S1"))
                                   {
                                       CourseLoad courseLoad = new CourseLoad(student.getStudentTranscript().getListOfStudentCourses());
                                       int n = courseLoad.totalCourseLoadOfStudent();
                                       courseLoad.getStudentAccount().setTotalCredits(n);
                                       int revenue = courseLoad.getStudentAccount().calculateRevenue();
                                       System.out.println("Student Name: "+student.getStudentName());
                                       System.out.println("Student ID: "+student.getStudentID());
                                       System.out.println("The Total Cost for this Student is: "+revenue);
                                       
                                   }
                               }
                               
                            }
                        }
                    }
                }
            }
        }
        return universityCatalog; 
    
        
    }
  
  //calculating Revenue of Student of a Calendar Years
  
  public static UniversityCatalog calucatingRevenueAtEachYearForOneDepartment()
    {
        int finalRevenue = 0;
        int year=0;
       UniversityCatalog universityCatalog = addingCoursesToTranscript();
        for(University university : universityCatalog.getUniversityCatalogList()){
            if(university.getUnivName().equals("BU"))
            {
                for(College college : university.getCollegeCatalog().getCollegeCatalogList())
                {
                    if(college.getCollegeName().equalsIgnoreCase("BU COE"))
                    {
                        for(Department department : college.getDepartmentCatalog().getDepartmentCatalogList())
                        {
                            if(department.getDeptName().equalsIgnoreCase("CS"))
                            {  
                                System.out.println("University: "+university.getUnivName()+", "+"College: "+college.getCollegeName());
                               for(Student student : department.getStudentDirectory().getStudentList())
                               {
                                   
                                   if(student.getYearGraduated().equalsIgnoreCase("2016"))
                                   {
                                       year = Integer.parseInt(student.getYearGraduated());
                                       CourseLoad courseLoad = new CourseLoad(student.getStudentTranscript().getListOfStudentCourses());
                                       int n = courseLoad.totalCourseLoadOfStudent();
                                       courseLoad.getStudentAccount().setTotalCredits(n);
                                       int revenue = courseLoad.getStudentAccount().calculateRevenue();
                                       //System.out.println("Student Total Cost: "+revenue);
                                       finalRevenue = revenue + finalRevenue;
                                       
                                   }
                                   
                               }
                               System.out.println("For year "+year+" Revenue generated is $"+finalRevenue+" for "+department.getDeptName()+" Department");
                               
                            }
                        }
                    }
                }
            }
        }
        return universityCatalog; 
    
        
    }
  
    //Assigning Grade to Student
      public static UniversityCatalog assigningGradeToStudent()
    {
        UniversityCatalog universityCatalog = courseLoad();
        for(University university : universityCatalog.getUniversityCatalogList())
        {
            if(university.getUnivName().equals("BU"))
            {
                for(College college : university.getCollegeCatalog().getCollegeCatalogList())
                {
                    if(college.getCollegeName().equalsIgnoreCase("BU COE"))
                    {
                        for(Department department : college.getDepartmentCatalog().getDepartmentCatalogList())
                        {
                            if(department.getDeptName().equalsIgnoreCase("CS"))
                            {
                                for(Student student : department.getStudentDirectory().getStudentList())
                                {
                                    if(student.getStudentID().equals("S1"))
                                    {
                                        StudentGradeDetails grade = student.getStudentTranscript().getCourseLoad().getSeatAssignment().addStudentGrade();
                                        grade.setSubject("AED");
                                        grade.setGrade("4.5");
                                        grade = student.getStudentTranscript().getCourseLoad().getSeatAssignment().addStudentGrade();
                                        grade.setSubject("DBMS");
                                        grade.setGrade("4.1");
                                    }
                                    
                                    else if(student.getStudentID().equals("S2"))
                                    {
                                        StudentGradeDetails grade = student.getStudentTranscript().getCourseLoad().getSeatAssignment().addStudentGrade();
                                        grade.setSubject("AED");
                                        grade.setGrade("4.2");
                                        grade = student.getStudentTranscript().getCourseLoad().getSeatAssignment().addStudentGrade();
                                        grade.setSubject("Web Tools");
                                        grade.setGrade("4.1");
                                    }
                                    
                                    else if(student.getStudentID().equals("S13"))
                                    {
                                        StudentGradeDetails grade = student.getStudentTranscript().getCourseLoad().getSeatAssignment().addStudentGrade();
                                        grade.setSubject("AED");
                                        grade.setGrade("4.2");
                                        grade = student.getStudentTranscript().getCourseLoad().getSeatAssignment().addStudentGrade();
                                        grade.setSubject("Web Tools");
                                        grade.setGrade("4.1");
                                        grade = student.getStudentTranscript().getCourseLoad().getSeatAssignment().addStudentGrade();
                                        grade.setSubject("DBMS");
                                        grade.setGrade("4.1");
                                    }
                                    
                                    else if(student.getStudentID().equals("S14"))
                                    {
                                        StudentGradeDetails grade = student.getStudentTranscript().getCourseLoad().getSeatAssignment().addStudentGrade();
                                        grade.setSubject("AED");
                                        grade.setGrade("4.2");
                                        grade = student.getStudentTranscript().getCourseLoad().getSeatAssignment().addStudentGrade();
                                        grade.setSubject("Web Tools");
                                        grade.setGrade("4.1");
                                        grade = student.getStudentTranscript().getCourseLoad().getSeatAssignment().addStudentGrade();
                                        grade.setSubject("DBMS");
                                        grade.setGrade("4.1");
                                    }
                                    
                                    else if(student.getStudentID().equals("S15"))
                                    {
                                        StudentGradeDetails grade = student.getStudentTranscript().getCourseLoad().getSeatAssignment().addStudentGrade();
                                        grade.setSubject("Web Tools");
                                        grade.setGrade("4.1");
                                        grade = student.getStudentTranscript().getCourseLoad().getSeatAssignment().addStudentGrade();
                                        grade.setSubject("DBMS");
                                        grade.setGrade("4.1");
                                    }
                                }
                                   
                            }
                            
                            //
                            if(department.getDeptName().equalsIgnoreCase("IS"))
                            {
                                for(Student student : department.getStudentDirectory().getStudentList())
                                {
                                    if(student.getStudentID().equals("S3"))
                                    {
                                        StudentGradeDetails grade = student.getStudentTranscript().getCourseLoad().getSeatAssignment().addStudentGrade();
                                        grade.setSubject("OOPS");
                                        grade.setGrade("4.1");
                                        grade = student.getStudentTranscript().getCourseLoad().getSeatAssignment().addStudentGrade();
                                        grade.setSubject("Data Mining");
                                        grade.setGrade("4.1");
                                    }
                                    
                                    else if(student.getStudentID().equals("S4"))
                                    {
                                        StudentGradeDetails grade = student.getStudentTranscript().getCourseLoad().getSeatAssignment().addStudentGrade();
                                        grade.setSubject("OOPS");
                                        grade.setGrade("4.1");
                                        grade = student.getStudentTranscript().getCourseLoad().getSeatAssignment().addStudentGrade();
                                        grade.setSubject("Advanced DBMS");
                                        grade.setGrade("4.1");
                                        
                                    }
                                    
                                }
                                   
                            } 
                        }
                    }
                    //
                    
                    if(college.getCollegeName().equalsIgnoreCase("BU Management"))
                    {
                        for(Department department : college.getDepartmentCatalog().getDepartmentCatalogList())
                        {
                            if(department.getDeptName().equalsIgnoreCase("HR"))
                            {
                                for(Student student : department.getStudentDirectory().getStudentList())
                                {
                                    if(student.getStudentID().equals("S5"))
                                    {
                                        StudentGradeDetails grade = student.getStudentTranscript().getCourseLoad().getSeatAssignment().addStudentGrade();
                                        grade.setSubject("Recruiter");
                                        grade.setGrade("4.1");
                                        grade = student.getStudentTranscript().getCourseLoad().getSeatAssignment().addStudentGrade();
                                        grade.setSubject("Business Skills");
                                        grade.setGrade("4.1");
                                    }
                                    
                                    else if(student.getStudentID().equals("S6"))
                                    {
                                         StudentGradeDetails grade = student.getStudentTranscript().getCourseLoad().getSeatAssignment().addStudentGrade();
                                        grade.setSubject("Recruiter");
                                        grade.setGrade("4.1");
                                        grade = student.getStudentTranscript().getCourseLoad().getSeatAssignment().addStudentGrade();
                                        grade.setSubject("Presentation");
                                        grade.setGrade("4.1");
                                    }
                                }
                                   
                            } 
                        }
                    }
                    
                }
            }
            //
            
            if(university.getUnivName().equals("Northeastern"))
            {
                for(College college : university.getCollegeCatalog().getCollegeCatalogList())
                {
                    if(college.getCollegeName().equalsIgnoreCase("NEU COE"))
                    {
                        for(Department department : college.getDepartmentCatalog().getDepartmentCatalogList())
                        {
                            if(department.getDeptName().equalsIgnoreCase("ECE"))
                            {
                                for(Student student : department.getStudentDirectory().getStudentList())
                                {
                                    if(student.getStudentID().equals("S7"))
                                    {
                                        StudentGradeDetails grade = student.getStudentTranscript().getCourseLoad().getSeatAssignment().addStudentGrade();
                                        grade.setSubject("Complier Design");
                                        grade.setGrade("4.1");
                                        grade = student.getStudentTranscript().getCourseLoad().getSeatAssignment().addStudentGrade();
                                        grade.setSubject("Networking");
                                        grade.setGrade("4.1");
                                        grade = student.getStudentTranscript().getCourseLoad().getSeatAssignment().addStudentGrade();
                                        grade.setSubject("Microprocessor");
                                        grade.setGrade("4.1");
                                    }
                                    
                                    else if(student.getStudentID().equals("S8"))
                                    {
                                        StudentGradeDetails grade = student.getStudentTranscript().getCourseLoad().getSeatAssignment().addStudentGrade();
                                        grade.setSubject("Complier Design");
                                        grade.setGrade("4.1");
                                        grade = student.getStudentTranscript().getCourseLoad().getSeatAssignment().addStudentGrade();
                                        grade.setSubject("Networking");
                                        grade.setGrade("4.1");
                                    }
                                   
                                }
                                   
                            }
                            
                            //
                            if(department.getDeptName().equalsIgnoreCase("CIVIL"))
                            {
                                for(Student student : department.getStudentDirectory().getStudentList())
                                {
                                    if(student.getStudentID().equals("S9"))
                                    {
                                       StudentGradeDetails grade = student.getStudentTranscript().getCourseLoad().getSeatAssignment().addStudentGrade();
                                        grade.setSubject("Steel Design");
                                        grade.setGrade("4.1");
                                        grade = student.getStudentTranscript().getCourseLoad().getSeatAssignment().addStudentGrade();
                                        grade.setSubject("Bridge Design");
                                        grade.setGrade("4.1");
                                    }
                                    
                                    else if(student.getStudentID().equals("S10"))
                                    {
                                        StudentGradeDetails grade = student.getStudentTranscript().getCourseLoad().getSeatAssignment().addStudentGrade();
                                        grade.setSubject("Steel Design");
                                        grade.setGrade("4.1");
                                        grade = student.getStudentTranscript().getCourseLoad().getSeatAssignment().addStudentGrade();
                                        grade.setSubject("Bridge Design");
                                        grade.setGrade("4.1");
                                        grade = student.getStudentTranscript().getCourseLoad().getSeatAssignment().addStudentGrade();
                                        grade.setSubject("Concrete Technology");
                                        grade.setGrade("4.1");
                                        
                                    }
                                    
                                }
                                   
                            } 
                        }
                    }
                    //
                    
                    if(college.getCollegeName().equalsIgnoreCase("NEU Management"))
                    {
                        for(Department department : college.getDepartmentCatalog().getDepartmentCatalogList())
                        {
                            if(department.getDeptName().equalsIgnoreCase("Finance"))
                            {
                                for(Student student : department.getStudentDirectory().getStudentList())
                                {
                                    if(student.getStudentID().equals("S11"))
                                    {
                                        StudentGradeDetails grade = student.getStudentTranscript().getCourseLoad().getSeatAssignment().addStudentGrade();
                                        grade.setSubject("Financial Marketing");
                                        grade.setGrade("4.1");
                                        grade = student.getStudentTranscript().getCourseLoad().getSeatAssignment().addStudentGrade();
                                        grade.setSubject("Debt Analysis");
                                        grade.setGrade("4.1");
                                    }
                                    
                                    else if(student.getStudentID().equals("S12"))
                                    {
                                        StudentGradeDetails grade = student.getStudentTranscript().getCourseLoad().getSeatAssignment().addStudentGrade();
                                        grade.setSubject("Financial Marketing");
                                        grade.setGrade("4.1");
                                        grade = student.getStudentTranscript().getCourseLoad().getSeatAssignment().addStudentGrade();
                                        grade.setSubject("Debt Analysis");
                                        grade.setGrade("4.1");
                                        grade = student.getStudentTranscript().getCourseLoad().getSeatAssignment().addStudentGrade();
                                        grade.setSubject("International Marketing");
                                        grade.setGrade("4.1");
                                    }
                                }
                                   
                            } 
                        }
                    }
                    
                }
            }
        }
        return universityCatalog;     
    }
  
  //GPA CALCULATION
  public static UniversityCatalog displayingGPA(){
      
      UniversityCatalog universityCatalog = Initialization.assigningGradeToStudent();
      for(University university : universityCatalog.getUniversityCatalogList()){
            if(university.getUnivName().equals("BU"))
            {
                for(College college : university.getCollegeCatalog().getCollegeCatalogList())
                {
                    if(college.getCollegeName().equalsIgnoreCase("BU COE"))
                    {
                        for(Department department : college.getDepartmentCatalog().getDepartmentCatalogList())
                        {
                            if(department.getDeptName().equalsIgnoreCase("CS"))
                            {
                               for(Student student : department.getStudentDirectory().getStudentList())
                               {
                                   if(student.getStudentID().equalsIgnoreCase("S1"))
                                   {
                                       System.out.println("University: "+university.getUnivName()+", "+"College: "+college.getCollegeName()+", "+"Department: "+department.getDeptName());
                                       float GPA = student.getStudentTranscript().getCourseLoad().getSeatAssignment().calculateGPA();
                                       System.out.println("Student Name: "+student.getStudentName());
                                       System.out.println("Student ID: "+student.getStudentID());
                                       System.out.println("Student Gpa: "+GPA);
                                   }
                               }
                               
                            }
                        }
                    }
                }
            }
        }
      return universityCatalog;
  }
  
  
  
  //Calculate Seat For Courses
  
  public static UniversityCatalog displayingSeatCourseWise(){
      
      UniversityCatalog universityCatalog = Initialization.assigningGradeToStudent();
      for(University university : universityCatalog.getUniversityCatalogList()){
            if(university.getUnivName().equals("BU"))
            {
                for(College college : university.getCollegeCatalog().getCollegeCatalogList())
                {
                    if(college.getCollegeName().equalsIgnoreCase("BU COE"))
                    {
                        for(Department department : college.getDepartmentCatalog().getDepartmentCatalogList())
                        {
                            if(department.getDeptName().equalsIgnoreCase("CS"))
                            {
                                System.out.println("University: "+university.getUnivName()+", "+"College: "+college.getCollegeName());
                                int aed=0;
                                int dbms=0;
                                int webTools=0;
                               for(Student student : department.getStudentDirectory().getStudentList())
                               {
                                   Seat seat = new Seat(student.getStudentTranscript().getListOfStudentCourses());
                                   seat.courseViseSeatLeft();
                                    aed = seat.getAedSeats();
                                    dbms = seat.getDbmsSeats();
                                    webTools = seat.getWebToolsSeats();
                               }
                               System.out.println("Remaining Seats in "+department.getDeptName()+" Department in AED are "+aed);
                               System.out.println("Remaining Seats in "+department.getDeptName()+" Department in DBMS are "+dbms);
                               System.out.println("Remaining Seats in "+department.getDeptName()+" Department in WebTools are "+webTools);
                            }
                        }
                    }
                }
            }
        }
      return universityCatalog;
  }
  
  
}

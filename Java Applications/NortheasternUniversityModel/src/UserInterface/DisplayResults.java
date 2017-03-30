/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface;

import Business.College;
import Business.Course;
import Business.CourseCatalog;
import Business.CourseLoad;
import Business.CourseSchedule;
import Business.Department;
import Business.Faculty;
import Business.Initialization;
import static Business.Initialization.addingCoursesToTranscript;
import Business.Staff;
import Business.Student;
import Business.University;
import Business.UniversityCatalog;
/**
 *
 * @author kkgarg
 */
public class DisplayResults {
    public void displayUniversity()
    {
        //Displaying all the University
        
        UniversityCatalog universityCatalog = Initialization.addUniversity();
        System.out.println("All Universities in the Ecosystem are: ");
         for(University university : universityCatalog.getUniversityCatalogList())
            {
                System.out.println(university.getUnivName());
            }
    }
    
    public void displayCollege()
    {
        // Displaying the College of Specific University
            
            UniversityCatalog universityCatalog = Initialization.addCollege();
            System.out.println("*****Displaying Colleges in All Universities*****");
            for(University university : universityCatalog.getUniversityCatalogList())
            {
                if(university.getUnivName().equalsIgnoreCase("BU"))
                {
                    System.out.println("All Collges in BU are: ");
                    for(College college : university.getCollegeCatalog().getCollegeCatalogList())
                    {
                        System.out.println(college.getCollegeName());
                    }
                    System.out.println("------------------");
                }
                if(university.getUnivName().equalsIgnoreCase("Northeastern"))
                {
                    System.out.println("All Collges in NEU are: ");
                    for(College college : university.getCollegeCatalog().getCollegeCatalogList())
                    {
                        System.out.println(college.getCollegeName());
                    }
                }
            }   
    }
    
    public void displayDepartment()
    {
        // Displaying the department of Specific College
            
            UniversityCatalog universityCatalog = Initialization.addDepartment();
            
            for(University university : universityCatalog.getUniversityCatalogList())
            {
                if(university.getUnivName().equalsIgnoreCase("BU"))
                {
                    System.out.println("University - "+university.getUnivName());
                    
                    for(College college : university.getCollegeCatalog().getCollegeCatalogList())
                    {
                        if(college.getCollegeName().equalsIgnoreCase("BU COE"))
                        {
                            System.out.println("Displaying All Department of BU COE: ");
                            for(Department department : college.getDepartmentCatalog().getDepartmentCatalogList())
                            {
                                System.out.println(department.getDeptName());
                            }
                        }
                        
                       if(college.getCollegeName().equalsIgnoreCase("BU Management"))
                        {
                            System.out.println("Displaying All Department of BU Management: ");
                            for(Department department : college.getDepartmentCatalog().getDepartmentCatalogList())
                            {
                                System.out.println(department.getDeptName());
                            }
                        } 
                    }
                }  
                
                if(university.getUnivName().equalsIgnoreCase("Northeastern"))
                   System.out.println("-----------------------------------------------------------");
                   System.out.println("University - "+university.getUnivName());
                {
                    
                    for(College college : university.getCollegeCatalog().getCollegeCatalogList())
                    {
                        if(college.getCollegeName().equalsIgnoreCase("NEU COE"))
                        {
                            System.out.println("Displaying All Department of NEU COE: ");
                            for(Department department : college.getDepartmentCatalog().getDepartmentCatalogList())
                            {
                                System.out.println(department.getDeptName());
                            }
                        }
                        
                        if(college.getCollegeName().equalsIgnoreCase("NEU Management"))
                        {
                            System.out.println("Displaying All Department of NEU Management: ");
                            for(Department department : college.getDepartmentCatalog().getDepartmentCatalogList())
                            {
                                System.out.println(department.getDeptName());
                            }
                        } 
                    }
                } 
            }    
    }
    
    public void displayStudent()
   {
       // Displaying Student of BU University , BU COE (College) & CS Department
       UniversityCatalog universityCatalog = Initialization.addStudent();
           //System.out.println("Displaying Student of BU University,BU COE(College) & CS Department:");
           for(University university : universityCatalog.getUniversityCatalogList())
           {
               if(university.getUnivName().equalsIgnoreCase("BU"))
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
                                       System.out.println("Student's Name: "+student.getStudentName());
                                       System.out.println("Student's ID: "+student.getStudentID());
                                       System.out.println("Student's Age: "+student.getStudentAge());
                                       System.out.println("--------------------------------------------------");
                                   }
                               }
                           }
                       }
                   }
               }  
           }    
   }
    
    
    public void displayCourseCatalog()
   {
       // Displaying Student of BU University , BU COE (College) & CS Department
       UniversityCatalog universityCatalog = Initialization.addCourseInCourseCatalog();
           //System.out.println("Displaying Course Catalog of BU University,BU COE(College) & CS Department:");
           for(University university : universityCatalog.getUniversityCatalogList())
           {
               if(university.getUnivName().equalsIgnoreCase("BU"))
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
                                   for(Course course : department.getCoursecatalog().getCourseCatatogList())
                                   {
                                       System.out.println("Couse Name: "+course.getCourseName());
                                       System.out.println("Course ID: "+course.getCourseID());
                                       System.out.println("Coures Credits: "+course.getCourseCredits());
                                       System.out.println("---------------------------------------------");
                                   }
                               }
                           }
                       }
                   }
               }  
           }    
   }
    
     public void displayCourseSchedule()
    {
        // Displaying Student of BU University , BU COE (College) & CS Department
        UniversityCatalog universityCatalog = Initialization.courseSchedule();
            for(University university : universityCatalog.getUniversityCatalogList())
            {
                if(university.getUnivName().equalsIgnoreCase("BU"))
                {
                    for(College college : university.getCollegeCatalog().getCollegeCatalogList())
                    {
                        if(college.getCollegeName().equalsIgnoreCase("BU COE"))
                        {
                            for(Department department : college.getDepartmentCatalog().getDepartmentCatalogList())
                            {
                                if(department.getDeptName().equalsIgnoreCase("IS"))
                                {
                                    System.out.println("University: "+university.getUnivName()+", "+"College: "+college.getCollegeName()+", "+"Department: "+department.getDeptName());
                                    for(CourseSchedule courseSchedule : department.getCourseScheduleDirectory().getCourseScheduleList())
                                    {
                                        System.out.println("Course Name: "+courseSchedule.getCourseName());
                                        System.out.println("Course ID: "+courseSchedule.getCourseID());
                                        System.out.println("Semester: "+courseSchedule.getSemesterName());
                                        System.out.println("Faculty Name: "+courseSchedule.getTeacherName());
                                        System.out.println("Location: "+courseSchedule.getRoomNumber());
                                        System.out.println("--------------------------------");
                                    }
                                }
                            }
                        }
                    }
                }  
            }    
    }
    
   public void displayCourseOfferingInASemester(){
       UniversityCatalog universityCatalog = Initialization.courseOfferingInASemester();
       
   } 
    
     
     public void displayTranscript()
    {
        // Displaying Student of BU University , BU COE (College) & CS Department
        //UniversityCatalog universityCatalog = Initialization.addingCoursesToTranscript();
        UniversityCatalog universityCatalog = Initialization.assigningGradeToStudent();
            for(University university : universityCatalog.getUniversityCatalogList())
            {
                if(university.getUnivName().equalsIgnoreCase("Northeastern"))
                {
                    for(College college : university.getCollegeCatalog().getCollegeCatalogList())
                    {
                        if(college.getCollegeName().equalsIgnoreCase("NEU Management"))
                        {
                            for(Department department : college.getDepartmentCatalog().getDepartmentCatalogList())
                            {
                                if(department.getDeptName().equalsIgnoreCase("Finance"))
                                {
                                    for(Student student : department.getStudentDirectory().getStudentList())
                                    {
                                        if(student.getStudentID().equals("S12"))
                                        {   
                                            System.out.println("University: "+university.getUnivName());
                                            System.out.println("College: "+college.getCollegeName()+", Department: "+department.getDeptName());
                                            System.out.println("Student's Name: "+student.getStudentName()+", Student's ID:"+student.getStudentID());
                                            
                                            System.out.println("************TRANSCRIPT***************");
                                            
                                            for(Course course : student.getStudentTranscript().getListOfStudentCourses())
                                            {
                                                System.out.println("Course Name: "+course.getCourseName());
                                                System.out.println("Course Credits: "+course.getCourseCredits());
                                                System.out.println("-------------------------------------------------------------");
                                            }
                                            
                                            float GPA = student.getStudentTranscript().getCourseLoad().getSeatAssignment().calculateGPA();
                                            System.out.println("GPA of "+student.getStudentName()+" is "+GPA+" out of 5");
                                            
                                        }
                                    }
                                }
                            }
                        }
                    }
                }  
            }    
    }       
     
     
    
     public void displayCouseLoad()
    {
       UniversityCatalog universityCatalog = Initialization.courseLoad();
        
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
                                
                                System.out.println("University: "+university.getUnivName()+", "+"College: "+college.getCollegeName()+", "+"Department: "+department.getDeptName());
                                for(Student student : department.getStudentDirectory().getStudentList())
                                {
                                    if(student.getStudentID().equals("S1"))
                                    {
                                        CourseLoad courseLoad = new CourseLoad(student.getStudentTranscript().getListOfStudentCourses());
                                        //int totalLoad = courseLoad.totalCourseLoadOfStudent();
                                        System.out.println("Course Load of Student "+student.getStudentID()+": "+courseLoad.totalCourseLoadOfStudent());
                                    }
                                }
                                   
                            }       
                        }
                    }
                }
            }
        }
        
    }
     
     public void displayPlacementPercentageOfOneDepartment()
    {
        UniversityCatalog universityCatalog = Initialization.placementPercentageOfOneDepartment();       
    } 
     
     public void displayPlacementPercentageOfAllDepartments()
    {
        UniversityCatalog universityCatalog = Initialization.placementPercentageOfAllDepartments();       
    }
     
     public void displayPlacementPercentageOfAllColleges()
    {
        UniversityCatalog universityCatalog = Initialization.placementPercentageOfAllColleges();       
    }
     
     public void displayPlacementPercentageOfAllUniveristy()
    {
        UniversityCatalog universityCatalog = Initialization.placementPercentageOfAllUniversity();       
    }
     
     public void displayStudentFacultyRatio()
    {
        UniversityCatalog universityCatalog = Initialization.calculatingStudentFacultyRatio();       
    }
     
     public void displayStaffOfOneDepartment()
    {
        UniversityCatalog universityCatalog = Initialization.addStaff();
            for(University university : universityCatalog.getUniversityCatalogList())
            {
                if(university.getUnivName().equalsIgnoreCase("BU"))
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
                                    System.out.println("Displaying Staff of "+department.getDeptName()+" Department");
                                   for(Staff staff : department.getStaffDirectory().getStaffList())
                                   {
                                       System.out.println("Staff Name: "+staff.getStaffName());
                                       System.out.println("Staff ID: "+staff.getStaffID());
                                       System.out.println("Active Year: "+staff.getActiveYear());
                                       System.out.println("-----------------");
                                   }
                                }
                            }
                        }
                    }
                }  
            }    
        
    }
     
     public void displayStaffEmployementRatioOfOneDepartment()
    {
        UniversityCatalog universityCatalog = Initialization.calculateStaffEmployementPercentageChangeOfDepartment();       
    }
     
     public void displayStudentGraduationPercentageOfOneDepartment()
    {
        UniversityCatalog universityCatalog = Initialization.calculateStudentGraduationPercentageOfOneDepartment();       
    }
     
     public void diplayStudentGraduationPercentageOfAllDepartments(){
         Initialization.calculateStudentGraduationPercentageOfAllDepartments();
     }
     
     public void displayStudentGraduationPercentageOfAllColleges(){
         Initialization.calculateStudentGraduationPercentageOfAllColleges();
     }
     public void displayStudentGraduationPercentageOfAllUniversities(){
         Initialization.calculateStudentGraduationPercentageOfAllUniversities();
     }
     
     public void displayFaculty()
    {
        UniversityCatalog universityCatalog = Initialization.addFaculty();
            for(University university : universityCatalog.getUniversityCatalogList())
            {
                if(university.getUnivName().equalsIgnoreCase("BU"))
                {
                    System.out.println("University: "+university.getUnivName());
                    for(College college : university.getCollegeCatalog().getCollegeCatalogList())
                    {
                        if(college.getCollegeName().equalsIgnoreCase("BU COE"))
                        {
                            System.out.println("College: "+college.getCollegeName());
                            for(Department department : college.getDepartmentCatalog().getDepartmentCatalogList())
                            {
                                if(department.getDeptName().equalsIgnoreCase("CS"))
                                {
                                    System.out.println("Displaying Faculty of "+department.getDeptName()+" Department");
                                   for(Faculty faculty : department.getFacultyDirectory().getFacultyList())
                                   {
                                       System.out.println("Faculty Name: "+faculty.getTeacherName());
                                       System.out.println("Faculty ID: "+faculty.getTecherID());
                                       System.out.println("Faculty Qualification: "+faculty.getTeacherQualification());
                                       System.out.println("-----------------");
                                   }
                                }
                            }
                        }
                    }
                }  
            }    
        
    }
     
     
     
     //Displaying only PHD Faculty in a Department
     
     public void displayPHDInOneDepartment()
    {
        UniversityCatalog universityCatalog = Initialization.addFaculty();
            for(University university : universityCatalog.getUniversityCatalogList())
            {
                if(university.getUnivName().equalsIgnoreCase("BU"))
                {
                    System.out.println("University: "+university.getUnivName());
                    for(College college : university.getCollegeCatalog().getCollegeCatalogList())
                    {
                        if(college.getCollegeName().equalsIgnoreCase("BU COE"))
                        {
                            System.out.println("College: "+college.getCollegeName());
                            for(Department department : college.getDepartmentCatalog().getDepartmentCatalogList())
                            {
                                if(department.getDeptName().equalsIgnoreCase("CS"))
                                {
                                    System.out.println("Displaying All PHD's of "+department.getDeptName()+" Department");
                                   for(Faculty faculty : department.getFacultyDirectory().getFacultyList())
                                   {
                                       if(faculty.getTeacherQualification().equalsIgnoreCase("PHD"))
                                       {
                                            System.out.println("Faculty Name: "+faculty.getTeacherName());
                                            System.out.println("Faculty ID: "+faculty.getTecherID());
                                            System.out.println("-----------------");
                                       }
                                   }
                                }
                            }
                        }
                    }
                }  
            }    
        
    }
     
     //displaying PHD's of One college
     
     public void displayPHDInOneCollege()
    {
        UniversityCatalog universityCatalog = Initialization.addFaculty();
            for(University university : universityCatalog.getUniversityCatalogList())
            {
                if(university.getUnivName().equalsIgnoreCase("BU"))
                {
                    System.out.println("Displaying PHD Faculty In "+university.getUnivName()+" University");
                    for(College college : university.getCollegeCatalog().getCollegeCatalogList())
                    {
                        if(college.getCollegeName().equalsIgnoreCase("BU COE"))
                        {
                            System.out.println("For "+college.getCollegeName()+":");
                            for(Department department : college.getDepartmentCatalog().getDepartmentCatalogList())
                            {
                                
                                    System.out.println("Displaying All PHD's of "+department.getDeptName()+" Department");
                                   for(Faculty faculty : department.getFacultyDirectory().getFacultyList())
                                   {
                                       if(faculty.getTeacherQualification().equalsIgnoreCase("PHD"))
                                       {
                                            System.out.println("Faculty Name: "+faculty.getTeacherName());
                                            System.out.println("Faculty ID: "+faculty.getTecherID());
                                            System.out.println("-----------------");
                                       }
                                   }
                                
                            }
                        }
                    }
                }  
            }    
        
    }
    
     //displaying PHD's of One University
     
     public void displayPHDInOneUniversity()
    {
        UniversityCatalog universityCatalog = Initialization.addFaculty();
            for(University university : universityCatalog.getUniversityCatalogList())
            {
                if(university.getUnivName().equalsIgnoreCase("BU"))
                {
                    System.out.println("Displaying PHD Faculty In "+university.getUnivName()+" University");
                    for(College college : university.getCollegeCatalog().getCollegeCatalogList())
                    {
                            System.out.println("For "+college.getCollegeName()+":");
                            for(Department department : college.getDepartmentCatalog().getDepartmentCatalogList())
                            {
                                
                                    System.out.println("Displaying All PHD's of "+department.getDeptName()+" Department");
                                   for(Faculty faculty : department.getFacultyDirectory().getFacultyList())
                                   {
                                       if(faculty.getTeacherQualification().equalsIgnoreCase("PHD"))
                                       {
                                            System.out.println("Faculty Name: "+faculty.getTeacherName());
                                            System.out.println("Faculty ID: "+faculty.getTecherID());
                                            System.out.println("-----------------");
                                       }
                                   }
                                
                            }
                        
                    }
                }  
            }    
        
    }
     
     //displaying PHD's of One Ecosystem
     
     public void displayPHDInOneEcosystem()
    {
        UniversityCatalog universityCatalog = Initialization.addFaculty();
        System.out.println("*****Displaying PHD Faculty of Complete Ecosystem*****");
            for(University university : universityCatalog.getUniversityCatalogList())
            {
                    System.out.println("Displaying PHD Faculty In "+university.getUnivName()+" Univeristy");
                    for(College college : university.getCollegeCatalog().getCollegeCatalogList())
                    {
                            System.out.println("For "+college.getCollegeName()+":");
                            for(Department department : college.getDepartmentCatalog().getDepartmentCatalogList())
                            {
                                
                                    System.out.println("Displaying All PHD's of "+department.getDeptName()+" Department");
                                   for(Faculty faculty : department.getFacultyDirectory().getFacultyList())
                                   {
                                       if(faculty.getTeacherQualification().equalsIgnoreCase("PHD"))
                                       {
                                            System.out.println("Faculty Name: "+faculty.getTeacherName());
                                            System.out.println("Faculty ID: "+faculty.getTecherID());
                                            System.out.println("-----------------");
                                       }
                                   }
                                
                            }
                        
                    }
                 
            }    
        
    }
     
      public void displayStudentRevenue()
      {
          Initialization.calucatingRevenueAtStudentLevel();
      }
      
       public void displayStudentRevenueForOneDepartment()
      {
          Initialization.calucatingRevenueAtEachYearForOneDepartment();
      }
       
       public void displayGPA()
      {
          Initialization.displayingGPA();
      }
       
       
       public void displayRemainingSeatCourseWise(){
           Initialization.displayingSeatCourseWise();
       }
       
     
     
}

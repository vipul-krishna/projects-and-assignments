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
public class StudentDirectory {
    
    private float graduationCounter2016;
    private float graduationCounter2015;
    private ArrayList<Student> studentList;
    
    public StudentDirectory(){
        studentList = new ArrayList<Student>();
        
    }

    public ArrayList<Student> getStudentList() {
        return studentList;
    }
    
    public Student addStudent(){
        Student student = new Student();
        studentList.add(student);
        return student;
    }
    
    public float placementPercentage(){
     float counter= 0.0f;
        for(Student student : studentList)
        {
            if(student.getPlacementStatus().equalsIgnoreCase("Yes"))
            {
                counter++;
            }
        
        }
        
        float size = studentList.size();
        float placementRate= (counter/size)*100;
        return placementRate;
    }
    
    public float gradutaionRate(){
            for(Student student : studentList){
            if(student.getYearGraduated().equalsIgnoreCase("2015"))
            {
                graduationCounter2015++;
            }
            else if(student.getYearGraduated().equalsIgnoreCase("2016"))
            {
                graduationCounter2016++;
            }
        }
       
        float studentGraduationPercentageChange = ((graduationCounter2016-graduationCounter2015)/graduationCounter2016)*100;
        
        return studentGraduationPercentageChange;
    }
}

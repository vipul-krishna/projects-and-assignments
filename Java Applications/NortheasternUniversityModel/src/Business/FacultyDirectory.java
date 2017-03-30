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
public class FacultyDirectory {
    
    private ArrayList<Faculty> facultyList;
    
    public FacultyDirectory(){
    this.facultyList = new ArrayList<Faculty>();
    }

    public ArrayList<Faculty> getFacultyList() {
        return facultyList;
    }

    public void setFacultyList(ArrayList<Faculty> facultyList) {
        this.facultyList = facultyList;
    }
    
    public Faculty addFaculty()
    {
        Faculty faculty = new Faculty();
        facultyList.add(faculty);
        return faculty;
    }
    
}

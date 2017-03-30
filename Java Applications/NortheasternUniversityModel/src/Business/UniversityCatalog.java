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
public class UniversityCatalog {
 
    private ArrayList<University> universityCatalogList;

    public UniversityCatalog() {
        this.universityCatalogList = new ArrayList<University>();
    }

    public ArrayList<University> getUniversityCatalogList() {
        return universityCatalogList;
    }

  
    
    
    public University addUniversity(){
    University university = new University();
    universityCatalogList.add(university);
    return university;
    }
}

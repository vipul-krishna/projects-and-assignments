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
public class CollegeCatalog {
    
    private ArrayList<College> collegeCatalogList;
    
    public CollegeCatalog(){
    this.collegeCatalogList = new ArrayList<College>();
    
    }

    public ArrayList<College> getCollegeCatalogList() {
        return collegeCatalogList;
    }
    
    public College addCollege(){
    College college = new College();
    collegeCatalogList.add(college);
    return college;
    }
    
}

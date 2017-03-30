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
public class University {
    private String univName;
    private CollegeCatalog collegeCatalog;
    

    public University() {
        this.collegeCatalog = new CollegeCatalog();
    }

    public CollegeCatalog getCollegeCatalog() {
        return collegeCatalog;
    }

    
    
    public String getUnivName() {
        return univName;
    }

    public void setUnivName(String univName) {
        this.univName = univName;
    }

   
}
    


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
public class College {
    
    private String collegeName;
    private DepartmentCatalog departmentCatalog;

    public College() {
        departmentCatalog = new DepartmentCatalog();
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public DepartmentCatalog getDepartmentCatalog() {
        return departmentCatalog;
    }

    
}

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
public class DepartmentCatalog {
    private ArrayList<Department> departmentCatalogList;
    
    public DepartmentCatalog(){
    
    this.departmentCatalogList = new ArrayList<Department>();
    }

    public ArrayList<Department> getDepartmentCatalogList() {
        return departmentCatalogList;
    }
    
    public Department addDepartment(){
    Department department = new Department();
    departmentCatalogList.add(department);
    return department;
    }
}

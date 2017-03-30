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
public class StaffDirectory {
    
    private float jobCounter2016=0;
    private float jobCounter2015=0;
    private ArrayList<Staff> staffList;
    
    public StaffDirectory(){
    
        this.staffList = new ArrayList<Staff>();
        
    }

    public ArrayList<Staff> getStaffList() {
        return staffList;
    }
    
    
    public Staff addStaff(){
        Staff staff = new Staff();
        staffList.add(staff);
        return staff;
    }
    
    public float jobOpeningRatioOfDepartment(){
            for(Staff staff : staffList){
            if(staff.getActiveYear().equalsIgnoreCase("2015"))
            {
                jobCounter2015++;
            }
            else if(staff.getActiveYear().equalsIgnoreCase("2016"))
            {
                jobCounter2016++;
            }
        }
       
        float percentageChange = ((jobCounter2016-jobCounter2015)/jobCounter2016)*100;
        
        return percentageChange;
    }
    
    
}

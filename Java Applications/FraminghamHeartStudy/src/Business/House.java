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
public class House {
    
    
    private String houseNumber;
    private ArrayList<Family> familyList; 
    
    
    public House()
    {
        this.familyList = new ArrayList<Family>();
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public ArrayList<Family> getFamilyList() {
        return familyList;
    }
    
        
    public Family addFamily(){
        Family family = new Family();
        familyList.add(family);
        return family;
    }
    
    
}

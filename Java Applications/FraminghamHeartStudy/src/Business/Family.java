/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;


public class Family {
    
    private String familyName;
    private ArrayList<FamilyMembers> membersList;
    
    public Family()
    {
        this.membersList = new ArrayList<FamilyMembers>();
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public ArrayList<FamilyMembers> getMembersList() {
        return membersList;
    }
    
        
    public FamilyMembers addMembers(){
        FamilyMembers familyMembers = new FamilyMembers();
        membersList.add(familyMembers);
        return familyMembers;
    }
    
}

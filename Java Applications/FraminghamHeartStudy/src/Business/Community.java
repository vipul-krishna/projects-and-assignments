/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;


public class Community {
    
    private String communityName;
    private ArrayList<House> houseList;
    
    public Community()
    {
        this.houseList = new ArrayList<House>();
    }

    public String getCommunityName() {
        return communityName;
    }

    public void setCommunityName(String communityName) {
        this.communityName = communityName;
    }

    public ArrayList<House> getHouseList() {
        return houseList;
    }
    
        
    public House addHouse(){
        House house = new House();
        houseList.add(house);
        return house;
    }
    
    
    
}

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
public class StudentAccount {
    
    private int creditValue = 1470;
    private int revenue;
    private int totalCredits;
    

    public void setTotalCredits(int totalCredits) {
        this.totalCredits = totalCredits;
    }
    
    public int calculateRevenue(){
        
        revenue = creditValue*this.totalCredits;
        return revenue;
    }
    
}

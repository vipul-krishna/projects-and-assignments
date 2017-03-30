/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author prash
 */
public class Ecosystem {
    
    private UniversityCatalog universityCatalog;
    
    public Ecosystem(){
    this.universityCatalog = new UniversityCatalog();
    }

    public UniversityCatalog getUniversityCatalog() {
        return universityCatalog;
    }

    
}

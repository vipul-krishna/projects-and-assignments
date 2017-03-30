/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author Lenovo
 */
public class ResumeList {

    public ArrayList<Resume> getResumeList() {
        return resumeList;
    }

    public void setResumeList(ArrayList<Resume> resumeList) {
        this.resumeList = resumeList;
    }
    
    private ArrayList<Resume> resumeList;
    
    public ResumeList(){
        
        resumeList = new ArrayList<Resume>();
    }
    
    public Resume addResume(){
        
        Resume resume = new Resume();
        resumeList.add(resume);
        return resume;
    }
    
    public void deleteResume(Resume rsm){
        
       resumeList.remove(rsm);
    }
    
}

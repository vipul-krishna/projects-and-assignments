/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;


public class FamilyMembers {
    
    private String memberName;
    private int memberAge;
    private String memberGender;
    private String memberType;
    private HealthReport healthReport;
    private GeneralAttributes generalAttributes;
    private ArrayList<VitalSigns> vitalSignsList;
    
    public FamilyMembers(){
        this.generalAttributes = new GeneralAttributes();
        this.vitalSignsList = new ArrayList<VitalSigns>();
        this.healthReport = new HealthReport(vitalSignsList,generalAttributes);
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public int getMemberAge() {
        return memberAge;
    }

    public void setMemberAge(int memberAge) {
        this.memberAge = memberAge;
    }

    public String getMemberGender() {
        return memberGender;
    }

    public void setMemberGender(String memberGender) {
        this.memberGender = memberGender;
    }

    public String getMemberType() {
        return memberType;
    }

    public void setMemberType(String memberType) {
        this.memberType = memberType;
    }

    public GeneralAttributes getGeneralAttributes() {
        return generalAttributes;
    }

    public void setGeneralAttributes(GeneralAttributes generalAttributes) {
        this.generalAttributes = generalAttributes;
    }

    public HealthReport getHealthReport() {
        return healthReport;
    }

    public void setHealthReport(HealthReport healthReport) {
        this.healthReport = healthReport;
    }
    
    public ArrayList<VitalSigns> getVitalSignsList() {
        return vitalSignsList;
    }
    
    public VitalSigns addVitalSigns(){
        VitalSigns vitalSigns = new VitalSigns();
        vitalSignsList.add(vitalSigns);
        return vitalSigns;
    }
}

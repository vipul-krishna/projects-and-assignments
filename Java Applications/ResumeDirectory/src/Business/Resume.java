/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import javax.swing.ImageIcon;

/**
 *
 * @author Lenovo
 */
public class Resume {
    
    private String name;
    private String gender;
    private String address1;
    private String address2;
    private String city;
    private String country;
    private String contact;
    private String email;
    private String nationality;
    private String dob;
    private String affiliation;
    private String careerObj;
    private String degree;
    private String school;
    private int degreeYear;
    private String schoolCity;
    private String workExp;
    private String programHistory;
    private String language;
    private ImageIcon icon;

    public ImageIcon getIcon() {
        return icon;
    }

    public void setIcon(ImageIcon icon) {
        this.icon = icon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getAffiliation() {
        return affiliation;
    }

    public void setAffiliation(String affiliation) {
        this.affiliation = affiliation;
    }

    public String getCareerObj() {
        return careerObj;
    }

    public void setCareerObj(String careerObj) {
        this.careerObj = careerObj;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public int getDegreeYear() {
        return degreeYear;
    }

    public void setDegreeYear(int degreeYear) {
        this.degreeYear = degreeYear;
    }

    public String getSchoolCity() {
        return schoolCity;
    }

    public void setSchoolCity(String schoolCity) {
        this.schoolCity = schoolCity;
    }

    public String getWorkExp() {
        return workExp;
    }

    public void setWorkExp(String workExp) {
        this.workExp = workExp;
    }

    public String getProgramHistory() {
        return programHistory;
    }

    public void setProgramHistory(String programHistory) {
        this.programHistory = programHistory;
    }
    
    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
    
    @Override
    public String toString()
    {
        return this.name;
    }
    
     
}

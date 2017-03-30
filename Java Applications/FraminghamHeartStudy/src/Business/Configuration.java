/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;


public class Configuration {
    
    public static int randInt(int min, int max) {

       
        Random random = new Random();
        int randomNum = random.nextInt((max - min) + 1) + min;
        //System.out.println(randomNum);
        return randomNum;
    }
    
    public static double randDouble(double min, double max) {
        
        Random random = new Random();
        double value = min + (max - min) * random.nextDouble();
        double randomDoubleValue = Double.parseDouble( new DecimalFormat("##.#").format(value));
        return randomDoubleValue;
    }
    
     public static City addCommunity()
     {
        City city = new City();
        city.setCityName("Framingham");
        int count=0;
        for(int i = 1; i <= 10; i++) 
        {
        count++;
        String communityName = "Community"+count;
        Community community = city.addCommunity();
        community.setCommunityName(communityName);
        }
        return city;
     }
     
     
     public static City addHouse()
     {
        City city = addCommunity();
        int count=0;
        for(Community community : city.getCommunityList())
        {
            for(int i = 1; i <= 10; i++) 
            {
            count++;
            String houseNumber = "HouseNumber"+count;
            House house = community.addHouse();
            house.setHouseNumber(houseNumber);
            }
        
        }
        return city;
     }
     
     
     public static City addFamily()
     {
        City city = addHouse();
        int count=0;
        for(Community community : city.getCommunityList())
        {
            for(House house : community.getHouseList())
            {
                for(int i = 1; i <= 2; i++) 
                {
                    count++;
                    String familyName = "Family"+count;
                    Family family = house.addFamily();
                    family.setFamilyName(familyName);
            }
        
            }
        }
        return city;
     }
     
     
     public static City addFamilyMembers()
     {
        Random random = new Random();
        City city = addFamily();
        int count=0;
        for(Community community : city.getCommunityList())
        {
            for(House house : community.getHouseList())
            {
                for(Family family : house.getFamilyList())
                {
                    for(int i = 1; i <= 6; i++) 
                    {
                        count++;
                        FamilyMembers familyMembers = family.addMembers();
                        String memberName = "Person"+count;
                        //For Father
                        if(i==1){
                            int fatherAge = randInt(40, 60);
                            familyMembers.setMemberType("Father");
                            familyMembers.setMemberName(memberName);
                            familyMembers.setMemberGender("Male");
                            familyMembers.setMemberAge(fatherAge);
                            
                        }
                        //For Mother
                        else if(i==2){
                            int motherAge = randInt(40, 60);
                            familyMembers.setMemberType("Mother");
                            familyMembers.setMemberName(memberName);
                            familyMembers.setMemberGender("Female");
                            familyMembers.setMemberAge(motherAge);
                            
                        }
                        //For GrandFather
                        else if(i==3)
                        {
                            int grandFatherAge = randInt(60, 75);
                            familyMembers.setMemberType("GrandFather");
                            familyMembers.setMemberName(memberName);
                            familyMembers.setMemberGender("Male");
                            familyMembers.setMemberAge(grandFatherAge);
                            
                        }
                        //For GrandMother
                        else if(i==4){
                            int grandMotherAge = randInt(60, 75);
                            familyMembers.setMemberType("GrandMother");
                            familyMembers.setMemberName(memberName);
                            familyMembers.setMemberGender("Female");
                            familyMembers.setMemberAge(grandMotherAge);
                            
                        }
                        // For Child
                        else
                        {
                        familyMembers.setMemberName(memberName);
                        int memberAge = randInt(30, 40);
                        familyMembers.setMemberAge(memberAge);
                        familyMembers.setMemberType("Child");
                        String[] array={"Male","Female"};
                        String childGender = array[random.nextInt(array.length)];
                        familyMembers.setMemberGender(childGender);
                        }
                    }     
                }
            }
        }
        return city;
     }
     
     public static City addVitalSigns()
     {
        City city = addFamilyMembers();
        for(Community community : city.getCommunityList())
        {
            for(House house : community.getHouseList())
            {
                for(Family family : house.getFamilyList())
                    {
                        for(FamilyMembers familyMembers : family.getMembersList())
                        {
                            for(int i = 1; i <= 5; i++)
                            {
                                VitalSigns vitalSigns = familyMembers.addVitalSigns();
                                double bodyTemperature = randDouble(95.0, 109.0);
                                int bpSystolic = randInt(70, 190);
                                int bpDiastolic = randInt(60, 120);
                                int pulseRate = randInt(30, 130);
                                int pedometerReading = randInt(2000, 12000);
                                int ldlCholesterol = randInt(70, 220);
                                int hdlCholesterol = randInt(25, 70);
                                vitalSigns.setBodyTemperature(bodyTemperature);
                                vitalSigns.setBpSystolic(bpSystolic);
                                vitalSigns.setBpDiastolic(bpDiastolic);
                                vitalSigns.setPulseRate(pulseRate);
                                vitalSigns.setLdlCholesterol(ldlCholesterol);
                                vitalSigns.setHdlCholesterol(hdlCholesterol);
                                vitalSigns.setPedometerReading(pedometerReading);
                            }
                        }
                    }
            }
        }
        return city;
    }
     
    
    public static City addGeneralAttributes()
     {
        City city = addVitalSigns();
        Random random = new Random();
        for(Community community : city.getCommunityList())
        {
            for(House house : community.getHouseList())
            {
                for(Family family : house.getFamilyList())
                    {
                        for(FamilyMembers familyMembers : family.getMembersList())
                        {
                            String[] array={"Yes","No"};
                            String smoking = array[random.nextInt(array.length)];
                            String drinking = array[random.nextInt(array.length)];
                            String diabetes = array[random.nextInt(array.length)];
                            double heightInCm = randDouble(120.0,200.0);
                            double weightInKg = randDouble(40.0,110.0);
                            int exerciseHours = randInt(0,3);
                            int durationOfSleep = randInt(2,12);
                            double caloriesIntake = randDouble(2000.0,3000.0);
                            
                            familyMembers.getGeneralAttributes().setSmoking(smoking);
                            familyMembers.getGeneralAttributes().setDrinking(drinking);
                            familyMembers.getGeneralAttributes().setDiabetes(diabetes);
                            familyMembers.getGeneralAttributes().setHeight(heightInCm);
                            familyMembers.getGeneralAttributes().setWeight(weightInKg);
                            familyMembers.getGeneralAttributes().setExerciseHours(exerciseHours);
                            familyMembers.getGeneralAttributes().setDurationOfSleep(durationOfSleep);
                            familyMembers.getGeneralAttributes().setCaloriesIntake(caloriesIntake);
                            
                        }
                    }
            }
        }
        return city;
    }
   
       
}
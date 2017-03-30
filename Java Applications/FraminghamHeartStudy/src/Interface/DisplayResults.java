/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Business.City;
import Business.Community;
import Business.Configuration;
import Business.Family;
import Business.FamilyMembers;
import Business.House;
import Business.VitalSigns;
import java.text.DecimalFormat;
import java.util.Random;


public class DisplayResults {
    
    
    public static int randInt(int min, int max) {

       
        Random random = new Random();
        int randomNum = random.nextInt((max - min) + 1) + min;
        //System.out.println(randomNum);
        return randomNum;
    }
    
    public void displayCommunity()
    {
        City city = Configuration.addCommunity();
        System.out.println("All Communities in the "+city.getCityName()+" City are: ");
        for(Community community : city.getCommunityList())
        {
            System.out.println(community.getCommunityName());
            
        }
        
    }
    
    public void displayHouse()
    {
        City city = Configuration.addHouse();
        for(Community community : city.getCommunityList())
        {
            System.out.println("All Houses in "+community.getCommunityName()+" are: ");
            for(House house : community.getHouseList())
            {
                System.out.println(house.getHouseNumber());
            }
        }
        
    }
    
    public void displayFamily()
    {
        City city = Configuration.addFamily();
        for(Community community : city.getCommunityList())
        {
            System.out.println(community.getCommunityName());
            for(House house : community.getHouseList())
            {
                System.out.println(house.getHouseNumber());
                for(Family family : house.getFamilyList())
                {
                    System.out.println(family.getFamilyName());
                }
            }
            System.out.println("-----------------------");
        }
        
    }
    
    
    public void displayFamilyMember()
    {
        City city = Configuration.addFamilyMembers();
        for(Community community : city.getCommunityList())
        {
            System.out.println(community.getCommunityName());
            for(House house : community.getHouseList())
            {
                System.out.println(house.getHouseNumber());
                for(Family family : house.getFamilyList())
                {
                    System.out.println(family.getFamilyName());
                    for(FamilyMembers familyMembers : family.getMembersList())
                    {
                        System.out.println("Name: "+familyMembers.getMemberName());
                        System.out.println("Age: "+familyMembers.getMemberAge());
                        System.out.println("Role: "+familyMembers.getMemberType());
                        System.out.println("Gender: "+familyMembers.getMemberGender());
                        System.out.println("------------------------");
                    }
                }
                System.out.println("***************************");
            }
            System.out.println("-----------XXXXXXXXXX------------");
        }
        
    }
    
    public void displayVitalSigns()
    {
        City city = Configuration.addVitalSigns();
        for(Community community : city.getCommunityList())
        {
            System.out.println(community.getCommunityName());
            for(House house : community.getHouseList())
            {
                System.out.println(house.getHouseNumber());
                for(Family family : house.getFamilyList())
                {
                    System.out.println(family.getFamilyName());
                    for(FamilyMembers familyMembers : family.getMembersList())
                    {
                        System.out.println("Name: "+familyMembers.getMemberName());
                        System.out.println();
                        for(VitalSigns vitalSigns : familyMembers.getVitalSignsList())
                        {
                            System.out.println("BodyTemperature: "+vitalSigns.getBodyTemperature()+" F");
                            System.out.println("BloodPressure: "+vitalSigns.getBpSystolic()+"/"+vitalSigns.getBpDiastolic());
                            System.out.println("PulseRate: "+vitalSigns.getPulseRate());
                            System.out.println("LDL Cholesterol: "+vitalSigns.getLdlCholesterol()+" mg/dl");
                            System.out.println("HDL Cholesterol: "+vitalSigns.getHdlCholesterol()+" mg/dl");
                            System.out.println("PedometerReading: "+vitalSigns.getPedometerReading()+" steps");
                            System.out.println("Date Recorded: "+vitalSigns.getDateRecorded());
                            System.out.println();
                        }
                        System.out.println("-----------------------");
                    }
                    System.out.println("***************************");
                }
            }
            System.out.println("-----------XXXXXXXXXX------------");
        }
        
    }
    
    public void displayGeneralAttributes()
    {
        City city = Configuration.addGeneralAttributes();
        for(Community community : city.getCommunityList())
        {
            System.out.println(community.getCommunityName());
            for(House house : community.getHouseList())
            {
                System.out.println(house.getHouseNumber());
                for(Family family : house.getFamilyList())
                {
                    System.out.println(family.getFamilyName());
                    for(FamilyMembers familyMembers : family.getMembersList())
                    {
                        System.out.println("Name: "+familyMembers.getMemberName());
                        
                            System.out.println("Smoking: "+familyMembers.getGeneralAttributes().getSmoking());
                            System.out.println("Drinking: "+familyMembers.getGeneralAttributes().getDrinking());
                            System.out.println("Diabetes: "+familyMembers.getGeneralAttributes().getDiabetes());
                            System.out.println("Weight: "+familyMembers.getGeneralAttributes().getWeight()+" kg");
                            System.out.println("Height: "+familyMembers.getGeneralAttributes().getHeight()+" cm");
                            System.out.println("Exercise Hours: "+familyMembers.getGeneralAttributes().getExerciseHours());
                            System.out.println("Duration of Sleep: "+familyMembers.getGeneralAttributes().getDurationOfSleep());
                            System.out.println("Calories Intake: "+familyMembers.getGeneralAttributes().getCaloriesIntake()+" Calories");
                            System.out.println("----------------------------");
                        
                    }
                    System.out.println("***************************");
                }
            }
            System.out.println("-----------XXXXXXXXXX------------");
        }
        
    }
    
    public void displayReports()
    {
        City city = Configuration.addGeneralAttributes();
        for(Community community : city.getCommunityList())
        {
            System.out.println(community.getCommunityName());
            for(House house : community.getHouseList())
            {
                System.out.println(house.getHouseNumber());
                for(Family family : house.getFamilyList())
                    {
                        System.out.println(family.getFamilyName());
                        for(FamilyMembers familyMembers : family.getMembersList())
                        {
                            System.out.println("Name: "+familyMembers.getMemberName());
                            System.out.println("Member Type: "+familyMembers.getMemberType());
                            System.out.println("Gender: "+familyMembers.getMemberGender());
                            System.out.println("Age: "+familyMembers.getMemberAge());
                            //Vital Signs
                            System.out.println("****Vital Signs****");
                            //Body Temperature
                            System.out.println("------------------");
                            String membersBodyTemperatureReport = familyMembers.getHealthReport().bodyTemperatureReport();
                            System.out.println("Average Body Temperature: "+familyMembers.getHealthReport().getAverageTemperature()+" F");
                            System.out.println(membersBodyTemperatureReport);
                            //Pulse
                            System.out.println("------------------");
                            String membersPulseRateReport = familyMembers.getHealthReport().pulseRateReport();
                            System.out.println("Average Pulse Rate: "+familyMembers.getHealthReport().getAveragePulse());
                            System.out.println(membersPulseRateReport);
                            //Blood Pressure
                            System.out.println("------------------");
                            String membersBloodPressureReport = familyMembers.getHealthReport().bloodPressureReport();
                            int averageSystolic = familyMembers.getHealthReport().getAverageSystolic();
                            int averageDiastolic = familyMembers.getHealthReport().getAverageDiastolic();
                            String averageBloodPressure = averageSystolic+"/"+averageDiastolic;
                            System.out.println("Average Blood Pressure: "+averageBloodPressure);
                            System.out.println(membersBloodPressureReport);
                            //Pedometer Reading
                            System.out.println("------------------");
                            familyMembers.getHealthReport().pedometerReport();
                            double membersPedometerReading = familyMembers.getHealthReport().getAverageMiles();
                            double membersAverageCaloriesBurnt = familyMembers.getHealthReport().getAverageCaloriesBurntByPedometer() + familyMembers.getHealthReport().getAverageCaloriesBurntByExercise();
                            double membersDifferenceOfCalories = familyMembers.getHealthReport().getCaloriesDifference();
                            System.out.println("Average Miles Walked: "+membersPedometerReading+" miles");
                            System.out.println("Average Calories Burnt: "+membersAverageCaloriesBurnt+" Calories");
                            System.out.println("Difference Of Calories Intake and Calories Burnt: "+membersDifferenceOfCalories+" Calories");
                            //BMI
                            System.out.println("------------------");
                            String bmiReport = familyMembers.getHealthReport().bodyMassIndex();
                            double bmi = familyMembers.getHealthReport().getBodyMassIndex();
                            System.out.println("Body Mass Index: "+bmi);
                            System.out.println(bmiReport);
                            //LDL Cholesterol
                            System.out.println("------------------");
                            String ldlCholesterolReport = familyMembers.getHealthReport().ldlCholesterol();
                            int ldlCholesterol = familyMembers.getHealthReport().getAverageLdlCholesterol();
                            System.out.println("LDL Cholesterol: "+ldlCholesterol+" mg/dl");
                            System.out.println(ldlCholesterolReport);
                            //HDL Cholesterol
                            System.out.println("------------------");
                            String hdlCholesterolReport = familyMembers.getHealthReport().hdlCholesterol();
                            int hdlCholesterol = familyMembers.getHealthReport().getAverageHdlCholesterol();
                            System.out.println("HDL Cholesterol: "+hdlCholesterol+" mg/dl");
                            System.out.println(hdlCholesterolReport);
                            System.out.println();
                            //

                            //General Attributes
                            System.out.println("****General Attributes****");
                            System.out.println("Smoking: "+familyMembers.getGeneralAttributes().getSmoking());
                            System.out.println("Drinking: "+familyMembers.getGeneralAttributes().getDrinking());
                            System.out.println("Diabetes: "+familyMembers.getGeneralAttributes().getDiabetes());
                            System.out.println("Exercise Hours: "+familyMembers.getGeneralAttributes().getExerciseHours());
                            System.out.println("Weight: "+familyMembers.getGeneralAttributes().getWeight()+" kg");
                            System.out.println("Height: "+familyMembers.getGeneralAttributes().getHeight()+" cm");
                            System.out.println("Duration of Sleep: "+familyMembers.getGeneralAttributes().getDurationOfSleep()+" hours");
                            System.out.println("Calorites Intake: "+familyMembers.getGeneralAttributes().getCaloriesIntake());
                            System.out.println();
                            //
                            //RISK FACTOR
                            System.out.println("************");
                            int riskPercentage = 0;
                            if(familyMembers.getMemberGender().equalsIgnoreCase("Male"))
                            {
                                familyMembers.getHealthReport().riskFactorCalculatorMen(familyMembers.getMemberAge());
//                                int riskPoints = familyMembers.getHealthReport().getRiskPoints();
//                                System.out.println("Risk Points: "+riskPoints);
                                riskPercentage = familyMembers.getHealthReport().getRiskPercentage();
                                if(riskPercentage==56)
                                {
                                    System.out.println("Risk Percentage: >="+riskPercentage+"%");
                                }
                                else
                                {
                                    System.out.println("Risk Percentage: "+riskPercentage+"%");
                                }
                            }
                            
                            if(familyMembers.getMemberGender().equalsIgnoreCase("Female"))
                            {
                                familyMembers.getHealthReport().riskFactorCalculatorWomen(familyMembers.getMemberAge());
//                                int riskPoints = familyMembers.getHealthReport().getRiskPoints();
//                                System.out.println("Risk Points: "+riskPoints);
                                riskPercentage = familyMembers.getHealthReport().getRiskPercentage();
                                if(riskPercentage==32)
                                {
                                    System.out.println("Risk Percentage: >="+riskPercentage+"%");
                                }
                                else
                                {
                                    System.out.println("Risk Percentage: "+riskPercentage+"%");
                                }
                            }
                            
                            
                            // Expected Risk
                            
                            //For men
                            if(familyMembers.getMemberGender().equalsIgnoreCase("Male"))
                            {
                                familyMembers.getHealthReport().compareRiskMen(familyMembers.getMemberAge());
                                int expectedRiskPerc = familyMembers.getHealthReport().getExpectedRiskPercentage();
                                System.out.println("Expected Risk Percentage of this age group: "+expectedRiskPerc+"%");
                                if(riskPercentage>expectedRiskPerc)
                                {
                                    System.out.println("High Risk Percentage than expected.");
                                }
                            }
                            
                            //For Women
                            if(familyMembers.getMemberGender().equalsIgnoreCase("Female"))
                            {
                                familyMembers.getHealthReport().compareRiskWomen(familyMembers.getMemberAge());
                                int expectedRiskPerc = familyMembers.getHealthReport().getExpectedRiskPercentage();
                                System.out.println("Expected Risk Percentage of this age group: "+expectedRiskPerc+"%");
                                if(riskPercentage>expectedRiskPerc)
                                {
                                    System.out.println("High Risk Percentage than expected.");
                                }
                            }
                            
                            //
                            System.out.println("--------------------------");
                            
                        }
                        System.out.println("***************************");
                       
                    }
                
            }
            System.out.println("-----------XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX------------");
            
        }
    }
    
    
    //
    
    
    public void displayReportsForOneRandomPerson()
    {
        
        City city = Configuration.addGeneralAttributes();
        
        int indexCommunity = randInt(0, (city.getCommunityList().size()-1));
        Community community = city.getCommunityList().get(indexCommunity);
        
            System.out.println(community.getCommunityName());
            int indexHome = randInt(0, (community.getHouseList().size()-1));
            House house = community.getHouseList().get(indexHome);
            
                System.out.println(house.getHouseNumber());
                
                int indexFamily = randInt(0, house.getFamilyList().size()-1);
                Family family = house.getFamilyList().get(indexFamily);
                
                        System.out.println(family.getFamilyName());
                        
                        int indexFamilyMember = randInt(0, family.getMembersList().size()-1);
                        FamilyMembers familyMembers = family.getMembersList().get(indexFamilyMember);
                        
                            System.out.println("Name: "+familyMembers.getMemberName());
                            System.out.println("Member Type: "+familyMembers.getMemberType());
                            System.out.println("Gender: "+familyMembers.getMemberGender());
                            System.out.println("Age: "+familyMembers.getMemberAge());
                            //Vital Signs
                            System.out.println("****Vital Signs****");
                            //Body Temperature
                            System.out.println("----------------------------------");
                            String membersBodyTemperatureReport = familyMembers.getHealthReport().bodyTemperatureReport();
                            System.out.println("Average Body Temperature: "+familyMembers.getHealthReport().getAverageTemperature()+" F");
                            System.out.println(membersBodyTemperatureReport);
                            //Pulse
                            System.out.println("----------------------------------");
                            String membersPulseRateReport = familyMembers.getHealthReport().pulseRateReport();
                            System.out.println("Average Pulse Rate: "+familyMembers.getHealthReport().getAveragePulse());
                            System.out.println(membersPulseRateReport);
                            //Blood Pressure
                            System.out.println("----------------------------------");
                            String membersBloodPressureReport = familyMembers.getHealthReport().bloodPressureReport();
                            int averageSystolic = familyMembers.getHealthReport().getAverageSystolic();
                            int averageDiastolic = familyMembers.getHealthReport().getAverageDiastolic();
                            String averageBloodPressure = averageSystolic+"/"+averageDiastolic;
                            System.out.println("Average Blood Pressure: "+averageBloodPressure);
                            System.out.println(membersBloodPressureReport);
                            //Pedometer Reading
                            System.out.println("----------------------------------");
                            familyMembers.getHealthReport().pedometerReport();
                            double membersPedometerReading = familyMembers.getHealthReport().getAverageMiles();
                            double membersAverageCaloriesBurnt = familyMembers.getHealthReport().getAverageCaloriesBurntByPedometer() + familyMembers.getHealthReport().getAverageCaloriesBurntByExercise();
                            double membersDifferenceOfCalories = familyMembers.getHealthReport().getCaloriesDifference();
                            System.out.println("Average Miles Walked: "+membersPedometerReading+" miles");
                            System.out.println("Average Calories Burnt: "+membersAverageCaloriesBurnt+" Calories");
                            System.out.println("Difference Of Calories Intake and Calories Burnt: "+membersDifferenceOfCalories+" Calories");
                            //BMI
                            System.out.println("----------------------------------");
                            String bmiReport = familyMembers.getHealthReport().bodyMassIndex();
                            double bmi = familyMembers.getHealthReport().getBodyMassIndex();
                            System.out.println("Body Mass Index: "+bmi);
                            System.out.println(bmiReport);
                            //LDL Cholesterol
                            System.out.println("----------------------------------");
                            String ldlCholesterolReport = familyMembers.getHealthReport().ldlCholesterol();
                            int ldlCholesterol = familyMembers.getHealthReport().getAverageLdlCholesterol();
                            System.out.println("LDL Cholesterol: "+ldlCholesterol+" mg/dl");
                            System.out.println(ldlCholesterolReport);
                            //HDL Cholesterol
                            System.out.println("----------------------------------");
                            String hdlCholesterolReport = familyMembers.getHealthReport().hdlCholesterol();
                            int hdlCholesterol = familyMembers.getHealthReport().getAverageHdlCholesterol();
                            System.out.println("HDL Cholesterol: "+hdlCholesterol+" mg/dl");
                            System.out.println(hdlCholesterolReport);
                            System.out.println();
                            //

                            //General Attributes
                            System.out.println("****General Attributes****");
                            System.out.println("Smoking: "+familyMembers.getGeneralAttributes().getSmoking());
                            System.out.println("Drinking: "+familyMembers.getGeneralAttributes().getDrinking());
                            System.out.println("Diabetes: "+familyMembers.getGeneralAttributes().getDiabetes());
                            System.out.println("Exercise Hours: "+familyMembers.getGeneralAttributes().getExerciseHours());
                            System.out.println("Weight: "+familyMembers.getGeneralAttributes().getWeight()+" kg");
                            System.out.println("Height: "+familyMembers.getGeneralAttributes().getHeight()+" cm");
                            System.out.println("Duration of Sleep: "+familyMembers.getGeneralAttributes().getDurationOfSleep()+" hours");
                            System.out.println("Calorites Intake: "+familyMembers.getGeneralAttributes().getCaloriesIntake());
                            System.out.println();
                            //
                            //RISK FACTOR
                            System.out.println("*********************");
                            int riskPercentage = 0;
                            if(familyMembers.getMemberGender().equalsIgnoreCase("Male"))
                            {
                                familyMembers.getHealthReport().riskFactorCalculatorMen(familyMembers.getMemberAge());
//                                int riskPoints = familyMembers.getHealthReport().getRiskPoints();
//                                System.out.println("Risk Points: "+riskPoints);
                                riskPercentage = familyMembers.getHealthReport().getRiskPercentage();
                                if(riskPercentage==56)
                                {
                                    System.out.println("Risk Percentage: >="+riskPercentage+"%");
                                }
                                else
                                {
                                    System.out.println("Risk Percentage: "+riskPercentage+"%");
                                }
                            }
                            
                            if(familyMembers.getMemberGender().equalsIgnoreCase("Female"))
                            {
                                familyMembers.getHealthReport().riskFactorCalculatorWomen(familyMembers.getMemberAge());
//                                int riskPoints = familyMembers.getHealthReport().getRiskPoints();
//                                System.out.println("Risk Points: "+riskPoints);
                                riskPercentage = familyMembers.getHealthReport().getRiskPercentage();
                                if(riskPercentage==32)
                                {
                                    System.out.println("Risk Percentage: >="+riskPercentage+"%");
                                }
                                else
                                {
                                    System.out.println("Risk Percentage: "+riskPercentage+"%");
                                }
                            }
                            
                            
                            // Expected Risk
                            
                            //For men
                            if(familyMembers.getMemberGender().equalsIgnoreCase("Male"))
                            {
                                familyMembers.getHealthReport().compareRiskMen(familyMembers.getMemberAge());
                                int expectedRiskPerc = familyMembers.getHealthReport().getExpectedRiskPercentage();
                                System.out.println("Expected Risk Percentage of this age group "+expectedRiskPerc+"%");
                                if(riskPercentage>expectedRiskPerc)
                                {
                                    System.out.println("High Risk Percentage than expected.");
                                }
                            }
                            
                            //For Women
                            if(familyMembers.getMemberGender().equalsIgnoreCase("Female"))
                            {
                                familyMembers.getHealthReport().compareRiskWomen(familyMembers.getMemberAge());
                                int expectedRiskPerc = familyMembers.getHealthReport().getExpectedRiskPercentage();
                                System.out.println("Expected Risk Percentage of this age group "+expectedRiskPerc+"%");
                                if(riskPercentage>expectedRiskPerc)
                                {
                                    System.out.println("High Risk Percentage than expected.");
                                }
                            }
            System.out.println("-----------XXXXXXXXXX------------");
            
        
    }
    
    
    public void displayReportsOfOneFamily()
    {
        City city = Configuration.addGeneralAttributes();
        
        //Generating Random Community
        
        int indexCommunity = randInt(0, (city.getCommunityList().size() - 1));
        Community community = city.getCommunityList().get(indexCommunity);
        System.out.println(community.getCommunityName());
         
        //Generating Random House
        
        int indexHome = randInt(0, (community.getHouseList().size() - 1));
        House house = community.getHouseList().get(indexHome);
        System.out.println(house.getHouseNumber());

        //Generating Random Family
        
        int indexFamily = randInt(0, (house.getFamilyList().size() - 1));
        Family family = house.getFamilyList().get(indexFamily);
        System.out.println(family.getFamilyName());
        
                        for(FamilyMembers familyMembers : family.getMembersList())
                        {
                            System.out.println("Name: "+familyMembers.getMemberName());
                            System.out.println("Member Type: "+familyMembers.getMemberType());
                            System.out.println("Gender: "+familyMembers.getMemberGender());
                            System.out.println("Age: "+familyMembers.getMemberAge());
                            //Vital Signs
                            System.out.println("****Vital Signs****");
                            //Body Temperature
                            System.out.println("---------------------------------------");
                            String membersBodyTemperatureReport = familyMembers.getHealthReport().bodyTemperatureReport();
                            System.out.println("Average Body Temperature: "+familyMembers.getHealthReport().getAverageTemperature()+" F");
                            System.out.println(membersBodyTemperatureReport);
                            //Pulse
                            System.out.println("---------------------------------------");
                            String membersPulseRateReport = familyMembers.getHealthReport().pulseRateReport();
                            System.out.println("Average Pulse Rate: "+familyMembers.getHealthReport().getAveragePulse());
                            System.out.println(membersPulseRateReport);
                            //Blood Pressure
                            System.out.println("---------------------------------------");
                            String membersBloodPressureReport = familyMembers.getHealthReport().bloodPressureReport();
                            int averageSystolic = familyMembers.getHealthReport().getAverageSystolic();
                            int averageDiastolic = familyMembers.getHealthReport().getAverageDiastolic();
                            String averageBloodPressure = averageSystolic+"/"+averageDiastolic;
                            System.out.println("Average Blood Pressure: "+averageBloodPressure);
                            System.out.println(membersBloodPressureReport);
                            //Pedometer Reading
                            System.out.println("---------------------------------------");
                            familyMembers.getHealthReport().pedometerReport();
                            double membersPedometerReading = familyMembers.getHealthReport().getAverageMiles();
                            double membersAverageCaloriesBurnt = familyMembers.getHealthReport().getAverageCaloriesBurntByPedometer() + familyMembers.getHealthReport().getAverageCaloriesBurntByExercise();
                            double membersDifferenceOfCalories = familyMembers.getHealthReport().getCaloriesDifference();
                            System.out.println("Average Miles Walked: "+membersPedometerReading+" miles");
                            System.out.println("Average Calories Burnt: "+membersAverageCaloriesBurnt+" Calories");
                            System.out.println("Difference Of Calories Intake and Calories Burnt: "+membersDifferenceOfCalories+" Calories");
                            //BMI
                            System.out.println("---------------------------------------");
                            String bmiReport = familyMembers.getHealthReport().bodyMassIndex();
                            double bmi = familyMembers.getHealthReport().getBodyMassIndex();
                            System.out.println("Body Mass Index: "+bmi);
                            System.out.println(bmiReport);
                            //LDL Cholesterol
                            System.out.println("---------------------------------------");
                            String ldlCholesterolReport = familyMembers.getHealthReport().ldlCholesterol();
                            int ldlCholesterol = familyMembers.getHealthReport().getAverageLdlCholesterol();
                            System.out.println("LDL Cholesterol: "+ldlCholesterol+" mg/dl");
                            System.out.println(ldlCholesterolReport);
                            //HDL Cholesterol
                            System.out.println("---------------------------------------");
                            String hdlCholesterolReport = familyMembers.getHealthReport().hdlCholesterol();
                            int hdlCholesterol = familyMembers.getHealthReport().getAverageHdlCholesterol();
                            System.out.println("HDL Cholesterol: "+hdlCholesterol+" mg/dl");
                            System.out.println(hdlCholesterolReport);
                            System.out.println();
                            //

                            //General Attributes
                            System.out.println("****General Attributes****");
                            System.out.println("Smoking: "+familyMembers.getGeneralAttributes().getSmoking());
                            System.out.println("Drinking: "+familyMembers.getGeneralAttributes().getDrinking());
                            System.out.println("Diabetes: "+familyMembers.getGeneralAttributes().getDiabetes());
                            System.out.println("Exercise Hours: "+familyMembers.getGeneralAttributes().getExerciseHours());
                            System.out.println("Weight: "+familyMembers.getGeneralAttributes().getWeight()+" kg");
                            System.out.println("Height: "+familyMembers.getGeneralAttributes().getHeight()+" cm");
                            System.out.println("Duration of Sleep: "+familyMembers.getGeneralAttributes().getDurationOfSleep()+" hours");
                            System.out.println("Calorites Intake: "+familyMembers.getGeneralAttributes().getCaloriesIntake());
                            System.out.println();
                            
                            
                            //RISK FACTOR
                            
                            System.out.println("************");
                            int riskPercentage = 0;
                            if(familyMembers.getMemberGender().equalsIgnoreCase("Male"))
                            {
                                familyMembers.getHealthReport().riskFactorCalculatorMen(familyMembers.getMemberAge());
//                                int riskPoints = familyMembers.getHealthReport().getRiskPoints();
//                                System.out.println("Risk Points: "+riskPoints);
                                riskPercentage = familyMembers.getHealthReport().getRiskPercentage();
                                if(riskPercentage==56)
                                {
                                    System.out.println("Risk Percentage: >="+riskPercentage+"%");
                                }
                                else
                                {
                                    System.out.println("Risk Percentage: "+riskPercentage+"%");
                                }
                            }
                            
                            if(familyMembers.getMemberGender().equalsIgnoreCase("Female"))
                            {
                                familyMembers.getHealthReport().riskFactorCalculatorWomen(familyMembers.getMemberAge());
//                                int riskPoints = familyMembers.getHealthReport().getRiskPoints();
//                                System.out.println("Risk Points: "+riskPoints);
                                riskPercentage = familyMembers.getHealthReport().getRiskPercentage();
                                if(riskPercentage==32)
                                {
                                    System.out.println("Risk Percentage: >="+riskPercentage+"%");
                                }
                                else
                                {
                                    System.out.println("Risk Percentage: "+riskPercentage+"%");
                                }
                            }
                            
                            
                            // Expected Risk
                            
                            //For men
                            if(familyMembers.getMemberGender().equalsIgnoreCase("Male"))
                            {
                                familyMembers.getHealthReport().compareRiskMen(familyMembers.getMemberAge());
                                int expectedRiskPerc = familyMembers.getHealthReport().getExpectedRiskPercentage();
                                System.out.println("Expected Risk Percentage of this age group "+expectedRiskPerc+"%");
                                if(riskPercentage>expectedRiskPerc)
                                {
                                    System.out.println("High Risk Percentage than expected.");
                                }
                            }
                            
                            //For Women
                            if(familyMembers.getMemberGender().equalsIgnoreCase("Female"))
                            {
                                familyMembers.getHealthReport().compareRiskWomen(familyMembers.getMemberAge());
                                int expectedRiskPerc = familyMembers.getHealthReport().getExpectedRiskPercentage();
                                System.out.println("Expected Risk Percentage of this age group "+expectedRiskPerc+"%");
                                if(riskPercentage>expectedRiskPerc)
                                {
                                    System.out.println("High Risk Percentage than expected.");
                                }
                            }
                            System.out.println("---------------------------------");
                        }
            System.out.println("-----------XXXXXXXXXX------------");
    }
    
    
    public void displayReportsOfOneHouse()
    {
        City city = Configuration.addGeneralAttributes();
        
        //Generating Random Community
        
        int indexCommunity = randInt(0, (city.getCommunityList().size()-1));
        Community community = city.getCommunityList().get(indexCommunity);
        System.out.println(community.getCommunityName());
        
        //Generating Random House
        
        int indexHome = randInt(0, (community.getHouseList().size()-1));
        House house = community.getHouseList().get(indexHome);
        System.out.println(house.getHouseNumber());
        
             for(Family family : house.getFamilyList())
             {
                        System.out.println(family.getFamilyName());
                        for(FamilyMembers familyMembers : family.getMembersList())
                        {
                            System.out.println("Name: "+familyMembers.getMemberName());
                            System.out.println("Member Type: "+familyMembers.getMemberType());
                            System.out.println("Gender: "+familyMembers.getMemberGender());
                            System.out.println("Age: "+familyMembers.getMemberAge());
                            //Vital Signs
                            System.out.println("****Vital Signs****");
                            //Body Temperature
                            System.out.println("----------------------------------");
                            String membersBodyTemperatureReport = familyMembers.getHealthReport().bodyTemperatureReport();
                            System.out.println("Average Body Temperature: "+familyMembers.getHealthReport().getAverageTemperature()+" F");
                            System.out.println(membersBodyTemperatureReport);
                            //Pulse
                            System.out.println("----------------------------------");
                            String membersPulseRateReport = familyMembers.getHealthReport().pulseRateReport();
                            System.out.println("Average Pulse Rate: "+familyMembers.getHealthReport().getAveragePulse());
                            System.out.println(membersPulseRateReport);
                            //Blood Pressure
                            System.out.println("----------------------------------");
                            String membersBloodPressureReport = familyMembers.getHealthReport().bloodPressureReport();
                            int averageSystolic = familyMembers.getHealthReport().getAverageSystolic();
                            int averageDiastolic = familyMembers.getHealthReport().getAverageDiastolic();
                            String averageBloodPressure = averageSystolic+"/"+averageDiastolic;
                            System.out.println("Average Blood Pressure: "+averageBloodPressure);
                            System.out.println(membersBloodPressureReport);
                            //Pedometer Reading
                            System.out.println("----------------------------------");
                            familyMembers.getHealthReport().pedometerReport();
                            double membersPedometerReading = familyMembers.getHealthReport().getAverageMiles();
                            double membersAverageCaloriesBurnt = familyMembers.getHealthReport().getAverageCaloriesBurntByPedometer() + familyMembers.getHealthReport().getAverageCaloriesBurntByExercise();
                            double membersDifferenceOfCalories = familyMembers.getHealthReport().getCaloriesDifference();
                            System.out.println("Average Miles Walked: "+membersPedometerReading+" miles");
                            System.out.println("Average Calories Burnt: "+membersAverageCaloriesBurnt+" Calories");
                            System.out.println("Difference Of Calories Intake and Calories Burnt: "+membersDifferenceOfCalories+" Calories");
                            //BMI
                            System.out.println("----------------------------------");
                            String bmiReport = familyMembers.getHealthReport().bodyMassIndex();
                            double bmi = familyMembers.getHealthReport().getBodyMassIndex();
                            System.out.println("Body Mass Index: "+bmi);
                            System.out.println(bmiReport);
                            //LDL Cholesterol
                            System.out.println("----------------------------------");
                            String ldlCholesterolReport = familyMembers.getHealthReport().ldlCholesterol();
                            int ldlCholesterol = familyMembers.getHealthReport().getAverageLdlCholesterol();
                            System.out.println("LDL Cholesterol: "+ldlCholesterol+" mg/dl");
                            System.out.println(ldlCholesterolReport);
                            //HDL Cholesterol
                            System.out.println("----------------------------------");
                            String hdlCholesterolReport = familyMembers.getHealthReport().hdlCholesterol();
                            int hdlCholesterol = familyMembers.getHealthReport().getAverageHdlCholesterol();
                            System.out.println("HDL Cholesterol: "+hdlCholesterol+" mg/dl");
                            System.out.println(hdlCholesterolReport);
                            System.out.println();
                            //

                            //General Attributes
                            System.out.println("****General Attributes****");
                            System.out.println("Smoking: "+familyMembers.getGeneralAttributes().getSmoking());
                            System.out.println("Drinking: "+familyMembers.getGeneralAttributes().getDrinking());
                            System.out.println("Diabetes: "+familyMembers.getGeneralAttributes().getDiabetes());
                            System.out.println("Exercise Hours: "+familyMembers.getGeneralAttributes().getExerciseHours());
                            System.out.println("Weight: "+familyMembers.getGeneralAttributes().getWeight()+" kg");
                            System.out.println("Height: "+familyMembers.getGeneralAttributes().getHeight()+" cm");
                            System.out.println("Duration of Sleep: "+familyMembers.getGeneralAttributes().getDurationOfSleep()+" hours");
                            System.out.println("Calorites Intake: "+familyMembers.getGeneralAttributes().getCaloriesIntake());
                            System.out.println();
                            //
                            //RISK FACTOR
                            System.out.println("*****************************");
                            int riskPercentage = 0;
                            if(familyMembers.getMemberGender().equalsIgnoreCase("Male"))
                            {
                                familyMembers.getHealthReport().riskFactorCalculatorMen(familyMembers.getMemberAge());
//                                int riskPoints = familyMembers.getHealthReport().getRiskPoints();
//                                System.out.println("Risk Points: "+riskPoints);
                                riskPercentage = familyMembers.getHealthReport().getRiskPercentage();
                                if(riskPercentage==56)
                                {
                                    System.out.println("Risk Percentage: >="+riskPercentage+"%");
                                }
                                else
                                {
                                    System.out.println("Risk Percentage: "+riskPercentage+"%");
                                }
                            }
                            
                            if(familyMembers.getMemberGender().equalsIgnoreCase("Female"))
                            {
                                familyMembers.getHealthReport().riskFactorCalculatorWomen(familyMembers.getMemberAge());
//                                int riskPoints = familyMembers.getHealthReport().getRiskPoints();
//                                System.out.println("Risk Points: "+riskPoints);
                                riskPercentage = familyMembers.getHealthReport().getRiskPercentage();
                                if(riskPercentage==32)
                                {
                                    System.out.println("Risk Percentage: >="+riskPercentage+"%");
                                }
                                else
                                {
                                    System.out.println("Risk Percentage: "+riskPercentage+"%");
                                }
                            }
                            
                            
                            // Expected Risk
                            
                            //For men
                            if(familyMembers.getMemberGender().equalsIgnoreCase("Male"))
                            {
                                familyMembers.getHealthReport().compareRiskMen(familyMembers.getMemberAge());
                                int expectedRiskPerc = familyMembers.getHealthReport().getExpectedRiskPercentage();
                                System.out.println("Expected Risk Percentage of this age group "+expectedRiskPerc+"%");
                                if(riskPercentage>expectedRiskPerc)
                                {
                                    System.out.println("High Risk Percentage than expected.");
                                }
                            }
                            
                            //For Women
                            if(familyMembers.getMemberGender().equalsIgnoreCase("Female"))
                            {
                                familyMembers.getHealthReport().compareRiskWomen(familyMembers.getMemberAge());
                                int expectedRiskPerc = familyMembers.getHealthReport().getExpectedRiskPercentage();
                                System.out.println("Expected Risk Percentage of this age group "+expectedRiskPerc+"%");
                                if(riskPercentage>expectedRiskPerc)
                                {
                                    System.out.println("High Risk Percentage than expected.");
                                }
                            }
                            
                            //
                            System.out.println("-------------------------------------");
                        }
                    }   
            System.out.println("-----------XXXXXXXXXXXXXXXXXXXXXXXXXXX------------");
            
        
    }
    
    public void displayReportsOfOneCommunity()
    {
        City city = Configuration.addGeneralAttributes();
        
        //Generating Random Community 
        
        int indexCommunity = randInt(0, (city.getCommunityList().size()-1));
        Community community = city.getCommunityList().get(indexCommunity);
        System.out.println(community.getCommunityName());
        
        for(House house : community.getHouseList())
        {
           System.out.println(house.getHouseNumber());
             for(Family family : house.getFamilyList())
             {
                        System.out.println(family.getFamilyName());
                        for(FamilyMembers familyMembers : family.getMembersList())
                        {
                            System.out.println("Name: "+familyMembers.getMemberName());
                            System.out.println("Member Type: "+familyMembers.getMemberType());
                            System.out.println("Gender: "+familyMembers.getMemberGender());
                            System.out.println("Age: "+familyMembers.getMemberAge());
                            //Vital Signs
                            System.out.println("****Vital Signs****");
                            //Body Temperature
                            System.out.println("-----------------------------------------");
                            String membersBodyTemperatureReport = familyMembers.getHealthReport().bodyTemperatureReport();
                            System.out.println("Average Body Temperature: "+familyMembers.getHealthReport().getAverageTemperature()+" F");
                            System.out.println(membersBodyTemperatureReport);
                            //Pulse
                            System.out.println("-----------------------------------------");
                            String membersPulseRateReport = familyMembers.getHealthReport().pulseRateReport();
                            System.out.println("Average Pulse Rate: "+familyMembers.getHealthReport().getAveragePulse());
                            System.out.println(membersPulseRateReport);
                            //Blood Pressure
                            System.out.println("-----------------------------------------");
                            String membersBloodPressureReport = familyMembers.getHealthReport().bloodPressureReport();
                            int averageSystolic = familyMembers.getHealthReport().getAverageSystolic();
                            int averageDiastolic = familyMembers.getHealthReport().getAverageDiastolic();
                            String averageBloodPressure = averageSystolic+"/"+averageDiastolic;
                            System.out.println("Average Blood Pressure: "+averageBloodPressure);
                            System.out.println(membersBloodPressureReport);
                            //Pedometer Reading
                            System.out.println("-----------------------------------------");
                            familyMembers.getHealthReport().pedometerReport();
                            double membersPedometerReading = familyMembers.getHealthReport().getAverageMiles();
                            double membersAverageCaloriesBurnt = familyMembers.getHealthReport().getAverageCaloriesBurntByPedometer() + familyMembers.getHealthReport().getAverageCaloriesBurntByExercise();
                            double membersDifferenceOfCalories = familyMembers.getHealthReport().getCaloriesDifference();
                            System.out.println("Average Miles Walked: "+membersPedometerReading+" miles");
                            System.out.println("Average Calories Burnt: "+membersAverageCaloriesBurnt+" Calories");
                            System.out.println("Difference Of Calories Intake and Calories Burnt: "+membersDifferenceOfCalories+" Calories");
                            //BMI
                            System.out.println("-----------------------------------------");
                            String bmiReport = familyMembers.getHealthReport().bodyMassIndex();
                            double bmi = familyMembers.getHealthReport().getBodyMassIndex();
                            System.out.println("Body Mass Index: "+bmi);
                            System.out.println(bmiReport);
                            //LDL Cholesterol
                            System.out.println("-----------------------------------------");
                            String ldlCholesterolReport = familyMembers.getHealthReport().ldlCholesterol();
                            int ldlCholesterol = familyMembers.getHealthReport().getAverageLdlCholesterol();
                            System.out.println("LDL Cholesterol: "+ldlCholesterol+" mg/dl");
                            System.out.println(ldlCholesterolReport);
                            //HDL Cholesterol
                            System.out.println("-----------------------------------------");
                            String hdlCholesterolReport = familyMembers.getHealthReport().hdlCholesterol();
                            int hdlCholesterol = familyMembers.getHealthReport().getAverageHdlCholesterol();
                            System.out.println("HDL Cholesterol: "+hdlCholesterol+" mg/dl");
                            System.out.println(hdlCholesterolReport);
                            System.out.println();
                            //

                            //General Attributes
                            System.out.println("****General Attributes****");
                            System.out.println("Smoking: "+familyMembers.getGeneralAttributes().getSmoking());
                            System.out.println("Drinking: "+familyMembers.getGeneralAttributes().getDrinking());
                            System.out.println("Diabetes: "+familyMembers.getGeneralAttributes().getDiabetes());
                            System.out.println("Exercise Hours: "+familyMembers.getGeneralAttributes().getExerciseHours());
                            System.out.println("Weight: "+familyMembers.getGeneralAttributes().getWeight()+" kg");
                            System.out.println("Height: "+familyMembers.getGeneralAttributes().getHeight()+" cm");
                            System.out.println("Duration of Sleep: "+familyMembers.getGeneralAttributes().getDurationOfSleep()+" hours");
                            System.out.println("Calorites Intake: "+familyMembers.getGeneralAttributes().getCaloriesIntake());
                            
                            //
                            //RISK FACTOR
                            System.out.println("*********************");
                            int riskPercentage = 0;
                            if(familyMembers.getMemberGender().equalsIgnoreCase("Male"))
                            {
                                familyMembers.getHealthReport().riskFactorCalculatorMen(familyMembers.getMemberAge());
//                                int riskPoints = familyMembers.getHealthReport().getRiskPoints();
//                                System.out.println("Risk Points: "+riskPoints);
                                riskPercentage = familyMembers.getHealthReport().getRiskPercentage();
                                if(riskPercentage==56)
                                {
                                    System.out.println("Risk Percentage: >="+riskPercentage+"%");
                                }
                                else
                                {
                                    System.out.println("Risk Percentage: "+riskPercentage+"%");
                                }
                            }
                            
                            if(familyMembers.getMemberGender().equalsIgnoreCase("Female"))
                            {
                                familyMembers.getHealthReport().riskFactorCalculatorWomen(familyMembers.getMemberAge());
//                                int riskPoints = familyMembers.getHealthReport().getRiskPoints();
//                                System.out.println("Risk Points: "+riskPoints);
                                riskPercentage = familyMembers.getHealthReport().getRiskPercentage();
                                if(riskPercentage==32)
                                {
                                    System.out.println("Risk Percentage: >="+riskPercentage+"%");
                                }
                                else
                                {
                                    System.out.println("Risk Percentage: "+riskPercentage+"%");
                                }
                            }
                            
                            
                            // Expected Risk
                            
                            //For men
                            if(familyMembers.getMemberGender().equalsIgnoreCase("Male"))
                            {
                                familyMembers.getHealthReport().compareRiskMen(familyMembers.getMemberAge());
                                int expectedRiskPerc = familyMembers.getHealthReport().getExpectedRiskPercentage();
                                System.out.println("Expected Risk Percentage of this age group "+expectedRiskPerc+"%");
                                if(riskPercentage>expectedRiskPerc)
                                {
                                    System.out.println("High Risk Percentage than expected.");
                                }
                            }
                            
                            //For Women
                            if(familyMembers.getMemberGender().equalsIgnoreCase("Female"))
                            {
                                familyMembers.getHealthReport().compareRiskWomen(familyMembers.getMemberAge());
                                int expectedRiskPerc = familyMembers.getHealthReport().getExpectedRiskPercentage();
                                System.out.println("Expected Risk Percentage of this age group "+expectedRiskPerc+"%");
                                if(riskPercentage>expectedRiskPerc)
                                {
                                    System.out.println("High Risk Percentage than expected.");
                                }
                            }
                            
                            //
                            System.out.println("---------------------------------");
                           
                        }
                    }   
                        System.out.println("****************************");
                  }     
                       
                    
                
            
            System.out.println("-----------XXXXXXXXXXXXXXXXXXXXXXXXX------------");
            
        
    }
    
    
    
    
    //
    
    public void displayRiskRatioOfFamily()
    {
        
        City city = Configuration.addGeneralAttributes();
        for(Community community : city.getCommunityList())
        {
            System.out.println(community.getCommunityName());
            for(House house : community.getHouseList())
            {
                System.out.println(house.getHouseNumber());
                for(Family family : house.getFamilyList())
                    { 
                        int count = 0;
                        System.out.println(family.getFamilyName());
                        for(FamilyMembers familyMembers : family.getMembersList())
                        {
                            if(familyMembers.getMemberGender().equalsIgnoreCase("Male"))
                            {
                                familyMembers.getHealthReport().riskFactorCalculatorMen(familyMembers.getMemberAge());
                                familyMembers.getHealthReport().compareRiskMen(familyMembers.getMemberAge());
                                if(familyMembers.getHealthReport().getExpectedRiskPercentage()<familyMembers.getHealthReport().getRiskPercentage())
                                {
                                    count++;
                                }
                            }
                            if(familyMembers.getMemberGender().equalsIgnoreCase("Female"))
                            {
                                familyMembers.getHealthReport().riskFactorCalculatorWomen(familyMembers.getMemberAge());
                                familyMembers.getHealthReport().compareRiskMen(familyMembers.getMemberAge());
                                if(familyMembers.getHealthReport().getExpectedRiskPercentage()<familyMembers.getHealthReport().getRiskPercentage())
                                {
                                    count++;
                                }
                            }
                        }
                        System.out.println("Number of People having High Risk: "+count);
                        System.out.println("Total Population: "+family.getMembersList().size());
                        float percetangeOfFamilyMembers = ((float)count/(float)family.getMembersList().size())*100;
                        float percetangeOfFamilyMembersAtHighRisk = Float.parseFloat(new DecimalFormat("##.#").format(percetangeOfFamilyMembers));
                        System.out.println("Percentage of people with High Risk in this Family: "+percetangeOfFamilyMembersAtHighRisk+"%");
                        
                    }
                System.out.println("---------------------------------------------------------------");
            }
        }
        
    }
    
    
    //One house
    public void displayRiskRatioOfHouse() {

        City city = Configuration.addGeneralAttributes();
        for (Community community : city.getCommunityList()) 
        {
            System.out.println(community.getCommunityName());
            for (House house : community.getHouseList()) 
            {
                int countHouse = 0;
                int totalNumber = 0;
                System.out.println(house.getHouseNumber());
                for (Family family : house.getFamilyList()) 
                {
                    totalNumber = totalNumber + family.getMembersList().size();
                    for (FamilyMembers familyMembers : family.getMembersList()) 
                    {   
                        
                        if (familyMembers.getMemberGender().equalsIgnoreCase("Male")) 
                        {
                            familyMembers.getHealthReport().riskFactorCalculatorMen(familyMembers.getMemberAge());
                            familyMembers.getHealthReport().compareRiskMen(familyMembers.getMemberAge());
                            if (familyMembers.getHealthReport().getExpectedRiskPercentage() < familyMembers.getHealthReport().getRiskPercentage()) 
                            {
                                countHouse++;
                                
                            }
                        }
                        if (familyMembers.getMemberGender().equalsIgnoreCase("Female")) {
                            familyMembers.getHealthReport().riskFactorCalculatorWomen(familyMembers.getMemberAge());
                            familyMembers.getHealthReport().compareRiskMen(familyMembers.getMemberAge());
                            if (familyMembers.getHealthReport().getExpectedRiskPercentage() < familyMembers.getHealthReport().getRiskPercentage()) {
                                countHouse++;
                            }
                        }

                        

                    }

                }
                System.out.println("Number of People having High Risk: "+countHouse);
                System.out.println("Total Population: "+totalNumber);
                float percetangeOfFamilyMembers = ((float)countHouse/(float)totalNumber)*100;
                float percetangeOfFamilyMembersAtHighRisk = Float.parseFloat(new DecimalFormat("##.#").format(percetangeOfFamilyMembers));
                System.out.println("Percentage risk of this house: "+percetangeOfFamilyMembersAtHighRisk+"%");
            }
            System.out.println("---------------------------------------------------------------");
        }

    }
    
    public void displayRiskRatioOfCommunity() {

        City city = Configuration.addGeneralAttributes();
        for (Community community : city.getCommunityList()) 
        {
            int countInCommunity = 0;
            int totalNumber = 0;
            System.out.println(community.getCommunityName());
            for (House house : community.getHouseList()) 
            {
                for (Family family : house.getFamilyList()) 
                {
                    totalNumber = totalNumber + family.getMembersList().size();
                    for (FamilyMembers familyMembers : family.getMembersList()) 
                    {   
                        
                        if (familyMembers.getMemberGender().equalsIgnoreCase("Male")) 
                        {
                            familyMembers.getHealthReport().riskFactorCalculatorMen(familyMembers.getMemberAge());
                            familyMembers.getHealthReport().compareRiskMen(familyMembers.getMemberAge());
                            if (familyMembers.getHealthReport().getExpectedRiskPercentage() < familyMembers.getHealthReport().getRiskPercentage()) 
                            {
                                countInCommunity++;
                                
                            }
                        }
                        if (familyMembers.getMemberGender().equalsIgnoreCase("Female")) {
                            familyMembers.getHealthReport().riskFactorCalculatorWomen(familyMembers.getMemberAge());
                            familyMembers.getHealthReport().compareRiskMen(familyMembers.getMemberAge());
                            if (familyMembers.getHealthReport().getExpectedRiskPercentage() < familyMembers.getHealthReport().getRiskPercentage()) {
                                countInCommunity++;
                            }
                        }

                        

                    }

                }
                
            }
                System.out.println("Number of People having High Risk: "+countInCommunity);
                System.out.println("Total Population: "+totalNumber);
                float percetangeOfFamilyMembers = ((float)countInCommunity/(float)totalNumber)*100;
                float percetangeOfFamilyMembersAtHighRisk = Float.parseFloat(new DecimalFormat("##.#").format(percetangeOfFamilyMembers));
                System.out.println("Percentage risk of this community: "+percetangeOfFamilyMembersAtHighRisk+"%");
                System.out.println("---------------------------------------------------------------");
        }

    }
    
    
    public void displayRiskRatioOfCity() {

        City city = Configuration.addGeneralAttributes();
        System.out.println(city.getCityName()+" City");
        int countInCity = 0;
            int totalNumber = 0;
        for (Community community : city.getCommunityList()) 
        {
            for (House house : community.getHouseList()) 
            {
                for (Family family : house.getFamilyList()) 
                {
                    totalNumber = totalNumber + family.getMembersList().size();
                    for (FamilyMembers familyMembers : family.getMembersList()) 
                    {   
                        
                        if (familyMembers.getMemberGender().equalsIgnoreCase("Male")) 
                        {
                            familyMembers.getHealthReport().riskFactorCalculatorMen(familyMembers.getMemberAge());
                            familyMembers.getHealthReport().compareRiskMen(familyMembers.getMemberAge());
                            if (familyMembers.getHealthReport().getExpectedRiskPercentage() < familyMembers.getHealthReport().getRiskPercentage()) 
                            {
                                countInCity++;
                                
                            }
                        }
                        if (familyMembers.getMemberGender().equalsIgnoreCase("Female")) {
                            familyMembers.getHealthReport().riskFactorCalculatorWomen(familyMembers.getMemberAge());
                            familyMembers.getHealthReport().compareRiskMen(familyMembers.getMemberAge());
                            if (familyMembers.getHealthReport().getExpectedRiskPercentage() < familyMembers.getHealthReport().getRiskPercentage()) {
                                countInCity++;
                            }
                        }
                    }
                }
            }
                
        }
        System.out.println("Number of People having High Risk: "+countInCity);
        System.out.println("Total Population: "+totalNumber);
        float percetangeOfFamilyMembers = ((float)countInCity/(float)totalNumber)*100;
        float percetangeOfFamilyMembersAtHighRisk = Float.parseFloat(new DecimalFormat("##.#").format(percetangeOfFamilyMembers));
        System.out.println("Percentage risk of this City: "+percetangeOfFamilyMembersAtHighRisk+"%");

    }
    
    
    
}

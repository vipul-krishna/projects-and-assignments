/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.text.DecimalFormat;
import java.util.ArrayList;

/**
 *
 * @author kkgarg
 */
public class HealthReport {

    private int expectedRiskPercentage=0;
    private int riskPoints = 0;
    private int riskPercentage=0;
    private String result="";
    private double averageTemperature=0.0;
    private int averagePulse = 0;
    private int averageSystolic=0;
    private int averageDiastolic=0;
    private int averageLdlCholesterol = 0;
    private int averageHdlCholesterol = 0;
    private double averageMiles = 0.0;
    private double averageCaloriesBurntByPedometer = 0.0;
    private double averageCaloriesBurntByExercise = 0.0;
    private double caloriesDifference =0.0;
    private double bodyMassIndex = 0;
    private ArrayList<VitalSigns> vitalSignsList;
    private GeneralAttributes generalAttributes;
    
    
    
    public HealthReport(ArrayList<VitalSigns> vitalSignsList, GeneralAttributes generalAttributes) {
        this.vitalSignsList = vitalSignsList;
        this.generalAttributes = generalAttributes;
    }

    public String getResult() {
        return result;
    }


    public double getAverageTemperature() {
        return averageTemperature;
    }

    public int getAveragePulse() {
        return averagePulse;
    }

    public int getAverageSystolic() {
        return averageSystolic;
    }

    public int getAverageDiastolic() {
        return averageDiastolic;
    }

    public int getAverageLdlCholesterol() {
        return averageLdlCholesterol;
    }

    public int getAverageHdlCholesterol() {
        return averageHdlCholesterol;
    }

    public double getAverageMiles() {
        return averageMiles;
    }

    public double getAverageCaloriesBurntByPedometer() {
        return averageCaloriesBurntByPedometer;
    }

    public double getAverageCaloriesBurntByExercise() {
        return averageCaloriesBurntByExercise;
    }

    
    
    public double getCaloriesDifference() {
        return caloriesDifference;
    }

    public double getBodyMassIndex() {
        return bodyMassIndex;
    }

    public int getRiskPoints() {
        return riskPoints;
    }

    public int getRiskPercentage() {
        return riskPercentage;
    }

    public int getExpectedRiskPercentage() {
        return expectedRiskPercentage;
    }
    
    
    
    
    
    
    
    

    
    
    
    
    public String bodyTemperatureReport()
    {
        double totalTemperature=0.0;
        for(VitalSigns vitalSigns : vitalSignsList)
        {
            double temperature = vitalSigns.getBodyTemperature();
            totalTemperature = totalTemperature + temperature;
        }
        double average = totalTemperature/vitalSignsList.size();
        averageTemperature = Double.parseDouble( new DecimalFormat("##.#").format(average));
        
        if(averageTemperature>95.0 && averageTemperature<=99.0)
        {
            result = "Body temperature is fine.";
        }
        if(averageTemperature>99.0)
        {
            result = "Body temperature is high.";
        }
        return result;
    }
    
    public String pulseRateReport()
    {
        int totalPulse=0;
        for(VitalSigns vitalSigns : vitalSignsList)
        {
            int pulse = vitalSigns.getPulseRate();
            totalPulse = totalPulse + pulse;
        }
        averagePulse = totalPulse/vitalSignsList.size();
        
        if(averagePulse<=60)
        {
            result = "Pulse is Low.";
        }
        if(averagePulse>60 && averagePulse<=100)
        {
            result = "Pulse is Fine.";
        }
        if(averagePulse>100)
        {
            result = "Pulse is High.";
        }
        return result;
    }
    
    
    public String bloodPressureReport()
    {
        int totalSystolic=0;
        int totalDiastolic=0;
        
        for(VitalSigns vitalSigns : vitalSignsList)
        {
            int systolic = vitalSigns.getBpSystolic();
            int diastolic = vitalSigns.getBpDiastolic();
            totalSystolic = totalSystolic + systolic;
            totalDiastolic = totalDiastolic + diastolic;
        }
        averageSystolic = totalSystolic/vitalSignsList.size();
        averageDiastolic = totalDiastolic/vitalSignsList.size();
        

        if((averageSystolic>100 && averageSystolic<=130)&& (averageDiastolic>70 && averageDiastolic<=90 ))
        {
            result = "Blood Pressure is Fine.";
        }
        else
        {
            result = "Blood Pressure in not Normal.";
        }
        
        return result;
    }
    
    public void pedometerReport()
    {
        int totalSteps=0;
        double averageSteps = 0.0;
        double oneMile = 2000.0;
        double caloriesBurntInOneMile = 100.0;
        double caloriesBurntInOneHourExercise = 400.0;
        for(VitalSigns vitalSigns : vitalSignsList)
        {
            int pedometerReading = vitalSigns.getPedometerReading();
            totalSteps = totalSteps + pedometerReading;
        }
        String totalStepsString = String.valueOf(totalSteps);
        double totalStepsDouble = Double.parseDouble(totalStepsString);
        
        int vitalSignSize = vitalSignsList.size();
        String vitalSignSizeString = String.valueOf(vitalSignSize);
        double vitalSignSizeDouble = Double.parseDouble(vitalSignSizeString);
        
        averageSteps = totalStepsDouble/vitalSignSizeDouble;
        
        double averageMilesWalked = averageSteps/oneMile;
        
        averageMiles = Double.parseDouble( new DecimalFormat("##.#").format(averageMilesWalked));
        
        double caloriesBurntByPedometer = caloriesBurntInOneMile*averageMilesWalked;
        averageCaloriesBurntByPedometer = Double.parseDouble(new DecimalFormat("##.#").format(caloriesBurntByPedometer));
        
        int exerciseHours = generalAttributes.getExerciseHours();
        String exerciseHoursString = String.valueOf(exerciseHours);
        double exerciseHoursDouble = Double.parseDouble(exerciseHoursString);
        double caloriesBurntByExercise = caloriesBurntInOneHourExercise*exerciseHoursDouble ;
        averageCaloriesBurntByExercise = Double.parseDouble(new DecimalFormat("##.#").format(caloriesBurntByExercise));
        
        double differenceOfCalories = generalAttributes.getCaloriesIntake() - averageCaloriesBurntByPedometer -averageCaloriesBurntByExercise;
        caloriesDifference = Double.parseDouble( new DecimalFormat("##.#").format(differenceOfCalories));
    }
    
    public String bodyMassIndex()
    {
        double heightInMeters = generalAttributes.getHeight()/100;
        double height = Double.parseDouble( new DecimalFormat("##.##").format(heightInMeters));
        
        double bmi = generalAttributes.getWeight()/(height*height);
        bodyMassIndex = Double.parseDouble( new DecimalFormat("##.#").format(bmi));
        
        if(bodyMassIndex<=18)
        {
            result="BMI is Low";
        }
        if(bodyMassIndex>18 && bodyMassIndex<30)
        {
            result="BMI is Fine.";
        }
        if(bodyMassIndex>=30)
        {
            result="BMI is high which is means high risk for CHD";
        }
        
        return result;
    }
    
    public String ldlCholesterol()
    {
        int totalLdlCholesterol = 0;
        
        for(VitalSigns vitalSigns : vitalSignsList)
        {
            int ldlCholesterol = vitalSigns.getLdlCholesterol();
            totalLdlCholesterol = totalLdlCholesterol + ldlCholesterol;
        }
        
        averageLdlCholesterol = totalLdlCholesterol/vitalSignsList.size();
        
        if(averageLdlCholesterol<=129)
        {
            result = "LDL Cholesterol is Low";
        }
        if(averageLdlCholesterol>129 && averageLdlCholesterol<160)
        {
            result = "LDL Cholesterol is Fine";
        }
        if(averageLdlCholesterol>=160)
        {
            result = "LDL Cholesterol is High";
        }
        
        return result;
    }
    
    public String hdlCholesterol()
    {
        int totalHdlCholesterol = 0;
        for(VitalSigns vitalSigns : vitalSignsList)
        {
            int hdlCholesterol = vitalSigns.getHdlCholesterol();
            totalHdlCholesterol = totalHdlCholesterol + hdlCholesterol;
        }
        
        averageHdlCholesterol = totalHdlCholesterol/vitalSignsList.size();
        
        if(averageHdlCholesterol<=40)
        {
            result = "HDL Cholesterol is Low";
        }
        if(averageHdlCholesterol>40 && averageHdlCholesterol<55)
        {
            result = "HDL Cholesterol is Fine";
        }
        if(averageHdlCholesterol>=55)
        {
            result = "HDL Cholesterol is High";
        }
        
        return result;
    }
    
    
    public void riskFactorCalculatorMen(int memberAge)
    {
        //For men
        

        //Age
        
        if(memberAge>=30 && memberAge<=34)
        {
            riskPoints = riskPoints + (-1);
        }
        if(memberAge>=35 && memberAge<=39)
        {
            riskPoints = riskPoints + (0);
        }
        if(memberAge>=40 && memberAge<=44)
        {
            riskPoints = riskPoints + (1);
        }
        if(memberAge>=45 && memberAge<=49)
        {
            riskPoints = riskPoints + (2);
        }
        if(memberAge>=50 && memberAge<=54)
        {
            riskPoints = riskPoints + (3);
        }
        if(memberAge>=55 && memberAge<=59)
        {
            riskPoints = riskPoints + (4);
        }
        if(memberAge>=60 && memberAge<=64)
        {
            riskPoints = riskPoints + (5);
        }
        if(memberAge>=65 && memberAge<=69)
        {
            riskPoints = riskPoints + (6);
        }
        if(memberAge>=70 && memberAge<=75)
        {
            riskPoints = riskPoints + (7);
        }
        
        //LDL Cholesterol
        if(averageLdlCholesterol<100)
        {
            riskPoints = riskPoints + (-3);
        }
        if(averageLdlCholesterol>=100 && averageLdlCholesterol<=129)
        {
            riskPoints = riskPoints + (0);
        }
        if(averageLdlCholesterol>=130 && averageLdlCholesterol<=159)
        {
            riskPoints = riskPoints + (0);
        }
        if(averageLdlCholesterol>=160 && averageLdlCholesterol<190)
        {
            riskPoints = riskPoints + (1);
        }
        if(averageLdlCholesterol>=190)
        {
            riskPoints = riskPoints + (2);
        }
        
        //HDL Cholesterol
        
        if(averageHdlCholesterol<35)
        {
            riskPoints = riskPoints + (2);
        }
        if(averageHdlCholesterol>=35 && averageHdlCholesterol<=44)
        {
            riskPoints = riskPoints + (1);
        }
        if(averageHdlCholesterol>=45 && averageHdlCholesterol<=49)
        {
            riskPoints = riskPoints + (0);
        }
        if(averageHdlCholesterol>=50 && averageHdlCholesterol<=59)
        {
            riskPoints = riskPoints + (0);
        }
        if(averageHdlCholesterol>=60)
        {
            riskPoints = riskPoints + (-1);
        }
        
        //Blood pressure
        
        //Systolic
        int riskSystolic=0;
        if(averageSystolic<120)
        {
            riskSystolic = 0;
        }
        if(averageSystolic>=120 && averageSystolic<=129)
        {
            riskSystolic = 0;
        }
        if(averageSystolic>=130 && averageSystolic<139)
        {
            riskSystolic = 1;
        }
        if(averageSystolic>=140 && averageSystolic<+159)
        {
            riskSystolic = 2;
        }
        if(averageSystolic>160)
        {
            riskSystolic = 3;
        }
       //Diastolic
       int riskDiastolic=0;
       if(averageDiastolic<80)
        {
            riskDiastolic = 0;
        }
        if(averageDiastolic>=80 && averageDiastolic<=84)
        {
            riskDiastolic = 0;
        }
        if(averageDiastolic>=85 && averageDiastolic<=89)
        {
            riskDiastolic = 1;
        }
        if(averageDiastolic>=90 && averageDiastolic<=99)
        {
            riskDiastolic = 2;
        }
        if(averageDiastolic>=100)
        {
            riskDiastolic = 3;
        }
        //Checking condition For Blood Pressure
        if(riskSystolic==riskDiastolic)
        {
            riskPoints = riskPoints + riskSystolic;
        }
        if(riskSystolic>riskDiastolic)
        {
            riskPoints = riskPoints + riskSystolic;
        }
        if(riskDiastolic>riskSystolic)
        {
            riskPoints = riskPoints + riskDiastolic;
        }
        
        //Diabetes
        String diabetes = generalAttributes.getDiabetes();
        if(diabetes.equalsIgnoreCase("Yes"))
        {
            riskPoints = riskPoints + 1;
        }
        if(diabetes.equalsIgnoreCase("No"))
        {
            riskPoints = riskPoints + 0;
        }
        
        //Pulse Rate
        
        if(averagePulse<60)
        {
            riskPoints = riskPoints + (1);
        }
        if(averagePulse>=60 && averagePulse<=100)
        {
            riskPoints = riskPoints + (0);
        }
        if(averagePulse<100)
        {
            riskPoints = riskPoints + (1);
        }
        
        //BMI
        if(bodyMassIndex>30)
        {
            riskPoints = riskPoints + 1;
        }
        
        
        //Smoking
        String smoking = generalAttributes.getSmoking();
        if(smoking.equalsIgnoreCase("Yes"))
        {
            riskPoints = riskPoints + 1;
        }
        if(smoking.equalsIgnoreCase("No"))
        {
            riskPoints = riskPoints + 0;
        }
        
        //Drinking
        String drinking = generalAttributes.getDrinking();
        if(drinking.equalsIgnoreCase("Yes"))
        {
            riskPoints = riskPoints + 1;
        }
        if(drinking.equalsIgnoreCase("No"))
        {
            riskPoints = riskPoints + 0;
        }
        
        
        
        //Assigning Percentage
        if(riskPoints<-3)
        {
            riskPercentage=1;
        }
        if(riskPoints==-2)
        {
            riskPercentage=2;
        }
        if(riskPoints==-1)
        {
            riskPercentage=2;
        }
        if(riskPoints==0)
        {
            riskPercentage=3;
        }
        if(riskPoints==1)
        {
            riskPercentage=4;
        }
        if(riskPoints==2)
        {
            riskPercentage=4;
        }
        if(riskPoints==3)
        {
            riskPercentage=6;
        }
        if(riskPoints==4)
        {
            riskPercentage=7;
        }
        if(riskPoints==5)
        {
            riskPercentage=9;
        }
        if(riskPoints==6)
        {
            riskPercentage=11;
        }
        if(riskPoints==7)
        {
            riskPercentage=14;
        }
        if(riskPoints==8)
        {
            riskPercentage=18;
        }
        if(riskPoints==9)
        {
            riskPercentage=22;
        }
        if(riskPoints==10)
        {
            riskPercentage=27;
        }
        if(riskPoints==11)
        {
            riskPercentage=33;
        }
        if(riskPoints==12)
        {
            riskPercentage=40;
        }
        if(riskPoints==13)
        {
            riskPercentage=47;
        }
        if(riskPoints>=14)
        {
            riskPercentage=56;
        }
        
        
    }
    
    public void compareRiskMen(int memberAge)
    {
        if(memberAge>=30 && memberAge<=34)
        {
            expectedRiskPercentage = 3;
        }
        if(memberAge>=35 && memberAge<=39)
        {
            expectedRiskPercentage = 5;
        }
        if(memberAge>=40 && memberAge<=44)
        {
            expectedRiskPercentage = 7;
        }
        if(memberAge>=45 && memberAge<=49)
        {
            expectedRiskPercentage = 11;
        }
        if(memberAge>=50 && memberAge<=54)
        {
            expectedRiskPercentage = 14;
        }
        if(memberAge>=55 && memberAge<=59)
        {
            expectedRiskPercentage = 16;
        }
        if(memberAge>=60 && memberAge<=64)
        {
            expectedRiskPercentage = 21;
        }
        if(memberAge>=65 && memberAge<=69)
        {
            expectedRiskPercentage = 25;
        }
        if(memberAge>=70 && memberAge<=75)
        {
            expectedRiskPercentage = 30;
        }
    }
    
    //WOMEN
    
    public void riskFactorCalculatorWomen(int memberAge)
    {
        //For men
        

        //Age
        
        if(memberAge>=30 && memberAge<=34)
        {
            riskPoints = riskPoints + (-9);
        }
        if(memberAge>=35 && memberAge<=39)
        {
            riskPoints = riskPoints + (-4);
        }
        if(memberAge>=40 && memberAge<=44)
        {
            riskPoints = riskPoints + (0);
        }
        if(memberAge>=45 && memberAge<=49)
        {
            riskPoints = riskPoints + (3);
        }
        if(memberAge>=50 && memberAge<=54)
        {
            riskPoints = riskPoints + (6);
        }
        if(memberAge>=55 && memberAge<=59)
        {
            riskPoints = riskPoints + (7);
        }
        if(memberAge>=60 && memberAge<=64)
        {
            riskPoints = riskPoints + (8);
        }
        if(memberAge>=65 && memberAge<=69)
        {
            riskPoints = riskPoints + (8);
        }
        if(memberAge>=70 && memberAge<=75)
        {
            riskPoints = riskPoints + (8);
        }
        
        //LDL Cholesterol
        if(averageLdlCholesterol<100)
        {
            riskPoints = riskPoints + (-2);
        }
        if(averageLdlCholesterol>=100 && averageLdlCholesterol<=129)
        {
            riskPoints = riskPoints + (0);
        }
        if(averageLdlCholesterol>=130 && averageLdlCholesterol<=159)
        {
            riskPoints = riskPoints + (0);
        }
        if(averageLdlCholesterol>=160 && averageLdlCholesterol<190)
        {
            riskPoints = riskPoints + (2);
        }
        if(averageLdlCholesterol>=190)
        {
            riskPoints = riskPoints + (2);
        }
        
        //HDL Cholesterol
        
        if(averageHdlCholesterol<35)
        {
            riskPoints = riskPoints + (5);
        }
        if(averageHdlCholesterol>=35 && averageHdlCholesterol<=44)
        {
            riskPoints = riskPoints + (2);
        }
        if(averageHdlCholesterol>=45 && averageHdlCholesterol<=49)
        {
            riskPoints = riskPoints + (1);
        }
        if(averageHdlCholesterol>=50 && averageHdlCholesterol<=59)
        {
            riskPoints = riskPoints + (0);
        }
        if(averageHdlCholesterol>=60)
        {
            riskPoints = riskPoints + (-2);
        }
        
        //Blood pressure
        
        //Systolic
        int riskSystolic=0;
        if(averageSystolic<120)
        {
            riskSystolic = -3;
        }
        if(averageSystolic>=120 && averageSystolic<=129)
        {
            riskSystolic = 0;
        }
        if(averageSystolic>=130 && averageSystolic<139)
        {
            riskSystolic = 0;
        }
        if(averageSystolic>=140 && averageSystolic<+159)
        {
            riskSystolic = 2;
        }
        if(averageSystolic>160)
        {
            riskSystolic = 3;
        }
       //Diastolic
       int riskDiastolic=0;
       if(averageDiastolic<80)
        {
            riskDiastolic = -3;
        }
        if(averageDiastolic>=80 && averageDiastolic<=84)
        {
            riskDiastolic = 0;
        }
        if(averageDiastolic>=85 && averageDiastolic<=89)
        {
            riskDiastolic = 0;
        }
        if(averageDiastolic>=90 && averageDiastolic<=99)
        {
            riskDiastolic = 2;
        }
        if(averageDiastolic>=100)
        {
            riskDiastolic = 3;
        }
        //Checking condition For Blood Pressure
        if(riskSystolic==riskDiastolic)
        {
            riskPoints = riskPoints + riskSystolic;
        }
        if(riskSystolic>riskDiastolic)
        {
            riskPoints = riskPoints + riskSystolic;
        }
        if(riskDiastolic>riskSystolic)
        {
            riskPoints = riskPoints + riskDiastolic;
        }
        
        //Diabetes
        String diabetes = generalAttributes.getDiabetes();
        if(diabetes.equalsIgnoreCase("Yes"))
        {
            riskPoints = riskPoints + 2;
        }
        if(diabetes.equalsIgnoreCase("No"))
        {
            riskPoints = riskPoints + 0;
        }
        
        //Pulse Rate
        
        if(averagePulse<60)
        {
            riskPoints = riskPoints + (1);
        }
        if(averagePulse>=60 && averagePulse<=100)
        {
            riskPoints = riskPoints + (0);
        }
        if(averagePulse<100)
        {
            riskPoints = riskPoints + (1);
        }
        
        //BMI
        if(bodyMassIndex>30)
        {
            riskPoints = riskPoints + 2;
        }
        
        
        //Smoking
        String smoking = generalAttributes.getSmoking();
        if(smoking.equalsIgnoreCase("Yes"))
        {
            riskPoints = riskPoints + 1;
        }
        if(smoking.equalsIgnoreCase("No"))
        {
            riskPoints = riskPoints + 0;
        }
        
        //Drinking
        String drinking = generalAttributes.getDrinking();
        if(drinking.equalsIgnoreCase("Yes"))
        {
            riskPoints = riskPoints + 1;
        }
        if(drinking.equalsIgnoreCase("No"))
        {
            riskPoints = riskPoints + 0;
        }
        
        
        
        //Assigning Percentage
        if(riskPoints==-2)
        {
            riskPercentage=1;
        }
        if(riskPoints==-1)
        {
            riskPercentage=2;
        }
        if(riskPoints==0)
        {
            riskPercentage=2;
        }
        if(riskPoints==1)
        {
            riskPercentage=2;
        }
        if(riskPoints==2)
        {
            riskPercentage=3;
        }
        if(riskPoints==3)
        {
            riskPercentage=3;
        }
        if(riskPoints==4)
        {
            riskPercentage=4;
        }
        if(riskPoints==5)
        {
            riskPercentage=5;
        }
        if(riskPoints==6)
        {
            riskPercentage=6;
        }
        if(riskPoints==7)
        {
            riskPercentage=7;
        }
        if(riskPoints==8)
        {
            riskPercentage=8;
        }
        if(riskPoints==9)
        {
            riskPercentage=9;
        }
        if(riskPoints==10)
        {
            riskPercentage=11;
        }
        if(riskPoints==11)
        {
            riskPercentage=13;
        }
        if(riskPoints==12)
        {
            riskPercentage=15;
        }
        if(riskPoints==13)
        {
            riskPercentage=17;
        }
        if(riskPoints==14)
        {
            riskPercentage=20;
        }
        if(riskPoints==15)
        {
            riskPercentage=24;
        }
        if(riskPoints==16)
        {
            riskPercentage=27;
        }
        if(riskPoints>=17)
        {
            riskPercentage=32;
        }
        
        
    }
    
    //Compare Women
    
    public void compareRiskWomen(int memberAge)
    {
        if(memberAge>=30 && memberAge<=34)
        {
            expectedRiskPercentage = 1;
        }
        if(memberAge>=35 && memberAge<=39)
        {
            expectedRiskPercentage = 1;
        }
        if(memberAge>=40 && memberAge<=44)
        {
            expectedRiskPercentage = 2;
        }
        if(memberAge>=45 && memberAge<=49)
        {
            expectedRiskPercentage = 5;
        }
        if(memberAge>=50 && memberAge<=54)
        {
            expectedRiskPercentage = 8;
        }
        if(memberAge>=55 && memberAge<=59)
        {
            expectedRiskPercentage = 12;
        }
        if(memberAge>=60 && memberAge<=64)
        {
            expectedRiskPercentage = 12;
        }
        if(memberAge>=65 && memberAge<=69)
        {
            expectedRiskPercentage = 13;
        }
        if(memberAge>=70 && memberAge<=75)
        {
            expectedRiskPercentage = 14;
        }
    }
    
    
    
}

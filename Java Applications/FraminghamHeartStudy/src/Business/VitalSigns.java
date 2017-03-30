/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.sql.Timestamp;
import java.util.Date;

/**
 *
 * @author kkgarg
 */
public class VitalSigns {
    
    private double bodyTemperature;
    private int pulseRate;
    private int bpSystolic;
    private int bpDiastolic;
    private int ldlCholesterol;
    private int hdlCholesterol;
    private int pedometerReading;
    private Date dateRecorded; 
    
    public VitalSigns()
    {
        Date date = new Date(); 
        long time = date.getTime();
        dateRecorded = new Timestamp(time);
    }
            

    public double getBodyTemperature() {
        return bodyTemperature;
    }

    public void setBodyTemperature(double bodyTemperature) {
        this.bodyTemperature = bodyTemperature;
    }

    public int getPulseRate() {
        return pulseRate;
    }

    public void setPulseRate(int pulseRate) {
        this.pulseRate = pulseRate;
    }

    public int getBpSystolic() {
        return bpSystolic;
    }

    public void setBpSystolic(int bpSystolic) {
        this.bpSystolic = bpSystolic;
    }

    public int getBpDiastolic() {
        return bpDiastolic;
    }

    public void setBpDiastolic(int bpDiastolic) {
        this.bpDiastolic = bpDiastolic;
    }

    public int getLdlCholesterol() {
        return ldlCholesterol;
    }

    public void setLdlCholesterol(int ldlCholesterol) {
        this.ldlCholesterol = ldlCholesterol;
    }

    public int getHdlCholesterol() {
        return hdlCholesterol;
    }

    public void setHdlCholesterol(int hdlCholesterol) {
        this.hdlCholesterol = hdlCholesterol;
    }
    

    public int getPedometerReading() {
        return pedometerReading;
    }

    public void setPedometerReading(int pedometerReading) {
        this.pedometerReading = pedometerReading;
    }

    public Date getDateRecorded() {
        return dateRecorded;
    } 
    
    
    
}

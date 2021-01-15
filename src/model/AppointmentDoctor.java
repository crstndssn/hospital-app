package model;

import java.util.Date;

public class AppointmentDoctor {
    // id, patient, doctor, time, date
    private int id;
    private String patient;
    private String doctor;
    private String time;
    private Date date;

    public AppointmentDoctor(String patient, String doctor){
        this.patient = patient;
        this.doctor = doctor;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getPatient(){
        return patient;
    }

    public void setPatient(){
        this.patient = patient;
    }

    public String getDoctor(){
        return doctor;
    }

    public void setDoctor(){
        this.doctor = doctor;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}

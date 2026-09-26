/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hms.model;

/**
 *
 * @author saipr
 */
public class Appointment {
    private int patientId;
    private int doctorId;
    private String appointmentDate;

    public Appointment(int patientId, int doctorId, String appointmentDate)
    {
        this.patientId = patientId;
        this.doctorId = doctorId;
        this.appointmentDate = appointmentDate;
    }

    public int getPatientId()
    {
        return patientId;
    }

    public int getDoctorId()
    {
        return doctorId;
    }

    public String getAppointmentDate()
    {
        return appointmentDate;
    }
}

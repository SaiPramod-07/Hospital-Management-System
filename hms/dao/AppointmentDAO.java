/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hms.dao;

/**
 *
 * @author saipr
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.hms.model.Appointment;
import com.hms.util.DBConnection;
public class AppointmentDAO {
    
     public void bookAppointment(Appointment a)
    {
        try
        {
            Connection con = DBConnection.getConnection();

            String query = "INSERT INTO appointment(patient_id, doctor_id, appointment_date) VALUES (?, ?, ?)";

            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(1, a.getPatientId());
            ps.setInt(2, a.getDoctorId());
            ps.setString(3, a.getAppointmentDate());

            ps.executeUpdate();

            System.out.println("Appointment booked successfully!");

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
     public void viewAppointments()
{
    try
    {
        Connection con = DBConnection.getConnection();

        String query = "SELECT * FROM appointment";

        PreparedStatement ps = con.prepareStatement(query);

        ResultSet rs = ps.executeQuery();

        while(rs.next())
        {
            int id = rs.getInt("id");
            int patientId = rs.getInt("patient_id");
            int doctorId = rs.getInt("doctor_id");
            String date = rs.getString("appointment_date");

            System.out.println(id + " " + patientId + " " + doctorId + " " + date);
        }

    }
    catch(Exception e)
    {
        e.printStackTrace();
    }
}
}
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

import com.hms.model.Doctor;
import com.hms.util.DBConnection;
import java.sql.ResultSet;
public class DoctorDAO {
    public void addDoctor(Doctor d)
{
    try
    {
        Connection con = DBConnection.getConnection();

        String query = "INSERT INTO doctor(name, specialization, phone) VALUES (?, ?, ?)";

        PreparedStatement ps = con.prepareStatement(query);

        ps.setString(1, d.getName());
        ps.setString(2, d.getSpecialization());
        ps.setString(3, d.getPhone());

        ps.executeUpdate();

        System.out.println("Doctor added successfully!");

    }
    catch(Exception e)
    {
        e.printStackTrace();
    }
}
    public void viewDoctors()
{
    try
    {
        Connection con = DBConnection.getConnection();

        String query = "SELECT * FROM doctor";

        PreparedStatement ps = con.prepareStatement(query);

        ResultSet rs = ps.executeQuery();

        while(rs.next())
        {
            int id = rs.getInt("id");
            String name = rs.getString("name");
            String specialization = rs.getString("specialization");
            String phone = rs.getString("phone");

            System.out.println(id + " " + name + " " + specialization + " " + phone);
        }

    }
    catch(Exception e)
    {
        e.printStackTrace();
    }
}
}

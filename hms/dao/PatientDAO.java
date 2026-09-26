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
import com.hms.model.Patient;
import com.hms.util.DBConnection;
import java.sql.ResultSet;
public class PatientDAO {
    public void addPatient(Patient p)
    {
        try
        {
            Connection con = DBConnection.getConnection();

            String query = "INSERT INTO patient(name, age, gender, phone, disease) VALUES (?, ?, ?, ?, ?)";

            PreparedStatement ps = con.prepareStatement(query);

            ps.setString(1, p.getName());
            ps.setInt(2, p.getAge());
            ps.setString(3, p.getGender());
            ps.setString(4, p.getPhone());
            ps.setString(5, p.getDisease());

            ps.executeUpdate();

            System.out.println("Patient Added Successfully!");

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    public void viewPatients()
{
    try
    {
        Connection con = DBConnection.getConnection();

        String query = "SELECT * FROM patient";

        PreparedStatement ps = con.prepareStatement(query);

        ResultSet rs = ps.executeQuery();

        while(rs.next())
        {
            int id = rs.getInt("id");
            String name = rs.getString("name");
            int age = rs.getInt("age");
            String gender = rs.getString("gender");
            String phone = rs.getString("phone");
            String disease = rs.getString("disease");

            System.out.println(id + " " + name + " " + age + " " + gender + " " + phone + " " + disease);
        }

    }
    catch(Exception e)
    {
        e.printStackTrace();
    }
}
    public void deletePatient(int id)
{
    try
    {
        Connection con = DBConnection.getConnection();

        String query = "DELETE FROM patient WHERE id = ?";

        PreparedStatement ps = con.prepareStatement(query);

        ps.setInt(1, id);

        ps.executeUpdate();

        System.out.println("Patient deleted successfully!");

    }
    catch(Exception e)
    {
        e.printStackTrace();
    }
}
    public void updatePatient(Patient p, int id)
{
    try
    {
        Connection con = DBConnection.getConnection();

        String query = "UPDATE patient SET name=?, age=?, gender=?, phone=?, disease=? WHERE id=?";

        PreparedStatement ps = con.prepareStatement(query);

        ps.setString(1, p.getName());
        ps.setInt(2, p.getAge());
        ps.setString(3, p.getGender());
        ps.setString(4, p.getPhone());
        ps.setString(5, p.getDisease());

        ps.setInt(6, id);

        ps.executeUpdate();

        System.out.println("Patient updated successfully!");

    }
    catch(Exception e)
    {
        e.printStackTrace();
    }
}
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hms.model;

/**
 *
 * @author saipr
 */
public class Doctor {
     private String name;
    private String specialization;
    private String phone;

    public Doctor(String name, String specialization, String phone)
    {
        this.name = name;
        this.specialization = specialization;
        this.phone = phone;
    }

    public String getName()
    {
        return name;
    }

    public String getSpecialization()
    {
        return specialization;
    }

    public String getPhone()
    {
        return phone;
    }
}

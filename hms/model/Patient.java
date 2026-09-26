/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hms.model;

/**
 *
 * @author saipr
 */
public class Patient {
  private String name;
    private int age;
    private String gender;
    private String phone;
    private String disease;

    public Patient(String name, int age, String gender, String phone, String disease)
    {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.phone = phone;
        this.disease = disease;
    }

    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    public String getGender()
    {
        return gender;
    }

    public String getPhone()
    {
        return phone;
    }

    public String getDisease()
    {
        return disease;
    }   
}

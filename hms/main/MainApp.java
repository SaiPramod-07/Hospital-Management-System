/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hms.main;

/**
 *
 * @author saipr
 */
import java.util.Scanner;

import com.hms.dao.PatientDAO;
import com.hms.dao.DoctorDAO;
import com.hms.dao.AppointmentDAO;
import com.hms.model.Patient;
import com.hms.model.Doctor;
import com.hms.model.Appointment;

public class MainApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        PatientDAO patientDAO = new PatientDAO();
        DoctorDAO doctorDAO = new DoctorDAO();
        AppointmentDAO appointmentDAO = new AppointmentDAO();

        while(true)
        {
            System.out.println("\n===== Hospital Management System =====");
            System.out.println("1. Add Patient");
            System.out.println("2. View Patients");
            System.out.println("3. Update Patient");
            System.out.println("4. Delete Patient");
            System.out.println("5. Add Doctor");
            System.out.println("6. View Doctors");
            System.out.println("7. Book Appointment");
            System.out.println("8. View Appointments");
            System.out.println("9. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch(choice)
            {

                case 1:

                    System.out.print("Enter Patient Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Age: ");
                    int age = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Gender: ");
                    String gender = sc.nextLine();

                    System.out.print("Enter Phone: ");
                    String phone = sc.nextLine();

                    System.out.print("Enter Disease: ");
                    String disease = sc.nextLine();

                    Patient p = new Patient(name, age, gender, phone, disease);

                    patientDAO.addPatient(p);

                    break;


                case 2:

                    patientDAO.viewPatients();
                    break;


                case 3:

                    System.out.print("Enter Patient ID to update: ");
                    int updateId = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter New Name: ");
                    name = sc.nextLine();

                    System.out.print("Enter New Age: ");
                    age = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter New Gender: ");
                    gender = sc.nextLine();

                    System.out.print("Enter New Phone: ");
                    phone = sc.nextLine();

                    System.out.print("Enter New Disease: ");
                    disease = sc.nextLine();

                    Patient updatedPatient = new Patient(name, age, gender, phone, disease);

                    patientDAO.updatePatient(updatedPatient, updateId);

                    break;


                case 4:

                    System.out.print("Enter Patient ID to delete: ");
                    int deleteId = sc.nextInt();
                    sc.nextLine();
                    patientDAO.deletePatient(deleteId);

                    break;


                case 5:

                    System.out.print("Enter Doctor Name: ");
                    String docName = sc.nextLine();

                    System.out.print("Enter Specialization: ");
                    String specialization = sc.nextLine();

                    System.out.print("Enter Phone: ");
                    String docPhone = sc.nextLine();

                    Doctor d = new Doctor(docName, specialization, docPhone);

                    doctorDAO.addDoctor(d);

                    break;


                case 6:

                    doctorDAO.viewDoctors();
                    break;


                case 7:

                    System.out.print("Enter Patient ID: ");
                    int patientId = sc.nextInt();

                    System.out.print("Enter Doctor ID: ");
                    int doctorId = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Appointment Date (YYYY-MM-DD): ");
                    String date = sc.nextLine();

                    Appointment a = new Appointment(patientId, doctorId, date);

                    appointmentDAO.bookAppointment(a);

                    break;


                case 8:

                    appointmentDAO.viewAppointments();
                    break;


                case 9:

                    System.out.println("Exiting system...");
                    System.exit(0);

                default:

                    System.out.println("Invalid choice!");

            }

        }

    }
}
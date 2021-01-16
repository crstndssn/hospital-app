package ui;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

import model.Doctor;
import model.Patient;
import model.User;

public class UIMenu {

    public static final String[] MONTHS = {
            "Enero", "Febrero", "Marzo", "Abril", "Mayo",
            "Junio", "Julio", "Agosto", "Septiembre", "Octubre",
            "Noviembre", "Diciembre"
    };

    public static Doctor doctorLogged;
    public static Patient patientLogged;

    public static void showMenu(){

        System.out.println("\nWelcome to Hospital");

        int response = 0;
        String responseInput;

        do {

            System.out.println("Select an option");
            System.out.println("1. Doctor");
            System.out.println("2. Patient");
            System.out.println("0. Exit");

            Scanner sc = new Scanner(System.in);
            response = Integer.parseInt(sc.nextLine());

            switch (response){
                case 1:
                    response = 0;
                    authUser(1);
                    break;
                case 2:
                    response = 0;
                    authUser(2);
                    break;
                case 0:
                    System.out.println("thaks for your visit");
                    break;
                default:
                    System.out.println("select a correct option");
            }
        } while (response != 0);
    }

    private static void authUser(int userType){
        // userType = 1 Doctor
        // userType = 2 Patient

        ArrayList<Doctor> doctors = new ArrayList<Doctor>();
        doctors.add(new Doctor("Alejandro", "doctor@mail.com"));
        doctors.add(new Doctor("Maria", "maria@mail.com"));
        doctors.add(new Doctor("Rocio", "rocio@mail.com"));

        ArrayList<Patient> patients = new ArrayList<Patient>();
        patients.add(new Patient("Laura", "laura@mail.com"));
        patients.add(new Patient("Camila", "camila@mail.com"));
        patients.add(new Patient("Camilo", "patient@mail.com"));

        boolean emailCorrect = false;

        do {

            System.out.println("\nEnter your email:");
            Scanner sc = new Scanner(System.in);
            String email = sc.nextLine();

            // Validación Doctor
            if (userType == 1 ){
                for (Doctor d: doctors) {
                    if (d.getEmail().equals(email)){
                        emailCorrect = true;
                        doctorLogged = d;
                        UIDoctorMenu.showDoctorMenu();
                    } else {
                        System.out.println("doctor not found");
                        showMenu();
                    }
                }
            }

            // Validacion Patient
            if (userType == 2){
                for (Patient p: patients){
                    if (p.getEmail().equals(email)){
                        emailCorrect = true;
                        patientLogged = p;
                        UIPatientMenu.showPatientMenu();
                    } else {
                        System.out.println("patient not found");
                        showMenu();
                    }
                }
            }

        } while (!emailCorrect);
    }

}

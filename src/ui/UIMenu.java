package ui;

import model.Doctor;
import model.Patient;

import java.util.ArrayList;
import java.util.Scanner;

public class UIMenu {

    public static final String[] MONTHS = {
            "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio",
            "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciemnre"
    };

    public static Doctor doctorLogged;
    public static Patient patientLogged;

    public static void showMenu(){
        System.out.println("Welcome to My Appointments");
        System.out.println("Seleccione la opción deseada");

        int response = 0;

        do {
            System.out.println("1. Doctor");
            System.out.println("2. Patient");
            System.out.println("0. Exit");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

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
                    System.out.println("Thank you for the visit");
                    break;
                default:
                    System.out.println("Select the correct answer");
            }

        } while (response != 0);
    }

    private static void authUser(int userType){
        // userType = 1 Doctor
        // userType = 2 Patient

        ArrayList<Doctor> doctors = new ArrayList<Doctor>();
        doctors.add(new Doctor("Alejandro Martínez", "alejandro@gmail.com"));
        doctors.add(new Doctor("Karen Sosa", "karen@gmail.com"));
        doctors.add(new Doctor("Rocio Losada", "rocio@gmail.com"));

        ArrayList<Patient> patients = new ArrayList<Patient>();
        patients.add(new Patient("María Salgado", "maria@mail.com"));
        patients.add(new Patient("Paula Cuellar", "paula@mail.com"));
        patients.add(new Patient("José Gutierrez", "jose@mail.com"));

        boolean emailCorrect = false;

        do {
            System.out.println("Insert your email: [aaa@mail.com]");
            Scanner sc = new Scanner(System.in);
            String email = sc.nextLine();

            // Validacion doctor
            if (userType == 1){
                for (Doctor d: doctors) {
                    if (d.getEmail().equals(email)){
                        emailCorrect = true;
                        // Obtener el usuario logeado
                        doctorLogged = d;
                        // showDoctorMenu
                        UIDoctorMenu.showDoctorMenu();
                    }
                }
            }

            // Validación paciente
            if (userType == 2){
                for (Patient p: patients){
                    if (p.getEmail().equals(email)){
                        emailCorrect = true;
                        // Obtener el paciente logeado
                        patientLogged = p;
                        // showPatientMenu
                        UIPatientMenu.showPatientMenu();
                    }
                }
            }

        } while (!emailCorrect);

    }

    static void showPatientMenu(){

        int response = 0;

        do {
            System.out.println("/n/n");
            System.out.println("model.Patient");
            System.out.println("1. Book Appointment");
            System.out.println("2. My Appointments");
            System.out.println("0. Return");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response) {
                case 1:
                    System.out.println("::Book an appointment");
                    for (int i = 1; i <= 3; i++) {
                        System.out.println(i + ". " + MONTHS[i]);
                    }
                    break;
                case 2:
                    System.out.println("::My Appointments");
                    break;
                case 0:
                    showMenu();
                    break;
            }
        } while (response != 0);

    }

}

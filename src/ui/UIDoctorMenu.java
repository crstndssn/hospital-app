package ui;

import model.Doctor;

import java.util.ArrayList;
import java.util.Scanner;

public class UIDoctorMenu {

    public static ArrayList<Doctor> doctorsAvailableAppointments = new ArrayList<>();

    public static void showDoctorMenu(){

        int response = 0;
        do {

            System.out.println("\nWelcome " + UIMenu.doctorLogged.getName());
            System.out.println("1. Add Available Appointment");
            System.out.println("2. My Scheduled Appointments");
            System.out.println("0. Logout");

            Scanner sc = new Scanner(System.in);
            response = Integer.parseInt(sc.nextLine());

            switch (response) {
                case 1:
                    showAddAvailableAppointmentsMenu();
                    break;
                case 2:
                    showScheduledAppointments();
                    break;
                case 0:
                    UIMenu.showMenu();
                    break;
            }

        } while (response != 0);

        System.out.println(response);

    }

    private static void showAddAvailableAppointmentsMenu(){
        int response = 0;
        do {
            System.out.println("\nSelect Month:");
            for (int i = 0; i < 3; i++){
                int j = i + 1;
                System.out.println(j + ". " + UIMenu.MONTHS[i]);
            }
            System.out.println("0. Return");

            Scanner sc = new Scanner(System.in);
            response = Integer.parseInt(sc.nextLine());


            if (response > 0 && response < 4){

                // insert date
                int monthSelect = response;
                System.out.println(monthSelect + ". " + UIMenu.MONTHS[monthSelect-1]);
                System.out.println("Insert the date available [dd/mm/yyyy]:");
                String date = sc.nextLine();
                System.out.println("The date " + date + ", is correct? \n1. si\2. no");
                int responseDate = Integer.parseInt(sc.nextLine());
                if (responseDate == 2) continue;

                // insert time
                int responseTime = 0;
                String time = "";
                do {
                    System.out.println("insert time [00:00]:");
                    time = sc.nextLine();
                    System.out.println("your time is " + time + ", is correct \n1. si\n2. no");
                    responseTime = Integer.parseInt(sc.nextLine());
                } while(responseTime == 2);

                System.out.println("Your appointment is for " + date + " at " + time);
                UIMenu.doctorLogged.addAvailableAppointment(date,time);
                checkDoctorAvailableAppointments(UIMenu.doctorLogged);
            }

        } while (response!=0);
    }

    private static void checkDoctorAvailableAppointments(Doctor doctor){
        if (doctor.getAvailableAppointment().size() > 0
        && !doctorsAvailableAppointments.contains(doctor)) {
            doctorsAvailableAppointments.add(doctor);
        }
    }

    private static void showScheduledAppointments() {
        System.out.println("Your shedule is: ");
        for (int i=0; i < UIMenu.doctorLogged.getAvailableAppointment().size(); i++){
            System.out.println(UIMenu.doctorLogged.getAvailableAppointment().get(i).getDate()
                    + " " + UIMenu.doctorLogged.getAvailableAppointment().get(i).getTime());
        }

    }

}

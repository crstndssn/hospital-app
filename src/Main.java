import model.Doctor;
import model.User;
import ui.UIMenu;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        UIMenu.showMenu();

       /* model.Doctor myDoctor = new model.Doctor("Ana", "Odontología");


        System.out.println(myDoctor.getAvailableAppointments());

        for (model.Doctor.AvailableAppointment aA: myDoctor.getAvailableAppointments()) {
            System.out.println(aA.getDate() + " " + aA.getTime());
        } */
/*
        model.Patient patient = new model.Patient("Alejandra", "aleja29@gmail.com");
        System.out.println(patient);
*/
/*
        Doctor doctor = new Doctor("Camila", "cami99@gmail.com");
        doctor.addAvailableAppointment(new Date(), "4pm");
        doctor.addAvailableAppointment(new Date(), "10am");
        doctor.addAvailableAppointment(new Date(), "1pm");
        System.out.println(doctor);
*/
        /*
        User user = new Doctor("name", "ana@ama.com");
        user.showDataUser();

        // Clase anónima
        User user1 = new User("anahí", "ana@ana.com") {
            @Override
            public void showDataUser() {
                System.out.println("Esto es una clase anónima");
            }
        };

        user1.showDataUser();*/
    }
}

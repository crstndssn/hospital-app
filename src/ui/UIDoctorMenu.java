package ui;

import javax.swing.*;

public class UIDoctorMenu {

    public static void showDoctorMenu(){

        int response = 0;
        do {
            response = Integer.parseInt(JOptionPane.showInputDialog(
                    null,
                    "Welcome " + UIMenu.doctorLogged.getName() +
                            "\n1. Add Available Appointment" +
                            "\n2. My Scheduled Appointments" +
                            "\n0. Logout"

            ));

            switch (response) {
                case 1:
                    // JOptionPane.showMessageDialog(null, "add appointment");
                    showAddAvailableAppointmentsMenu();
                    break;
                case 2:
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

            for (int i = 0; i < 3; i++){
                int j = i + 1;
                /*response = Integer.parseInt(JOptionPane.showInputDialog(
                        null,
                        "\nAdd Available Appointment" +
                                "\nSelect Month:" +
                                "\n " + j + ". " + UIMenu.MONTHS[i] +
                                "\n\n 0. Return"

                ));*/
                System.out.println(j + " " + UIMenu.MONTHS[i]);
            }

            if (response )

        } while (response!=0);
    }
}

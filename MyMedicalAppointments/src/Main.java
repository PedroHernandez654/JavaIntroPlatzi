import java.util.Date;

import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {
        //showMenu();
        Doctor myDoctor = new Doctor("Pedro Hernández", "Pediatria");

        /*Patient patient = new Patient("Alejandra","alejandra@gmail.com");
        Patient patient2 = new Patient("Anahi","anahi@gmail.com");

        System.out.println(patient.getName());
        System.out.println(patient2.getName());
        patient2 = patient;
        System.out.println(patient.getName());
        System.out.println(patient2.getName());

        patient2.setName("Manuel");
        System.out.println(patient.getName());
        System.out.println(patient2.getName());

        patient.setName("Manuela");
        System.out.println(patient.getName());
        System.out.println(patient2.getName());*/

        myDoctor.addAvailableAppointment(new Date(), "4 PM");
        myDoctor.addAvailableAppointment(new Date(), "10 AM");
        myDoctor.addAvailableAppointment(new Date(), "1 PM");

        for (Doctor.AvailableAppointment aA: myDoctor.getAvailableAppointments()){
            System.out.println(aA.getDate() + " " + aA.getTime());
        }
    }
}
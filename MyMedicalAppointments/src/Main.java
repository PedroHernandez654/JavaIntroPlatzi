import model.Doctor;
import model.Patient;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        //showMenu();
        Doctor myDoctor = new Doctor("Pedro Hernández", "Pedro@gmail.com");

        /*model.Patient patient = new model.Patient("Alejandra","alejandra@gmail.com");
        model.Patient patient2 = new model.Patient("Anahi","anahi@gmail.com");

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

        /*for (model.Doctor.AvailableAppointment aA: myDoctor.getAvailableAppointments()){
            System.out.println(aA.getDate() + " " + aA.getTime());
        }*/

        System.out.println(Day.MONDAY.getSpanish());

        Patient patient = new Patient("Alejandra","alejandra@gmail.com");

        System.out.println(patient);

        System.out.println(myDoctor);
    }
}
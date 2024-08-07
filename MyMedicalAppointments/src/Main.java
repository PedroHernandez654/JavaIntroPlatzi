import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {
        //showMenu();
        Doctor myDoctor = new Doctor("Pedro Hernández", "Pediatria");
        System.out.println(myDoctor.name);
        System.out.println(myDoctor.speciality);

        int i = 0;
        int b = 2;
        b = i;
        String name = "Ann";

        Patient patient = new Patient("Alejandra","alejandra@gmail.com");
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
        System.out.println(patient2.getName());

        /*patient.setWeight(54.6);
        System.out.println(patient.getWeight());

        patient.setPhoneNumber("12345678");
        System.out.println(patient.getPhoneNumber());*/

        //patient.weight = 60.5; //Kg
        //patient.height = 1.65; // Mts


    }
}
import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {
        //showMenu();
        Doctor myDoctor = new Doctor("Pedro Hernández", "Pediatria");
        System.out.println(myDoctor.name);
        System.out.println(myDoctor.speciality);

        Patient patient = new Patient("Alejandra","alejandra@gmail.com");

        //patient.weight = 60.5; //Kg
        //patient.height = 1.65; // Mts


    }
}
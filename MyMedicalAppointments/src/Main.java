import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {
        Doctor myDoctor = new Doctor("Pedro Hernández");
        myDoctor.name = "Felipe Cazin";
        myDoctor.showName();
        myDoctor.showId();


        Doctor myDoctorAnn = new Doctor();
        myDoctorAnn.showId();

        showMenu();

    }
}
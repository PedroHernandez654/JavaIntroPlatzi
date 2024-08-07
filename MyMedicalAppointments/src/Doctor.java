public class Doctor {
    //Atributos
    static int id = 0; //Autoincrement
    String name;
    String speciality;

    Doctor(){
        System.out.println("Construyendo el objeto Doctor");
    }

    Doctor(String name, String speciality){
        id++;
        this.name = name;
        this.speciality = speciality;
        System.out.println("El nombre del Dr asingado es "+name);
    }

    //Comportamientos
    public void showName(){
        System.out.println(name);
    }

    public void showId(){
        System.out.println("ID Doctor: " + id);
    }
}

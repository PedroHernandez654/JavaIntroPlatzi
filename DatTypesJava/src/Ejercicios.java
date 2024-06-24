import java.sql.SQLOutput;

public class Ejercicios {
    public static void main(String[] args) {
        //Ejercicio 1
        int myAge = 22;
        int myMomAge = 60;
        String myName = "Pedro Dev";
        String myMomName = "Mamá Dev";


        System.out.println("Hola yo soy: " + myName + " y tengo: " + myAge + " años.");
        System.out.println("mi mamá se llama: " + myMomName + " y tiene: " + myMomAge + " años.");

        //Ejercicio 2
        char example = 'z';
        System.out.println("Este es un:" + (int) example);

        int i = 250;
        System.out.println("Valor de i: " + i);
        long iL = i;
        System.out.println("Valor de iL Long: " + iL);
        short iS = (short) iL;
        System.out.println("Valor de iS short: " + iS);

        double d = 301.067;
        System.out.println((long) d);

        int x = 100;
        System.out.println((float) x+5000.66);

        int j = 737;
        System.out.println((byte)j*100);

        double k = 298.638;
        System.out.println((long)k/25);
    }
}

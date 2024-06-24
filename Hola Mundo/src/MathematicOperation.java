public class MathematicOperation {
    public static void main(String[] args) {
        double x = 2;
        double y = 3;

        //Devuelve un entero hacía arriba
        System.out.println(Math.ceil(x));

        //Devuelve un entero hacía abajo
        System.out.println(Math.floor(x));

        //Devuelve un número elevado a otro
        System.out.println(Math.pow(x,y));

        //Devuelve el número mayor
        System.out.println(Math.max(x,y));

        //Devuelve la raíz cuadrada
        System.out.println(Math.sqrt(y));

        //Área del círculo
        // PI * R2
        System.out.println(Math.PI * Math.pow(y,2));

        //Área de la esfera
        // 4*PI*R2
        System.out.println(4 * Math.PI * Math.pow(y,2));

        //Volumen de la esfera
        // (4/3)PI*R3
        System.out.println((4/3) * Math.PI * Math.pow(y,3));

    }
}

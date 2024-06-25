public class Funciones {
    public static void main(String[] args) {
        double y = 3;
        //Área del círculo
        // PI * R2
        double area = circuleArea(y);
        System.out.println(area);

        //Área de la esfera
        // 4*PI*R2
        System.out.println(sphereArea(y));

        //Volumen de la esfera
        // (4/3)PI*R3
        System.out.println(sphereVolume(y));

        System.out.println("Pesos Mexicanos a Dolares: " + convertToDollar(1000,"MXN"));
        System.out.println("Pesos Colmbianos a Dolares: " + convertToDollar(1000,"COP"));
        
    }

    public static double circuleArea(double radio){
        return Math.PI * Math.pow(radio,2);
    }
    public static double sphereArea(double radio){
        return 4 * Math.PI * Math.pow(radio,2);
    }
    public static double sphereVolume(double radio){
        return (4/3) * Math.PI * Math.pow(radio,3);
    }

    /**
     * Descripcion: Función que especificando su moneda convierte una cantidad de dinero a Dolares
     *
     * @param quantity Cantidad de Dinero
     * @param currency Tipo de moneda: solo acepta MXN o COP
     * @return quantity Devuelve la cantidad actualizada en Dolares
     * */
    public static double convertToDollar(double quantity, String currency){
        //MXN COP
        switch (currency){
            case "MXN":
                quantity = quantity * 0.052;
                break;
            case "COP":
                quantity = quantity * 0.00031;
                break;
        }
        return quantity;
    }
}

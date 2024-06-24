public class UpdatingVariables {
    public static void main(String[] args) {
        int salary= 1000;

        //bono $200
        salary = salary + 200;

        //Pension: $50 descuento
        salary = salary - 50;

        //2 horas extra $30
        //Comida: $45
        salary = salary + (30*2) - 45;

        System.out.println(salary);
        //Actualizando cadenas de texto
        String employeeName = "Pedro Hernández";
        employeeName = employeeName + " Dzul";

        employeeName = "Pedruxter: " + employeeName;

        System.out.println(employeeName);

    }
}

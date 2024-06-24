public class DataTypes {
    public static void main(String[] args) {
        int n = 1234567890;
        long nL = 12345678904L;
        double nD = 123.456;
        float Nf = 123.456F;

        var salary = 1002; //int
        //pension 3%
        var pension = salary * 0.03; //double

        var totalSalary = salary - pension;

        System.out.println(salary);
        System.out.println(totalSalary);

        var employeeName = "Pedro Hernández";
        System.out.println("Emplooyee: " + employeeName + " Salary: " + totalSalary);
    }
}

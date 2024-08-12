import java.sql.*;

public class Main {
    public static void main(String[] args) {
        Connection myCon = null;
        Statement myStamt = null;
        ResultSet myRes = null;
        String url = "jdbc:sqlserver://;databaseName=;trustServerCertificate=true;loginTimeout=3600";
        String user = "";
        String password = "";

        try{
            myCon = DriverManager.getConnection(url, user, password);

            System.out.println("Genial, nos conectamos");

            myStamt = myCon.createStatement();
            myRes = myStamt.executeQuery("SELECT TOP(100) * FROM UBICACIONES_BOLITA");

            while(myRes.next()){
                System.out.println(myRes.getString("Nombre"));
            }


        }catch (SQLException e){
            e.printStackTrace();
            System.out.println("Algo salio mal");
        }

    }
}
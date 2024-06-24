public class IfStatement {
    public static void main(String[] args) {
        boolean isBluetoothEnabled = true;
        int fileSended = 6;
        if (isBluetoothEnabled && fileSended > 5){
            System.out.println("Demasiados archivos a enviar");
        } else if (isBluetoothEnabled) {
            fileSended++;
            System.out.println("Archivo Enviado " + fileSended);
        }else{
            System.out.println("Bluetooth no activado");
        }
    }
}

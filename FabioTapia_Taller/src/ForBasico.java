
import java.util.Scanner;

public class ForBasico {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("¿A que número desea que se muestre la tabla?: ");
        n = sc.nextInt();
        if (n < 0) {
            System.out.println("El numero debe ser positivo.");
        }
        for (int i = 0; i < 10; i++) {
            
        }
        
        
        
        
        int totalVentas = 3; // TODO: número de ventas del día
        double venta; 
        for (int i = 1; i <= totalVentas; i++) {
            System.out.print("Deme monto: ");
            venta = sc.nextDouble();
            System.out.println("Monto de Venta es: " + venta);
            // TODO: solicitar el monto de la venta
            // TODO: procesar o mostrar el valor ingresado
        }
    }
}

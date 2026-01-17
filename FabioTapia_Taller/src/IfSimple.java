import java.util.Scanner;

public class IfSimple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Declaración de Variables
        short edad;
        //Pedir Edad
        System.out.println("Ingrese su edad: ");
        edad = sc.nextShort();
        if (edad <= 0) {
            System.out.print("Edad Invalida");
        }
        if (edad >= 18) {
            System.out.print("Acceso permitido.");
        } 
    }
}


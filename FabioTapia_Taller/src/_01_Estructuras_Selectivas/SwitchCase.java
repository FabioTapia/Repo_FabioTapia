package _01_Estructuras_Selectivas;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Declaración de Variables
        int opcion;
        double num1, num2;
        System.out.print("Ingrese una opción: ");
        System.out.println("\n1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        opcion = sc.nextInt();
        System.out.print("Ingrese el número 1: ");
        num1 = sc.nextDouble();
        System.out.print("Ingrese el número 2: ");
        num2 = sc.nextDouble();
        switch (opcion) {
            case 1:
                System.out.println("Resultado: " + (num1 + num2));
                break;
            case 2:
                System.out.println("Resultado: " + (num1 - num2));
                break;
            case 3:
                System.out.println("Resultado: " + (num1 * num2));
                break;
            case 4:
                if (num2 == 0) {
                    System.out.println("No se puede dividir para cero");
                } else {
                    System.out.println("Resultado: " + (num1 / num2));
                }
                break;
            default:
                System.out.println("Opción inválida");
        }
    }
}

package _02_Estructuras_Repetitivas;

import java.util.Scanner;

public class DoWhileBasico {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        short opcion;
        do {
            System.out.println("1. Saludar");
            System.out.println("2. Mostrar fecha");
            System.out.println("0. Salir");
            System.out.print("Ingrese una opción: ");
            opcion = sc.nextShort();
            switch (opcion) {
                case 1:
                    System.out.println("Hola!");
                    break;
                case 2:
                    System.out.println("Funcionalidad no implementada");
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opción inválida");
                    break;
            }
        } while (opcion != 0);
    }
}

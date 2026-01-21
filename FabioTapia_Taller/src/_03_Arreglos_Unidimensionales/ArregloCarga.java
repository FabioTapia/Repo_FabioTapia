package _03_Arreglos_Unidimensionales;

import java.util.Scanner;

public class ArregloCarga {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        short n;
        //Pedir Datos
        System.out.print("¿Cuántos números desea ingresar?: ");
        n = sc.nextShort();
        //Condicional para el tamaño de n
        if (n >= 1 && n <= 50) {
            int[] vector = new int[n];
            for (int i = 0; i < n; i++) {
                System.out.print("Ingrese el valor " + (i + 1) + ": ");
                vector[i] = sc.nextInt();
            }
            System.out.println("Carga completada");
        } else {
            System.err.println("Los números que usted pidió se excede del rango.");
        }
    }
}

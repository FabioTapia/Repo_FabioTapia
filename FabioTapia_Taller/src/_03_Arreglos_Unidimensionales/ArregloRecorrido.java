package _03_Arreglos_Unidimensionales;

import java.util.Scanner;

public class ArregloRecorrido {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        short n;
        int pares, impares;
        pares = 0;
        impares = 0;
        do {
            System.out.print("¿Cuántos números desea ingresar?: ");
            n = sc.nextShort();
            if (n <= 0) {
                System.err.println("Error, Los numeros a ingresar deben ser positivos.");
            }
        } while (n < 0);
        int[] vector = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el valor " + (i + 1) + ": ");
            vector[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.println(vector[i]);
            if (vector[i] % 2 == 0) {
                pares++;
           } else {
                impares++;
            }
        }    
        System.out.println("Pares: " + pares + ", Impares: " + impares);
    }
}

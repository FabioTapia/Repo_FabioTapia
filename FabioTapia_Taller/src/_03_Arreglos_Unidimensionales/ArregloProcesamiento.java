package _03_Arreglos_Unidimensionales;

import java.util.Scanner;

public class ArregloProcesamiento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        short n;
        int suma, mayor, menor;
        double promedio;
        suma = 0;
        do {
            System.out.print("¿Cuántos números desea ingresar?: ");
            n = sc.nextShort();
            if (n <= 0) {
                System.err.println("Error, Los numeros a ingresar deben ser positivos.");
            }
        } while (n < 0);
        //HOLA Q2UI ESTA
        int[] vector = new int[n];
        mayor = vector[0];
        menor = vector[0];
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el valor " + (i + 1) + ": ");
            vector[i] = sc.nextInt();
            }
            for (int i = 0; i < n; i++) {
                if (vector[i] > mayor) {
                    mayor = vector[i];
                }
                if (vector[i] < menor) {
                    menor = vector[i];
                }
                suma += vector[i];
            }
            //Calculo del promedio
            promedio = (double) suma / n;
            //Salida
            System.out.println("Mayor: " + mayor);
            System.out.println("Menor: " + menor);
            System.out.printf("Promedio: %.2f%n", promedio);
    }
}
//A PARTE DE AQUI PONERLE
            
package _04_Arreglos_Bidimensionales;

import java.util.Scanner;

public class MatrizRecorrido {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int filas, columnas;
        System.out.print("Ingrese número de filas (1-10): ");
        filas = sc.nextInt();
        System.out.print("Ingrese número de columnas (1-10): ");
        columnas = sc.nextInt();
        if (filas >= 1 && filas <= 10 && columnas >= 1 && columnas <= 10) {
            int[][] matriz = new int[filas][columnas];
            for (int i = 0; i < filas; i++) {
                for (int j = 0; j < columnas; j++) {
                    System.out.print("Ingrese el valor [" + (i+1) + "][" + (j+1) + "]: ");
                    matriz[i][j] = sc.nextInt();
                }
            }
            for (int i = 0; i < filas; i++) {
                int sumaFila = 0;
                for (int j = 0; j < columnas; j++) {
                    System.out.print(matriz[i][j] + "  ");
                    sumaFila += matriz[i][j];
                }
                System.out.println("Fila " + (i + 1) + " -> suma = " + sumaFila);
            }
        }
    }
}

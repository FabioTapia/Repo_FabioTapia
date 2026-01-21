package _04_Arreglos_Bidimensionales;

import java.util.Scanner;

public class MatrizProcesamiento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int filas, columnas;
        int sumaDiagonal, sumaTotal ;
        sumaDiagonal = 0;
        sumaTotal = 0;
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
                    sumaTotal += matriz[i][j];
                    if (filas == columnas && i == j) {
                        sumaDiagonal = sumaDiagonal + matriz[i][j];
                    }
                }
            }
            System.out.println("Suma total de elementos: " + sumaTotal);
            if (filas == columnas) {
                System.out.println("Suma diagonal principal: " + sumaDiagonal);
            } else {
                System.out.println("Diagonal no aplica.");
            }
        } 
    }
}

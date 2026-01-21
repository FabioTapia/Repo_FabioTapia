package _02_Estructuras_Repetitivas;

import java.util.Scanner;

public class ComparacionCiclos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        short n, i;
        int sumaWhile, sumaDoWhile, sumaFor;
        sumaWhile = 0;
        sumaDoWhile = 0;
        sumaFor = 0;
        i = 1;
        System.out.print("Ingrese los N números para analizar: ");
        n = sc.nextShort();
        //Condicionales
        if (n >= 1) {
            //Suma con el while
            while (i <= n) {
                sumaWhile += i;
                i++;
            }
            //Suma con el do While
            i = 1;
            do {
                sumaDoWhile += i;
                i++;
            } while (i <= n);
            //Suma con el for
            for (i = 1; i <= n; i++) {
                sumaFor += i;
            }
            System.out.println("Suma con while: " + sumaWhile);
            System.out.println("Suma con do-while: " + sumaDoWhile);
            System.out.println("Suma con for: " + sumaFor);
            //Si no coinciden las sumas
            if (sumaWhile != sumaDoWhile || sumaWhile != sumaFor) {
                System.out.println("Revisar implementación");
            }
        }
    }
}

package _02_Estructuras_Repetitivas;

import java.util.Scanner;

public class ForBasico {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        short n;
        System.out.print("Ingrese un número: ");
        n = sc.nextShort();
        if (n > 0) {
            for (int i = 1; i <= 12; i++) {
                System.out.println(n + " x " + i + " = " + (n * i));
            }
        } else {
            System.out.println("Número inválido");
        }
    }
}

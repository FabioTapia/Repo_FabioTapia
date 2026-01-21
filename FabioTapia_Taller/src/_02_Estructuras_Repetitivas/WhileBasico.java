package _02_Estructuras_Repetitivas;

import java.util.Scanner;

public class WhileBasico {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String clave = "utpl";
        String claveIngresada = "";
        short intentos = 0;

        while (!claveIngresada.equals(clave)) {
            System.out.print("Ingrese la clave: ");
            claveIngresada = sc.nextLine();
            intentos++;
        }
        System.out.print("Acceso concedido en " + intentos + " intento(s)");
    }
}

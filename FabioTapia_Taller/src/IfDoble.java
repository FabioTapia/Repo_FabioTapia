import java.util.Scanner;

public class IfDoble {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Declaración de Variables
        short nota;
        //Pedir Datos
        System.out.print("Ingrese la nota: ");
        nota = sc.nextShort();
        if (nota < 0 || nota > 100) {
            System.out.println("Nota inválida");
        } else {
            if (nota >= 70) {
                System.out.println("Aprobado");
            } else {
                System.out.println("Reprobado");
            }
        }
    }
}

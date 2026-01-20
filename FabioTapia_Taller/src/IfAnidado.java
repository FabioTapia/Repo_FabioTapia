import java.util.Scanner;

public class IfAnidado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        short puntaje;
        System.out.print("Ingrese el puntaje: ");
        puntaje = sc.nextShort();
        //Condicional ifAnidado
        if (puntaje < 0 || puntaje > 100) {
            System.out.print("Puntaje Inválido");
            } else {
            if (puntaje >= 90) {
                System.out.print("Excelente");
            } else  {
                if (puntaje >= 70) {
                    System.out.print("Bueno");
                } else {
                    System.out.print("En Proceso");
                }
            }
        }
    }
}

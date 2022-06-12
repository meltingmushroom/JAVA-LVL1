package Java2022;
import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {

        System.out.println("Ingrese un numero: ");
        Scanner scan = new Scanner(System.in);
        int numero = scan.nextInt();

        if (numero > 0) {
            for (int i = 1; i <= numero + 1; i++) {
                System.out.println(" ");
                for (int x = 1; x < i; x++) {
                    System.out.print(x);
                }
            }
        }
        else {
            System.out.println("Número no válido. Ingrese un numero correcto");
        }
        scan.close();
    }
}
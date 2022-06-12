package Java2022;
import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] ar) {
        Scanner scan = new Scanner(System.in);
        int numero, exponente, potencia;
        System.out.print("Ingrese un número entero: ");
        numero = scan.nextInt();
        System.out.print("Ingrese el exponente: ");
        exponente = scan.nextInt();

        potencia = 1;
        int i;
        for (i = 1; i <= exponente; i++) {
            potencia = potencia * numero;
        }
        System.out.print(numero+" elevado a "+exponente+" es: "+potencia);
    }
}
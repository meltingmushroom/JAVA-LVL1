package Java2022;
import java.util.Scanner;

public class Ejercicio4 {

        public static void main(String[] args) {

            System.out.println("Ingrese el numero para calcular el factorial");

            Scanner scan = new Scanner(System.in);
            int numero = scan.nextInt();

            System.out.println("El factorial de "+ numero +" es: "+ factorial(numero));
        }

        public static int factorial(int valor) {
            int resultado = 1;
            for(int i = valor; i > 0; i--) {
                resultado = resultado * i;
            }
            return resultado;
        }
    }


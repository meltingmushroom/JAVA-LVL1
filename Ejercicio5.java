package Java2022;
import java.util.Scanner;

    public class Ejercicio5 {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println(" Ingrese un número: ");
            int numero1 = scan.nextInt();
            System.out.println(" Ingrese otro número: ");
            int numero2 = scan.nextInt();
            scan.close();
            int resultado = 0;

            for (int i = 1; i <= numero2; i++) {
                resultado += numero1;
            }

            System.out.println(numero1+" X "+numero2+" = "+resultado);
        }
    }

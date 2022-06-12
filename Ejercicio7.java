package Java2022;
import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {

        System.out.println("Ingrese una palabra en letras minúsculas: ");
        Scanner scan = new Scanner(System.in);
        String palabra = scan.nextLine();
        String mayuscula = "";

        for (int i = 0; i < palabra.length(); i++) {
            char letra = convertir_Mayus(palabra.charAt(i));
            mayuscula += letra;
            }
        System.out.println(mayuscula);
        scan.close();

        }

        public static char convertir_Mayus(char palabra) {
            if (palabra >= 'a' || palabra <= 'z') {
                palabra = (char) (palabra - ('a' - 'A'));
            }
            return palabra;
        }
    }


package Java2022;
import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        System.out.println("Por favor, ingrese su nombre completo con los espacios correspondientes.");
        Scanner scan = new Scanner(System.in);
        String nombre = scan.nextLine();
        System.out.println("HOLA "+nombre+"!!!");
    }
}


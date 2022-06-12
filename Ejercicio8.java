package Java2022;
import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese su nombre y apellido, con los espacios correspondientes.");
        String nombre = scan.nextLine();
        System.out.println("Ingrese su edad. ");
        String edad = scan.nextLine();
        System.out.println("Ingrese su dirección. ");
        String direccion = scan.nextLine();
        System.out.println("Ingrese su ciudad. ");
        String ciudad = scan.nextLine();
        scan.close();

        System.out.print(ciudad + " - "+ direccion + " - " + edad + " - "+ nombre);

    }
}


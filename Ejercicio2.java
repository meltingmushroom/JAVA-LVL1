package Java2022;
import java.util.Scanner;

public class Ejercicio2 {

    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        double numero1 = scan.nextDouble();
        System.out.print("Ingrese el segundo número: ");
        double numero2 = scan.nextDouble();
        System.out.println("El resultado de la suma entre "+numero1+" y "+numero2+" es: "+(numero1+numero2));
        System.out.println("El resultado de la resta entre "+numero1+" y "+numero2+" es: "+(numero1-numero2));
        System.out.println("El resultado de la multiplicación entre "+numero1+" y "+numero2+" es: "+(numero1*numero2));
        System.out.println("El resultado de la división entre "+numero1+" y "+numero2+" es: "+(numero1/numero2));
        System.out.println("El resultado del módulo entre "+numero1+" y "+numero2+" es: "+(numero1%numero2));
    }
}

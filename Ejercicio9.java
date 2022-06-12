package Java2022;
import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {

        System.out.println("Ingrese un texto, o palabra : ");
        Scanner scan = new Scanner(System.in);
        String texto = scan.nextLine();
        System.out.print("Ingrese caracter a buscar: ");
        char caracter = scan.next().charAt(0);
        int cantidad = CantidadDeCaracteres(texto, caracter);
        System.out.println("El texto ingresado '" + texto + "' contiene " + cantidad + " letras '" + caracter+"'");
        scan.close();
    }
    public static int CantidadDeCaracteres(String texto, char caracter) {
        int posicion = 0;
        int contador = 0;
        posicion = texto.indexOf(caracter);
        while (posicion != -1) {
            contador++;
            posicion = texto.indexOf(caracter, posicion + 1);
        }
        return contador;

    }



}

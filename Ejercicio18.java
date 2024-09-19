
import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args) {
        System.out.println("Introducir un numero entero entre 1 y 7");
        char n = new Scanner(System.in).next().charAt(0);
        String dia = switch(n){
            case '1' -> "Lunes";
            case '2' -> "Martes";
            case '3' -> "Miercoles";
            case '4' -> "Jueves";
            case '5' -> "Viernes";
            case '6' -> "Sabado";
            case '7' -> "Domingo";
            default -> "No valido";
        };
        System.out.println("El numero "+n+" se corresponde con el "+dia);
    }
}

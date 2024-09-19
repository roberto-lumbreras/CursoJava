
import java.util.Locale;
import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        Double n1;
        Double n2;
        System.out.println("Introducir primer operando");
        n1=new Scanner(System.in).useLocale(Locale.US).nextDouble();
        System.out.println("Introducir segundo operando");
        n2=new Scanner(System.in).useLocale(Locale.US).nextDouble();
        System.out.println("¿Que deseas hacer?");
        System.out.println("1.- Sumar");
        System.out.println("2.- Restar");
        System.out.println("3.- Multiplicar");
        System.out.println("4.- Dividir");
        char operador = new Scanner(System.in).next().charAt(0);
        switch (operador) {
            case '1': 
                System.out.println(n1+n2);
                break;
            case '2':
                System.out.println(n1-n2);
                break;
            case '3':
                System.out.println(n1*n2);
                break;
            case '4':
                System.out.println(n1/n2);
                break;
            default:
                System.out.println("operador no reconocido");
        }
    }
}

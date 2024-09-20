
import java.util.Locale;
import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        System.out.println("Introduzca radio del circulo para obtener su área");
        Double d = new Scanner(System.in).useLocale(Locale.US).nextDouble();
        System.out.println("El area del circulo es de "+(Math.PI*Math.pow(d, 2)));
    }
}

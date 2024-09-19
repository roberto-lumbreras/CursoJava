
import java.util.Locale;
import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        System.out.println("Introducir un numero para obtener:\n-Su valor elevado al cuadrado\n-El valor de su raiz cuadrada\n-Su valor absoluto");
        Double d = new Scanner(System.in).useLocale(Locale.US).nextDouble();
        System.out.println("Calculando resultados...");
        System.out.println(Math.pow(d, 2));
        System.out.println(Math.sqrt(d));
        System.out.println(Math.abs(d));
    }
}

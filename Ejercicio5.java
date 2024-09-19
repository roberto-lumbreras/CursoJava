import java.util.Locale;
import java.util.Scanner;

public class Ejercicio5{
    public static void main(String[] args) {
        String s;
        Double d;
        Integer i;

        System.out.println("Introducir string");
        s = new Scanner(System.in).nextLine();
        System.out.println("Introducir decimal");
        d = new Scanner(System.in).useLocale(Locale.US).nextDouble();
        System.out.println("Introducir entero");
        i = new Scanner(System.in).nextInt();

        System.out.println("Imprimiendo datos...");

        System.out.println("String: "+s);
        System.out.println("Decimal: "+d);
        System.out.println("Entero: "+i);
    }
}

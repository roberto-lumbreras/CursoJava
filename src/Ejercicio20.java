
import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args) {
        System.out.println("Introducir un entero");
        int n = new Scanner(System.in).nextInt();
        boolean b1 = n>=0&&n%2==0;
        System.out.println("Es positivo y par? "+b1);
        boolean b2 = n<0||n%3==0;
        System.out.println("Es negativo o divisible entre 3? "+b2);
    }
}

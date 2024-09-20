import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        int n1;
        int n2;

        System.out.println("Introducir primer numero entero");
        n1 = new Scanner(System.in).nextInt();
        System.out.println("Introducir segundo numero entero");
        n2 = new Scanner(System.in).nextInt();
        System.out.println("La suma de los numeros es "+(n1+n2));
    }
}

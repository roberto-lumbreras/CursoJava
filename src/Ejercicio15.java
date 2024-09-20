
import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        System.out.println("Introducir numero entero");
        int n = new Scanner(System.in).nextInt();
        if(n%2==0){
            System.out.println("El numero es par");
        }else{
            System.out.println("El numero es impar");
        }
    }
}

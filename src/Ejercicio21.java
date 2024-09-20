import java.util.Scanner;

public class Ejercicio21{
    public static void main(String[] args) {
        System.out.println("Introducir un numero entero");
        int max = new Scanner(System.in).nextInt();
        int suma = 0;
        while(suma<max){
            System.out.println("Introducir siguiente numero entero");
            suma += new Scanner(System.in).nextInt();
            System.out.println("Total = "+suma);
        }
        System.out.println("Fin del programa");


    }
}
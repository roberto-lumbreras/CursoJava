
import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        System.out.println("Introducir año para saber si es bisiesto");
        int n = new Scanner(System.in).nextInt();
        if(n%4==0&&n%100!=0){
            System.out.println("Es bisiesto");
        }else if(n%100==0&&n%400==0){
            System.out.println("Es bisiesto");
        }else{
            System.out.println("No es bisiesto");
        }
    }
}

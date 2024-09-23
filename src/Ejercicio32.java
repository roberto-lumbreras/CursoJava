
import java.util.Scanner;

public class Ejercicio32 {
    public static void main(String[] args) {
        System.out.println("Introducir un string");
        String s = new Scanner(System.in).nextLine().toLowerCase();
        int contador = 0;
        System.out.println(s);
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i)=='a'
            ||s.charAt(i)=='e'
            ||s.charAt(i)=='i'
            ||s.charAt(i)=='o'
            ||s.charAt(i)=='u'){
                contador++;
            }
        }
        System.out.println("Tiene "+contador+" vocales");
    }
}

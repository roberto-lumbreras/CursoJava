
import java.util.Scanner;

public class Ejercicio32 {
    public static void main(String[] args) {
        System.out.println("Introducir cadena para ver el numero de vocales que tiene");
        String s = new Scanner(System.in).nextLine();
        int contador = 0;
        for (int i=0;i<s.length();i++){
            if(s.toLowerCase().charAt(i)=='a'
            ||s.toLowerCase().charAt(i)=='e'
            ||s.toLowerCase().charAt(i)=='i'
            ||s.toLowerCase().charAt(i)=='o'
            ||s.toLowerCase().charAt(i)=='u'){
                contador++;
            }
        }
        System.out.println("Tiene "+contador+" vocales");
    }
}

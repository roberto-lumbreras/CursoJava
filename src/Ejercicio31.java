import java.util.Scanner;

public class Ejercicio31 {
    public static void main(String[] args) {
        System.out.println("Introducir texto para ver si es palindromo");
        String txt = new Scanner(System.in).nextLine();
        boolean esPalindroma = true;
        for (int i = 0;i<txt.length();i++){
            if(txt.charAt(i)!=txt.charAt(txt.length()-i-1)){
                esPalindroma=false;
            }
        }
        System.out.println("Es palindroma? "+esPalindroma);
    }
}

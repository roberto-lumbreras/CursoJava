import java.util.Scanner;

public class Ejercicio23{
    public static void main(String[] args) {
        System.out.println("Introducir un numero para ver su tabla de multiplicar");
        int n = new Scanner(System.in).nextInt();
        for (int i = 1;i<11;i++){
            System.out.println(n+"*"+i+"="+n*i);
        }
    }
}
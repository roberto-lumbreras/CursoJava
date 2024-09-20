import java.util.Random;
import java.util.Scanner;

public class Ejercicio22 {
    public static void main(String[] args) {
        int numeroSecreto = new Random().nextInt(1, 101);
        int contador = 0;
        int bet = 0;
        System.out.println("Adivina el numero secreto");
        bet = new Scanner(System.in).nextInt();
        if(bet == numeroSecreto){
            System.out.println("Felicidades! Has acertado a la primera.");
        }
        while(bet!=numeroSecreto){
            if(numeroSecreto>bet&&bet!=0){
                System.out.println("El numero secreto es mas grande");
            }else if (numeroSecreto<bet) {
                System.out.println("El numero secreto es mas pequeño");
            }
            System.out.println("Prueba otra vez");
            bet = new Scanner(System.in).nextInt();
        }
        System.out.println("You win!");
    }
}

import java.util.Scanner;

public class Ejercicio25 {
    public static void main(String[] args) {
        System.out.println("Introducir altura de la piramide de estrellas");
        int altura = new Scanner(System.in).nextInt();
        int length = 1 + 2*altura - 2;
        for(int i = 0;i<altura;i++){
            for(int j = 0;j<length;j++){
                if(j<altura-i-1||j>altura+i-1){
                    System.out.print(' ');
                }else{
                    System.out.print("*");
                }
            }
            System.out.print("\n");
        }
    }
}

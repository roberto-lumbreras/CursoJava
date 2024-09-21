import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio29 {
    public static void main(String[] args) {
        System.out.println("Programa para sumar dos matrices");
        System.out.println("Introducir numero de filas");
        int f = new Scanner(System.in).nextInt();
        System.out.println("Introducir numero de columnas");
        int c = new Scanner(System.in).nextInt();
        
        int [][] m1 = new int[f][c];
        int [][] m2 = new int[f][c];

        for(int i = 0;i<f;i++){
            for(int k = 0;k<c;k++){
                System.out.println("Introduzca el valor del elemento "+(i+1)+""+(k+1)+" de la primera matriz");
                m1[i][k]=new Scanner(System.in).nextInt();
            }
        }

        for(int i = 0;i<f;i++){
            for(int k = 0;k<c;k++){
                System.out.println("Introduzca el valor del elemento "+(i+1)+""+(k+1)+" de la segunda matriz");
                m2[i][k]=new Scanner(System.in).nextInt();
            }
        }

        int [][] mResultado = new int[f][c];

        for(int i = 0;i<f;i++){
            for(int k = 0;k<c;k++){
                mResultado[i][k]=m1[i][k]+m2[i][k];
            }
        }

        System.out.println("Resultado");
        for (int i = 0;i<f;i++){
            System.out.println(Arrays.toString(mResultado[i]));
        }
    }
}

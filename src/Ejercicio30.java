import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio30 {
    public static void main(String[] args) {
        System.out.println("Introducir numero de filas de la matriz");
        int f = new Scanner(System.in).nextInt();
        System.out.println("Introducir numero de columnas de la matriz");
        int c = new Scanner(System.in).nextInt();
        int[][] matrizOriginal = new int[f][c];
        int[][] matrizTranspuesta = new int[f][c];
        for(int i = 0;i<f;i++){
            for(int j = 0;j<c;j++){
                System.out.println("Introducir valor del elemento "+(i+1)+""+(j+1));
                matrizOriginal[i][j]=new Scanner(System.in).nextInt();
                matrizTranspuesta[j][i]=matrizOriginal[i][j];
            }
        }
        System.out.println("--Matriz original--");
        for(int i = 0;i<f;i++){
            System.out.println(Arrays.toString(matrizOriginal[i]));
        }

        System.out.println("\n--Matriz transpuesta--");
        for(int i = 0;i<f;i++){
            System.out.println(Arrays.toString(matrizTranspuesta[i]));
        }

    }
}

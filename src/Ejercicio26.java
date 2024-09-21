import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio26 {
    public static void main(String[] args) {
        System.out.println("Este es un programa para multiplicar dos matrices");
        System.out.println("Para que esto sea posible, el numero de columnas de la primera debe ser igual al numero de filas de la segunda");
        System.out.println("\nIntroduzca el numero de filas de la primera matriz");
        int f1 = new Scanner(System.in).nextInt();
        System.out.println("\nIntroduzca el numero de columnas de la primera matriz");
        int c1 = new Scanner(System.in).nextInt();
        System.out.println("\nIntroduzca el numero de columnas de la segunda matriz");
        int c2 = new Scanner(System.in).nextInt();

        int [][] m1 = new int[f1][c1];
        int [][] m2 = new int[c1][c2];

        for (int i = 0; i < f1; i++){
            for (int j = 0; j<c1; j++){
                System.out.println("Introducir el valor del elemento "+(i+1)+""+(j+1)+" de la primera matriz");
                m1[i][j]= new Scanner(System.in).nextInt();
            }
        }

        for (int i = 0; i < c1; i++){
            for (int j = 0; j<c2; j++){
                System.out.println("Introducir el valor del elemento "+(i+1)+""+(j+1)+" de la segunda matriz");
                m2[i][j]= new Scanner(System.in).nextInt();
            }
        }

        int [][] mResultado = new int[f1][c2];
        int sumatorio=0;

        for (int i = 0;i<f1;i++){
            for(int j = 0;j<c2;j++){
                for(int k = 0;k<c1;k++){
                    sumatorio=sumatorio+m1[i][k]*m2[k][j];
                }
                mResultado[i][j]=sumatorio;
                sumatorio=0;
            }
        }

        for (int i = 0; i < mResultado.length;i++){
            System.out.println(Arrays.toString(mResultado[i]));
        }
    }
}

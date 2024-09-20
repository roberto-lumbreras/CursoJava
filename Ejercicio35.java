import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio35 {
    public static void main(String[] args) {
        System.out.println("Cuantos numeros quieres guardar?");
        int n = new Scanner(System.in).nextInt();
        ArrayList<Integer> l = new ArrayList<>();
        for (int i = 0; i<n; i++){
            System.out.println("Faltan "+(n-i)+" numeros");
            l.add(new Scanner(System.in).nextInt());
        }
        System.out.println("Mostrando lista y sumatorio...");
        System.out.println(l.toString());
        int suma = 0;
        for(int i:l){
            suma+=i;
        }
        System.out.println("Total -> "+suma);
    }
}

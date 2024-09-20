
import java.util.Arrays;
import java.util.Random;

public class Ejercicio27 {
    public static void main(String[] args) {
        int [] a = new int[10]; 
        for (int i = 0;i<10;i++){
            a[i]=new Random().nextInt(1, 101);
        }
        int mayor = 0;
        for (int i = 0;i<10;i++){
            if(a[i]>mayor){
                mayor = a[i];
            }
        }
        System.out.println("Numeros generados -> "+Arrays.toString(a));
        System.out.println("El mayor es "+mayor);
    }
}

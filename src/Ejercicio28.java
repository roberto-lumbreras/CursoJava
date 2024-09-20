import java.util.Arrays;
import java.util.Random;

public class Ejercicio28 {
    public static void main(String[] args) {
        int [] a = new int[10]; 
        for (int i = 0;i<10;i++){
            a[i]=new Random().nextInt(1, 101);
        }
        int [] flex = Arrays.copyOf(a, a.length);
        for(int i=0;i<a.length;i++){
            a[i]=flex[flex.length-i-1];
        }
        System.out.println("Array original");
        System.out.println(Arrays.toString(flex));
        System.out.println("Array invertido");
        System.out.println(Arrays.toString(a));
    }
}

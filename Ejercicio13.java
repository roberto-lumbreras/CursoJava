
import java.util.Random;

public class Ejercicio13 {
    public static void main(String[] args) {
        System.out.println("Tirando dos dados...");
        int d1;
        int d2;
        d1 = new Random().nextInt (1, 7);
        d2 = new Random().nextInt (1, 7);
        System.out.println("Ha salido "+d1+" y "+d2);
    }
}

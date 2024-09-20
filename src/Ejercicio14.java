
import java.util.Random;

public class Ejercicio14 {
    public static void main(String[] args) {
        String password = "";
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        for(int i=0;i<8;i++){
            password+=characters.charAt(new Random().nextInt(0,characters.length()-1));
        }
        System.out.println("Tu contraseña es "+password);
    }
}

import java.util.Scanner;

public class Ejercicio24{
    public static void main(String[] args) {
        System.out.println("Introducir un numero para ver su factorial");
        int n = new Scanner(System.in).nextInt();
        int resultado = 1;
        for(int i = n;i>=2;i--){
            resultado*=i;
        }
        System.out.println("Resultado -> "+resultado);
    }
}
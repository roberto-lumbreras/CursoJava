public class Ejercicio4 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;

        System.out.println("Antes del intercambio");
        System.out.println("a: "+a);
        System.out.println("b: "+b);

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("Despues del intercambio");
        System.out.println("a: "+a);
        System.out.println("b: "+b);
    }
}

public class Ejercicio3 {
    public static void main(String[] args) {
        int n1;
        int n2;
        n1 = 1;
        n2 = 2;

        System.out.println("Antes del intercambio");
        System.out.println("n1: "+n1);
        System.out.println("n2: "+n2);
        
        n1 = n1+n2;
        n2 = n1-n2;
        n1 = n1-n2;

        System.out.println("Despues del intercambio");
        System.out.println("n1: "+n1);
        System.out.println("n2: "+n2);

    }
}

public class Ejercicio12 {
    public static void main(String[] args) {
        System.out.println("Generando numero aleatorio entre 1 y 100");
        int n = (int)(Math.random()*100)+1;
        for (int i=0;i<100;i++){
            System.out.println(n);
            n = (int)(Math.random()*100)+1;
        }
    }
}

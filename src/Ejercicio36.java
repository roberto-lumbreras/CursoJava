
import java.util.ArrayList;
import java.util.HashSet;

public class Ejercicio36 {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList();
        lista.add("Sol");
        lista.add("Luna");
        lista.add("Río");
        lista.add("Estrella");
        lista.add("Mar");
        lista.add("Cielo");
        lista.add("Tierra");
        lista.add("Luna");
        lista.add("Montaña");
        lista.add("Río");
        lista.add("Bosque");
        lista.add("Viento");
        lista.add("Estrella");
        lista.add("Desierto");
        lista.add("Lago");
        lista = new ArrayList<>(new HashSet<>(lista));
        System.out.println(lista.toString());
    }
}

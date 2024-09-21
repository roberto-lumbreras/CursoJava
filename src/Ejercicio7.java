import java.util.Scanner;

import org.apache.commons.jexl3.JexlBuilder;
import org.apache.commons.jexl3.JexlEngine;
import org.apache.commons.jexl3.MapContext;

public class Ejercicio7 {
    public static void main(String[] args) {
        System.out.println("Introducir una expresion aritmetica para calcular");
        String txt = new Scanner(System.in).nextLine();
        JexlEngine e = new JexlBuilder().create();
        Object result = e.createExpression(txt).evaluate(new MapContext());
        System.out.println("Resultado -> "+result);
    }
}

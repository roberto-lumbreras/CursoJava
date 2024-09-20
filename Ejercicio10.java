
import javax.swing.JOptionPane;

public class Ejercicio10 {
    public static void main(String[] args) {
        Double n1 = Double.parseDouble((JOptionPane.showInputDialog("Introducir primer operando")));
        Double n2 = Double.parseDouble((JOptionPane.showInputDialog("Introducir segundo operando")));
        String[] options = {"Sumar","Restar","Mutilplicar","Dividir"};

        int opcion = JOptionPane.showOptionDialog(null, "Seleccionar operador",
        "", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null,
        options, options[0]);

        double resultado = switch(opcion){
            case 0 -> n1+n2;
            case 1 -> n1-n2;
            case 2 -> n1*n2;
            case 3 -> {
                if(n2!=0){
                    yield n1/n2;
                }else{
                    JOptionPane.showMessageDialog(null, "Operacion no válida");
                    yield 0;
                }
            }
            default -> {
                JOptionPane.showMessageDialog(null, "Operacion no válida");
                    yield 0;
            }
        };

        JOptionPane.showMessageDialog(null, "Resultado -> "+resultado);
    }
}

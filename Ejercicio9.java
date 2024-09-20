
import javax.swing.JOptionPane;

public class Ejercicio9 {
    public static void main(String[] args) {
        String s = JOptionPane.showInputDialog("Introduce your user name");
        JOptionPane.showMessageDialog(null, "Welcome back, "+s);
    }
}

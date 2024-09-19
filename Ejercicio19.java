
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String[] args) {
        LocalDate fechaNac;
        System.out.println("Introduzca fecha de nacimiento (xx/xx/xxxx)");
        String cadena = new Scanner(System.in).next();
        fechaNac = LocalDate.parse(cadena, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        int years = Period.between(fechaNac, LocalDate.now()).getYears();
        String statement = (years>17)? "Usted tiene derecho a votar" : "Usted es menor y no puede votar";
        System.out.println(statement);
    }
}

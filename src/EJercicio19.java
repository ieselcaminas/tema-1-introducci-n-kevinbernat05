import java.sql.SQLOutput;
import java.util.Scanner;

public class EJercicio19 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Horas trabajadas: ");
        float horasTrabajadas = sc.nextInt();

        System.out.println("Precio por hora: ");
        float precioHora = sc.nextInt();

        double bruto;
        double imp25 = 0;
        double imp45 = 0;


        if (horasTrabajadas <= 35) {
            bruto = horasTrabajadas * precioHora;
        } else {
            bruto = (35 * precioHora) + (horasTrabajadas - 35) * (precioHora * 1.5);
        }

        if (bruto >= 500) {
            imp25 = (bruto - 500) * 0.25;
        } else if (bruto >= 900) {
            imp25 = (bruto - 500) * 0.25;
            imp45 = (bruto - 900) * 0.45;
        }
        double impuestos = imp25 + imp45;

        System.out.println("Salario bruto: " + bruto);
        System.out.println("Impuestos: " + impuestos);
        System.out.println("Salario neto: " + (bruto - impuestos));
    }
}

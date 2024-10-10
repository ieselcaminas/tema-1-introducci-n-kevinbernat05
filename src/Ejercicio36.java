import java.util.Scanner;

public class Ejercicio36 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Ingresa un número decimal: ");
        int decimal = scanner.nextInt();
        String binario = " ";
        int residuo;

        do {
            residuo = decimal % 2;
            binario = residuo + binario;
            decimal = decimal / 2;
        } while (decimal > 0);

        System.out.println("El número en binario es: " + binario);
    }
}

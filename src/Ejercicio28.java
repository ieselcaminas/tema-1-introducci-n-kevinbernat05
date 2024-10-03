import java.util.Scanner;

public class Ejercicio28 {
    public static void main(String[] args) {

        int x;
        boolean esPrimo = true;

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el valor de x: ");
        x = sc.nextInt();

        if (x == 2) {
            System.out.println(x + " es primo");
            return;
        }

        if (x % 2 == 0) {
            System.out.println(x + " no es primo");
            return;
        }

        for (int i = 3; i <= x; i+=2) {
            if (x % i == 0) {
                esPrimo = false;
                break;
            }
        }
        if (esPrimo) {
            System.out.println(x + " es primo");
        }else {
            System.out.println(x + " no es primo");
        }
    }

}

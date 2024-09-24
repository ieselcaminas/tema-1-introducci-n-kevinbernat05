import java.util.Scanner;

public class Ejercicio27 {
    public static void main(String[] args) {

        int x;

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el valor de x: ");
        x = sc.nextInt();

        for (int i = 1;
             i <= x;
             i++) {
            for (int j = 1;
                 j <= i;
                 j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}


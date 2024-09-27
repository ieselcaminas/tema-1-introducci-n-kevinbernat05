import java.util.Scanner;

public class Ejercicio34 {
    public static void main(String[] args) {

        int x;
        int y;

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el valor de x: ");
        x = sc.nextInt();
        System.out.print("Ingrese el valor de y: ");
        y = sc.nextInt();

        for (int i = 0; i <= x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print(x + i);
            }
        }
    }
}

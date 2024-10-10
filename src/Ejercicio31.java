import java.util.Scanner;

public class Ejercicio31 {
    public static void main(String[] args) {
        int x;

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el valor de x: ");
        x = sc.nextInt();

        for (int i = 1; i < x; i++) {
            if (x % i == 0){
                System.out.println(x + " es divisible por " + i);
            }
        }
    }
}

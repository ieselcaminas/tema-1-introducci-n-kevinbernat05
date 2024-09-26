import java.util.Scanner;

public class Ejercicio34 {
    public static void main(String[] args) {

        int x;
        int y;
        int suma = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el valor de x: ");
        x = sc.nextInt();
        System.out.println("Ingrese el valor de y: ");
        y = sc.nextInt();

        for (int i = 1; i <= y; i++) {
            System.out.print(x);
            if (i < y) {
                System.out.print(" + ");
            }
            suma += x;
        }
       System.out.println();
       System.out.println("El resultado de " + x + " x " + y + " es: " + suma);
    }
}



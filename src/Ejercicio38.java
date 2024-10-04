import java.util.Random;
import java.util.Scanner;

public class Ejercicio38 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random aleatorio = new Random(System.currentTimeMillis());

        int secreto = aleatorio.nextInt(100);
        int x;

        do {
            System.out.print("Introduzca un numero: ");
            x = sc.nextInt();

            if (x == -1) {
                System.out.print("Te rindes.");
                break;
            }

            if (x == secreto) {
                System.out.println("Has ganado.");
                break;
            }else if (x > secreto) {
                System.out.println("El numero secreto es mas pequeño.");
            }else {
                System.out.println("El número secreto es más grande.");
            }
            }while(true);


    }
}

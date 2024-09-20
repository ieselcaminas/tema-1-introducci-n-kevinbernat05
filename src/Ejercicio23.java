import java.util.Scanner;

public class Ejercicio23 {
    public static void main(String[] args) {

        int x;
        int contador = 0;

        Scanner sc = new Scanner(System.in);
        do {
            x = sc.nextInt();
            if (x > 0) {
                contador++;
            }
        }while (x != 0);

        System.out.println("Tiene " + contador + " numeros positivos.");

    }
}

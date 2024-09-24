import java.util.Scanner;

public class Ejercicio26 {
    public static void main(String[] args) {

        int num;
        int resultado = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        num = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            resultado = num * i;

            System.out.println(num + " x " + i + " = " + resultado);
        }

    }
}

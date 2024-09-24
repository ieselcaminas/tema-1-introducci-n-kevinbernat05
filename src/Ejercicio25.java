import java.util.Scanner;

public class Ejercicio25 {
    public static void main(String[] args) {

        long factorial = 1;
        int num;

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            factorial = factorial * i;
        }
        System.out.println("El factorial de " + num + " es " + factorial);


    }
}

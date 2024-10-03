import java.util.Scanner;

public class Ej21R1 {
    public static void main(String[] args) {

    int casos;
    int x;
    int y;

    Scanner sc = new Scanner(System.in);
    System.out.println("Ingrese el numero de casos: ");
    casos = sc.nextInt();

    for (int i = 1; i <= casos; i++) {
        System.out.print("Saldo a inicio de mes: ");
        x = sc.nextInt();
        System.out.print("Gastos: ");
        y = sc.nextInt();

        if ( x + y >= 0){
            System.out.println("Si.");
        }else {
            System.out.println("No.");
        }
    }

    }
}

import java.util.Scanner;

public interface Ejercicio18 {
    public static void main(String[] args) {

        int x;
        int resultado = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el valor de x: ");
        x = sc.nextInt();

        for (int i = 0; i <= 8; i += 2) {
            if (x % 2 == 0) {
                resultado = x + i + 2;
                System.out.print(resultado + " ");
            }else{
                resultado  = (x + 1) + i;
                System.out.print(resultado  + " ");
            }

            }
        }
    }


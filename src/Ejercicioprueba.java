import java.util.Scanner;

public class Ejercicioprueba {
    public static void main(String[] args) {

        int x;
        int positivos =0;

        Scanner sc = new Scanner(System.in);

        for (int i =0; i < 10; i++) {
            System.out.println("Ingrese el numero: ");
            x = sc.nextInt();
            if (x >0){
                positivos ++;
            }
        }
        System.out.println(positivos);
    }
}

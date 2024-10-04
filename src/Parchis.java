import java.util.Scanner;

public class Parchis {
    public static void main(String[] args) {

        int c;
        int p;
        int t;
        int x;

        Scanner sc = new Scanner(System.in);

        do{
            System.out.print("Introduce numero de casillas: ");
            c = sc.nextInt();
            System.out.print("Introduce casilla en la que estas: ");
            p = sc.nextInt();
            System.out.print("Introduce numero de dado: ");
            t = sc.nextInt();

            if (c == 0 && p == 0 && t == 0) {
                break;
            }

            int f = p + t;

            if (f > c) {
                x = f - c;
                System.out.println(c - x);
            }else{
                x = p + t;
                System.out.println(x);
            }

        }while(true);
    }
}

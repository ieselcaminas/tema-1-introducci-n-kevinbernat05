import java.util.Scanner;

public class Radares {
    public static void main(String[] args) {

        int m; //distancia metros
        int v; //velocidad maxima km/h
        int s; //segundos


        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Distancia, velocidad maxima y tiempo: ");
            m = sc.nextInt();
            v = sc.nextInt();
            s = sc.nextInt();

            if (m == 0 && v == 0 && s == 0) {
                break;
            }

            double media = (m / (double) s) * 3.6;

            if (media > v * 1.20) {
                System.out.println("Puntos");
            }else if (media >= v){
                System.out.println("Multa");
            }else {
                System.out.println("Ok");
            }

        }while (true);

        System.out.println("End");
    }
}

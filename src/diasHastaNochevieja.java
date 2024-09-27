import java.util.Scanner;

public class diasHastaNochevieja {
    public static void main(String[] args) {

        int dia;
        int mes;
        int diasmes;
        int diasTotales = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca el dia: ");
        dia = sc.nextInt();
        System.out.println("Introduzca el mes: ");
        mes = sc.nextInt();

        for (int i = mes + 1; i <= 12; i++) {
            switch (i) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    diasmes = 31;
                    break;
                case 2:
                    diasmes = 28;
                    break;
                default:
                    diasmes = 30;
                    break;
            }
            diasTotales = diasTotales + diasmes;
        }
    }
}






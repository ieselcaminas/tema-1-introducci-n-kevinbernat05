package metodos;

public class Ej17 {
    public static int esDias(int mes) {
        switch (mes) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                return 28;
            default:
                return -1;
        }
    }
    public static void main(String[] args) {

        int mes = Utilidades.leerEntero("Introduce tu mes (1-12): ");
        int dias = esDias(mes);

        System.out.println(dias);
    }
}

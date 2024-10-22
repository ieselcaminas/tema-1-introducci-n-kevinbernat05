package metodos;

public class Ej2 {
    public static boolean esTriangulo(int a, int b, int c) {
        if ((a > b + c) || (b > a + c) || (c > a + b)) {
            return false;
        } else {
            return true;
        }
    }

    public static void main(String[] args) {

        int a = Utilidades.leerEntero("Introduzca su primer lado: ");
        int b = Utilidades.leerEntero("Introduzca su segundo lado: ");
        int c = Utilidades.leerEntero("Introduzca su tercer lado: ");

        System.out.println(esTriangulo(a, b, c));

    }
}

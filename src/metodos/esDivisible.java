package metodos;

public class esDivisible {
    public static boolean esDivisible(int n, int m) {
        if (n % m == 0) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {

        int n = Utilidades.leerEntero("Introduce tu primer numero: ");
        int m = Utilidades.leerEntero("Introduce tu segundo numero: ");

        if (esDivisible(n, m)) {
            System.out.println("Tu numero es divisible.");
        } else {
            System.out.println("Tu numeró no es divisible.");
        }
    }
}

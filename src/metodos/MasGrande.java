package metodos;

//Diseña un algoritmo que lea dos valores y muestre el más grande de ellos.
public class MasGrande {
    public static int masGrande(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
    public static void main(String argv[]) {
        int numero = Utilidades.leerEntero("Introduce un número entero:");
        int numero2 = Utilidades.leerEntero("Introduce otro número entero:");

        int elMasGrande = masGrande(numero, numero2);

        System.out.println("elMasGrande: " + elMasGrande);
        }
    }

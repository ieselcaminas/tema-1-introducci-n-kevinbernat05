package metodos;

public class divisores31 {
    public static String divisores31(int a) {
        String resultado = "";
        for (int i = 1; i <= a; i++) {
            if (a % i == 0){
                resultado += i + " ";
            }
        }
        return resultado;

    }
    public static void main(String[] args) {

        int a = Utilidades.leerEntero("Introduzca su numero: ");

        System.out.println(divisores31(a));
    }
}

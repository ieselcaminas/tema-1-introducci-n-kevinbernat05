package metodos;

//Diseña un algoritmo que lea un valor y muestre si es positivo o negativo (0 es positivo)
public class EsPositivoMain {
	public static boolean esPositivo(int a) {
		if (a >= 0) {
			return true;
		}else {
			return false;
		}

		//return a >= 0;
	}
	public static void main(String [] argv) {
		int  numero = Utilidades.leerEntero("Introduce un número entero:");

		if (esPositivo(numero)) {
			System.out.println("Tu numero es positivo");
		} else {
			System.out.println("Tu numero no es positivo");
		}
		
	}
}
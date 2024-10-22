package metodos;

public class ValorNotaMain {
	public static String valorEnLetra(int nota) {
		if ((nota < 0) || (nota > 10)) {
			return "Nota invalida";
		}else if (nota < 3) {
			return "Muy deficiente";
		}else if (nota < 5 ) {
			return "Insuficiente";
		}else if (nota < 6 ) {
			return "Suficiente";
		}else if (nota < 7 ) {
			return "Bien";
		}else if (nota < 9 ) {
			return "Notable";
		}else {
			return "Sobresaliente";
		}
	}
	public static void main(String argv[]) {
		int nota = Utilidades.leerEntero("Introduce el valor de la nota entera: ");
	

		System.out.println(valorEnLetra(nota));
			
	}
}
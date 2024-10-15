import java.util.Scanner;

public class Ejercicio37 {
    public static void main(String[] args) {

        // String binario = "10010";
        //System.out.println(binario.length());
        //System.out.println(binario.charAt(0));
        //System.out.println(Math.pow(2,3));
        double resultado = 0;
        double decimal = 0;
        Scanner sc = new Scanner(System.in);


        System.out.println("Introduce binario: ");
        String binario = sc.nextLine();

        for (int i = 0; i < binario.length();i++ ) {
            int bit = binario.charAt(binario.length() - 1 - i) - '0';

            resultado = resultado + bit * Math.pow(2, i);

        }
        System.out.println(resultado);



    }
}

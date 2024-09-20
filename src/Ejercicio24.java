import java.util.Scanner;

public class Ejercicio24 {
    public static void main(String[] args) {

        int nota;
        int cuantasnotas = 0;
        float sumanotas = 0;

        boolean haydiez = false;

        Scanner sc = new Scanner(System.in);

        do {
            nota = sc.nextInt();
            if (nota != -1){
                sumanotas += nota;
                cuantasnotas ++;
                if(nota == 10){
                    haydiez = true;
                }
            }


        }while (nota != -1);

        System.out.println(sumanotas/cuantasnotas);

        if (haydiez) {
            System.out.println("Hay un 10 en tus notas.");
        }else {
            System.out.println("No hay 10 en tus notas.");
        }

    }
}

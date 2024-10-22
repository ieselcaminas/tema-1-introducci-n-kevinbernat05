package metodos;

public class esDescuento {
    public static int esDescuento(int precioReal, int precioRebajado) {

        int descuento = 100 -(precioRebajado * 100) / precioReal;

        return descuento;
    }

    public static void main(String[] args) {

        int precioReal = Utilidades.leerEntero("Precio Real: ");
        int precioRebajado = Utilidades.leerEntero("Precio Rebajado: ");

        int descuento = esDescuento(precioReal, precioRebajado);

        System.out.println("Tu descuento es de: " + descuento + "%");
    }
}

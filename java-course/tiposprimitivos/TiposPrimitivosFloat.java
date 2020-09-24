package tiposprimitivos;

public class TiposPrimitivosFloat {

    public static void main(String[] args) {
        // Tipos primitivos del tipo flotante.

        // float, double
        System.out.println("Bits tipo float: " + Float.SIZE);
        System.out.println("Bytes tipo float: " + Float.BYTES);
        System.out.println("Valor mayor tipo float: " + Float.MAX_VALUE);
        System.out.println("Valor mínimo tipo float: " + Float.MIN_VALUE);
        System.out.println();
        System.out.println("Bits tipo double: " + Double.SIZE);
        System.out.println("Bytes tipo double: " + Double.BYTES);
        System.out.println("Valor mayor tipo double: " + Double.MAX_VALUE);
        System.out.println("Valor mínimo tipo double: " + Double.MIN_VALUE);

        float varFloat = 0.5f;
        double varDouble = 5.10d;
    }
}

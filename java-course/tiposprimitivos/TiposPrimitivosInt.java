package tiposprimitivos;

public class TiposPrimitivosInt {

    public static void main(String[] args) {
        // Tipos primitivos del tipo Entero.

        // byte, short, int, long

        // Número de bits dentro de un byte.
        System.out.println("Bits tipo byte: " + Byte.SIZE);
        // Número de bytes dentro de un byte.
        System.out.println("Bytes tipo byte: " + Byte.BYTES);
        // Valor maximo de un byte.
        System.out.println("Valor mayor tipo byte: " + Byte.MAX_VALUE);
        // Valor minímo de un byte.
        System.out.println("Valor mínimo tipo byte: " + Byte.MIN_VALUE);
        System.out.println();
        System.out.println("Bits tipo short: " + Short.SIZE);
        System.out.println("Bytes tipo short: " + Short.BYTES);
        System.out.println("Valor mayor tipo short: " + Short.MAX_VALUE);
        System.out.println("Valor mínimo tipo short: " + Short.MIN_VALUE);
        System.out.println();
        System.out.println("Bits tipo int: " + Integer.SIZE);
        System.out.println("Bytes tipo int: " + Integer.BYTES);
        System.out.println("Valor mayor tipo int: " + Integer.MAX_VALUE);
        System.out.println("Valor mínimo tipo int: " + Integer.MIN_VALUE);
        System.out.println();
        System.out.println("Bits tipo long: " + Long.SIZE);
        System.out.println("Bytes tipo long: " + Long.BYTES);
        System.out.println("Valor mayor tipo long: " + Long.MAX_VALUE);
        System.out.println("Valor mínimo tipo long: " + Long.MIN_VALUE);
        System.out.println();

        byte varByte = 50;
        System.out.println("varByte = " + varByte);
        short varShort = 100;
        System.out.println("varShort = " + varShort);
        int varInt = 500;
        System.out.println("varInt = " + varInt);
        long varLong = 1000;
        System.out.println("varLong = " + varLong);

        // Indicamos que la variable sea tipo Long, con la literal "L".
        long numero = 10L;
        System.out.println("numero = " + numero);
    }
}

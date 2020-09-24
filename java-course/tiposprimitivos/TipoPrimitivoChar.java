package tiposprimitivos;

public class TipoPrimitivoChar {

    public static void main(String[] args) {
        // Tipo primitivo del tipo char.

        System.out.println("Bits tipo char: " + Character.SIZE);
        System.out.println("Bytes tipo char: " + Character.BYTES);
        System.out.println("Valor mayor tipo char: " + Character.MAX_VALUE);
        System.out.println("Valor mínimo tipo char: " + Character.MIN_VALUE);

        // Signo de admiración en unicode.
        // char u = '\u0021';

        char u = '!';
        System.out.println("u = " + u);
    }
}
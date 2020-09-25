package cadenasycaracteres;

// Métodos substring de la clase String.
public class SubString {

    public static void main(String[] args) {

        String letras = "abcdefghijklmabcdefghijklm";

        // prueba los métodos substring
        System.out.printf("La subcadena desde el índice 20 hasta el final es: \'%s\'%n",
                letras.substring(20));

        System.out.printf("%s \"%s\"%n", "La subcadena desde el índice 3 hasta el 6 es: ",
                letras.substring(3, 6));

    }
}
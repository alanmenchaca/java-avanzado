package cadenasycaracteres.clasestringbuilder;

// Métodos charAt, setCharAt, getChars y reverse de StringBuilder.
public class StringBuilderChars {

    public static void main(String[] args) {

        StringBuilder buffer = new StringBuilder("hola a todos");

        System.out.printf("buffer = %s%n", buffer.toString());
        System.out.printf("Caracter en 0: %s%nCaracter en 5: %s%n",
                /* El método charAt recibe un argumento entero y devuelve el carácter que se
                 * encuentre en el objeto StringBuilder en ese índice. */
                buffer.charAt(0), buffer.charAt(5));

        char[] arregloChar = new char[buffer.length()];

        /* El método getChars recibe cuatro argumentos: el índice inicial a partir del
         * cual deben copiarse caracteres en el objeto StringBuilder, el índice una posición
         * más allá del último carácter a copiar del objeto StringBuilder, el arreglo de
         * caracteres en el que se van a copiar los caracteres y la posición inicial en el
         * arreglo de caracteres en donde debe colocarse el rpimer carácter. */
        buffer.getChars(0, arregloChar.length, arregloChar, 0);
        /* El método getChars copia los caracteres de un objeto StringBuilder en el arreglo de
         * caracteres que recibe como argumento. */
        System.out.print("Los caracteres son: ");

        for (char caracter : arregloChar) {
            System.out.print(caracter);
        }

        buffer.setCharAt(0, 'H');
        buffer.setCharAt(7, 'T');
        System.out.printf("%n%nbuffer = %s%n", buffer.toString());

        // El método reverse invierte el contenido del objeto StringBuilder.
        buffer.reverse();
        System.out.println("\nMétodo reverse: ");
        System.out.printf("buffer = %s%n", buffer.toString());
    }
}

package cadenasycaracteres.clasestringbuilder;

// constructores de StringBuilder.
public class ConstructoresStringBuilder {

    public static void main(String[] args) {

        /* Constructor de StringBuilder sin argumentos para crear objetos StringBuilder que
         *  no contienen caracteres, y tiene una capacidad inicial de 16 caracteres (el valor
         *  predeterminado para un objeto StringBuilder). */
        StringBuilder buffer1 = new StringBuilder();

        /* StringBuilder que recibe un argumento entero para crear un objeto StringBuilder que
         * no contiene caracteres, y su capacidad inicial se especifica mediante el argumeno entero
         * (es decir 10). */
        StringBuilder buffer2 = new StringBuilder(10);

        /* StringBuilder que recibe un argumento String para crear un objeto StringBuilder que contiene
         * los caracteres en el argumento String. La capacidad inicial es el número de caracteres en el
         * argumento String, más 16. */
        StringBuilder buffer3 = new StringBuilder("Hola");

        System.out.printf("buffer1 = \"%s\"%n", buffer1);
        System.out.printf("buffer2 = \"%s\"%n", buffer2);
        System.out.printf("buffer3 = \"%s\"%n", buffer3);
    }
}

package cadenasycaracteres.expresionesregulares;

import java.util.Arrays;

// Uso de los métodos replaceFirst, repaceAll y split.
public class SustitucionRegex {

    public static void main(String[] args) {

        String primerCadena = "Este enunciado termina con 5 estrellas *****";
        String segundaCadena = "1, 2, 3, 4, 5, 6, 7, 8";

        System.out.printf("Cadena 1 original: %s%n", primerCadena);

        // sustituye '*' con '^'
        primerCadena = primerCadena.replaceAll("\\*", "^");
        /* Para encontrar todas las ocurrencias del carácter literal *; debemos escapar el carácter *
         * con el carácter \. Al escapar un carácter especial de expresión regular con una \, indicamos
         * al motor de concordancia de expresiones regulares que busque el carácter en sí. */
        System.out.printf("^ sustituye a *: %s%n", primerCadena);
        /* Como la expresión está almacenada en un objeto String de Java y \ es un carácter especial
         * en los objetos String de Java, debemos incluir un \ adicional. Por lo tanto, la cadena de Java
         * "\\*" representa el patrón de expresión regular \*, que concuerda con un solo carácter * en
         * la cadena de búsqueda. */


        // sustituye 'estrellas' con 'intercaladores'
        primerCadena = primerCadena.replaceAll("estrellas", "intercaladores");
        /* El método replaceAll reemplaza el texto en un objeto String con nuevo texto (el segundo
         * argumento) en cualquier parte en donde el objeto String original concuerde con una expresión
         * regular (el primer argumento). */

        System.out.printf("\"intercaladores\" sustituye a \"estrellas\": %s%n", primerCadena);

        // sustituye las palabras con 'palabra'.
        System.out.printf("Cada palabra se sustituye por \"palabra\": %s%n%n",
                primerCadena.replaceAll("\\w+", "palabra"));

        System.out.printf("Cadena 2 original: %s%n", segundaCadena);

        // sustituye los primeros tres dígitos con 'digito'.
        for (int i = 0; i < 3; i++) {
            segundaCadena = segundaCadena.replaceFirst("\\d", "digito");
        }

        System.out.printf("Los primeros 3 digitos se sustituyen por \"digito\": %s%n", segundaCadena);

        System.out.print("Cadena dividida en comas: ");
        /* El argumento de split es es la expresión regular que localiza el delimitador. En este caso se
         * utilizó la expresión regular ",\\s*" para separar las subcadenas siempre que haya una coma.
         * Al concordar con cualquier carácter dde espacio en blanco, eliminamos los espacios adicionales
         * de las subcadenas resultantes. Las comas y los espacios en blanco no se devuleven como parte
         * de las subcadenas. */
        String[] resultados = segundaCadena.split(",\\s*");

        System.out.println(Arrays.toString(resultados));

    }
}

package cadenasycaracteres.expresionesregulares;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Clases Pattern y Matcher
public class ConcordanciasRegex {

    public static void main(String[] args) {

        /* Si se va a utilizar una expresión regular más de una vez (en un ciclo, por
         * ejemplo), es más eficiente usar el método compile static de la clase Pattern
         * específico de esa expresión regular. Este método recibe un objeto String que
         * representa el patrón y devuelve un nuevo objeto Pattern, el cual puede utilizarse
         * para llamar al método matcher. Este método recibe un objeto CharSequence en el
         * cual se va a realizar la búsqueda, y devuelve un objeto Matcher.*/

        // crea la expresión regular
        Pattern expression = Pattern.compile("J.*\\d[0-35-9]-\\d{2}-\\d{2}");
        /* El carácter de punto "." en la expresión regular concuerda con cualquier carácter
         * individual, excepto un carácter de nueva línea. */

        String cadena1 = "Jane nacio el 05-12-75\n" +
                "Dave nacio el 11-04-68\n" +
                "John nacio el 04-28-73\n" +
                "Joe nacio el 12-17-77\n";

        // compara la expresión regular con la cadena e imprime las concordancias.
        Matcher matcher = expression.matcher(cadena1);

        /* El método find de la clase Matcher trata de hacer que concuerde una pieza del objeto
         * de búsqueda en el patrón de búsqueda. Cada una de las llamas a este método empieza
         * con el punto en el que término la última llamada, por lo que pueden encontrarse varias
         * concordancias. */
        while (matcher.find()) {
            /* Los métodos fina y lookingAt (de la clase Matcher) devuelven true si una parte del
             * objeto de búsqueda concuerda con la expresión regular. */
            System.out.println(matcher.group());
            /* El objeto String devuelto es el que haya concordado la última vez en una en una
             * llamada a find o lookingAt. */
        }
    }

}

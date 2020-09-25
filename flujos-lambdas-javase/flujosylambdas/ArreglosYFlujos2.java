package flujosylambdas;

import java.util.Arrays;
import java.util.stream.Collectors;

// Demostración de las lambdas y los flujos con un arreglo de objetos String.
public class ArreglosYFlujos2 {

    public static void main(String[] args) {

        String[] cadenas = {"Rojo", "Naranja", "Amarillo", "Verde", "Azul",
                "Indigo", "Violeta"};

        // muestra las cadenas originales
        System.out.printf("Cadenas originales %s%n", Arrays.asList(cadenas));

        // cadenas en mayúscula
        System.out.printf("Cadenas en mayúscula: %s%n", Arrays.stream(cadenas)
                /* String::toUpperCase se conoce como una referencia a método y es una
                 * notación abreviada para una expresión lambda. String::toUpperCase es una
                 * referencia para el método de instancia toUpperCase de String. */
                .map(String::toUpperCase)
                /* String::toUpperCase crea una lambda de un parámetro que invoca al método
                 * de instancia con el argumento de la lambda y devuelve el resultado del método.*/
                .collect(Collectors.toList()));

        // cadenas mayores que "m" (sin susceptibilidad al uso de mayúsculas/minúsculas)
        // en orden ascendente
        System.out.printf("Cadenas mayores que \"m\" en orden ascendete: %s%n",
                Arrays.stream(cadenas)
                        /* Se hace una llamada al método filter para localizar todos los objetos
                         * String que sean mayores que "m", utilizando una comparación sin
                         * susceptibilidad al uso de mayúsculas y minúsculas en la lambda Predicate. */
                        .filter(cadena -> cadena.compareToIgnoreCase("m") > 0)
                        /* El método sorted usa el orden natural para el tipo; para los objetos String,
                         * el orden natural es susceptible al uso de mayúsculas y minúsculas, lo que
                         * significa que "Z" es menor que "a". Al pasar e objeto Comparator
                         * String.CASE_INSENSITIVE_ORDER se realiza un ordenamiento sin susceptibilidad
                         * al uso de minúsculas y mayúsculas. */
                        .sorted(String.CASE_INSENSITIVE_ORDER)
                        .collect(Collectors.toList()));

        // cadenas mayores que "m" (sin susceptibilidad al uso de mayúsculas/minúsculas)
        // en orden descendente
        System.out.printf("Cadenas mayores que \"m\" en orden descendente: %s%n",
                Arrays.stream(cadenas)
                        .filter(cadena -> cadena.compareToIgnoreCase("m") > 0)
                        /* La interfaz funcional Comparator contiene el método default reversed, que
                         * invierte el orden de un Comparator existente. Cuando se aplica a String.
                         * CASE_INSENSITIVE_ORDER, los objetos String se ordenan en forma descendente. */
                        .sorted(String.CASE_INSENSITIVE_ORDER.reversed())
                        .collect(Collectors.toList()));

    }
}

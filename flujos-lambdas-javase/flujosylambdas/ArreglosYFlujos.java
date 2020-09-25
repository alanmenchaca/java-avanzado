package flujosylambdas;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// Demostración de lambdas y flujos con un arreglo de enteros.
public class ArreglosYFlujos {

    public static void main(String[] args) {

        Integer[] valores = {2, 9, 5, 0, 3, 7, 1, 4, 8, 6};

        System.out.printf("Valores originales: %s%n", Arrays.asList(valores));

        // ordena los valores en forma ascendente con flujos
        System.out.printf("Valores ordenados: %s%n", Arrays.stream(valores)
                /* El método stream de la clase Array puede usarse para crear un objeto
                 * Stream a partir de un arreglo de objetos. */
                .sorted()
                /* Para crear una colección se puede usar el método collect de Stream, que
                 * es una operación terminal. A medida que se procesa la canalización de
                 * flujo, el método collect realiza una operación de reducción mutable que
                 * coloca los resultados en un objeto que puede modificarse de manera
                 * subsiguiente; a menudo una colección, como un objeto List, Map o Set. */
                .collect(Collectors.toList()));
        /* La clase Collectors proporciona métodos static que devuelven implementaciones de
         * Collector predefinidas. Por ejemplo, el método toList de Collectors transforma el
         * Stream<Integer> en una colección List<Integer>. */

        // valores mayores que 4
        List<Integer> mayoresQue4 = Arrays.stream(valores)
                .filter(valor -> valor > 4)
                .collect(Collectors.toList());
        System.out.printf("Valores mayores que 4: %s%n", mayoresQue4);

        // filtra los valores mayores que 4 y luego ordena los resultados
        System.out.printf("Valores ordenados mayores que 4: %s%n",
                Arrays.stream(valores)
                        /* Se filtran (filter) todos los elementos para localizar todos
                         * los valores mayores que 4. */
                        .filter(valor -> valor > 4)
                        .sorted()
                        .collect(Collectors.toList()));

        // objeto List mayoresQue4 ordenado con flujos
        System.out.printf("Valores mayores que 4 (ascendente con flujos): %s%n",
                mayoresQue4.stream()
                        .sorted()
                        .collect(Collectors.toList()));
    }

    /* La clase Arrays también proporciona versiones sobrecargadas del método stream para
     * crear objetos IntStream, LongStream Y DoubleStream a partir de arreglos int, long y
     * double completos o por rangos de elementos en los arreglos. Las clases IntStream,
     * LongStream y DoubleStream especializadas proporcionan varios métodos para operaciones
     * comunes sobre flujos numéricos. */
}

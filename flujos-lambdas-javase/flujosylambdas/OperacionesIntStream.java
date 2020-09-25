package flujosylambdas;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

/* Demostración de la clase IntStream:
 * La clase IntStream proporciona varias operaciones terminales para reducciones de flujo
 * comunes en flujo de valores int. Las operaciones terminales son ansiosas, ya que procesan
 * de inmediato los elementos en el flujo cuando se les invoca.*/
public class OperacionesIntStream {

    public static void main(String[] args) {

        int[] valores = {3, 10, 6, 1, 4, 8, 2, 5, 9, 7};

        /* El método static of de IntStream recibe un arreglo int como argumento y devuelve un
         * IntStream para procesar los valores del arreglo. Una vez creado el flujo, es posible
         * encadenar varias llamadas a métodos para crear una canalización de flujo. */
        System.out.print("Valores originales: ");
        IntStream.of(valores)
                .forEach(valor -> System.out.printf("%d ", valor));
        System.out.println();

        // count devuelve el número de elementos en el flujo
        System.out.printf("%nCuenta: %d%n", IntStream.of(valores).count());
        // min devuelve el int más pequeño en el fujo
        System.out.printf("Min: %d%n", IntStream.of(valores).min().getAsInt());
        // max devuelve el int más grande en el flujo
        System.out.printf("Max: %d%n", IntStream.of(valores).max().getAsInt());
        // sum devuelve la suma de todos los valores int en el flujo
        System.out.printf("Suma: %d%n", IntStream.of(valores).sum());
        /* average devuelve un OptionalDouble (paquete java.util) que contiene el promedio
         * de los valores int en el flujo como un valor de tipo double, llamamos al método
         * getAsDouble de la clase OptionalDouble para obtener el promedio. */
        System.out.printf("Promedio: %.2f%n", IntStream.of(valores).average().getAsDouble());

        // suma de los valores con el método reduce
        System.out.printf("%nSuma mediante el método reduce: %d%n",
                IntStream.of(valores)
                        .reduce(0, Integer::sum));

        // suma de cuadrados de los valores con el método reduce
        System.out.printf("Suma de cuadrados mediante el método reduce: %d%n",
                IntStream.of(valores)
                        .reduce(0, (x, y) -> x + y * y));

        // producto de valores mediante el método reduce
        System.out.printf("Producto mediante el método reduce: %d",
                IntStream.of(valores)
                        .reduce(1, (x, y) -> x * y));

        // valores pares mostrados en orden
        System.out.print("\n\nValores pares mostrados en orden: ");
        IntStream.of(valores)
                /* Un programador filtra elementos para producir un flujo de resultados inmediatos
                 * que coincidan con la condición; a esto se le conoce como predicado. Las llamadas
                 * a filter y a otros flujos intermediarios son perezosas, ya que no se evalúan sino
                 * hasta que se realice una operación terminal (la cual es ansiosa) producen nuevos
                 * flujos de elementos. */
                .filter(valor -> valor % 2 == 0)
                /* El método sorted de IntStream ordena en forma ascendente los elementos en el flujo.
                 * Al igual que filter, sorted es una operación perezosa; sin embargo, cuando se llega
                 * a realizar un ordenamiento todas las operaciones intermediarias anteriores en la
                 * canalización del flujo deben completarse, de modo que el método sorted sepa qué
                 * elementos ordenar. */
                .sorted()
                .forEach(valor -> System.out.printf("%d ", valor));
        /* El método forEach de IntStream (una operacion terminal) realiza un procesamiento sobre
         * cada elemento en el flujo. */

        System.out.println();

        // valores impares multiplicados por 10 y mostrados en orden
        System.out.print("Valores impares multiplicados por 10 y mostrados en orden: ");
        IntStream.of(valores)
                /* El método filter es una operación sin estado, ya que no requiere información sobre
                 * otros elementos en el flujo para probar si el elemento satisface al predicado. */
                .filter(valor -> valor % 2 != 0)
                /* El método map es una operación de flujo sin estado, las llamadas al método map son
                 * perezosas, la operación de asignación recibe cada valor y lo multiplica por 10. La
                 * asignación es una operación intermedia que transforma los elementos de un flujo en
                 * nuevos valores y produce un nuevo flujo que contiene los elementos resultantes. */
                .map(valor -> valor * 10)
                .sorted()
                .forEach(valor -> System.out.printf("%d ", valor));
        System.out.println();

        /* El método range produce una secuencia de valores desde su primer argumento hasta (pero sin
         * incluir) su segundo argumento. */
        System.out.printf("%nSuma de enteros del 1 al 9: %d%n",
                IntStream.range(1, 10).sum());

        // El método rangeClosed produce una secuencia de valores, incluyendo sus dos argumentos.
        System.out.printf("Suma de enteros del 1 al 10: %d%n%n",
                IntStream.range(1, 10).sum());

        /* La clase IntStream también proporciona el método summaryStatistics que ejecuta las
         * operaciones count, min, max, sum y average en una pasada de los elementos de un
         * IntStream y devuelve los resultados como un objeto IntSummaryStatistics. */
        IntSummaryStatistics summary = IntStream.of(valores).summaryStatistics();
        System.out.println(summary);
    }
}

package coleccionesdegenericos.conjuntos;

import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;

// Uso de SortedSet y TreeSet
public class PruebaSortedSet {

    public static void main(String[] args) {

        String[] colores = {"amarillo", "verde", "negro", "carne", "gris",
                "blanco", "naranja", "rojo", "verde"};
        /* Se incluye la interfaz SortedSet (que extiende a Set) para los conjuntos
         * que mantengan a sus elementos ordenados; ya sea en el orden natural de los
         * elementos (por ejemplo, los números se encuentran en orden ascendente) o
         * en un orden especificado por un objeto Comparator. */
        SortedSet<String> arbol = new TreeSet<String>(Arrays.asList(colores));
        /* Los objetos String se ordenan al ser agregados al objeto TreeSet (la
         * clase TreeSet implementa a SortedSet). */

        System.out.print("Conjunto ordenado: ");
        imprimirConjunto(arbol);

        /* Se hace una llamada al método headSet de TreeSet para obtener un subconjunto
         * del objeto TreeSet, en el que todos los elementos serán menores que "naranja". */
        System.out.print("headSet (\"naranja\"): ");
        imprimirConjunto(arbol.headSet("naranja"));

        /* Se hace una llamada al método tailSet de TreeSet para obtener un subconjunto en
         * el que cada elemento sea mayor o igual que "naranja". */
        System.out.print("tailSet (\"naranja\"): ");
        imprimirConjunto(arbol.tailSet("naranja"));

        /* Se hace una llamada a los métodos first y last de SortedSet para obtener
         * el elemento más pequeño y más grande del conjunto. */
        System.out.printf("primero: %s%n", arbol.first());
        System.out.printf("último: %s%n", arbol.last());
    }

    // imprime sortedSet en pantalla mediante instrucción for mejorada.
    private static void imprimirConjunto(SortedSet<String> conjunto) {

        for (String s : conjunto) {
            System.out.printf("%s ", s);
        }
        System.out.println();
    }
}

package coleccionesdegenericos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// El método binarySearch de Collections.
public class PruebaBusquedaBinaria {

    public static void main(String[] args) {

        // crea un ArrayList<String> a partir del contenido del arreglo colores.
        String[] colores = {"rojo", "blanco", "azul", "negro", "amarillo", "morado",
                "cafe", "rosa"};
        List<String> lista = new ArrayList<>(Arrays.asList(colores));

        /* El método binarySearch espera de Collections espera que los elementos del
         * argumento List estén en orden ascendente, por lo que se usa el método sort
         * de Collections para ordenar la lista. */
        Collections.sort(lista); // ordena el objeto ArrayList
        System.out.printf("ArrayList ordenado: %s%n", lista);

        // busca varios valores en la lista
        imprimirResultadosBusqueda(lista, "negro"); // primer elemento
        imprimirResultadosBusqueda(lista, "rojo"); // elemento medio
        imprimirResultadosBusqueda(lista, "rosa"); // último elemento
        imprimirResultadosBusqueda(lista, "aqua"); // debajo del menor
        imprimirResultadosBusqueda(lista, "gris"); // no existe
        imprimirResultadosBusqueda(lista, "verdeazulado"); // no existe
    }

    /* Una versión sobrecargada de binarySearch recibe un objeto Comparator como tercer argumento,
     * el cual especifica la forma en que binarySearch debe comparar la clave de búsqueda con los
     * elementos del objeto List. */
    public static void imprimirResultadosBusqueda(List<String> lista, String clave) {
        int resultado = 0;

        System.out.printf("%nBuscando: %s%n", clave);
        /* El método binarySearch localiza un objeto un objeto en un objeto List (es decir, un
         * objeto LinkedList o ArrayList). Si se encuentra el objeto, se devuelve el índice de
         * ese objeto. Si no se encuentra el objeto, binarySearch devuleve un valor negativo. */
        resultado = Collections.binarySearch(lista, clave);
        /* Si los elementos del argumento List no están ordenados, el resultado de usar
         * binarySearch es indefinido. */

        if (resultado >= 0) {
            System.out.printf("Se encontró en el índice: %d%n", resultado);
        } else {
            System.out.printf("No se encontró (%d)%n", resultado);
        }
    }
}

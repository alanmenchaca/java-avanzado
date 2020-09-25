package coleccionesdegenericos;

/* Una cola es una colección que representa una fila de espera; por lo general, las
 * inserciones se realizan en la parte posterior de una cola y las eliminaciones se
 * realizan en la parte delantera. */

import java.util.PriorityQueue;

/* La interfaz Queue extiende a la interfaz Collection y proporciona operaciones
 * adicionales para insertar, eliminar e inspeccionar elementos de una cola.*/
public class PruebaPriorityQueue {
    /* PriorityQueue, que implementa a la interfaz Queue, ordena los elementos
     * con base en su orden natural, según lo especificado por el método compareTo
     * de los elementos Comparable, o mediante un objeto Comparator que suministra
     * a través del constructor. */
    public static void main(String[] args) {

        // cola con capacidad de once
        PriorityQueue<Double> cola = new PriorityQueue<>();

        /* El método offer inserta un elemento en la ubicación apropiada, con base en
         * el orden de prioridad. */
        cola.offer(3.2);
        /* El método offer lanza una excepción NullPointException si el programa trata
         * de agregar un objeto null de la cola. */
        cola.offer(9.8);
        cola.offer(5.4);

        System.out.print("Sondeando de cola: ");

        // muestra los elementos de la cola
        while (cola.size() > 0) {
            /* El método peek obtiene una referencia al elemento de mayor prioridad
            de la cola de prioridad (es decir, la parte inicial o cabeza de la cola). */
            System.out.printf("%.1f", cola.peek());
            /* poll elimina el elemento de mayor prioridad de la cola de prioridad
             * (es decir, la parte inicial de la cabeza de la cola). */
            cola.poll();
        }
    }
}

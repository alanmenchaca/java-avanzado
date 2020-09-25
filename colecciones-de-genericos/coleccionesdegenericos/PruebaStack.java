package coleccionesdegenericos;

import java.util.EmptyStackException;
import java.util.Stack;

// La clase Stack del paquete java.util
public class PruebaStack {

    /* La clase Stack extiende a la clase Vector para implementar una
     * estructura de datos tipo pila. */
    public static void main(String[] args) {

        /* Se crea un objeto Stack de tipo Number, la clase Number (en el paquete
         * de java.lang) es la superclase de la mayoría de las clases de envoltura
         * (como Integer, Double) para los tipos primitivos. */
        Stack<Number> pila = new Stack<>();
        /* Al crear un objeto Stack de objetos Number, se puede meter en la pila
         * objetos de cualquier clase que extienda a la clase Number. */


        /* Se realizan multiples llamadas al método push de Stack para agregar objetos
         * Number a la cima de la pila. */
        pila.push(12L); // mete el valor long 12L
        System.out.println("Se metio 12L");
        imprimirPila(pila);

        pila.push(34567); // mete el valor int 34567
        System.out.println("Se metio 34567");
        imprimirPila(pila);

        pila.push(12F); // mete el valor float 0.1F
        System.out.println("Se metio 0.1F");
        imprimirPila(pila);

        pila.push(1234.5678); // mete el valor double 1234.5678
        System.out.println("Se metio 1234.5678");
        imprimirPila(pila);

        // elimina los elementos de la pila
        try {
            Number objetoEliminado;

            // saca elementos de la pila
            while (true) {
                /* El cilo infinito llama al método pop de Stack para eliminar el elemento
                 * superior de pa pila. El método devuelve una referencia Number al elemento
                 * eliminado. Si no hay elementos en el objeto Stack, el método pop lanza una
                 * excepción EmptyStackException. */
                objetoEliminado = pila.pop(); // usa el método pop.

                System.out.printf("Se saco %s%n", objetoEliminado);
                imprimirPila(pila);
            }
        } catch (EmptyStackException emptyStackException) {
            emptyStackException.printStackTrace();
        }
    }

    // muestra el contenido de la pila.
    private static void imprimirPila(Stack<Number> pila) {
        /* Se hace una llamada al método isEmpty de stack (heredado por Stack de la clase Vector
         * para determinar si la pila está vacía. Si está vacía, el método devuelve true; en caso
         * contrario, devuelve false. */
        if (pila.isEmpty()) {
            // La pila está vacía.
            System.out.printf("La pila está vacía%n%n");
        } else {
            // La pila no está vacía.
            System.out.printf("La pila contiene: %s (cima)%n", pila);
        }
    }

    /* Como Stack extiende a Vector, todos los métodos public de Vector pueden llamarse en objetos
     * Stack, aun si los métodos no representan operaciones de la pila convencionales. Al manipular
     * un objeto Stack, sólo deben usarse los métodos push y pop para agregar y eliminar elementos
     * de la pila, respectivamente. Utilizar otro método public heradado de la clase Vector, podría
     * "corromper" los datos de la pila. */
}


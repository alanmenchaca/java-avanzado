package coleccionesdegenericos;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

// Uso de objetos List, LinkedList y ListIterator.
public class PruebaList {

    public static void main(String[] args) {

        // agrega elementos de colores a lista1
        String[] colores = {"negro", "amarillo", "verde", "azul", "violeta", "plateado"};
        List<String> lista1 = new LinkedList<>();

        for (String color : colores) {
            lista1.add(color);
        }

        // agrega elemento de colores2 a lista2
        String[] colores2 = {"dorado", "blanco", "cafe", "azul", "gris", "plateado"};
        List<String> lista2 = new LinkedList<>();

        for (String color : colores2) {
            lista2.add(color);
        }

        /* Se hace una llamada al método addAll de List para anexar todos los elementos de
         * lista2 al final de lista1. */
        lista1.addAll(lista2);
        lista2 = null; // libera los recursos
        imprimirLista(lista1); // imprime los elementos de lista1

        convertirCadenasAMayusculas(lista1); // convierte cadena a mayúsculas
        imprimirLista(lista1); // imprime los elementos de lista1

        System.out.print("\n\nEliminando elementos 4 a 6...");
        // El rango de elementos se eliminan empezando desde el índice 4 hasta el 7.
        eliminarElementos(lista1, 4, 7);
        imprimirLista(lista1); // imprime los elementos de lista1
        imprimirListaInversa(lista1); // imprime la lista en orden inverso
    }

    // imprime el contenido del objeto List
    public static void imprimirLista(List<String> lista) {
        System.out.println("\n\nLista:");

        for (String color : lista) {
            System.out.printf("%s ", color);
        }
    }

    // localiza los objetos String y los convierte a mayúsculas
    public static void convertirCadenasAMayusculas(List<String> lista) {

        /* Se hace una llamada al método listIterator de List para obtener un iterador
         * bidireccional (es decir, un iterador que pueda recorrer un objeto Lista hacia
         * adelante o hacia atrás) para el objeto List. ListIterator es también una clase
         * genérica. */
        ListIterator<String> iterator = lista.listIterator();

        while (iterator.hasNext()) {
            String color = iterator.next(); // obtiene el elemento
            /* Se hace una llamada al método set de Iterator para reemplazar el objeto
             * String actual al que hace referencia iterator con el objeto String devuelto
             * por el método toUpperCase. */
            iterator.set(color.toUpperCase()); // convierte a mayúsculas
        }
    }

    // obtiene sublista y utiliza el método clear para eliminar los elementos de la mmisma
    public static void eliminarElementos(List<String> lista, int inicio, int fin) {

        /* Se hace una llamada al método subList de List para obtener una porción
         * del objeto List (lo que se conoce como sublista). La sublista es otra vista
         * hacia el interior del objeto List desde el que se hace la llamada a subList.
         * El índice final no forma parte del rango de la sublista. */
        lista.subList(inicio, fin).clear();
        /* Se hace una llamada al método clear de List en la sbulista para eliminar los
         * elementos que ésta contiene del objeto List. Cualquier cambio realizado a una
         * sublista se hace en el objeto List original. */
    }

    // imprime la lista inversa
    public static void imprimirListaInversa(List<String> lista) {
        /* Se hace una llamada al método listIterator de List con un argumento que
         * específica la posición inicial (en este caso, el último elemento en la lista)
         * para obtener un iterador bidireccional para la lista. */
        ListIterator<String> iterador = lista.listIterator(lista.size());
        // El método size de List devuelve el número de elementos en el objeto List.

        System.out.println("\n\nLista inversa:");
        /* Se hace una llamada al método hasPrevious de ListIterator para determinar si
         * hay más elementos, mientras se recorre la lista hacia atrás. */
        while (iterador.hasPrevious()) {
            /* Se hace una llamada al método previous de ListIterator para obtener el elemento
             * anterior de la lista y se envía como salida al flujo de salida estándar. */
            System.out.printf("%s ", iterador.previous());
        }

    }
}

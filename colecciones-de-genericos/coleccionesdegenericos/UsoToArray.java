package coleccionesdegenericos;
/* Se utiliza el método asList para ver un arreglo como una colección List, y el
 * método toArray de List para obtener un arreglo de una colección LinkedList. */

import java.util.Arrays;
import java.util.LinkedList;

// Ver arreglos como objetos List y convertir objetos List en arreglos.
public class UsoToArray {

    /* El constructor crea un objeto LinkedList, le agrega elementos y lo
     * convierte en arreglo. */
    public static void main(String[] args) {

        String[] colores = {"negro", "azul", "amarillo"};
        /* La clase Arrays proporciona el método static asList para ver un arreglo
         * como una colección List. Una vista List permite al programador manipular el
         * arreglo como si fuera una lista. Cualquier modificación realizada a través de
         * la vista List cambia el arreglo, y cualquier modificación realizada al
         * arreglo cambia la vista List. */
        LinkedList<String> enlaces = new LinkedList<>(Arrays.asList(colores));
        /* La única operación permitida en la vista devuelta por asList es establecer, la
         * cual cambia el valor de la vista y del arreglo de soporte. Cualquier otro
         * intento por cambiar la vista (como agregar o eliminar elementos) produce una
         * excepción UnsupportOperationException. */


        // Las operaciones add están permitidas debido a que operan en el objeto LinkedList
        enlaces.addLast("rojo"); // lo agrega como último elemento.
        enlaces.add("rosa"); // lo agrega al final.
        enlaces.add(3, "verde"); // lo agrega en el 3er índice.
        /* Cuando se agrega "cyan" como el primer elemento, "verde" se convierte en el
         * quinto elemento en el objeto LinkedList. */
        enlaces.add("cyan");

        // obtiene los elementos de LinkedList como un arreglo
        colores = enlaces.toArray(new String[enlaces.size()]);
        /* Pasar un arreglo que contenga datos al método toArray puede crear errores lógicos. Si
         * el número de elementos en el arreglo es menor que el número de elementos en la lista
         * en la que se llama a toArray, se asigna un nuevo arreglo para almacenar los elementos
         * de la lista (sin preservar los elementos del argumento tipo arreglo). Si el número de
         * elementos en el arreglo es mayor que el número de elementos en la lista, los elementos
         * del arreglo (empezando en el índice cero) se sobrescriben con los elementos de la lista.
         * Los elementos del arreglo que no se sobrescriben retienen sus valores. */

        System.out.println("Colores:");
        for (String color : colores) {
            System.out.println(color);
        }
    }

}

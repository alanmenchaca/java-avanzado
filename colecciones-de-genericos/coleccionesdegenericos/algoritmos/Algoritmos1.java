package coleccionesdegenericos.algoritmos;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// Los métodos reverse, fill, copy, max y min de collections
public class Algoritmos1 {

    public static void main(String[] args) {

        /* Se crea la variable lista de tipo List<Character> y se inicializa con una
         * vista List del arreglo de tipo Character. */
        Character[] letras = {'P', 'C', 'M'};
        List<Character> lista = Arrays.asList(letras);
        System.out.println("lista inicial: ");
        imprimir(lista);

        // invierte y muestra el objeto List<Character>
        Collections.reverse(lista);
        /* Se hace una llamada al método reverse de Collections para invertir el orden
         * de la lista.*/
        System.out.printf("%nDespues de llamar a reversia, lista contiene:%n");
        imprimir(lista);

        // crea copiaLista a partir de un arreglo de 3 objetos Character
        Character[] letrasCopia = new Character[3]; // lista.size()
        /* Los cambios a copiaLista no cambian a letras, ya que copiaLista es un objeto
         * List independiente que no es una vista Lista del arreglo letras. */
        List<Character> copiaLista = Arrays.asList(letrasCopia);

        /* El método copy requiere dos argumentos List: el objeto List destino y el
         * de orgien. */
        Collections.copy(copiaLista, lista);
        System.out.printf("%nDespues de copiar, copiaLista contiene:%n");
        imprimir(lista);

        // llena la lista con letras R
        Collections.fill(lista, 'R');
        /* Se hace una llamada al método fill de Collections para colocar el caracter
         * 'R' en cada elemento de la lista. Como lista es es una vista List del arreglo
         * letras, esta operación cambia cada elemento en letras a 'R'. */
        System.out.printf("%nDespues de llamar a fill, lista contiene:%n");
        imprimir(lista);
    }

    // imprime la información del objeto List.
    public static void imprimir(List<Character> referenciaLista) {
        System.out.print("La lista es: ");

        for (Character elemento : referenciaLista) {
            System.out.printf("%s ", elemento);
        }

        /* Se hace una llamada a los método max y min de Collections para buscar el
         * elemento más grande y más pequeño de la colección, respectivamente. */
        System.out.printf("%nMax: %s", Collections.max(referenciaLista));
        System.out.printf("%nMin: %s%n", Collections.min(referenciaLista));
    }
}

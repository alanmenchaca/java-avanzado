package manejogenericos;

// Definimos una clase generica con el operador diamante <>.
public class ClaseGenerica<T> {

    /* El tipo lo conoceremos hasta el momento en que sea utilizada la clase (por 
    esto se le conoce como tipo generico). */
    // Definimos una variable de tipo generico.
    T objeto;

    // constructor que inicializa el tipo a utilizar.
    public ClaseGenerica(T objeto) {
        this.objeto = objeto;
    }

    // metodo para obtener el tipo definido en la clase generica.
    public void obtenerTipo() {
        /* para poder obtener el nombre de la clase del tipo que hemos definido utilizamos
        el api de reflections, usando los métodos .getClass() junto con el método .getName()
        para obtener el nombre de la clase. */
        System.out.println("El tipo T es: " + objeto.getClass().getName());
    }

}

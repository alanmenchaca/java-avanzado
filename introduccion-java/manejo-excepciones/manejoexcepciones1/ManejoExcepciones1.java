package manejoexcepciones1;

// Importamos la clase de OperationException y la clase Division.
import domain.*;

public class ManejoExcepciones1 {

    public static void main(String[] args) {

        try {
            /* Tenemos que procesar la excepción dentro de un bloque try - catch, esto
            debido a que al instanciar la clase Division e invocar su constructor este
            lanza una excepcion de tipo OperationException. */
            Division division = new Division(10, 0);
            // Indicamos cual es el tipo de excepción que queremos procesar.
        } catch (OperationException ex) {
            // El bloque de codigo posiblemente lanze una excepción de OperationException.
            System.out.println("Ocurrió un error!!!");
            /* Imprimimos el StackTrace (El StackTrace es la pila de errores que se va acumulando
            desde la primer clase que mandó el error hasta la última clase que procesó este error. */
            ex.printStackTrace();
        }
    }

}

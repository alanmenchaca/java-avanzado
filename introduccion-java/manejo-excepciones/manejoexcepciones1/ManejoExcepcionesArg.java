package manejoexcepciones1;

import domain.*;

public class ManejoExcepcionesArg {

    public static void main(String[] args) throws OperationException {
        try {
            int op1 = Integer.parseInt(args[0]);
            int op2 = Integer.parseInt(args[1]);
            Division div = new Division(op1, op2);
            div.visualizarOperacion();
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Ocurrió una Excepción: ");
            System.out.println("Hubo un error al acceder un elemento fuera de rango.");
            ex.printStackTrace();
            /* Podemos agregar cualquier cantidad de bloques catch para procesar las excepciones
            que se puedan arrojar dentro de nuestros bloques de codigo que estemos procesando. */
        } catch (NumberFormatException ex) {
            System.out.println("Ocurrió una Excepción: ");
            System.out.println("Uno de los argumentos, no es entero.");
            ex.printStackTrace();
        } catch (OperationException ex) {
            System.out.println("Ocurrió una Excepción: ");
            System.out.println("Se trató de realizar una operación erronea.");
            ex.printStackTrace();
        } finally {
            /* El bloque finally siempre se va a ejecutar, independientemente de que suceda algunas
            de las excepciones mencionadas anteriormente. */
            System.out.println("Se terminaron de revisar las excepciones.");
        }
    }

}

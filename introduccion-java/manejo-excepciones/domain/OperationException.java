package domain;

public class OperationException extends Exception {

    public OperationException(String mensaje) {
        // Inicializamos el mensaje de error en la clase Padre.
        super(mensaje);
        // Mandamos como parametro el argumento mensaje al constructor de la clase Padre.
    }
}

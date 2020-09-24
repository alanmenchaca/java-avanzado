package excepciones;

// Clase padre que vamos a utilizar para nuestro excepcion: AccesoDatos Excepcion
public class AccesoDatosEx extends Exception {
    // Manejaremos Excepciones de tipo: Check Exception (Excepciones comprobadas).

    public AccesoDatosEx(String message) {
        super(message);
    }

}

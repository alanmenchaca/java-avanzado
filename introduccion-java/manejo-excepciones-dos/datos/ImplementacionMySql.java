package datos;

// Importamos todas las clases del paquete excepciones para utilizar
// nuestras excepciones definidas.
import excepciones.*;

public class ImplementacionMySql implements AccesoDatos {

    private boolean simularError;

    /* Indicamos que el método posiblemente arroje una excepcion del tipo AccesoDatosEx,
    ya que así se definió en la firma del método en la interface AccesoDatos. */
    @Override
    public void insertar() throws AccesoDatosEx {
        if (simularError) {
            // Lanzamos una excepcione de una subclase del tipo AccesoDatosEx
            throw new EscrituraDatosEx("Error de escritura de datos.");
        } else {
            System.out.println("Insertar desde MySql.");
        }
    }

    @Override
    public void listar() throws AccesoDatosEx {
        if (simularError) {
            throw new LecturaDatosEx("Error de lectura de datos.");
        } else {
            System.out.println("Listar desde MySql.");
        }
    }

    public boolean isSimularError() {
        return simularError;
    }

    @Override
    public void simularError(boolean simularError) {
        this.simularError = simularError;
    }

}

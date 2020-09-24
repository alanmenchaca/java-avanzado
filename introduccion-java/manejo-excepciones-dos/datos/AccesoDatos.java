package datos;

import excepciones.AccesoDatosEx;

public interface AccesoDatos { 

    // Métodos que pueden arrojar Excepciones de tipo subclase es decir;
    // Escritura de datos o lectura de datos Exception.
    void insertar() throws AccesoDatosEx;

    // Utilizamos una excepcion de la clase padre en ambos métodos para generalizar el codigo.
    void listar() throws AccesoDatosEx;

    void simularError(boolean SimularError);
}

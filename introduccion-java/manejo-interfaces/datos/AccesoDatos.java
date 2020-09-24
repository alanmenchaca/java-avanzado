package datos;

public interface AccesoDatos {

    // En una interface los atributos por defectos son finales y estáticos.
    public static int MAX_REGISTROS = 10;

    public void insertar();

    public void listar();
}

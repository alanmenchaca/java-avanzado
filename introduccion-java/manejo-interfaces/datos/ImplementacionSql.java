package datos;

public class ImplementacionSql implements IAccesoDatos {

    @Override
    public void insertar() {
        System.out.println("Insertar desde MySql.");
    }

    @Override
    public void listar() {
        System.out.println("Listar desde MySql.");
    }
}

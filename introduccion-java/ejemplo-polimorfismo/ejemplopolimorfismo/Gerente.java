package ejemplopolimorfismo;

public class Gerente extends Empleado {

    private String departamento;

    public Gerente(String nombre, double sueldo, String departamento) {
        super(nombre, sueldo);
        this.departamento = departamento;
    }

    // Sobreescribimos el método padre.
    @Override
    public String obtenerDetalles() {
        /* Podemos utilizar el método obtenerDetalles() de la clase padre y
        agregarselo a la clase hija. */
        // Esto invoca a un método sobreescrito.
        return super.obtenerDetalles() + ", Departamento: " + departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
}

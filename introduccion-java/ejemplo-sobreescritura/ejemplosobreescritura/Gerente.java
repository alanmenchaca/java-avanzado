package ejemplosobreescritura;

public class Gerente extends Empleado {

    private String departamento;

    public Gerente(String nombre, double sueldo, String departamento) {
        super(nombre, sueldo);
        this.departamento = departamento;
    }

    /* La firma de un método sobreescrito por una subclase debe ser igual que el padre, tanto
    el nombre, tipo de retorno y lista de argumentos. */
    @Override
    // Sobreescribimos el método obtenerDetalles() de la clase padre.
    public String obtenerDetalles() {
        // Accedemos de manera directa a los atributos heredados.
        return "Nombre: " + nombre
                + ", Sueldo: " + sueldo
                + ", Departamento: " + departamento;
    }
    /* La sobreescritura de métodos tiene que ver con la modificación de un método por parte 
    de la clase hija de algún método que ha sido heredado de la clase padre. */

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

}

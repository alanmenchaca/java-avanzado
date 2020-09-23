package ejemploconversionobjetos;

public class Gerente extends Empleado {

    private String departamento;

    public Gerente(String nombre, float sueldo, String departamento) {
        /* Mandamos a llamar al constructor de la clase padre y mandamos
        por argumentos el nombre y sueldo.*/
        super(nombre, sueldo);
        this.departamento = departamento;
    }

    // Sobreescribimos el método padre heredado.
    @Override
    public String obtenerDetalles() {
        /* Observamos que para no repetir codigo, podemos utilizar
        el método obtenerDetalles()de la clase padre  con la palabra
        reservada super y solo agregar a este método de la clase
        hija (esto es invocar un método sobreescrito). */
        return super.obtenerDetalles() + ", departamento: " + departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

}

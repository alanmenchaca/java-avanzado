package ejemplosobreescritura;

public class Empleado {

    // Atributos con midificador de acceso protected.
    protected String nombre;
    protected double sueldo;

    // Constructor con modificador de acceso protected y que acepta dos argumentos.
    protected Empleado(String nombre, double sueldo) {
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    public String obtenerDetalles() {
        return "Nombre: " + nombre
                + ", Sueldo: " + sueldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

}

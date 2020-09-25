package sobrecargaconstructores;

public class Empleado extends Persona {

    private double sueldo;

    public Empleado(String nombre, int edad, double sueldo) {
        /* Mandamos a llamar al constructor de la clase padre con la palabra reservada super,
        y envíamos por argumentos el nombre y la edad. */
        super(nombre, edad);
        this.sueldo = sueldo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return super.toString() + " Empleado{" +
                "sueldo=" + sueldo +
                '}';
    }
}

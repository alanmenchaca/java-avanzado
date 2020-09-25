package sobrecargaconstructores;

public class Persona {

    public static int contadorPersonas;
    private int idPersona;
    private String nombre;
    private int edad;

    private Persona() {
        this.idPersona = ++contadorPersonas;
    }

    // Constructor completo (sobrecarga)
    public Persona(String nombre, int edad) {
        // Con la palabra reservada this() mandamos a llamar al constructor privado.
        this(); // Dentro de los paréntesis se colocan los argumentos del constructor.
        this.nombre = nombre;
        this.edad = edad;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "idPersona=" + idPersona +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }
}

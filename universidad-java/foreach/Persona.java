package foreach;

public class Persona {

    private final int idPersona;
    private String nombre;

    private static int contadorPersonas;

    public Persona(String nombre) {
        // El contador aumenta cada ves que se le asgina una referencia a un objeto Persona.
        this.idPersona = ++contadorPersonas;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}

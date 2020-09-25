package contextoestatico;

public class EjemploEstatico {

    public static void main(String[] args) {
        Persona p1 = new Persona("Juan");
        System.out.println(p1);

        Persona p2 = new Persona("Karla");
        System.out.println(p2);

        System.out.println("Contador Personas: " + Persona.getContadorPersonas());
    }
}

class Persona {
    // El contadorPersonas se asocia con la clase, no con el objeto.
    private static int contadorPersonas;
    private int idPersona;
    private String nombre;

    public Persona(String nombre) {
        // El contadorPersonas se incrementa cada ves que se crea un objeto.
        contadorPersonas++;

        /* Acedemos a la variable que se asocia a la clase, y se incrementará
        por cada objeto que se crea. */
        this.idPersona = contadorPersonas;
        this.nombre = nombre;
    }

    public static int getContadorPersonas() {
        return contadorPersonas;
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

    public String toString() {
        return "idPersona: " + idPersona + " nombre: " + nombre;
    }

}

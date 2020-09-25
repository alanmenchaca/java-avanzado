package palabranull;

public class PalabraNull {

    public static void main(String[] args) {

        Persona persona1 = new Persona("Juan");
        System.out.println("persona1 = " + persona1.obtenerNombre());

        // El la variable tipo object apuntará al objeto Persona.
        Persona persona2 = persona1;

        // La variable tipo object persona1 ya no apuntará al objeto Persona.
        persona1 = null; // Esta variable es candidata para que la elimine el recolector de basura.

        System.out.println("persona2 = " + persona2.obtenerNombre());

    }
}

class Persona {
    String nombre;

    Persona(String nombre) {
        this.nombre = nombre;
    }

    public String obtenerNombre() {
        return this.nombre;
    }
}
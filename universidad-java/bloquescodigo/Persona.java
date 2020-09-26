package bloquescodigo;

/* Bloques de código incializadores:
Un bloque de código en Java es cualquier parte del código que inicializa con llaves y termina con llaves, 
cualquier contenido dentro de las llaves se conoce como un bloque de código. */
public class Persona {

    /* Los bloques anonimos (tambien llamados inicializadores) nos permiten comunmente incializar variables de la clase, 
    estos bloques pueden inicializar dos tipos de variables ya sean de instancia o de tipo static. */
    private final int idPersona;
    private static int contadorPersonas;

    // Bloque de inicializacíón estatico.
    static {
        // Inicializamos el contadorPersona desde el valor 10.
        contadorPersonas = 10;
        // Dentro de esto bloque de código no se pueden usar variables no estáticas.
        System.out.println("Ejeucta bloque estático.");
        /* Bloques de código inicializadores estáticos:
        El  bloque estático anónimo inicializador. Se ejecuta antes que el bloque no estático.*/
    }

    // Bloques de código para inicializar atributos de la clase.
    // El bloque se copia a cada constructor de la clase.
    {
        System.out.println("Ejecuta bloque incializador.");
        idPersona = ++contadorPersonas;
    }

    Persona() {
        System.out.println("Ejecuta Constructor.");
    }

    /* - Los bloques estáticos se ejecutan una sola vez, los de inicialización cada que se crea un objeto nuevo.
       - Pueden existir múltiples bloques (tanto estáticos como de inicialización) en ese caso se ejecutarán en el
        orden en que aparecen.
       - Los bloques estáticos no deben hacer mención de métodos o atributos de la clase no estaticos. */
    public int getIdPersona() {
        return idPersona;
    }
}

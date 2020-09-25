package palabrafinal;

// La palabra final puede aplicar en la definición de una clase.
public final class ClaseFinal {

    // Declaración de una constante estatica
    public static final int VAR_PRIMITIVO = 10;

    /* Al declarar constante al objeto Persona, indicamos que ya no es posible mover
    la referencia del objeto Persona que se le asigno (es posible modificar el contenido
     del objeto persona). */
    public static final Persona VAR_PERSONA = new Persona();

    // Al declarar un método constante, no será posible modificarlo desde otra clase.
    public final void metodoFinal(){
    }
}

// class Hija extends ClaseFinal { }

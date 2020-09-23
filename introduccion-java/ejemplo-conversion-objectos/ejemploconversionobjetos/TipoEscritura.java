package ejemploconversionobjetos;

public enum TipoEscritura {

    // Declaramos dos constantes.
    CLASICO("Escritura a mano."),
    MODERNO("Escritura digital.");

    // Atributo de cada constante.
    private final String descripcion;

    /* El constructor privado solo se podrá mandar a llamar desde la 
    misma clase. */ 
    private TipoEscritura(String descripcion) {
        /* El constructor recibe el texto de las constantes inicializadas
        y se lo asigna a la constante descripción. */
        this.descripcion = descripcion;
    } // El constructor funciona como un método setter.
    
    // Obtener el tipo de Escritura.
    public String getDescripcion() {
        return descripcion;
    }

}

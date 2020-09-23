package ejemploconversionobjetos;

public class Escritor extends Empleado {

    // Variable de la clase TipoEscritura.
    final TipoEscritura tipoEscritura;

    public Escritor(String nombre, float sueldo, TipoEscritura tipoEscritura) {
        super(nombre, sueldo);
        this.tipoEscritura = tipoEscritura;
    }

    @Override
    public String obtenerDetalles() {
        /* Invocamos el método de la clase padre obtenerDetalles y concatenamos
        el tipo de escritura de la clase enum. */
        return super.obtenerDetalles() + " ,tipo de escritura: "
                // Invocamos el método que obtiene el tipo de Escritura.
                + tipoEscritura.getDescripcion();
    }

    public TipoEscritura getTipoEscritura() {
        return tipoEscritura;
    }

    public String getTipoDeEscrituraEnTexto() {
        return tipoEscritura.getDescripcion();
    }

}

package enumeraciones;

public enum Continentes {

    // Valores asignados a cada una de las constantes.
    AFRICA(53),
    EUROPA(46),
    ASIA(44),
    AMERICA(34),
    OCEANIA(14);

    // Atributo de cada elemento de la enumeración.
    private final int paises;

    // Constructor que incia cada uno de los valores asociados a cada constante.
    Continentes(int paises) {
        // Constructor de cada elemento de la enumeración.  
        this.paises = paises;
    }

    // Método que retorna un país.
    public int getPaises() {
        return paises;
    }
}

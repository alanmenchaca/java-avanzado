package abstracto.domain;

public class Rectangulo extends FiguraGeometrica {

    public Rectangulo(String tipoDeFigura) {
        super(tipoDeFigura);
    }

    @Override
    public void dibujar() {
        // Implementación del método dibujar heredado de la clase FiguraGeometrica.
        System.out.println("Aquí debería dibujar un: " + this.getClass().getSimpleName());
        // El método this.getClass().getSimpleName() obtinene el nombre de la clase actual.
    }

}

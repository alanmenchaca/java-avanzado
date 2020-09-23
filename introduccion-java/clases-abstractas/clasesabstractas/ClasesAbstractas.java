package clasesabstractas;

import abstracto.domain.*;

public class ClasesAbstractas {

    public static void main(String[] args) {

        // Creación de objetos.
        FiguraGeometrica rectangulo = new Rectangulo("Rectángulo");
        FiguraGeometrica triangulo = new Triangulo("Triángulo");
        FiguraGeometrica circulo = new Circulo("Círculo"); // Upcasting

        System.out.println(rectangulo);
        rectangulo.dibujar();

        System.out.println(triangulo);
        triangulo.dibujar();

        System.out.println(circulo);
        circulo.dibujar();
    }

}

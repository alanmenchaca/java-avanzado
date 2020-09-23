package ejemploinstanceof;

public class EjemploInstanceOf {

    public static void main(String[] args) {
        // Determina solo un tipo que corresponde con la jerarquía.
        FiguraGeometrica figura = new Elipse(); // Upcasting
        determinarTipo(figura);
        
        // Determina todos los tipos posibles.
        System.out.println("\nTodos sus tipos:");
        determinarTodosLosTipos(figura);
    }

    /* El operador de instancia de Java se utiliza para probar si el objeto es una
    instancia del tipo especificado (clase o subclase o interfaz). */
    private static void determinarTipo(FiguraGeometrica figura) {
        if (figura instanceof Elipse) {
            // Procesa algo particular de la Elipse.
            System.out.println("Es una Elipse.");
        } else if (figura instanceof Circulo) {
            // Procesa algo particular del Círculo.
            System.out.println("Es un Círculo,");
        } else if (figura instanceof FiguraGeometrica) {
            // Procesa algo particular de la Figura Geometrica.
            System.out.println("Es una Figura Geometrica.");
        } else if (figura instanceof Object) {
            // Procesa algo particular de la clase Object.
            System.out.println("Es un Object");
        } else {
            System.out.println("No se encontró el tipo.");
        }
    }

    private static void determinarTodosLosTipos(FiguraGeometrica figura) {
        if (figura instanceof Elipse) {
            // Procesa algo particular de la Elipse.
            System.out.println("Es una Elipse.");
        }
        if (figura instanceof Circulo) {
            // Procesa algo particular del Círculo.
            System.out.println("Es un Círculo.");
        }
        if (figura instanceof FiguraGeometrica) {
            // Procesa algo particular de la Figura Geometrica.
            System.out.println("Es una Figura Geometrica.");
        }
        if (figura instanceof Object) {
            // Procesa algo particular de la clase Object.
            System.out.println("Es un Object.");
        } else {
            System.out.println("No se encontró el tipo.");
        }
    }
}

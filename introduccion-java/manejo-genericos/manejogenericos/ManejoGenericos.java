package manejogenericos;

public class ManejoGenericos {

    public static void main(String[] args) {
        // Creamos una instancia de ClaseGenerica para Integer.
        ClaseGenerica<Integer> objetoInt = new ClaseGenerica<>(15);
        // Indicamos que la variable de tipo ClaseGenerica será de cierto tipo (en
        // este caso de tipo Integer).
        objetoInt.obtenerTipo();
        
        // Creamos una instancia de ClaseGenerica para String.
        // Se puede utilizar la inferencia del tipo de lado derecho.
        ClaseGenerica<String> objetoStr = new ClaseGenerica<>("Prueba");
        objetoStr.obtenerTipo();
        
        // Los tipo genericos no pueden ser aplicados a tipos primitivos
        // Por lo que esto marcaría un error de compilación
        // ClaseGenerica<int> intPrimitivo = new ClaseGenerica<int>(88);
    }

}

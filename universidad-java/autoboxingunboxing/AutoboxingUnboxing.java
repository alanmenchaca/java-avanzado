package autoboxingunboxing;

public class AutoboxingUnboxing {

    public static void main(String[] args) {
        // Autoboxing (se convierte de tipos primitivos a tipos Object).
        Integer enteroObj = 10;
        /* Convertimos un tipo primitivo a su clase equivalente de tipo Object (tambien llamado
        Wrapper o clase envolvente). */
        Float flotanteObj = 15.2F;
        Double dobleObj = 40.1;

        System.out.println("AutoBoxing");
        // Con el método intValue() obtenemos el valor almacenado en la variable tipo Object.
        System.out.println("Entero Obj: " + enteroObj.intValue());
        System.out.println("Flotante Obj: " + flotanteObj.floatValue());
        System.out.println("Doble Obj: " + dobleObj.doubleValue());
        // Método suma de la clase Integer.
        System.out.println("Suma: " + enteroObj.sum(10, 7));

        // Autounboxing (se convierte de objetos a tipos primitivos).
        int entero = enteroObj;
        float flotante = flotanteObj;
        double doble = dobleObj;
        System.out.println("\nUnboxing");
        System.out.println("Entero: " + entero);
        System.out.println("Flotante: " + flotante);
        System.out.println("Double: " + doble);
    }
}

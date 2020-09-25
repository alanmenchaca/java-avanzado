package palabrathis;

public class PalabraThis {

    public static void main(String[] args) {
        Persona persona = new Persona("Juan");
    }
}

class Persona {
    String nombre;

    Persona(String nombre) {
        this.nombre = nombre;

        // Imprimir el objeto Persona
        Imprimir obj = new Imprimir();
        // This contiene una referencia al objeto Persona
        obj.imprimir(this);

    }
}

class Imprimir{
    public void imprimir(Persona p){
        // Valor del objeto persona.
        System.out.println("Impresion argumento: " + p);
        // This apunta a un objeto de tipo imprimir.
        System.out.println("Impresion objeto actual (this): " + this);
    }
}


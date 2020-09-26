package bloquescodigo;

public class BloquesCodigo {

    public static void main(String[] args) {

        /* Al crear un objeto de la clase Persona al principio se ejecutará el bloque inicializador estático,
        después el bloque anónimo inicializador (no estatico) y por último se ejecuta el constructor. */
        Persona p1 = new Persona();
        int id = p1.getIdPersona();
        
        System.out.println("id Persona: " + id);
        
    }
}

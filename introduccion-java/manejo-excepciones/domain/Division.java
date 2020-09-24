package domain;

public class Division {

    // atributo de la clase
    private int numerador;
    // atributo de la clase
    private int denominador;

    // Indicamos que el constructor posiblemente podría arrojar la
    // excepción de OperationException.
    public Division(int numerador, int denominador) throws OperationException {

        if (denominador == 0) {
            // throw new IllegalArgumentException("Denominador igual a cero.").
            throw new OperationException("Denominador igual a cero.");
        }
        // Constrcutor que inicializa las variables de instancia.
        this.numerador = numerador;
        this.denominador = denominador;
    }

    // método que muestra la división del numerador entre el denominador.
    public void visualizarOperacion() {
        System.out.printf("El resultado de la división es: %d%n", (numerador / denominador));
    }

}

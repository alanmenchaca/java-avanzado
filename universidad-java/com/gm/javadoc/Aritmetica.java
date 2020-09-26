/**
 * Esta clase permite relizar operaciones de aritmetica como sumar, restar, etc..
 *
 * @author Alan Menchaca
 * @version 1.0
 */
package com.gm.javadoc;

public class Aritmetica {

    /**
     * Primer Operando.
     */
    int operandoA;

    /**
     * Segundo Operando.
     */
    int OperandoB;

    /**
     * Constructor con argumentos.
     */
    public Aritmetica(int operandoA, int OperandoB) {
        this.operandoA = operandoA;
        this.OperandoB = OperandoB;
    }

    /**
     * Este método reliza la suma de dos operandos enteros.
     *
     * @return int resultado de la suma
     */
    public int sumar() {
        return operandoA + OperandoB;
    }
}

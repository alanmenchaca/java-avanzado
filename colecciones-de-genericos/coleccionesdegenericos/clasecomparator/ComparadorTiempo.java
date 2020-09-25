package coleccionesdegenericos.clasecomparator;

import java.util.Comparator;

// Clase Comparator personalizada que compara dos objetos Tiempo.
public class ComparadorTiempo implements Comparator<Tiempo> {
    // Se implementa la interfaz Comparator, un tipo genérico que recibe un argumento.

    /* Una clase que implementa a Comparator debe declarar un método compare que reciba
     * dos argumentos y devuelva un entero negativo si el primer argumento es menor que el
     * segundo, 0 si los argumentos son iguales o un entero positivo si el primer argumento
     * es mayor que el segundo. */
    @Override
    public int compare(Tiempo tiempo1, Tiempo tiempo2) {
        /* Si el valor es positivo, entonces la primera hora es mayor que la segunda y el
         * primer tiempo es mayor que el segundo. Si este valor es negativo, entonces la
         * primera hora es menor que la segunda y el primer tiempo es menor que el segundo.
         * Si este valor es cero, las horas son iguales y debemos evaluar los minutos (y tal
         * vez los segundos) para determinar cuál tiempo es mayor. */
        int diferenciaHora = tiempo1.getHora() - tiempo2.getHora();

        // Si las horas son distintas entonces devolvemos este valor.
        if (diferenciaHora != 0) { // evalúa primero la hora
            return diferenciaHora;
        }

        int diferenciaMinuto = tiempo1.getMinuto() - tiempo1.getMinuto();

        if (diferenciaMinuto != 0) { // después evalúa el minuto
            return diferenciaMinuto;
        }

        int diferenciaSegundo = tiempo1.getSegundo() - tiempo2.getSegundo();
        return diferenciaSegundo;
    }
}

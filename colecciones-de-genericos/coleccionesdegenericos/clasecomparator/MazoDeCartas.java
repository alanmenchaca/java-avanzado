package coleccionesdegenericos.clasecomparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// clase para representar un objeto Carta en un mazo de cartas
class Carta {

    // Barajar y repartir cartas con el método shuffle de Collections.
    public static enum Cara {
        As, Dos, Tres, Cuatro, Cinco, Seis,
        Siete, Ocho, Nueve, Diez, Joker, Reina, Rey
    }

    public static enum Palo {Bastos, Diamantes, Corazones, Espadas}

    private final Cara cara;
    private final Palo palo;

    public Carta(Cara cara, Palo palo) {
        this.cara = cara;
        this.palo = palo;
    }

    // devuelve la cara de la Carta
    public Cara getCara() {
        return cara;
    }

    // devuelve el palo de la carta
    public Palo getPalo() {
        return palo;
    }

    public String toString() {
        return String.format("%s de %s", cara, palo);
    }
}

public class MazoDeCartas {
    // declara objeto List que almacenará los objetos Carta
    private List<Carta> lista;

    public MazoDeCartas() {
        Carta[] mazo = new Carta[52];
        int cuenta = 0; // número de cartas

        /* Tanto Cara como Palo son tipos public static enum de la clase Carta. Para usar
         * estos tipos enum fuera da la clase Carta, se debe calificar el nombre de cada
         * tipo enum con el nombre de la clase en la que reside (es decir, Carta) y un
         * separador punto (.) */
        for (Carta.Palo palo : Carta.Palo.values()) {
            /* El método values de un tipo enum devuelve un arreglo que contiene todas las
             * constantes del tipo enum. */
            for (Carta.Cara cara : Carta.Cara.values()) {
                /* Se llena el arreglo mazo con cartas que tienen combinaciónes únicas
                 * de cara y palo.*/
                mazo[cuenta] = new Carta(cara, palo);
                ++cuenta;
            }
        }

        // obtiene objeto List
        lista = Arrays.asList(mazo);
        /* La acción de barajar las cartas ocurre cuando se hace una llamada al método
         * static shuffle de la clase Collections para barajar los elementos del arreglo. */
        Collections.shuffle(lista);
    }

    // imprime el mazo
    public void imprimirCartas() {
        // muestra las 52 cartas en dos columnas
        for (int i = 0; i < lista.size(); i++) {
            System.out.printf("%-24s%s", lista.get(i),
                    ((i + 1) % 4 == 0) ? "\n" : "");
        }
    }


    public static void main(String[] args) {
        MazoDeCartas cartas = new MazoDeCartas();
        cartas.imprimirCartas();
    }
}

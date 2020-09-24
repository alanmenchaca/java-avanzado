package entradadatos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EntradaDatos {

    public static void main(String[] args) {

        String captura;
        BufferedReader bufferedInput = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Introduce un dato: ");
            // Indicamos al objeto tipo bufferedInput que lea una línea.
            // para ello utilizamos el método readLine()
            captura = bufferedInput.readLine();

            // Mientras ingresemos un valor el ciclo de ejecutará de manera infinita.
            while (captura != null) {
                System.out.println("Dato introducido: " + captura);
                captura = bufferedInput.readLine();
            }
        } catch (IOException e) { // Input / Output - Exception
        }
    }

}

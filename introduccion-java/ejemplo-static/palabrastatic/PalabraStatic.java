package palabrastatic;

public class PalabraStatic {

    static int numero = 23;
    int numero2 = 24;

//    Los métodos static se relacionan con una clase como un todo, mientras que los
//    métodos de instancia se asocian con una instancia específica (objeto) de la clase
//    y pueden manipular las variables de instancia de ese objeto.
    public static void main(String[] args) {

        /* Para acceder a las variables de instancia y a los métodos de instancia de
        la clase, un método static debe usar una referencia a un objeto de la clase. */
        PalabraStatic test = new PalabraStatic();
        test.numero2 = 94;

        /* Un método static puede llamar directamente a otros métodos static de
        la mmisma clase (es decir, mediante el nombre del método por sí solo) y puede 
        manipular variables estatic dentro de la misma clase. */
        saludar();
        numero = 17;
    }

    public static void saludar() {
//      Java no permite que un método static acceda de manera directa a las variables
//      de instancia y los métodos de instancia de la misma clase.
        System.out.println("Hola Mundo!!");
    }

//    Los métodos de instancia pueden acceder a todos los campos (variables static y
//    variables de instancia) y métodos de la clase.
    public void ejemplo() {
        System.out.println("HELLO WORLD!!");
    }
}

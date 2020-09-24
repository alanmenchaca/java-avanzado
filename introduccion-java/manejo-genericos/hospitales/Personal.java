package hospitales;

// Al declararse un método abstracto, es necesario declarar la clase como abstracta
// utilizando la palabra reservada abstract en el nombre de la clase (si no colocas
// esta palabra en el nombre de la clase ocurre un error de compilacion).
public abstract class Personal {

    /* El modificador de acceso privado se especifica con la palabra 
    clave private. Los métodos o los miembros de datos declarados como privados
    solo son accesibles dentro de la clase en la que se declaran. */
    private String nombre;
    private String apellido;
    private int edad;
    private double sueldo;

    public Personal(String nombre, String apellido, int edad, double sueldo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.sueldo = sueldo;
    }

    /* Un método abstracto es un método declarado pero no implementado, es
    decir , es un método del que solo se escribe su nombre , parámetros
    y tipo devuelto pero no su código. */
    public abstract void sueldo();
    // Los métodos abstractos se escriben sin llaves {} y con ; al final de la declaración.
}

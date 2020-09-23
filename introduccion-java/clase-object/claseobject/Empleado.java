package claseobject;

public class Empleado {

    private String nombre;
    private float sueldo;

    public Empleado(String nombre, float sueldo) {
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    /* El método toString() nos permite mostar una representación en texto de nuestras clases.
    Si no sobreescribimos el método toString() de nuestra clase lo que se mostrara en la
    consola será la referencia en memoria donde se ubica el objeto actual (el cual se
    compone por el nombre de la clase, seguido de la dirección hexadecimal donde se 
    encuentra en memoria el objeto). */
    @Override
    public String toString() {
        return "Nombre: " + nombre
                + "\nSueldo: " + sueldo;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            /* Si el objeto recibido es nulo, indicamos que el objeto recibido no es igual a 
            nuestro objeto actual (si el objeto no es nulo, se sigue con la comparación de
            cada uno de nuestros atributos). */
            return false;
        }
        /* Con el operador instanceof preguntamos si el variable de la clase Object
        tiene una referencia asignada de la clase Empleado (preguntamos si la variable
        recibida es del tipo Empleado).*/
        if (obj instanceof Empleado) {
            // Realizamos un Downcasting para utilizar los métodos de la clase Empleado.
            Empleado emp = (Empleado) obj;
            /* Comparamos los atributos de nuestro objeto acutal con los atributos de 
            recibidos de la clase Empleado. */
            if (nombre.equals(emp.nombre) && Float.valueOf(sueldo).equals(emp.sueldo)) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    /* Al sobreescribir el método equals() también deberíamos agregar la sobreescritura del
    método hashCode(), esto para garantizar que al compara objetos del mismo tipo podamos
    saber a ciencia cierta si son iguales o no. */
    @Override
    public int hashCode() {
        // Generamos un valor entero unico apoyandonos de los atributos de esta clase.
        int hash = 7;
        hash = 31 * hash + this.nombre.hashCode();
        hash = 31 * hash + Double.valueOf(this.sueldo).hashCode();
        return hash;
    }
    
    /* El método equals y hashCode se utilizan para saber si dos objetos son iguales (si
    no sobreescribimos el método equals() heredado de la clase Object, comparará la
    ubicación de memoria de los objetos, en lugar de comparar el contenido de los objetos,
    es decir, cada uno de sus atributos). */
}

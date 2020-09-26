package ventas;

import com.gm.ventas.Orden;
import com.gm.ventas.Producto;

public class Ventas {

    public static void main(String[] args) {
        // Creamos varios objetos del tipo producto.
        Producto p1 = new Producto("Camisa", 50);
        Producto p2 = new Producto("Pantalon", 100);
        Producto p3 = new Producto("Zapatos", 200);

        // Creamos un objeto de tipo orden.
        Orden o1 = new Orden();
        Orden o2 = new Orden();

        // Agregamos los productos a la orden.
        o1.agregarProductos(p1);
        o1.agregarProductos(p2);
        o2.agregarProductos(p3);

        o1.mostrarOrden();
        o2.mostrarOrden();
    }
}

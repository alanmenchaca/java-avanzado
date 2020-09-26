package com.gm.ventas;

public class Orden {

    private static final int MAX_PRODUCTOS = 10;
    private static int contadorOrdenes;
    private int idOrden;
    private Producto[] productos;
    // Contabilizar cuantos productos se han agregado al arreglo.
    private int contadorProductos;

    public Orden() {
        this.idOrden = ++contadorOrdenes;
        productos = new Producto[MAX_PRODUCTOS];
    }

    public void agregarProductos(Producto producto) {
        // Si los productos agregados no superan el maximo de productos,
        // Agregamos el nuevo producto al arreglo.
        if (contadorProductos < MAX_PRODUCTOS) {
            /* Agregamos el nuevo producto al arreglo, e icrementamos el contador
            de productos */
            productos[contadorProductos++] = producto;
        } else {
            System.out.println("Se ha superado el maximo de productos: " + MAX_PRODUCTOS);
        }
    }

    public double calcularToral() {
        double total = 0;
        for (int i = 0; i < contadorProductos; i++) {
            total += productos[i].getPrecio();
        }
        return total;
    }

    public void mostrarOrden() {
        System.out.println("Orden: " + idOrden);
        System.out.println("Total de la orden $" + calcularToral());
        System.out.println("Productos en la orden:");
        for (int i = 0; i < contadorProductos; i++) {
            System.out.println(productos[i]);
        }
    }
}

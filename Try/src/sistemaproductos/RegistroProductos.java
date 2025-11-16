package sistemaproductos;

import java.util.ArrayList;

public class RegistroProductos {
    private ArrayList<Producto> lista = new ArrayList<>();

    // Registrar producto
    public void registrarProducto(Producto producto) {
        lista.add(producto);
    }

    // Mostrar lista de productos
    public void mostrarProductos() {
        if (lista.isEmpty()) {
            System.out.println(" No hay productos registrados.");
        } else {
            System.out.println("\nLISTA DE PRODUCTOS REGISTRADOS ");
            for (Producto p : lista) {
                System.out.println(p);
            }
        }
    }

    public boolean listaVacia() {
        return lista.isEmpty();
    }
}

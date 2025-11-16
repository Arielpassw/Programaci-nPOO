import java.util.ArrayList;

public class RegistroProductos {
    private ArrayList<Producto> lista = new ArrayList<>();

    public void agregarProducto(Producto producto) {
        lista.add(producto);
    }

    public void mostrarLista() throws DatosInvalidosException {
        if (lista.isEmpty()) {
            throw new DatosInvalidosException("La lista está vacía. No hay productos registrados.");
        }

        System.out.println("\nLISTA DE PRODUCTOS ");
        for (Producto p : lista) {
            System.out.println(p);
        }
    }

    public void calcularPromedio() throws DatosInvalidosException {
        if (lista.isEmpty()) {
            throw new DatosInvalidosException("No se puede calcular el promedio: la lista está vacía.");
        }

        double suma = 0;
        for (Producto p : lista) {
            suma += p.calcularPrecioFinal();
        }

        double promedio = suma / lista.size();
        System.out.println(" Promedio de precios finales: $" + promedio);
    }
}

package sistemaproductos;

public class Producto {
    private String nombre;
    private double precio;

    // Constructor con validaciones
    public Producto(String nombre, double precio) {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede estar vacío.");
        }
        if (precio < 0) {
            throw new IllegalArgumentException(" El precio no puede ser negativo.");
        }

        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + " | Precio: $" + precio;
    }
}

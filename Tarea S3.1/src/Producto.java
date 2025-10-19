//1. Cambia los atributos a privados.
//2. Corrige los nombres de los métodos a getNombre() y setPrecio(double).
//3. Valida que el precio sea mayor a 0.
//4. Crea un método que muestre toda la información del producto.

public class Producto {
    private double precio;
    private String name;

    //Setter para 'precio'
    public void setPrecio(double precio) {
        if (precio < 0) {
            System.out.println("Precio debe ser mayor que cero");
        } else {
            this.precio = precio;
        }
    }

    //Setter para 'name'
    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            System.out.println("El campo nombre no puede estar vació");
        } else {
            this.name = name;
        }
    }

    //Getters
    public double getPrecio() {
        return precio;
    }

    public String getNombre() {
        return name;
    }


    //Metodo para mostrar información
    void mostrarInformacion() {
        System.out.println("Precio: " + precio);
        System.out.println("Nombre: " + name);
    }

}
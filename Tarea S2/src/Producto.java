public class Producto {
    String nombre;
    Double precio;
    int stock;

    public Producto(String nombre, Double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public Producto(boolean fijo) {
        this.nombre = "iPhone 13 ";
        this.precio = (double)385.0F;
        this.stock = 25;
    }

    public Producto() {
    }

    void mostrarInformacion() {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Precio: " + this.precio);
        System.out.println("Stock: " + this.stock);
    }

    public static void main(String[] args) {
        Producto objeto1 = new Producto("Laptos", 560.99, 50);
        objeto1.mostrarInformacion();
        System.out.println("---------------------------");
        Producto objeto2 = new Producto(true);
        objeto2.mostrarInformacion();
        System.out.println("---------------------------");
        Producto p1 = new Producto();
        p1.nombre = "Lapicero";
        p1.precio = (double)1.5F;
        p1.stock = 20;
        p1.mostrarInformacion();
    }
}

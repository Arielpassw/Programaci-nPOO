
//5. En el main, crea un objeto Producto y prueba con precios válidos e inválidos.

public class mainProducto {
    public static void main(String[] args) {

        //Creación del objeto Producto

        Producto p1 = new Producto();
        System.out.println("PRECIOS INVALIDOS");
        p1.setPrecio(-2.4);
        p1.setName("");

        System.out.println("------------------------");

        System.out.println("PRECIOS VALIDOS ");
        p1.setPrecio(25.5);
        p1.setName("Äriel");

        //Mostrar Precios
        System.out.println("-------------------------");
        p1.mostrarInformacion();


    }
}

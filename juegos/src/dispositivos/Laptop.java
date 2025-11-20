package dispositivos;

public class Laptop extends Dispositivo {

    private int memoriaRam;

    public Laptop(String marca, String modelo, double precio, int memoriaRam)
            throws DatoInvalidoException {
        super(marca, modelo, precio);
        this.memoriaRam = memoriaRam;
    }

    @Override
    public void mostrarInfo() {
        System.out.println(" Laptop");
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Precio: $" + getPrecio());
        System.out.println("RAM: " + memoriaRam + " GB");
        System.out.println("----------------------------------");
    }
}

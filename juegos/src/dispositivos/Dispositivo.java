package dispositivos;

public class Dispositivo {
    private String marca;
    private String modelo;
    private double precio;

    public Dispositivo(String marca, String modelo, double precio) throws DatoInvalidoException {
        setMarca(marca);
        setModelo(modelo);
        setPrecio(precio);
    }

    // GETTERS Y SETTERS CON VALIDACIONES

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) throws DatoInvalidoException {
        if (marca == null || marca.trim().isEmpty()) {
            throw new DatoInvalidoException("La marca no puede estar vacía.");
        }
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo; // Modelo puede ser vacío o cualquier texto
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) throws DatoInvalidoException {
        if (precio < 0) {
            throw new DatoInvalidoException("El precio no puede ser negativo.");
        }
        this.precio = precio;
    }

    // MÉTODO QUE SERÁ SOBRESCRITO
    public void mostrarInfo() {
        System.out.println("Dispositivo genérico.");
    }
}

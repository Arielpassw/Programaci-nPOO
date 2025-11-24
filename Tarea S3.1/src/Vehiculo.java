public class Vehiculo {

    // Atributos
    public String marca;
    private String modelo;
    private final int velocidadMaxima;
    private String codigoSeguridad;
    private String color;

    // Constructor
    public Vehiculo(String marca, String modelo, int velocidadMaxima) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadMaxima = velocidadMaxima;
    }

    // Getter y Setter para modelo
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        if (modelo != null && !modelo.isBlank()) {
            this.modelo = modelo;
        } else {
            System.out.println("Modelo inválido");
        }
    }

    // Getter solo para velocidadMaxima
    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    // Setter solo para codigoSeguridad
    public void setCodigoSeguridad(String codigo) {
        if (codigo != null && !codigo.isBlank()) {
            this.codigoSeguridad = codigo;
        } else {
            System.out.println("Código de seguridad inválido");
        }
    }

    // Getter y Setter para color con validación
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color.equalsIgnoreCase("rojo") ||
                color.equalsIgnoreCase("azul") ||
                color.equalsIgnoreCase("blanco")) {
            this.color = color.toLowerCase();
        } else {
            System.out.println("Color no permitido: " + color);
        }
    }

    // Método para mostrar datos válidos
    public void mostrarDatos() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Velocidad máxima: " + velocidadMaxima);
        System.out.println("Color: " + color);
    }
}


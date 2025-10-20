package artista;

public class Artista {
    private String nombre;
    private String genero;
    private int seguidores;

    // Constructor vacío
    public Artista() {
    }

    // Constructor con parámetros
    public Artista(String nombre, String genero, int seguidores) {
        this.setNombre(nombre);
        this.setGenero(genero);
        this.setSeguidores(seguidores);
    }

    // Getters
    public String getNombre() { return nombre; }
    public String getGenero() { return genero; }
    public int getSeguidores() { return seguidores; }

    // Setters con validaciones
    public void setNombre(String nombre) {
        if (nombre == null || nombre.isBlank()) {
            System.out.println("Error: El nombre no puede estar vacío.");
        } else {
            this.nombre = nombre;
        }
    }

    public void setGenero(String genero) {
        if (genero == null || genero.isBlank()) {
            System.out.println("Error: El género no puede estar vacío.");
        } else {
            this.genero = genero;
        }
    }

    public void setSeguidores(int seguidores) {
        if (seguidores < 0) {
            System.out.println("Error: Los seguidores no pueden ser negativos.");
        } else {
            this.seguidores = seguidores;
        }
    }

    // Método propio: ganar seguidores
    public void ganarSeguidores(int cantidad) {
        if (cantidad > 0) {
            this.seguidores += cantidad;
            System.out.println(cantidad + " seguidores añadidos. Total: " + this.seguidores);
        } else {
            System.out.println("Error: La cantidad debe ser positiva.");
        }
    }

    // Método propio: mostrar perfil
    public void mostrarPerfil() {
        System.out.println("===== Perfil del Artista =====");
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Género: " + this.genero);
        System.out.println("Seguidores: " + this.seguidores);
        System.out.println("==============================");
    }
}



package cancion;

public class Cancion {
    // Atributos privados
    private String titulo;
    private double duracion; // en minutos
    private int reproducciones;

    // Constructor vacío
    public Cancion() {
    }

    // Constructor con parámetros
    public Cancion(String titulo, double duracion, int reproducciones) {
        this.setTitulo(titulo);
        this.setDuracion(duracion);
        this.setReproducciones(reproducciones);
    }

    // Getters
    public String getTitulo() {
        return titulo;
    }

    public double getDuracion() {
        return duracion;
    }

    public int getReproducciones() {
        return reproducciones;
    }

    // Setters con validaciones
    public void setTitulo(String titulo) {
        if (titulo == null || titulo.isBlank()) {
            System.out.println("Error: El título no puede estar vacío.");
        } else {
            this.titulo = titulo;
        }
    }

    public void setDuracion(double duracion) {
        if (duracion <= 0) {
            System.out.println("Error: La duración debe ser mayor a 0.");
        } else {
            this.duracion = duracion;
        }
    }

    public void setReproducciones(int reproducciones) {
        if (reproducciones < 0) {
            System.out.println("Error: Las reproducciones no pueden ser negativas.");
        } else {
            this.reproducciones = reproducciones;
        }
    }

    // Método propio: reproducir canción
    public void reproducir() {
        this.reproducciones++;
        System.out.println("La canción '" + this.titulo + "' se ha reproducido. Total de reproducciones: " + this.reproducciones);
    }
}


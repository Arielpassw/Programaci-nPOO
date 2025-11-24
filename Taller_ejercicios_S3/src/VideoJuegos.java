public class VideoJuegos {
    private String titulo;
    private String plataforma;
    private double puntuacion;

    // Constructor por defecto
    public VideoJuegos() {
        this.titulo = "";
        this.plataforma = "";
        this.puntuacion = 0.0;
    }

    // Getters y Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public double getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(double puntuacion) {
        if (puntuacion >= 0) {
            this.puntuacion = puntuacion;
        } else {
            System.out.println("Error: la puntuación no puede ser negativa.");
        }
    }

    // Mostrar información
    public void mostrar() {
        System.out.println("Título: " + getTitulo());
        System.out.println("Plataforma: " + getPlataforma());
        System.out.println("Puntuación: " + getPuntuacion());
    }

}

public class Libro {
    String titulo;
    String autor;
    int anioPublicacion;

    public Libro(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
    }

    void mostrarInformacion() {
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("Anio Publicacion: " + this.anioPublicacion);
    }

    public static void main(String[] args) {
        Libro objeto1 = new Libro("100 Años de soledad", "Gabriel García Márquez", 1967);
        objeto1.mostrarInformacion();
        System.out.println("----------------------------");
        Libro objeto2 = new Libro("Huasipungo", "Jorge Icaza", 1934);
        objeto2.mostrarInformacion();
    }
}
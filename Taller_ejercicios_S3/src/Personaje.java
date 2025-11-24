public class Personaje {

    //Atributo
    private String nombrePersonaje;

    public String getNombrePersonaje() {
        return nombrePersonaje;
    }

    public void setNombrePersonaje(String nombrePersonaje) {
        this.nombrePersonaje = nombrePersonaje;
    }

    public void mostrar() {
        System.out.println("Nombre del personaje: " + getNombrePersonaje());
    }
}

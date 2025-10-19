public class Persona {

    //Atributos
    public String nombre;
    public String correo;
    private int edad;
    private  String direccion;

    //Métodos Constructores

    //Con parametros
    public Persona(String nombre, String correo, int edad, String direccion) {
        this.nombre = nombre;
        this.correo = correo;
        this.edad = edad;
        this.direccion = direccion;
    }

    //Vacio
    public Persona() {

    }

    //Metodo Propios

    //Método mostrar información
    void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Correo: " + correo);
        System.out.println("Edad: " + edad);
        System.out.println("Direccion: " + direccion);
    }

    //Método verficar(edad>=18)
    void verificarEdad() {
        if (edad >= 18) {
            System.out.println("Eres mayor de edad");
        }
        else {
            System.out.println("Eres menor de edad");
        }
    }


}

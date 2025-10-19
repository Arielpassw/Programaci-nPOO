import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        //OBJETOS

        //Con parametros
        Persona persona1 = new Persona("Ariel","aa@gmail.com",22,"Conocoto" );
        persona1.mostrarInformacion(); // llamo al metodo
        System.out.println("-----------------------");
        System.out.println("Verificación de edad");
        persona1.verificarEdad();

        //Vacio
        System.out.println("-----------------------");

        //Uso de Scanner
        Scanner entrada = new Scanner(System.in); // Creó el objeto

        System.out.println("Introduce el nombre del persona: ");
        String nombre1 = entrada.nextLine();

        System.out.println("Introduce la edad de la persona: ");
        int edad = entrada.nextInt();
        entrada.nextLine(); // Limpo el buffer

        System.out.println("Introduce el correo de la persona: ");
        String correo1 = entrada.nextLine();

        System.out.println("Introduce la direccion  del la  persona: ");
        String direccion1 = entrada.nextLine();

        Persona persona2 = new Persona(nombre1,correo1,edad,direccion1);
        persona2.mostrarInformacion();
        System.out.println("-----------------------");
        System.out.println("Verificación de edad");
        persona2.verificarEdad();
    }
}

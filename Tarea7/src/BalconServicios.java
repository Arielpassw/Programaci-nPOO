import java.util.Scanner;

public class BalconServicios extends Empleado {

    public BalconServicios(String nombre, String cedula, String direccion, String telefono,
                           String usuario, String clave) {
        super(nombre, cedula, direccion, telefono, usuario, clave);
    }

    @Override
    public void mostrarRol() {
        System.out.println("Rol: Balcón de Servicios");
    }

    public Cliente registrarNuevoCliente() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Cédula: ");
        String cedula = sc.nextLine();

        System.out.print("Dirección: ");
        String direccion = sc.nextLine();

        System.out.print("Teléfono: ");
        String telefono = sc.nextLine();

        return new Cliente(nombre, cedula, direccion, telefono);
    }

    public void actualizarDatosCliente(Cliente cliente) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nueva dirección: ");
        String nuevaDir = sc.nextLine();

        System.out.print("Nuevo teléfono: ");
        String nuevoTel = sc.nextLine();

        cliente.actualizarDatos(nuevaDir, nuevoTel);
    }
}

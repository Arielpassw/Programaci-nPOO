import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double total = 0;
        int opcion = 0;
        Scanner leer = new Scanner(System.in);



        do {
            System.out.println("1. Registar empleado a tiempo completo");
            System.out.println("2. Registar empleado a medio tiempo");
            System.out.println("3. Mostar empleados registrados");
            System.out.println("4. Mostar estadísticas");
            System.out.println("5. Salir");

            System.out.println("Ingrese una opcion: ");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Codigo: ");
                    String codigo = leer.next();
                    System.out.println("Nombre: ");
                    String nombre = leer.next();
                    System.out.println("Cargo: ");
                    String cargo = leer.next();
                    System.out.println("Sueldo Base: ");
                    double sueldoBase = leer.nextDouble();
                    System.out.println("Bono: ");
                    double sueldoBono = leer.nextDouble();
                    System.out.println("Empleado tiempo completo registrado correctamente.");

                    Empleados EmpleadosTP = new EmpleadoTiempoCompleto("Ariel","Arias","Profesor",800.0,"Completo","Conocoto",800.00,30);
                    break;
                case 2:
                    System.out.println("Codigo: ");
                    String codigo2 = leer.next();
                    System.out.println("Nombre: ");
                    String nombre2 = leer.next();
                    System.out.println("Cargo: ");
                    String cargo2 = leer.next();
                    System.out.println("Horas trabajadas: ");
                    double horasTrabajadas = leer.nextDouble();
                    System.out.println("Pago por horas: ");
                    double pagoPorHora = leer.nextDouble();
                    System.out.println("Empleado a medio tiempo completo correctamente.");
                    System.out.println();
                    break;
                    case 3:
                        System.out.println("-- Listado de empleados -- ");
                        System.out.println(" ");
                        break;
                        case 4:
                            System.out.println("--ESTADÍSTICAS-- ");
                            System.out.println("El empleado con mayor sueldo es: "  );System.out.println("El promedio Salarial entre todos los empleados es: ");
                            System.out.println(" ");
                            break;
                            case 5:
                                System.out.println("Saliendo..");
            }
        } while (opcion != 5);
    }
}
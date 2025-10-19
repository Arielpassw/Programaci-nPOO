//Escenario:
//Estás creando un programa que guarda información de empleados.
// Cada empleado tiene un nombre, una edad y una profesión.
// No se deben guardar edades negativas ni dejar el nombre vacío.

//Lo que tienes que hacer:
//1. Crea una clase llamada Persona.
//2. Declara los atributos nombre, edad y profesion como privados.
//3. Crea los métodos setNombre(String), setEdad(int), setProfesion(String) y sus respectivos get.
//   - setNombre debe verificar que el nombre no esté vacío.
//   - setEdad solo acepta valores mayores que 0.
//4. En el main, crea un objeto Persona, prueba asignando valores correctos e incorrectos.
//5. Muestra los resultados con System.out.println.

public class Persona  {

    //Atributos
    private String nombre;
    private int edad;
    private String profesion;

    //Setter para 'nombre'
    public void  setNombre(String nombre) {
        if(nombre == null || nombre.isEmpty()) {
            System.out.println("El campo nombre no puede estar vació");
        }
        else {
            this.nombre = nombre;
        }

    }

    //Setter para 'edad'
    public void setEdad(int edad) {
        if(edad<0){
            System.out.println("La edad debe ser mayor a 0.");
        }
        else {
            this.edad = edad;
        }
    }

    //Metodo set() para 'Profesión'
    public void setProfesion(String profesion) {
        if(profesion == null || profesion.isEmpty()){
            System.out.println("El campo profesion no puede estar vació");
        }
        else {
            this.profesion = profesion;
        }
    }

    //Getters
    public String getNombre() {
        return nombre;
    }

    public int getEdad(){
        return edad;
    }

    public String getProfesion(){
        return profesion;
    }

}

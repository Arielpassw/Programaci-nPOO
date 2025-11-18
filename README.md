
# Ejercicio #2 — Sistema de Registro de Olimpiadas  
**Programación Orientada a Objetos – Java**

## Enunciado General

Desarrolle un programa en Java que permita registrar información básica sobre unas Olimpiadas, sus eventos y los participantes.  
El objetivo es aplicar conceptos fundamentales de la Programación Orientada a Objetos, tales como:

- Clases abstractas  
- Herencia  
- Polimorfismo  
- Manejo de listas (ArrayList)  
- Excepciones personalizadas  

---

## Objetivo General

Modelar un sistema UML de gestión de Olimpiadas, permitiendo registrar participantes, eventos y la información principal de la olimpiada, utilizando herencia y polimorfismo para distinguir entre los tipos de participantes.

---

## Requerimientos Generales

1. Crear una clase abstracta **Participante** con atributos base y un método abstracto.

<img width="1153" height="689" alt="image" src="https://github.com/user-attachments/assets/b77581b7-8c5c-482d-bf19-83fcbc142f9d" />



2. Crear clases hijas **Atleta** y **Equipo**, ambas heredando de Participante.

**Atleta** 

<img width="980" height="594" alt="image" src="https://github.com/user-attachments/assets/263f12aa-a91a-4d17-b23b-6e30e897a9e7" />

**Equipo**

<img width="1079" height="578" alt="image" src="https://github.com/user-attachments/assets/1bdaa996-d133-4790-893f-b5c8abf927d0" />


3. Implementar la clase **Evento** para registrar participantes.

<img width="1172" height="853" alt="image" src="https://github.com/user-attachments/assets/3221a742-ae5b-464b-9922-f2c18adab054" />


4. Implementar la clase **Olimpiada** para almacenar información general y la lista de eventos.

<img width="684" height="859" alt="image" src="https://github.com/user-attachments/assets/de20ab50-66a5-4b13-9619-ca1d90c5f8e6" />


5. Aplicar polimorfismo mostrando el tipo de participante mediante sobrescritura de métodos.

<img width="577" height="44" alt="image" src="https://github.com/user-attachments/assets/47310e73-821f-4823-bfc0-cef4ba0070d3" />


6. Utilizar **excepciones personalizadas** para validar datos insuficientes o incorrectos.

<img width="775" height="186" alt="image" src="https://github.com/user-attachments/assets/048a1d99-f72f-4b8e-b24f-50ef234dc174" />


7. Gestionar toda la información usando listas dinámicas (**ArrayList**).

**Clase Eventos**

Se almacena la lista de participantes

<img width="488" height="41" alt="image" src="https://github.com/user-attachments/assets/56b6ee95-e012-475e-8d6c-c70982dfcf63" />

Se inicializa en el constructor

<img width="421" height="51" alt="image" src="https://github.com/user-attachments/assets/9ec09061-8529-4641-8806-75a6c44915be" />

**Clase Olimpiada**

Se almacena la lista de eventos

<img width="356" height="37" alt="image" src="https://github.com/user-attachments/assets/463a06e4-018d-41fd-a79a-ae815c10d026" />

Se inicializa

<img width="413" height="55" alt="image" src="https://github.com/user-attachments/assets/56afd0e6-a43c-4ada-ba54-d5aa96745c8f" />

**Clase Main**

Cuando seleccionas opciones del menú, usas esos ArrayList para:

Registrar eventos

Buscar eventos por nombre

Registrar participantes

Listar participantes

Validar si el evento existe


<img width="641" height="147" alt="image" src="https://github.com/user-attachments/assets/ec05871d-eb63-4738-b1a8-2875589d32d6" />

8. Crear un **menú principal** que permita:
   - Registrar eventos  
   - Registrar participantes  
   - Consultar eventos  
   - Consultar participantes por evento
   - 

   <img width="676" height="288" alt="image" src="https://github.com/user-attachments/assets/2cda81ef-41ef-4943-9015-cb4762b76cdf" />


---

##  Requerimientos del Diagrama UML

El diagrama debe incluir:

- Una clase abstracta **Participante**
- Las clases hijas **Atleta** y **Equipo**
- La clase **Evento**, que contiene una lista de Participante
- La clase **Olimpiada**, que contiene una lista de Evento
- Relaciones de herencia y composición entre clases



  <img width="703" height="626" alt="image" src="https://github.com/user-attachments/assets/a09a6f89-fdb8-41d3-aae0-174048f35baa" /> <img width="395" height="408" alt="image" src="https://github.com/user-attachments/assets/4d009925-d08e-4429-8dbb-e71d3a8b52fa" />



---



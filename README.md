# Sistema de Elección de la Reina de Quito  
### Proyecto Académico – Programación Orientada a Objetos en Java  

---

##  Descripción General

El sistema **Elección de la Reina de Quito** es una aplicación de consola desarrollada en **Java**, cuyo propósito es gestionar candidatas, simular votaciones y determinar una ganadora aplicando criterios de desempate.

Este proyecto aplica los principales conceptos de **POO**, tales como:

- Herencia  
- Polimorfismo  
- Clases abstractas  
- Sobrescritura de métodos  
- Excepciones personalizadas  
- Colecciones dinámicas (ArrayList, HashMap)  
- Encapsulamiento  
- Menú interactivo en consola  

El sistema simula de manera completa el proceso de registro, votación y selección de la Reina de Quito.

---

## Arquitectura del Proyecto

### 🔹 1. **Candidata (Clase Abstracta)**
Contiene:
- id  
- nombre  
- edad  
- distrito  
- puntaje del jurado  

Define el método abstracto `mostrarDetalles()`.

<img width="1050" height="806" alt="image" src="https://github.com/user-attachments/assets/8741db55-fdb6-49e0-bad7-b83a1d1cc552" />


<img width="898" height="734" alt="image" src="https://github.com/user-attachments/assets/8ca647cf-bd85-4b64-9051-6272a79b134d" />

<img width="499" height="52" alt="image" src="https://github.com/user-attachments/assets/552b2d4a-d875-4d9e-8d5b-6c6717e86321" />



### 🔹 2. **CandidataEstudiante**
Atributos adicionales:
- universidad  
- carrera  

Sobrescribe `mostrarDetalles()`.

<img width="952" height="644" alt="image" src="https://github.com/user-attachments/assets/803d9de8-81c9-488a-8d14-917c76c5e51d" />

<img width="1045" height="454" alt="image" src="https://github.com/user-attachments/assets/cc4f2afb-2d1f-4815-ac7b-4766bde7d0fc" />


### 🔹 3. **CandidataProfesional**
Atributos adicionales:
- profesión  
- años de experiencia  

Sobrescribe `mostrarDetalles()`.

<img width="987" height="802" alt="image" src="https://github.com/user-attachments/assets/1fad922d-4bf8-41a0-8cc1-54e9b3645817" />

<img width="956" height="210" alt="image" src="https://github.com/user-attachments/assets/a5999027-6370-40b3-a9b4-40e76ee9a958" />


### 🔹 4. **SistemaCandidatas**
Gestiona:
- Registrar
- Listar
- Buscar (nombre / ID)
- Filtrar (tipo / distrito)
- Eliminar y editar
- Registrar votos
- Simular votos automáticamente
- Determinar ganadora y manejar empates

Usa:
- `ArrayList<Candidata>`
- `HashMap<Integer, Integer>` para conteo de votos

<img width="718" height="658" alt="image" src="https://github.com/user-attachments/assets/7e454ec8-4091-4107-9b34-ba9098f88e4a" />

<img width="902" height="657" alt="image" src="https://github.com/user-attachments/assets/8d6b1a1f-62a5-4170-ad1c-fe806afa56cb" />

<img width="778" height="769" alt="image" src="https://github.com/user-attachments/assets/d1bb6491-a20f-4e32-8257-ec5c1f59ac7b" />

<img width="734" height="313" alt="image" src="https://github.com/user-attachments/assets/5d0db924-9486-469e-91fa-50df58ce9a57" />

<img width="787" height="442" alt="image" src="https://github.com/user-attachments/assets/9d7e1a35-3a14-4bd0-9671-de483721e1a0" />

<img width="814" height="457" alt="image" src="https://github.com/user-attachments/assets/33fd4050-830a-49f7-9df8-c8567b9632fd" />

<img width="698" height="667" alt="image" src="https://github.com/user-attachments/assets/163557c3-507b-4ad3-bb5b-74bd3524ab15" />

<img width="880" height="487" alt="image" src="https://github.com/user-attachments/assets/aa598d09-377b-4b8e-abf0-8827a6e1ad8b" />

<img width="848" height="382" alt="image" src="https://github.com/user-attachments/assets/9a3fe528-5b25-4a48-9684-ad8d59ac37df" />

<img width="712" height="473" alt="image" src="https://github.com/user-attachments/assets/7efb932a-44f9-41a1-88c9-b4dfadabf0ea" />


### 🔹 5. **DatosInvalidoException**
Excepción personalizada para validar datos ingresados.

<img width="726" height="158" alt="image" src="https://github.com/user-attachments/assets/4904e590-b335-4a1f-bd34-c54c190186ac" />


### 🔹 6. **Main**
Interfaz de consola mediante un menú interactivo.

<img width="755" height="679" alt="image" src="https://github.com/user-attachments/assets/d6bdd70b-35d3-4d84-ac97-911d374e98d5" />

<img width="685" height="657" alt="image" src="https://github.com/user-attachments/assets/b1eea117-e9e5-4102-84c5-b6b2868c65ea" />

<img width="755" height="789" alt="image" src="https://github.com/user-attachments/assets/a271290c-83a5-40be-9110-75e10fb12c4c" />

<img width="944" height="255" alt="image" src="https://github.com/user-attachments/assets/803a42b0-d86b-4416-bf97-87f6d2078b6c" />

<img width="695" height="521" alt="image" src="https://github.com/user-attachments/assets/962a72a4-84db-468e-8d84-98ed3dbe2e03" />

<img width="815" height="589" alt="image" src="https://github.com/user-attachments/assets/69479f21-a63b-4d78-951e-2884a02187e4" />

<img width="537" height="499" alt="image" src="https://github.com/user-attachments/assets/0cdf56f4-cac5-49e7-8934-e2bb525f109f" />

<img width="698" height="402" alt="image" src="https://github.com/user-attachments/assets/2df575d3-3348-40c3-86bd-9010e25122d4" />

---

---

# TechESFOT

<img width="827" height="521" alt="image" src="https://github.com/user-attachments/assets/10d8edcd-736b-46ae-b87c-03f0fa827f8a" />

<img width="876" height="623" alt="image" src="https://github.com/user-attachments/assets/3638e12e-13d9-45c2-91aa-01348ab9a2ce" />

<img width="771" height="229" alt="image" src="https://github.com/user-attachments/assets/b51ce397-e993-4cb8-9480-67512a173005" />

<img width="831" height="449" alt="image" src="https://github.com/user-attachments/assets/7fb405b2-920b-45c8-97ae-7c41bf9db300" />

<img width="738" height="416" alt="image" src="https://github.com/user-attachments/assets/5a6ac8b1-3118-4989-bc5a-f4344051439c" />

<img width="791" height="276" alt="image" src="https://github.com/user-attachments/assets/4f249101-869f-4fb6-987a-b955a74b3aee" />

<img width="646" height="395" alt="image" src="https://github.com/user-attachments/assets/90aea51f-ef10-455f-bde8-55c14b0d63e8" />

<img width="765" height="352" alt="image" src="https://github.com/user-attachments/assets/34fef303-9e10-4410-8127-6e33660a6486" />

<img width="820" height="577" alt="image" src="https://github.com/user-attachments/assets/1e9c3b1b-7497-46d4-bd34-453de1070637" />

<img width="817" height="498" alt="image" src="https://github.com/user-attachments/assets/b087c8e8-8ed6-4353-add7-b5da518e8ea4" />

<img width="766" height="437" alt="image" src="https://github.com/user-attachments/assets/96e2b0c9-c1ef-4ab5-9314-b60019d2f288" />

<img width="800" height="414" alt="image" src="https://github.com/user-attachments/assets/f9f8cea6-c00d-402d-ba4a-9f6afab1061d" />

<img width="814" height="281" alt="image" src="https://github.com/user-attachments/assets/9623d75f-01bf-4f38-af8d-100243d4d766" />

<img width="656" height="616" alt="image" src="https://github.com/user-attachments/assets/1a98b9b3-4437-4be8-8b63-6e9fde100e16" />

<img width="812" height="258" alt="image" src="https://github.com/user-attachments/assets/dd826d7b-c07b-4c5f-bf8c-daa25783726d" />

<img width="792" height="635" alt="image" src="https://github.com/user-attachments/assets/3ab39c3a-3f2c-49d2-a7db-a1e22a8eb33c" />

<img width="823" height="404" alt="image" src="https://github.com/user-attachments/assets/7880cd34-124b-47e3-a7ed-59fb9285679a" />



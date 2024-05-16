//utilizando los conceptos de clases y objetos 
//genere un programa donde se ingrese y almacene 
//por teclado la informacion de varios alumnos:
// - Nombre, Edad, Grado.
// luego haga el llamado de los datos a traves de objetos

public class MiClase {

  String nombre, grado;
  int edad;

  public MiClase(String nombre, String grado, int edad){
    this.nombre = nombre;
    this.grado = grado;
    this.edad = edad;
  }

  public String mostrarDatos(){
    return "\nNombre: "+nombre+"\nGrado: "+grado+"\nEdad:"+edad;
  }

  public static void main(String[] args) {
    MiClase alumno1 = new MiClase("Juan","5to",11);
    MiClase alumno2 = new MiClase("Rodrigo","6to",12);
    MiClase alumno3 = new MiClase("Ana","4to",10);

    System.out.println(alumno1.mostrarDatos());
    System.out.println(alumno2.mostrarDatos());
    System.out.println(alumno3.mostrarDatos());
    
  }
}

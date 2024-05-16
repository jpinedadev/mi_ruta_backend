public class Empleado {
  String nombre, apellido;
  int codigoEmpleado;

  public Empleado(){ //sin parametros 
    this.nombre = "No informado";
    this.apellido = "No informado";
    this.codigoEmpleado = 0;
  }

  public Empleado(String nombre){ //con parametros 
    this();
    this.nombre = nombre;
  }

  public Empleado(String nombre, String apellido, int codigoEmpleado){
    this.nombre = nombre;
    this.apellido = apellido;
    this.codigoEmpleado = codigoEmpleado;
  }

  public String toString(){//metodo del objeto string 
    return "Empleado = "+this.nombre+" "+this.apellido+" Codigo: "+this.codigoEmpleado;
  }

  public static void main(String[] args){
    Empleado empleado1 = new Empleado();
    Empleado empleado2 = new Empleado("Maria");
    Empleado empleado3 = new Empleado("Juan","Perez",2335);

    System.out.println(empleado1.toString());
    System.out.println(empleado2.toString());
    System.out.println(empleado3.toString());
  }
}

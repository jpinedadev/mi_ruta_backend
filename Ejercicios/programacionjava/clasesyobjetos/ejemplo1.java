//clases y objetos 

import java.util.Scanner;

public class ejemplo1 {

  private Scanner teclado;
  private String nombre;
  private String apellido;
  private String codigo;
  private int hsTrab;

  public void inicializar() {
    teclado = new Scanner(System.in);
    System.out.println("Ingrese el nombre: ");
    nombre = teclado.next();
    System.out.println("Ingrese el apellido: ");
    apellido = teclado.next();
    System.out.println("Ingrese el codigo");
    codigo = teclado.next();
    System.out.println("Ingrese las horas: ");
    hsTrab = teclado.nextInt();
  }

  public void imprimir(){
    System.out.println("Nombre: "+nombre);
    System.out.println("Apellido: "+apellido);
    System.out.println("Codigo: "+codigo);
    System.out.println("Horas trabajadas: "+hsTrab);
  }

  public void horasExtras() {
    if (hsTrab>8) {
      System.out.println(nombre+" "+apellido+" trabajó extras");
    }else{
      System.out.println(nombre+" "+apellido+" horas normales");
    }
  }

  public static void main(String[] args) {
    ejemplo1 empleado1;//declaracion del objeto 
    empleado1 = new ejemplo1(); // creacion del objeto 
    empleado1.inicializar(); // llamada a un metodo 
    empleado1.imprimir();
    empleado1.horasExtras();
  }
}

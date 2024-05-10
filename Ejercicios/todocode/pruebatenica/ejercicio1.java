// suponer un sistema de reserva de asientos para un anfiteatro.
// El teatro cuenta con 10 filas y 10 asientos cada una.
// se necesita desarrollar un sistema que permita llevar la reserva.

import java.util.Scanner;

public class ejercicio1 {
  public static void main(String[] args) {
    String[][] arrayAsientos = new String[10][10];
    int fila,columna;
    String opc, verAsientos;

    Scanner teclado = new Scanner(System.in);

    //llenando asientos libres 
    for (int f = 0; f < 10; f++) {
      for (int c = 0; c < 10; c++) {
        arrayAsientos[f][c] = "[L]";
      }
    }

    System.out.println("---Bienvenido al sistema de reservas---");

    System.out.println("--------------------------");
    System.out.print("¿Nueva reserva? S/N: ");
    opc = teclado.next();
    System.out.println("--------------------------");

    while (!opc.equalsIgnoreCase("n")) {

     System.out.print("¿Desea ver los asientos? S/N: ");
     verAsientos = teclado.next();
     if (verAsientos.equalsIgnoreCase("S")) {
      //mostrando asientos 
      for (int f = 0; f < 10; f++) {
        System.out.println("");
        for (int c = 0; c < 10; c++) {
          System.out.print(arrayAsientos[f][c]);
        }
      }     
     }
     
     //reservando asiento 
     System.out.print("\nIngrese la fila: ");
     fila = teclado.nextInt();
     System.out.print("Ingrese la columna: ");
     columna = teclado.nextInt();

     if ((fila>10 || columna>10)||(fila<1 | columna<1)) {
      System.out.println("**No existe el asiento**");
      fila =0;
      columna=0;
     }else{
      //comprobando si está libre 
      if (arrayAsientos[fila-1][columna-1].equals("[L]")) {
       arrayAsientos[fila-1][columna-1] = "[X]";
       System.out.println("**¡Reserva realizada con exito!**");
      }else{
        System.out.println("**Asiento no disponible**");
      }
     }

     System.out.println("--------------------------");
     System.out.print("¿Nueva reserva? S/N: ");
     opc = teclado.next();
     System.out.println("--------------------------");
    }

    System.out.println("Gracias por usar el sistema...");

  }
}

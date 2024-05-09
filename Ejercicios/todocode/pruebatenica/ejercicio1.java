// suponer un sistema de reserva de asientos para un anfiteatro.
// El teatro cuenta con 10 filas y 10 asientos cada una.
// se necesita desarrollar un sistema que permita llevar la reserva.

import java.util.Scanner;

public class ejercicio1 {
  public static void main(String[] args) {
    String[][] arrayAsientos = new String[10][10];
    int fila,columna;

    //llenando asientos libres 
    for (int f = 0; f < 10; f++) {
      for (int c = 0; c < 10; c++) {
        arrayAsientos[f][c] = "[L]";
      }
    }

    //mostrando asientos 
    for (int f = 0; f < 10; f++) {
      System.out.println("");
      for (int c = 0; c < 10; c++) {
        System.out.print(arrayAsientos[f][c]);
      }
    }

    //reservando asiento 
    Scanner teclado = new Scanner(System.in);
    System.out.print("\ningrese la fila: ");
    fila = teclado.nextInt();
    System.out.print("ingrese la columna: ");
    columna = teclado.nextInt();

    arrayAsientos[fila-1][columna-1] = "[X]";

    //mostrando asientos 
    for (int f = 0; f < 10; f++) {
      System.out.println("");
      for (int c = 0; c < 10; c++) {
        System.out.print(arrayAsientos[f][c]);
      }
    }

  }
}

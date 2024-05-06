// Construye un algoritmo que, dados el nombre del grupo y el número de
// alumnos preinscritos, exprese el nombre del grupo, el número de alumnos
// inscritos y si el grupo será abierto o cerrado, puesto que, para abrir un gru-
// po, se necesitan mínimo 30 alumnos.

import java.util.Scanner;

public class ejercicio6 {
  public static void main(String[] args) {
    String nombre;
    int alumnos;

    Scanner teclado = new Scanner(System.in);
    System.out.println("Ingrese el nombre del grupo");
    nombre = teclado.nextLine();
    System.out.println("Ingrese la cantidad de alumnos:");
    alumnos = teclado.nextInt();

    System.out.println("El grupo "+nombre+" tiene "+alumnos+" integrantes");
    if (alumnos>=30) {
      System.out.println("grupo abierto");
    }else{
      System.out.println("grupo cerrado");
    }
  }
}

// Construya un algoritmo dado como dato la calificación de un alumno en un
// examen, escriba “APROBADO” si su calificación es mayor o igual que 8 y
// “REPROBADO” en caso contrario.

import java.util.Scanner;

public class ejercicio3 {
  public static void main(String[] args) {
    double nota;
    Scanner teclado = new Scanner(System.in);

    System.out.println("Ingrese la nota del alumno:");
    nota = teclado.nextDouble();

    if (nota>=8) {
      System.out.println("Aprobado");
    }else{
      System.out.println("Reprobado");
    }
  }
}

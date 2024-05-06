// Construye un algoritmo dado como datos la matrícula y 5 calificaciones de
// un alumno; imprima la matrícula, el promedio y la palabra “Aprobado” si
// el alumno tiene un promedio mayor o igual que 6, y la palabra “No aproba-
// do”, en caso contrario.

import java.util.Scanner;

public class ejercicio5 {
  public static void main(String[] args) {
    double n1, n2, n3, n4, n5, promedio;

    Scanner teclado = new Scanner(System.in);

    System.out.print("Ingrese la nota 1: ");
    n1 = teclado.nextDouble();
    System.out.print("Ingrese la nota 2: ");
    n2 = teclado.nextDouble();
    System.out.print("Ingrese la nota 3: ");
    n3 = teclado.nextDouble();
    System.out.print("Ingrese la nota 4: ");
    n4 = teclado.nextDouble();
    System.out.print("Ingrese la nota 5: ");
    n5 = teclado.nextDouble();

    promedio = (n1+n2+n3+n4+n5)/5;
    System.out.println("El promedio es: "+promedio);

    if (promedio>=6) {
      System.out.println("Aprobado");
    }else{
      System.out.println("no Aprobado");
    }
  }
}

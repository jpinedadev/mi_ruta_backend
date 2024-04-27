//dadas tres notas, detemrinar si un alumno aprueba o no una materia: considerar que, para aprobar, el promedio debe ser igual o mayor que 7

import java.util.Scanner;

public class notas {
  public static void main(String[] args) {
    //leer datos 
    System.out.println("--Promedios--");
    Scanner teclado = new Scanner(System.in);
    System.out.print("Ingrese la primera nota: ");
    int n1 = teclado.nextInt();
    System.out.print("Ingrese la segunda nota: ");
    int n2 = teclado.nextInt();
    System.out.print("Ingrese la tercera nota: ");
    int n3 = teclado.nextInt();

    //promedio 
    int promedio = (n1+n2+n3)/3;

    //validando 
    if (promedio >= 7) {
      System.out.println("El estudiante aprobó con: " + promedio);
    }else{
      System.out.println("El estudiante reprobó con: " + promedio);
    }
  }
}

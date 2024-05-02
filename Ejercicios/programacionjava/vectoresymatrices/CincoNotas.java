// Escriba un programa que lea 5 notas de alumnos e informe cuántos tienen

// -- notas mayores o iguales a 7, 
// -- y cuántos, menores (aprobados y reprobados).
// Refactorice el programa para que aparezca el mensaje 
// de “Diciembre” si tiene
// -- la nota mayor que 4 y menor que 7.

import java.util.Scanner;

public class CincoNotas {
  public static void main(String[] args) {
    System.out.println("--Bienvenido al programa--");
    
    Scanner teclado = new Scanner(System.in);
    int notas[]=new int[5];

    //ingresa 5 notas de alumnos 
    for (int i = 0; i < notas.length; i++) {
      System.out.println("Ingrese la nota del alumno "+(i+1));
      notas[i]= teclado.nextInt();
    }


    int nAprobados=0;
    int nDiciembre=0;
    int nReprobados=0;

    for (int i = 0; i < notas.length; i++) {
      if (notas[i]>=7) { //cuantos mayores o iguales a 7
        nAprobados = nAprobados+1;
      }else if ((notas[i]>4) && (notas[i]<7)) {
        nDiciembre =nDiciembre+1;
      }else{  //cuantos menores a 7
        nReprobados = nReprobados+1;
      }
    }

    //Mostrando datos 
    //Total aprobados 
    System.out.println("El total de alumnos aprobados es: "+nAprobados);
    // "Para Diciembre"
    System.out.println("Alumnos para diciembre xd: "+nDiciembre);
    System.out.println("Alumnos reprobados..."+nReprobados);


  }
}

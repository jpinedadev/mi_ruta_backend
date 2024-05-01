//En una tabla de 4 filas y 4 columnas se guardan las notas de 4 alumnos de secundaria. Cada fila corresponde a las notas y al promedio de cada alumno. Se necesita un programa que permita a un profesor cargar, en las 3 posiciones (columnas) de cada fila, las notas del alumno y que en la ultima columna se calculen los promedios. una vez realizados los calculos se desea mostrar las 3 notas de cada alumno y el promedio correspondiente recorriendo la matriz.

import java.util.Scanner;

public class notas {
  public static void main(String[] args) {
    System.out.println("--Bienvenido al programa--");
    Scanner teclado = new Scanner(System.in);

    //matriz 
    double matriz[][] = new double[4][4];
    double suma = 0.0;

    //cargar datos 
    for (int f = 0; f < 4; f++) {
      System.out.println("-------------------------------");
      System.out.println("--Ingreso alumno Nº "+(f+1)+"--");
      System.out.println("-------------------------------");

      for (int c = 0; c < 3; c++) {
        System.out.print("- Ingrese la nota "+(c+1)+" :");
        matriz[f][c] = teclado.nextDouble();
        suma = suma + matriz[f][c];
      }

      matriz[f][3] = suma/3;
      suma = 0.0;
      System.out.println("");
      
    }

    //recorrer la matriz 
    System.out.println("-------------------------------");
    System.out.println("PRESENTANDO DATOS....");
    System.out.println("-------------------------------");

    for (int f = 0; f < 4; f++) {
      System.out.println("-------------------------------");
      System.out.println("Notas del alumno "+(f+1));
      System.out.println("-------------------------------");

      for (int c = 0; c < 3; c++) {
        System.out.println("- Nota numero "+(c+1)+" :"+matriz[f][c]);
      }
      System.out.println("- Promedio: "+matriz[f][3]);
      System.out.println("");
      
    }
  }
}

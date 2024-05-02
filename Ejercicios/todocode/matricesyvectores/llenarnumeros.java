// Ejercicio Matriz:
// Llevar a cabo un programa que permite cargar completamente
// con numeros 5 una matriz de 4x5 (4 filas, 5 columnas)

import java.util.Scanner;

public class llenarnumeros {
  public static void main(String[] args) {
    System.out.println("--Bienvenido al programa--");

    //matriz 
    int numeros[][] = new int[4][5];

    //llenar matriz con numeros 5

    for (int f = 0; f <4; f++) {
  
      for (int c = 0; c < 5; c++) {
       numeros[f][c] = 5;
      }
      
    }

    //presentando datos 
    for (int f = 0; f <4; f++) {
  
      for (int c = 0; c < 5; c++) {
       System.out.print(numeros[f][c]+" ");
      }
      System.out.println("");
      
    }
    
  }
}

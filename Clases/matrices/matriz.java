//carga y recorridod de una matriz

import java.util.Scanner;

public class matriz {
  public static void main(String[] args) {
    //ingresando valores
    Scanner teclado = new Scanner(System.in);
    int matriz[][] = new int[3][3];

    for (int f = 0; f < 3; f++) {
      for (int c = 0; c < 3; c++) {
        System.out.println("ingrese el valor para: "+f+"-"+c);
        matriz[f][c]= teclado.nextInt();
      }
    }
    
    //presentando datos 

    for (int f = 0; f < 3; f++) {
      for (int c = 0; c < 3; c++) {
        System.out.println("valor de "+f+"-"+c+" es: "+matriz[f][c]);
      }
      
    }
  }
}

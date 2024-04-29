//carga y recorrido de un vector

import java.util.Scanner;

public class vector {
  public static void main(String[] args) {
    System.out.println("--Carga y recorrido de vectores--");

    int vector[] = new int [4];

    //ingresando datos 
    Scanner teclado = new Scanner(System.in);
    for (int i = 0; i < vector.length; i++) {
      System.out.println("ingrese el indice "+i);
      vector[i] = teclado.nextInt();
    }

    //recorrido del vector 
    for (int i = 0; i < vector.length; i++) {
      System.out.println("Valor de la posicion "+i+" es: "+vector[i]);
    }
  }
}

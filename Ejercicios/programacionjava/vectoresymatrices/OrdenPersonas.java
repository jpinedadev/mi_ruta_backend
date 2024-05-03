// Mediante el ingreso de varios nombres de personas en un arreglo, implemente su ordenamiento alfabético.

import java.util.Scanner;
import java.util.Arrays;

public class OrdenPersonas {
  public static void main(String[] args) {
    System.out.println("--Bienvenido al programa--");
    
    String nombres[] = new String[6];

    //llenar array con nombres
    Scanner teclado = new Scanner(System.in);
    for (int i = 0; i < nombres.length; i++) {
      System.out.println("Ingrese el nombre "+(i+1)+": ");
      nombres[i] = teclado.next();
    }

    //ordenando nombres 
    Arrays.sort(nombres);
    //presentando nombres
    System.out.println("Nombres ordenados");
    for (int i = 0; i < nombres.length; i++) {
      System.out.println(nombres[i]);
    }

  }
}

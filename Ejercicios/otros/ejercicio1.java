// crea un metodo que dado un array de enteros y un valor entero,
// muestre la cantidad de veces que aparece el entero en el array.

import java.util.Scanner;

public class ejercicio1 {
  public static void main(String[] args) {
    int[] miArray = new int[6];
    int numero, count=0;

    System.out.println("--Ingreso del array--");
    Scanner teclado = new Scanner(System.in);
    for (int i = 0; i < 6; i++) {
      System.out.println("ingrese un numero para la posicion "+i);
      miArray[i]=teclado.nextInt();
    }
    System.out.println("Ingrese un numero entero a comparar:");
    numero = teclado.nextInt();

    //comparar numero
    for (int i = 0; i < 6; i++) {
      if (miArray[i]==numero) {
        count=count+1;
      }
    }

    System.out.println("El numero aparece "+count+" veces.");

  }
}

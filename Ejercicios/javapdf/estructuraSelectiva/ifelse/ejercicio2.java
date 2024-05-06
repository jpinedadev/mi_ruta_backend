/* Escribir un algoritmo para reparar un pinchazo de bicicleta. */

import java.util.Scanner;

public class ejercicio2 {
  public static void main(String[] args) {
    String llantas;

    Scanner teclado = new Scanner(System.in);

    System.out.println("¿La llanta tiene pinchazo? S/N");
    llantas = teclado.next();

    if (llantas.equalsIgnoreCase("S")) {
      System.out.println("Reparar llanta");
    }else{
      System.out.println("no hace falta reparla ");
    }
  }
}

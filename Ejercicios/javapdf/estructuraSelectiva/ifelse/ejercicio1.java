/* Escribir un algoritmo para lavar los platos de la comida. */

import java.util.Scanner;

public class ejercicio1 {
  public static void main(String[] args) {
    String platos;

    System.out.println("--bienvenido al programa--");

    Scanner teclado = new Scanner(System.in);

    System.out.println("¿Los platos están sucios? S/N");
    platos = teclado.next();

    if (platos.equalsIgnoreCase("s")) {
      System.out.println("lavar los platos en la lavadora porque si");
      System.out.println("platos limpios!!!");
    }else{
      System.out.println("El plato esta limpio!! :3");
    }

    System.out.println("--gracias--");
    
  }
}

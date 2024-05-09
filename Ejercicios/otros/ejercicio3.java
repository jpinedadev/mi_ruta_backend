// crea un metodo que reciba un array de strings y un char.
// debera mostrar todas las strings cuya primera letra
// sea el char pasado como parametro.

import java.util.Scanner;

public class ejercicio3 {
  public static void main(String[] args) {
    String[] miArray = new String[3];
    String letra,primera;

    Scanner teclado = new Scanner(System.in);

    System.out.print("Ingrese una letra: ");
    letra = teclado.next();

    for (int i = 0; i < miArray.length; i++) {
      System.out.print("ingrese un mes: ");
      miArray[i] = teclado.next();
      primera = miArray[i].substring(0,1);

      if (primera.equals(letra)) {
        System.out.println(miArray[i]);
      }

    }
  }
}

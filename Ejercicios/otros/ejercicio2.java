// cree un metodo que reciba un array de strings y muestre la string mas larga

import java.util.Scanner;

public class ejercicio2 {
  public static void main(String[] args) {
    String[] miArray = new String[4];
    String masLarga="";

    Scanner teclado = new Scanner(System.in);

    //llenar arreglo

    for (int i = 0; i < 4; i++) {
      System.out.println("Ingrese un nombre: ");
      miArray[i] = teclado.next();
      if (miArray[i].length() > masLarga.length()) {
        masLarga = miArray[i];
      }
    }

    System.out.println("La string mas larga es: "+masLarga);
 
    
  }
}

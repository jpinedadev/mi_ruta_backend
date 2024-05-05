// Mediante el ingreso de varios nombres de personas en un arreglo, 
// implemente su ordenamiento alfabético.

import java.util.Scanner;
import java.util.Arrays;

public class OrdenW {
  public static void main(String[] args) {
    //debe tener una dimension o sale error 
    String nombres[] = new String[];
    boolean op=true;
    String sn;

    Scanner teclado = new Scanner(System.in);
    
    int i = 0;
    while (op==true) {

      System.out.println("Ingrese un nombre: ");
      nombres[i] = teclado.next();

      System.out.println("Ingresar otro nombre? S/N");
      sn = teclado.nextLine();

      //la wea de java no compara Strings con == xd 
      //usa varible.equals("") 
      if (sn.equals("n")) {
        op=false;
        System.out.println("Terminando programa...");
      }

    }
  }
}

// Mediante el ingreso de varios nombres de personas en un arreglo, implemente su ordenamiento alfabético.

import java.util.Scanner;
import java.util.Arrays;

public class OrdenW {
  public static void main(String[] args) {
    String nombres[];
    boolean op=true;
    String sn;

    Scanner teclado = new Scanner(System.in);

    while (op==true) {
      System.out.println("Ingresar otro nombre? S/N");
      sn = teclado.nextLine();
      System.out.println(sn);

      //la wea de java no compara Strings con == xd 
      //usa varible.equals("") 
      if (sn.equals("n")) {
        op=false;
        System.out.println("hola xd");
      }

    }
  }
}

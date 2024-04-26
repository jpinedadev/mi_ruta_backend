//realizar un programa en java que
//encuentre el duplo y el triplo de un numero 

import java.util.Scanner;

public class duploytriplo {
  public static void main(String[] args) {
    System.out.println("--Duplo y triplo--");

    //ingresando datos 
    Scanner teclado = new Scanner(System.in);
    System.out.println("Ingrese un numero: ");
    int numero = teclado.nextInt();

    //realizando el proceso 
    int duplo = numero*2;
    int triplo = numero*3;

    //presentando datos 
    System.out.println("Duplo: " + duplo);
    System.out.println("Triplo: " + triplo);
  }
}

//realizar un programa en java que
//encuentra la mitad y la cuarta parte de una cantidad 

import java.util.Scanner;

public class mitadycuarta {
  public static void main(String[] args) {
    System.out.println("--Mitad y cuarta--");

    //ingresando datos 
    Scanner teclado = new Scanner(System.in);
    System.out.println("Ingrese un numero: ");
    int numero = teclado.nextInt();

    //realizando el proceso 
    int mitad = numero/2;
    int cuarta = numero/4;

    //presentando datos 
    System.out.println("La mitad es: " + mitad);
    System.out.println("La cuarta es: " + cuarta);
    
  }
}

//realizar un programa en java que
//calcule el total a pagar por un producto
//considerando que se ingresa la cantidad y el valor unitario

import java.util.Scanner;

public class totalapagar {
  public static void main(String[] args) {
    System.out.println("--Calculo total a pagar--");

    //ingresando datos 
    Scanner teclado = new Scanner(System.in);
    System.out.print("Ingrese la cantidad: ");
    int cantidad = teclado.nextInt();
    System.out.print("Ingrese el valor: ");
    int valor = teclado.nextInt();

    //calculando el proceso 
    int pvp = cantidad*valor;

    //presentando datos 
    System.out.println("El valor a pagar es: " + pvp);
    
  }
}

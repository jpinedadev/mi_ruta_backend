// Realizar un algoritmo para calcular 
// la media de los números 
//  --pares e -- impares, 
//  sólo se ingresarán 10 números.

import java.util.Scanner;

public class ejercicio1 {
  public static void main(String[] args) {
    int numero, par=0, impar=0;

    Scanner teclado = new Scanner(System.in);

    for (int i = 0; i < 10; i++) {
      System.out.println("ingresa un numero: ");
      numero = teclado.nextInt();

      if (numero % 2 == 0) { //residuo
        par = par+numero;
      }else{
        impar = impar+numero;
      }
    }
    System.out.println("la media par es: "+(par/10));
    System.out.println("la media impar es: "+(impar/10));
  }
}

// Escribe un algoritmo que imprima la factorial de un número dado por el
// usuario.  (multiplicar el numero x i hasta llegar a n)

import java.util.Scanner;

public class ejercicio1 {
  public static void main(String[] args) {
    int numero, resultado=0;

    Scanner teclado = new Scanner(System.in);
    System.out.println("Ingrese un numero: ");
    numero = teclado.nextInt();

    for (int i = 0; i < numero; i++) {
      resultado = numero*i;
    }
    System.out.println("El factorial es: "+resultado);
    
  }
}

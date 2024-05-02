// Escriba un programa que solicite la carga de un valor positivo y muestre desde 1 hasta el valor ingresado, de uno en uno

import java.util.Scanner;

public class ValorPositivo {
  public static void main(String[] args) {
    System.out.println("--Bienvenido al programa--");

    Scanner teclado = new Scanner(System.in);

    System.out.print("Ingrese un numero positivo: ");
    int numero = teclado.nextInt();

    if (numero<1) {
      System.out.println("Ingrese un numero positivo!!!!!");
    }else{
      for (int i = 1; i <= numero; i++) {
        System.out.println(i);
      }
    }

  }
}

// Supongamos que debemos obtener la suma de los gastos que hicimos en
// nuestro último viaje, pero no sabemos exactamente cuántos fueron. 
// Construye un algoritmo para conocer cuántos gastos se realizaron.

import java.util.Scanner;

public class ejercicio2 {
  public static void main(String[] args) {
    double gastos, total=0;

    Scanner teclado = new Scanner(System.in);

    System.out.println("ingresa gastos: ");
    gastos = teclado.nextDouble();

    while (gastos != 0) {
      total = total + gastos;
      System.out.println("ingresa gastos: ");
      gastos = teclado.nextDouble();
    }
    System.out.println("El total de gastos es: "+total);
  }
}

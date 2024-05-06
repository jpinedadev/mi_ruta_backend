// Escribir un algoritmo que aplique un aumento del 15% al sueldo de un 
// trabajador, si éste es menor a $1,000.00.

import java.util.Scanner;

public class ejercicio1 {
  public static void main(String[] args) {
    System.out.println("--Bienvenido al programa--");

    double sueldo, nSueldo;

    Scanner teclado = new Scanner(System.in);
    System.out.print("Ingrese el sueldo: ");
    sueldo = teclado.nextDouble();

    if (sueldo < 1000) {
       nSueldo = sueldo+(sueldo*0.15);
       System.out.println("El nuevo sueldo es: "+nSueldo);     
    }else{
      System.out.println("no hay aumento xd");
    }
    
  }
}


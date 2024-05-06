// Construya un algoritmo que calcule el monto total de una capital según sea
// el capital ingresado inicialmente y la tasa de interés vigente.

import java.util.Scanner;

public class ejercicio9 {
  public static void main(String[] args) {
    System.out.println("--Bienvenido al programa--");

    double capital, interes,monto;

    //ingresando datos 
    Scanner teclado = new Scanner(System.in);
    System.out.print("Ingrese el capital: ");
    capital = teclado.nextDouble();
    System.out.print("Ingrese el interes: ");
    interes = teclado.nextDouble();

    //procesando datos 
    monto = capital*(1+(interes/100));

    //presentando datos 
    System.out.println("El monto a recibir es: "+monto);
    
  }
}

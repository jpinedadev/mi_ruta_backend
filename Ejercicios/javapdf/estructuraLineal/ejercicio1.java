// Una persona desea invertir su capital en un banco y desea saber cuánto
// dinero ganará después de un mes si el banco le pagará intereses del 2%
// mensual, cree un algoritmo para solucionarlo.

import java.util.Scanner;

public class capital {
  public static void main(String[] args) {
    System.out.println("--Bienvenido al programa--");

    //variables
    double capital, interes=0.02, ganancia;
    double dias;

    //pedir datos 
    Scanner teclado = new Scanner(System.in);
    System.out.print("Ingrese el capital: ");
    capital = teclado.nextDouble();

    System.out.print("Ingrese los dias: ");
    dias = teclado.nextDouble();

    //proceso 
    ganancia = (capital*dias)*interes;

    //presentando datos 
    System.out.println("Su ganancia es: "+ganancia);
    
  }
}

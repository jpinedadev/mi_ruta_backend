// Un constructor sabe que necesita 
// -- 0.5 metros cúbicos de arena por metro
// cuadrado de revoque a realizar. 
// Escriba un algoritmo que le permita obtener 
// la cantidad de arena necesaria para revocar 
// una pared cualquiera, según sus medidas 
// (largo y alto) expresadas en metros.

import java.util.Scanner;

public class Albanil {
  public static void main(String[] args) {
    System.out.println("--Bienvenido al programa--");
    double cantArena, metros=0.5, largo, alto;

    //pedir datos
    Scanner teclado = new Scanner(System.in);

    System.out.print("Ingrese el largo de la pared: ");
    largo = teclado.nextDouble();

    System.out.print("Ingrese el ancho de la pared: ");
    alto = teclado.nextDouble();

    //proceso 
    cantArena = (largo*alto)*metros;

    //presentandod datos
    System.out.println("La cantidad de arena necesaria es: "+cantArena);
    
  }
}

// Dada la estabilidad económica que existe en un determinado país de 
// américa latina, las agencias automotrices comienzan a ofrecer distintos planes
// de financiamiento para la comercialización de sus vehículos. 
// La empresa XGW ofrece el siguiente plan de financiación: dado el monto total de vehículo, el cliente debe pagar el 35% de enganche y el resto en 18 
// mensualidades sin intereses. 
// Construye un algoritmo que permita obtener cuál es el
// importe del enganche y las mensualidades que debe pagar el cliente.

import java.util.Scanner;

public class ejercicio3 {
  public static void main(String[] args) {
    System.err.println("--bienvenido al programa--");

    double costo, enganche, mensualidad;

    Scanner teclado = new Scanner(System.in);
    System.out.print("Ingrese el costo total del vehiculo: ");
    costo = teclado.nextDouble();

    enganche = costo*0.35;
    mensualidad = (costo-enganche)/18;

    System.out.println("El enganche fue de :"+enganche);
    System.out.println("La mensualidad es de: "+mensualidad);


    
  }
}

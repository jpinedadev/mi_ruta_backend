//En una playa de estacionamiento cobran $150 la primera hora y $100 a partir de la segunda hora. Cree un programa que determine cuanto debe pagar un cliente, conociendo el tiempo de estacionamiento en horas.

import java.util.Scanner;

public class estacionamiento {
  public static void main(String[] args) {
    //pedir hora 
    Scanner teclado = new Scanner(System.in);
    System.out.println("--Estacionamiento--");

    System.out.println("Ingrese el tiempo en horas: ");
    int hora = teclado.nextInt();
    int total=0;

    if (hora <= 1) {
      total = 150;
      System.out.println("El total a pagar es: " + total);
      
    }else{
      total = 100*hora;
      System.out.println("El total a pagar es: " + total);
    }
    
  }
}

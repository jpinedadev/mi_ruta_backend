// El costo de las llamadas telefónicas internacionales depende de la zona
// geográfica en la que se encuentra el país de destino y el número de minutos
// hablados, en la siguiente tabla se presenta el costo de un minuto por zona;
// a cada zona se le asignado una clave. Construye un algoritmo que permita
// calcular e imprimir el costo total de una llamada.

// Clave   Zona             Precio
// 12      América Norte    2
// 15      América Central  2.2
// 18      América Sur      4.5
// 19      Europa           3.5
// 23      Asia             6
// 25      África           6
// 29      Oceanía          5

import java.util.Scanner;

public class ejercicio3 {
  public static void main(String[] args) {
    int cZona;
    double minutos,costo;
    Scanner teclado = new Scanner(System.in);

    System.out.println("***************************");
    System.out.println("CLAVE      ZONA");
    System.out.println("12         America Norte");
    System.out.println("15         America Central");
    System.out.println("18         America Sur");
    System.out.println("19         Europa");
    System.out.println("23         Asia");
    System.out.println("25         Africa");
    System.out.println("29         Oceania");
    System.out.println("***************************");

    System.out.print("Ingrese la clave de la zona: ");
    cZona = teclado.nextInt();
    System.out.print("Ingrese los minutos: ");
    minutos = teclado.nextDouble();

    switch (cZona) {
      case 12:
        costo = minutos*2;
        break;
      case 15:
        costo = minutos*2.2;
        break;
      case 18:
        costo = minutos*4.5;
        break;
      case 19:
        costo = minutos*3.5;
        break;
      case 23:
        costo = minutos*6;
        break;
      case 25:
        costo = minutos*6;
        break;
      case 29:
        costo = minutos*5;
        break;
      default:
        System.out.println("clave invalida xxxxx");
        costo = minutos;
        break;
    }

    System.out.println("Costo total de la llamada segun la zona es: "+costo);
    
  }
};

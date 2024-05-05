//Una compañia de vuelos cuenta con 6 destinos a los que realiza 3 vuelos
//diariamente, uno por la mañana, otro al mediodia y otro por la noche.
//Para administrar estos datos, utiliza una matriz, donde cada fila
//es un destino y en cada columna se guarda la cantidad de asientos
//disponibles. Ejemplo
//                    0         1           2
//                    mañana    mediodia    noche 
//  0 Rio de janeiro  120       15          30
//  1 Cancun          65        1           2
//  2 Madrid          4         52          7
//  3 Roma            46        32          16
//  4 Milan           64        23          11
//  5 Iguazu          61        12          91
//
//1.- Se necesita un programa que permita la carga de la matriz 
//con la cantidad de asientos para cada vuelo. 
//2.- Al mismo tiempo, el programa debe permitir al usuario ingresar
//el numero de destino al que quiere dirigirse, el numero de vuelo 
//(dependiendo si quiere viajar a la mañana, mediodia o noche)
//y la cantidad de pasajes que necesita. 
//3.- A partir de la solicitud del usuario, el programa debe controlar
//si hay la cantidad suficiente de asientos para la cantidad de 
//pasajes que se requiere. En caso de que asi sea mostrar por pantalla
//"Reserva con exito" y se debe descontar del total de asientos 
//los solicitados por el usuario, En caso de no haber asientos  
//disponibles, mostrar el mensaje "No hay asientos disponibles".
//
//Desde la compañia manifiestan que NO CONOCEN cuantas ventas/reservas
//se hacen por dia. Por lo cual, para finalizar las ventas 
//se ingresa la palabra "finish"

import java.util.Scanner;

public class Vuelos {
  public static void main(String[] args) {
   System.out.println("---------------------------------");
   System.out.println("--Bienvenido al programa--"); 
   System.out.println("---------------------------------");

   int vuelos[][] = new int[6][3];
  //1.- Se necesita un programa que permita la carga de la matriz 
  Scanner teclado = new Scanner(System.in);
  Scanner teclado2 = new Scanner(System.in);

  for (int f = 0; f < 6; f++) {
    System.out.println("--Asientos para el destino "+f+"--");
    for (int c = 0; c < 3; c++) {
     System.out.println("- horario de  vuelo "+c);
     vuelos[f][c] = teclado.nextInt();
    }
  }
  //2.- Al mismo tiempo, el programa debe permitir al usuario ingresar
  //el numero de destino al que quiere dirigirse, el numero de vuelo 
  //(dependiendo si quiere viajar a la mañana, mediodia o noche)
  //y la cantidad de pasajes que necesita. 
  String bandera = "";
  int destino, horario, asientos;

  while (!bandera.equalsIgnoreCase("finish")) {
    System.out.println("---------------------------------");
    System.out.println("- Ingrese el destino: ");//fila
    destino = teclado.nextInt();
    System.out.println("- Ingrese el horario: ");//columna
    horario = teclado.nextInt();
    System.out.println("- Ingrese la cantidad de asientos:");//valor
    asientos = teclado.nextInt();

    //3.- A partir de la solicitud del usuario, el programa debe controlar
    //si hay la cantidad suficiente de asientos para la cantidad de 
    //pasajes que se requiere.
    if (vuelos[destino][horario] > asientos) {
      System.out.println("***¡Reserva con exito!***");
      vuelos[destino][horario] = vuelos[destino][horario]-asientos;
    }else{
      System.out.println("***No hay tantos asientos disponibles***");
    }
    //para finalizar las ventas 
    //se ingresa la palabra "finish"
    System.out.println("Escriba finish para terminar, o cualquier tecla para continuar");
    bandera = teclado2.next();

  }

  }
}











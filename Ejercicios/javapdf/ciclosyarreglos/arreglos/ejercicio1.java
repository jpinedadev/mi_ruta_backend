// En el centro meteorológico de Argentina se llevan los promedios 
// mensuales de las lluvias caídas en las principales regiones del país. 
// Existen 3 regiones importantes denominadas norte, centro y sur. 
// Realice un algoritmo para calcular lo siguiente:
// - Promedio anual de la región Centro.
// - El mes con menor lluvia en la región sur.
// - La región con mayor lluvia.

import java.util.Scanner;

public class ejercicio1 {
  public static void main(String[] args) {
    String[] mes = new String[12];
    int[] centro = new int[12];
    int[] sur = new int[12];
    int[] norte = new int[12];

    Scanner teclado = new Scanner(System.in);

    //meses del año 
    mes[0] = "enero";
    mes[1] = "febrero";
    mes[2] = "marzo";
    mes[3] = "abril";
    mes[4] = "mayo";
    mes[5] = "junio";
    mes[6] = "julio";
    mes[7] = "agosto";
    mes[8] = "septiembre";
    mes[9] = "octubre";
    mes[10] = "noviembre";
    mes[11] = "diciembre";

    //promedio anual de la region centro
    int sumaMes = 0;
    int promedio;
    int mayor = 0;
    String region = "";
    System.out.println("\n---Porcentaje de lluvias region centro---");

    for (int i = 0; i < 12; i++) {
      System.out.println("Ingrese el % de lluvias del mes "+mes[i]);
      centro[i] = teclado.nextInt();
      sumaMes = sumaMes+centro[i];

      //observa y cuenta el mayor Porcentaje
      if (mayor < centro[i]) {
        mayor = centro[i];
        region = "centro";
      }
    }
    promedio = sumaMes/12;

    //el mes con menor lluvia en la region sur 
    int menor=0;
    int menorMes=0;
    System.out.println("\n--Procentaje de lluvias region sur--");

    for (int i = 0; i < 12; i++) {

      System.out.println("Ingrese el % de lluvias del mes "+mes[i]);
      sur[i] = teclado.nextInt();

      if (menor==0) {
        menor = sur[i];
      }

      if (menor > sur[i]) {
        menor = sur[i];
        menorMes = i;
      }
      //observa y cuenta el mayor Porcentaje
      if (mayor < sur[i]) {
        mayor = sur[i];
        region = "sur";
      }
    }

    //la region con mayor lluvia
    System.out.println("\n--Procentaje de lluvias region norte--");

    for (int i = 0; i < 12; i++) {

      System.out.println("Ingrese el % de lluvias del mes "+mes[i]);
      norte[i] = teclado.nextInt();

      //observa y cuenta el mayor Porcentaje
      if (mayor < norte[i]) {
        mayor = norte[i];
        region = "norte";
      }
    }

    //presentando datos
    System.out.println("\n*********************************************");
    System.out.println("-Promedio anual de la region centro: "+promedio);
    System.out.println("-Mes con menor lluvia en la region sur: "+mes[menorMes]);
    System.out.println("-Region con mayor lluvia: "+region);
    System.out.println("*********************************************");

  }
}

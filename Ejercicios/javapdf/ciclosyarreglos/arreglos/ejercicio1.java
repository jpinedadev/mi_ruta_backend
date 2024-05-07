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
    String mes = new String[12];
    int centro = new int[12];
    int sur = new int[12];
    int norte = new int[12];

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

  }
}

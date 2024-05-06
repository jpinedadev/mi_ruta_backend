// Construya el algoritmo tal que, dadas las coordenadas de los puntos 
// P1, P2 y P3 que corresponden a los vértices de un triángulo, 
// calcule su superficie.
// Donde:
// • X1 y Y1 expresan las coordenadas en el eje de las X y las Y, del punto P1.
// • X2 y Y2 expresan las coordenadas en el eje de las X y las Y, del punto P2.
// • X3 y Y3 expresan las coordenadas en el eje de las X y las Y, del punto P3.
// Consideraciones:
// • Para calcular el área de un triángulo dadas de las coordenadas 
// de los vértices que la componen, debemos aplicar la siguiente formula.
//
// Area = (((x1*y2)+(x2*y3)+(x3*y1)) - ((x1*y3)+(x3*y2)+(x2*y1)))/2

import java.util.Scanner;

public class ejercicio7 {
  public static void main(String[] args) {
    System.out.println("--Bienvenido al programa--");
    double x1,y1,x2,y2,x3,y3,area;

    //ingresando datos
    Scanner teclado = new Scanner(System.in);
    System.out.println("Ingrese x1");
    x1 = teclado.nextDouble();
    System.out.println("Ingrese y1");
    y1 = teclado.nextDouble();
    System.out.println("Ingrese x2");
    x2 = teclado.nextDouble();
    System.out.println("Ingrese y2");
    y2 = teclado.nextDouble();
    System.out.println("Ingrese x3");
    x3 = teclado.nextDouble();
    System.out.println("Ingrese y3");
    y3 = teclado.nextDouble();

    //procesando
    area = (((x1*y2)+(x2*y3)+(x3*y1)) - ((x1*y3)+(x3*y2)+(x2*y1)))/2; 

    System.out.println("El area es: "+area);

  }
}

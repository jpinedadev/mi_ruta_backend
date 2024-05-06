// Construya el algoritmo tal que, dadas las coordenadas de los puntos P1, P2
// y P3 que corresponden a los vértices de un triángulo, calcule su perímetro.
// Donde:
// • X1 y Y1 expresan las coordenadas en el eje de las X y las Y, del punto P1.  
// • X2 y Y2 expresan las coordenadas en el eje de las X y las Y, del punto P2.  
// • X3 y Y3 expresan las coordenadas en el eje de las X y las Y, del punto P3.  
// Consideraciones:
// Para calcular la distancia entre dos puntos P1 y P2 hacemos:
// D= RAIZ(( X1 − X2 )^2 + (Y1 − Y2 )^2)

import java.util.Scanner;

public class ejercicio6 {
  public static void main(String[] args) {
    System.out.println("--Bienvenido al programa--");

    double x1,y1,x2,y2,x3,y3,distancia1,distancia2,distancia3, perimetro;

    //ingresando datos 
    Scanner teclado = new Scanner(System.in);
    System.out.print("Ingrese el valor de x1: ");
    x1 = teclado.nextDouble();
    System.out.print("Ingrese el valor de y1: ");
    y1 = teclado.nextDouble();
    System.out.print("Ingrese el valor de x2: ");
    x2 = teclado.nextDouble();
    System.out.print("Ingrese el valor de y2: ");
    y2 = teclado.nextDouble();
    System.out.print("Ingrese el valor de x3: ");
    x3 = teclado.nextDouble();
    System.out.print("Ingrese el valor de y3: ");
    y3 = teclado.nextDouble();

    //procesando 
    distancia1 = Math.sqrt(Math.pow((x1-x2),2)+Math.pow((y1-y2),2));
    distancia2 = Math.sqrt(Math.pow((x2-x3),2)+Math.pow((y2-y3),2));
    distancia3 = Math.sqrt(Math.pow((x3-x1),2)+Math.pow((y3-y1),2));
    perimetro = distancia1+distancia2+distancia3;

    System.out.println("El perimetro es: "+perimetro);

  }
}

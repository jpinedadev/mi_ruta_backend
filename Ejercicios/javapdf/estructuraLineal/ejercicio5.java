// Construya el algoritmo tal que, dado como dato el lado de un 
// hexaedro o cubo, calcule:  
//  el área de la base, el área lateral, el área total y el volumen.
// Consideraciones:
// • Para calcular el área de la base aplicamos la siguiente fórmula: 
//    AB = L^2
// • Para calcular el área lateral hacemos: 
//    AL = 4* L^2
// • Para calcular el área total hacemos: 
//    AT = 6* L^2
// • Para calcular el volumen hacemos: 
//    V = L^3

import java.util.Scanner;

public class ejercicio5 {
  public static void main(String[] args) {
    System.out.println("--Bienvenido al programa--");
    double lado, aBase, aLateral, aTotal, volumen;

    //ingresando datos 
    Scanner teclado = new Scanner(System.in);
    System.out.println("Ingrese el lado: ");
    lado = teclado.nextDouble();

    //procesando 
    aBase = lado*lado;
    aLateral = 4*(lado*lado);
    aTotal = 6*(lado*lado);
    volumen = (lado*lado*lado);

    //presentando datos
    System.out.println("El area de la base es: "+aBase);
    System.out.println("El area lateral es: "+aLateral);
    System.out.println("El area total es: "+aTotal);
    System.out.println("El volumen es: "+volumen);
  }
}

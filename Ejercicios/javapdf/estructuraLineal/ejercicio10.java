// Escribe un algoritmo que calcule 
// el área total, lateral y el área de la base de un prisma pentagonal,
// solicitando para esto el perímetro de la base, apotema y altura del prisma

import java.util.Scanner;

public class ejercicio10 {
  public static void main(String[] args) {
    System.out.println("--Bienvenido al programa--");
    double perimetro, apotema, altura, aTotal, aLateral, aBase;

    //ingresando datos 
    Scanner teclado = new Scanner(System.in);
    System.out.print("Ingrese el perimetro de la base: ");
    perimetro = teclado.nextDouble();
    System.out.print("Ingrese el apotema: ");
    apotema = teclado.nextDouble();
    System.out.print("Ingrese la altura: ");
    altura = teclado.nextDouble();

    //procesando datos 
    aBase = (perimetro * apotema)/2;
    aLateral = (perimetro * altura)/2;
    aTotal = (2 * aBase) + aLateral;

    //presentando datos
    System.out.println("El area total es: "+aTotal);
    System.out.println("El area lateral es: "+aLateral);
    System.out.println("El area de la base es: "+aBase);
  
    
  }
}

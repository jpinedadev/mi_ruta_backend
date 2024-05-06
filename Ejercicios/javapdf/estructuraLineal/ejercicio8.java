// Construya el algoritmo tal que, dado el perímetro de la base, 
// la apotema y la altura de un prisma pentagonal; 
// calcule el área de la base, el área lateral, el área total y el volumen.
// Consideraciones:
// • Para calcular el área de la base, hacemos: 
//    AB = (PER * APO)/2
// • Para calcular el área lateral, aplicamos la siguiente fórmula: 
//    AL = PER * ALT
// • Para calcular el área total hacemos:
//    AT= 2* AB + AL
// • Para calcular el volumen hacemos: 
//    VOL = AB * ALT

import java.util.Scanner;

public class ejercicio8 {
  public static void main(String[] args) {
    System.out.println("--Bienvenido al programa--");
    double perimetro, apotema, altura, aBase, aLado, aTotal, volumen;

    //ingresando datos 
    Scanner teclado = new Scanner(System.in);
    System.out.print("Ingrese el perimetro: ");
    perimetro = teclado.nextDouble();
    System.out.print("Ingrese la apotema: ");
    apotema = teclado.nextDouble();
    System.out.print("Ingrese la altura: ");
    altura = teclado.nextDouble();

    //procesando datos 
    aBase = (perimetro*apotema)/2;
    aLado = perimetro*altura;
    aTotal = (2*aBase)+aLado;
    volumen = aBase*altura;

    //presentando datos 
    System.out.println("La area base es: "+aBase);
    System.out.println("El area lateral es: "+aLado);
    System.out.println("El area total es: "+aTotal);
    System.out.println("El volumen es: "+volumen);
  }
}

// Construya el algoritmo tal que, dado el radio, la generatriz 
// y la altura de un cono, calcule e imprima el área de la base, 
// el área lateral, el área total y su volumen.
// Consideraciones:
// • El área de la base se calcula aplicando la siguiente fórmula: 
//    AB = π * RADIO^2 
// • El área lateral se calcula: 
//    AL = π * RADIO * GENE RATRIZ
// • El área total se calcula como: AT = AB + A
// • El volumen se calcula de la siguiente forma: 
//    VOL = 1/3 * AB * ALTURA

import java.util.Scanner;

public class ejercicio3 {
  public static void main(String[] args) {
    System.out.println("--Bienvenido al programa--");
    double radio, generatriz, altura, aBase, aLateral, aTotal, volumen;

    //pedir datos 
    Scanner teclado = new Scanner(System.in);
    System.out.print("Ingrese el radio: ");
    radio = teclado.nextInt();
    System.out.print("Ingrese la generatriz: ");
    generatriz = teclado.nextInt();
    System.out.print("Ingrese la altura: ");
    altura = teclado.nextInt();

    //procesos 
    final double PI = Math.PI;
    aBase = PI * (radio * radio);
    aLateral = PI * radio * generatriz;
    aTotal = aBase + aLateral;
    volumen = (aBase*altura)/3;

    //presentando datos 
    System.out.println("El area de la base es: "+aBase);
    System.out.println("El area lateral es: "+aLateral);
    System.out.println("El area total es: "+aTotal);
    System.out.println("El volumen es: "+volumen);
    
  }
}

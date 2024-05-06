// Escribe un algoritmo que calcule e imprima los segundos que existen en el
// número de días ingresados por el usuario.

import java.util.Scanner;

public class ejercicio11 {
  public static void main(String[] args) {
    System.out.println("--Bienvenido al programa--");
    int dias, segundos;

    //ingresando datos 
    Scanner teclado = new Scanner(System.in);
    System.out.println("Ingrese los dias: ");
    dias = teclado.nextInt();

    //procesando datos 
    segundos = dias * 24 * 60 * 60;

    //presentando datos 
    System.out.println(dias+" dias equivalen a "+segundos+" segundos.");
    
  }
}

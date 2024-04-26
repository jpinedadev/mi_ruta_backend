//Elaborar un progama en java que
//toma un numero y genere el cuadrado y el cubo

import java.util.Scanner;

public class cuadradoycubo {
  public static void main(String[] args) {
    System.out.println("---Bienvenido al programa ---");

    //ingresamos el numero 
    Scanner teclado = new Scanner(System.in);
    System.out.println("Ingrese un numero: ");
    int numero = teclado.nextInt();
    
    //realizando el proceso 
    int cuadrado = numero*numero;
    int cubo = numero*numero*numero;

    //presentando el resultado 
    System.out.println("El cuadrado es: " + cuadrado);
    System.out.println("El cubo es: " + cubo);
  }
}

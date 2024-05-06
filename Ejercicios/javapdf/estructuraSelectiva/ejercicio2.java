// Escribe un algoritmo que calcule la temperatura de acuerdo con el número
// de sonidos emitidos por un grillo. wtf??????


import java.util.Scanner;

public class ejercicio2 {
  public static void main(String[] args) {
    System.out.println("--Bienvenido al programa--");
    double numeroSonidos, temperatura;

    Scanner teclado = new Scanner(System.in);

    System.out.print("ingrese el numero de sonidos emitidos: ");
    numeroSonidos = teclado.nextDouble();

    temperatura = (numeroSonidos/4)+40;

    System.out.println("La temperatura es: "+temperatura);
    
  }
}


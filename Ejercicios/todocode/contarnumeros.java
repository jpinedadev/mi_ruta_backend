//realizar un programa que dado por teclado 
//un limite numerico (por ejemplo 100)
//muestre por pantalla todos los numeros
//hasta el limite (empezando por 1)

import java.util.Scanner;

public class contarnumeros {
  public static void main(String[] args) {
    //pedir numero 
    System.out.println("--Bienvenido al programa--");
    Scanner teclado = new Scanner(System.in);
    System.out.print("Ingrese un limite: ");
    int limite = teclado.nextInt();

    //realizando el proceso 
    for (int i = 1; i <= limite; i++) {
      System.out.println(i);
    }
    
    System.out.println("Fin del programa...");
  }
}

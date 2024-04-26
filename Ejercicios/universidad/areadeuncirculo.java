//realizar un programa en java que
//encuentre el area de un circulo

import java.util.Scanner;

public class areadeuncirculo {
  public static void main(String[] args) {
    System.out.println("--Area de un circulo--");

    //ingresando datos 
    Scanner teclado = new Scanner(System.in);
    System.out.println("Ingresa el radio: ");
    double radio = teclado.nextDouble();

    //realizando el proceso 
    double area = 3.1416 * (radio*2);

    //presentando por pantalla 
    System.out.println("El area es: " + area);
  }
}

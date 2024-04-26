//realizar un programa en java que
//encuentre el area y perimetro de un cuadrado

import java.util.Scanner;

public class areayperimetro {
  public static void main(String[] args) {
    System.out.println("--Area y perimetro de un cuadrado--");
    //ingresando un numero
    Scanner teclado = new Scanner(System.in);
    System.out.println("Ingrese un lado del cuadrado: ");
    int numero = teclado.nextInt();

    //realizando el proceso 
    int area = numero*numero;
    int perimetro = numero*4;

    //presentando datos 
    System.out.println("El area es: " + area);
    System.out.println("El perimetro es: " + perimetro);
  }
}

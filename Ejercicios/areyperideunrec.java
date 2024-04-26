//realiza un progama en java que
//calcule el area y perimetro de un rectangulo

import java.util.Scanner;

public class areyperideunrec {
  public static void main(String[] args) {
    System.out.println("--Area y perimetro de un rectangulo--");

    //ingresando datos
    Scanner teclado = new Scanner(System.in);
    System.out.println("Ingrese la base: ");
    int base = teclado.nextInt();
    System.out.println("Ingrese la altura: ");
    int altura = teclado.nextInt();

    //realizando el proceso 
    int perimetro = base+base+altura+altura;
    int area = base*altura;

    //presentando datos 
    System.out.println("El area es: " + area);
    System.out.println("El perimetro es: " + perimetro);
    
  }
}

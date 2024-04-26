//realizar un programa en java que
//calcule el area de un triangulo

import java.util.Scanner;

public class areatriangulo {
  public static void main(String[] args) {
    System.out.println("--Calcula el area de un triangulo--");

    //ingresando datos 
    Scanner teclado = new Scanner(System.in);
    System.out.println("Ingrese la base: ");
    int base = teclado.nextInt();
    System.out.println("Ingrese la altura: ");
    int altura = teclado.nextInt();

    //realizando el proceso 
    int area = (base*altura)/2;

    //presentando datos 
    System.out.println("El area es: " + area);

    
  }
}

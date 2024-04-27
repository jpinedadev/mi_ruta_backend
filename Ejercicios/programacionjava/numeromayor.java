//desarrollar un programa que permita leer dos valores distintos y luego determinar cual de los dos es el mayor

import java.util.Scanner;

public class numeromayor {
  public static void main(String[] args) {
    //leer dos numeros
    System.out.println("--numero mayor--");
    Scanner teclado = new Scanner(System.in);
    System.out.print("Ingrese el primer numero: ");
    int n1 = teclado.nextInt();
    System.out.print("Ingrese el segundo numero: ");
    int n2 = teclado.nextInt();

    if (n1 > n2) {
     System.out.println("El mayor es: " + n1); 
    }else{
      System.out.println("El mayor es: " + n2);
    }

  }
}

//utilices metodos para crear un programa que permita ingresa tres valores por teclado, y luego muestre el mayor y el menor


import java.util.Scanner;

public class nmayor {
  public static void main(String[] args) {

    //ingresando datos
    Scanner teclado = new Scanner(System.in);
    System.out.println("--Bienvenido--");
    System.out.println("Primer numero");
    int n1 = teclado.nextInt();
    System.out.println("Segundo numero");
    int n2 = teclado.nextInt();
    System.out.println("Tecer numero");
    int n3 = teclado.nextInt();

    //proceso 

    if ((n1 > n2) && (n1 > n3)) {
      System.out.println("El mayor es "+n1);
    }else if ((n2 > n1) && (n2 > n3)) {
      System.out.println("El mayor es "+n2);
    }else if ((n3 > n1) && (n3 > n2)) {
      System.out.println("El mayor es "+n3);
    }

    if ((n1 < n2) && (n1 < n3)) {
      System.out.println("El menor es "+n1);
    }else if ((n2 < n1) && (n2 < n3)) {
      System.out.println("El menor es "+n2);
    }else if ((n3 < n1) && (n3 < n2)) {
      System.out.println("El menor es "+n3);
    }
    
  }
}

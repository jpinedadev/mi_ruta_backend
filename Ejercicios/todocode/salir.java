//realizar un programa que muestre en pantalla
//palabras que sean ingresadas por teclado hasta
//que se ingrese la palabra "salir"

import java.util.Scanner;

public class salir {
  public static void main(String[] args) {
   System.out.println("--Bienvenido al programa--"); 

   //entrando datos 
   Scanner teclado = new Scanner(System.in);
    System.out.println("Ingrese una palabra");
    String palabra = teclado.next();

   //realizando el proceso 
   while (!palabra.equals("salir")) {
    System.out.println("Ingrese una palabra");
    palabra = teclado.next();
   }
   
  }
}

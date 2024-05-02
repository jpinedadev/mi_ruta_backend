// ejercicio arrays:
// Llevar a cabo un programa que incluya un vector que almacene los nombres:
//  - Alejandra, Leonardo, Rosa, Guillermo, Daniel, Luisa y Ludmila.
// Realizar un recorrido del vector para 
//  - cargar los datos 
//  - y otro para mostrar los mismos por pantalla.

import java.util.Scanner;

public class nombres {
  public static void main(String[] args) {
    System.out.println("--Bienvenido al programa--");

    //declarar vector
    String nombres[] = new String[7];

    //cargar datos 
    Scanner teclado = new Scanner(System.in);

    for (int i = 0; i < nombres.length; i++) {
      System.out.println("-- Ingrese el nombre Nº "+(i+1));
      nombres[i] = teclado.next();
    }

    //mostrar datos 

    System.out.println("---- Mostrando Nombres ----");

    for (int i = 0; i < nombres.length; i++) {
      System.out.println(nombres[i]+" ");
    }
  }
}

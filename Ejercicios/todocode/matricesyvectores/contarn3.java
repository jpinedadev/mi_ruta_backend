//realizar un programa que permita cargar 15 numeros en un vector. una vez cargados, se necesita que el programa cuente e informe por pantalla cuantaas veces se cargo el numero 3

import java.util.Scanner;

public class contarn3 {
  public static void main(String[] args) {
    System.out.println("--Bienvenido al programa--");
    //cargar datos 
    Scanner teclado = new Scanner(System.in);
    int vector[] = new int[15];
    int cont=0;

    for (int i = 0; i < vector.length; i++) {
      System.out.println("Ingrese un numero: ");
      vector[i] = teclado.nextInt();
      if (vector[i] == 3) {
        cont = cont + 1;
      }
    }
    
    System.out.println("----------------------------------");
    System.out.println("El 3 se ha repetido "+cont+" veces");
    System.out.println("----------------------------------");
    
  }
}

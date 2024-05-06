// Construye un algoritmo dado como datos la categoría y el sueldo de un
// trabajador, calcule el aumento correspondiente, 
// teniendo en cuenta la siguiente tabla.
//     categoria    porcentaje
//     1            15%
//     2            10%
//     3            8%
//     4            7%

import java.util.Scanner;

public class ejercicio2 {
  public static void main(String[] args) {
    int op;
    double sueldo, nSueldo;

    Scanner teclado = new Scanner(System.in);
    System.out.println("--Menu--");
    System.out.println("Categoria del 1-4");
    System.out.print("Ingrese la categoria: ");
    op = teclado.nextInt();
    System.out.print("Ingrese el sueldo: ");
    sueldo = teclado.nextDouble();

    switch (op) {
      case 1:
        nSueldo = sueldo+(sueldo*0.15);
        break;
      case 2:
        nSueldo = sueldo+(sueldo*0.10);
        break;
      case 3:
        nSueldo = sueldo+(sueldo*0.08);
        break;
      case 4:
        nSueldo = sueldo+(sueldo*0.07);
        break;
      default:
        nSueldo = sueldo;
        break;
    }

    System.out.println("El nuevo sueldo es: "+nSueldo);
    
  }
}


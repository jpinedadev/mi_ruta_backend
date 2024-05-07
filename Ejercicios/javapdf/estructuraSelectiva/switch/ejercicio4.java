// Escriba el algoritmo que permita calcular lo que hay que pagarle a un tra-
// bajador teniendo en cuenta su sueldo y las horas extras trabajadas. Para el
// pago de horas extras se toma en cuenta la categoría del trabajador
//
// Categoría  Precio Hora Extra
//    1          30
//    2          38
//    3          50
//    4          70

import java.util.Scanner;

public class ejercicio4 {
  public static void main(String[] args) {
    int categoria;
    double sueldo, nHoras, nSueldo;

    Scanner teclado = new Scanner(System.in);

    System.out.println("Ingrese la categoria: ");
    categoria = teclado.nextInt();

    System.out.println("Ingrese el sueldo: ");
    sueldo = teclado.nextDouble();

    System.out.println("ingrese las horas extras: ");
    nHoras = teclado.nextDouble();

    switch (categoria) {
      case 1:
        nSueldo = sueldo + (nHoras*30);
        break;
      case 2:
        nSueldo = sueldo + (nHoras*38);
        break;
      case 3:
        nSueldo = sueldo + (nHoras*50);
        break;
      case 4:
        nSueldo = sueldo + (nHoras*70);
        break;
      default:
        System.out.println("xxx Categoria no valida xxx");
        nSueldo = sueldo;
        break;
    }

    System.out.println("El nuevo sueldo es: "+nSueldo);
  }
}

// una pequeña despensa desea calcular los sueldos de sus empleados
// los puestos de los mismos pueden tener 3 categorias 
// 1.- repositor
// 2.- cajero
// 3.- supervisor
//
// los repositores cobran $15.890 + un bono del 10%
// los cajeros cobran $25.630,89 fijos
// los supervisores cobran $35.560,20 en bruto al cual se le descuenta un 11%
// de jubilacion.
//
// se necesita un programa que dependiendo del tipo de empleado del que se 
// trate, calcule y muestre en pantalla el correspondiente sueldo.

import java.util.Scanner;

public class despensa {
  public static void main(String[] args) {
    double sueldo;
    int op;

    System.out.println("--Menu--");
    System.out.println("1.- repositor");
    System.out.println("2.- cajero");
    System.out.println("3.- supervisor");
    System.out.println("Ingrese una opcion: ");
    Scanner teclado = new Scanner(System.in);
    op = teclado.nextInt();

    switch (op) {
      case 1:
        sueldo = 15890+(15890 * 0.10);
        System.out.println("El sueldo es: "+sueldo);
        break;
      case 2:
        sueldo = 25630.89;
        System.out.println("El sueldo es: "+sueldo);
        break;
      case 3:
        sueldo = 35560.20-(35560.20 * 0.11);
        System.out.println("El sueldo es: "+sueldo);
        break;
      default:
        System.out.println("xx Opcion no valida xxx");
        break;
    }


  }
}

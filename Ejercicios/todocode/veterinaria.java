// se necesita un algoritmo para una veterinaria que determine
// el precio de las atenciones dadas a una mascota.
// Tener en cuenta que el usuario debera ingresar:
// 1.- Para servicio de baño valor $3500
// 2.- servicio de peluqueria valor $6000
// 3.- para vacunacion $12500
// 4.- servicio de baño y peluqueria
// 5.- para los 3 servicios
// 6.- para baño y vacunacion
// 7.- para peluqueria y vacunacion
//
// en base a la opcion ingresada se debera mostrar por pantalla
// el monto total gastado por el propietario.

import java.util.Scanner;

public class veterinaria {
  public static void main(String[] args) {
    int op, banio=3500,peluqueria=6000,vacunacion=12500;
    Scanner teclado = new Scanner(System.in);

    System.out.println("-----Menu-----");
    System.out.println("1.- Baño");
    System.out.println("2.- Peluqueria");
    System.out.println("3.- Vacunacion");
    System.out.println("4.- Baño y peluqueria");
    System.out.println("5.- Baño, Peluqueria y Vacunacion");
    System.out.println("6.- Baño y vacunacion");
    System.out.println("7.- Peluqueria y vacunacion");
    System.out.print("Ingrese una opcion: ");
    op = teclado.nextInt();

    switch (op) {
      case 1:
        System.out.println("Valor del baño es: "+banio);
        break;
      case 2:
        System.out.println("Valor de la peluqueria es: "+peluqueria);
        break;
      case 3:
        System.out.println("Valor de la vacunacion es: "+vacunacion);
        break;
      case 4:
        System.out.println("Valor del baño y peluqueria es: "+(banio+peluqueria));
        break;
      case 5:
        System.out.println("Valor del de los 3 servicios es: "+(banio+peluqueria+vacunacion));
        break;
      case 6:
        System.out.println("Valor del baño y vacunacion es: "+(banio+vacunacion));
        break;
      case 7:
        System.out.println("Valor de peluqueria y vacunacion es: "+(peluqueria+vacunacion));
        break;

      default:
        System.out.println("xxx opcion no valida xxx");
        break;
    }
  }
}

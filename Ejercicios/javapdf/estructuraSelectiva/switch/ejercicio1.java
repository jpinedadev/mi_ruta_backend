// Escribir un algoritmo dado como datos: Numero, Valor y Resultado obte-
// niendo los resultados según las siguientes funciones:
/*       opcion         resultado 
 *       1              100*valor 
 *       2              100^valor 
 *       3              100/valor
 */


import java.util.Scanner;

public class ejercicio1 {
  public static void main(String[] args) {
    int op, valor;
    double resultado;
    Scanner teclado = new Scanner(System.in);

    System.out.println("--Menu--");
    System.out.println("1- multiplica el numero 100");
    System.out.println("2- eleva a la potencia de numero");
    System.out.println("3- divide el numero entre 100");
    System.out.print("ingrese una opcion: ");
    op = teclado.nextInt();
    System.out.print("ingrese el valor en numero; ");
    valor = teclado.nextInt();

    switch (op) {
      case 1:
        resultado = 100*valor;
        break;
      case 2:
        resultado = Math.pow(100, valor);
        break;
      case 3:
        resultado = 100/valor;
      default:
        resultado = 0;
        break;
    }

    System.out.println("El resultado es: "+resultado);

  }
}

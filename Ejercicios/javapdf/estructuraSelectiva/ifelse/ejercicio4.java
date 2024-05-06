// Construya un algoritmo dado como dato el sueldo de un trabajador, aplique
// un aumento del 15% si su sueldo es inferior a $1,000.00 y el 12% en caso
// contrario. Imprima el nuevo sueldo del trabajador.


import java.util.Scanner;

public class ejercicio4 {
  public static void main(String[] args) {

    double sueldo, aumento;

    Scanner teclado = new Scanner(System.in);

    System.out.println("Ingrese el sueldo:");
    sueldo = teclado.nextDouble();

    if (sueldo < 1000) {
      aumento = sueldo+(sueldo*0.15);
      System.out.println("El nuevo sueldo es de: "+aumento);
    }else{
      aumento = sueldo+(sueldo*0.12);
      System.out.println("El nuevo sueldo es de: "+aumento);
    }
    
  }
}

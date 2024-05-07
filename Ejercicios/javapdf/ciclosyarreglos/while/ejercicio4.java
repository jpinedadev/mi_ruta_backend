// me salte el 3 xd
// Calcule el aumento de sueldo para un grupo de empleados de una empresa
// teniendo en cuenta el siguiente criterio, 
// - si sueldo es inferior a 1000, aumento del 15%, 
// - si sueldo es mayor o igual a 1000, aumento del 12%. 
// Imprima el sueldo nuevo del trabajador y el total de nómina de la empresa,
// considerando este nuevo aumento.

import java.util.Scanner;

public class ejercicio4 {
  public static void main(String[] args) {
    //variables
    double sueldo,nSueldo,nomina; //nomina es el total del sueldo del grupo
    int nTrabajadores;

    Scanner teclado = new Scanner(System.in);
    System.out.println("ingrese el Nº de trabajadores del grupo: ");
    nTrabajadores = teclado.nextInt();

    while (nTrabajadores >0) {
      System.out.println("sueldo de los trabajadores del grupo: ");
      sueldo = teclado.nextDouble();

      if (sueldo < 1000) {
        nSueldo = sueldo+(sueldo*0.15);
      }else{
        nSueldo = sueldo+(sueldo*0.12);
      }
      nomina = nSueldo*nTrabajadores;
      System.out.println("Nuevo sueldo: "+nSueldo);
      System.out.println("Costo total de la nomina: "+nomina);

      System.out.println("******************************");
      System.out.println("Nº de trabajadores del nuevo grupo: ");
      nTrabajadores = teclado.nextInt();
      
    }
  }
}

//obtenga el IVA de una venta, si esta es superior a $10.000 aplique un descuento del 25% , en caso contrario no se le aplica el impuesto 

import java.util.Scanner;

public class iva {
  public static void main(String[] args) {
    //pedir datos 
    Scanner teclado = new Scanner(System.in);
    System.out.println("--Bienvenido--");
    System.out.print("Ingrese el total de la venta: ");
    int venta = teclado.nextInt();
    double iva, totalIva;

    //proceso 
    if (venta > 10000) {
      double totalDesc = (venta - (venta*0.25));
      iva = totalDesc * 0.15;
      totalIva = totalDesc + iva;
      System.out.println("Total - descuento 25% es: " + totalDesc);
      System.out.println("Total + iva: " + totalIva);
    }else{
      iva = venta * 0.15;
      totalIva = venta + iva;
      System.out.println("El total + iva es: " + totalIva);
    }
    
  }
}

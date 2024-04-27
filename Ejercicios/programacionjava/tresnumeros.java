//dado tres numeros, halle la suma del primero con el segundo, y el producto del segundo con el tercero.

import java.util.Scanner;

public class tresnumeros {
  public static void main(String[] args) {
    //pedir datos 
    System.out.println("--Bienvenido--");
    Scanner teclado = new Scanner(System.in);

    System.out.print("Primer numero: ");
    int n1 = teclado.nextInt();
    System.out.print("Segundo numero: ");
    int n2 = teclado.nextInt();
    System.out.print("Tercer numero: ");
    int n = teclado.nextInt();

    //proceso 
    int suma = n1+n2;
    int pro = n2*n3;

    //presentando
    System.out.println("la suma del primero con el segundo es: "+suma);
    System.out.println("el producto del segundo con el tercero es:"+pro);
    
  }
}

//realizar un programa en java que
//encuentre el promedio de 3 cantidades 

import java.util.Scanner;

public class promediotrescant {
  public static void main(String[] args) {
    System.out.println("--Promedio de 3 numeros--");

    //ingresando datos 
    Scanner teclado = new Scanner(System.in);
    System.out.println("Ingrese el primer numero: ");
    int nota1 = teclado.nextInt();
    System.out.println("Ingrese el segundo numero: ");
    int nota2 = teclado.nextInt();
    System.out.println("Ingrese el tercer numero: ");
    int nota3 = teclado.nextInt();

    //realizando el proceso 
    int promedio = (nota1+nota2+nota3)/3;

    //presentando resultado 
    System.out.println("El promedio es: " + promedio);

    
  }
}

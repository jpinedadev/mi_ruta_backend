//dado dos numeros enteros, haga que un programa realice las cuatro operaciones aritmeticas.

import java.util.Scanner;

public class calculadora {
  public static void main(String[] args) {

    //ingresando datos
    Scanner teclado = new Scanner(System.in);
    System.out.println("--Bienvenido--");
    System.out.println("Primer numero: ");
    int n1 = teclado.nextInt();
    System.out.println("Segundo numero");
    int n2 = teclado.nextInt();

    //proceso 

    int suma = n1+n2;
    int resta = n1-n2;
    int multi = n1*n2;
    double divi = n1/n2;

    //presentando 
    System.out.println("La suma es: " + suma);
    System.out.println("La resta es: " + resta);
    System.out.println("La multiplicacion es: " + multi);
    System.out.println("La division es: " + divi);
  }
}

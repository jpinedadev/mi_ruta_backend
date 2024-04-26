// Elaborar un programa en java que permita
// sumar, restar, multiplicar y dividir 2 cantidades
import java.util.Scanner;

public class opdoscant {
  public static void main(String[] args) {
    System.out.println("---Bienvenido al programa---");
    Scanner numero = new Scanner (System.in);
    
    //Ingresando datos en una variable
    System.out.println("Ingrese el primer numero: ");
    int numero1 = numero.nextInt();
    System.out.println("Ingrese el segundo numero: ");
    int numero2 = numero.nextInt();

    //Realizando los procesos matematicos
    int suma = numero1 + numero2;
    int resta = numero1 - numero2;
    int multiplicacion = numero1 * numero2;
    int division = numero1 / numero2;

    //Presentando datos
    System.out.println("Suma: " + suma);
    System.out.println("Resta: " + resta);
    System.out.println("Multiplicacion: " + multiplicacion);
    System.out.println("Division: " + division);

  }
}

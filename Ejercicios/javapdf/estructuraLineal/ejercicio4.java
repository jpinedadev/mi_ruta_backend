// Construya el algoritmo tal que, dado el radio de una esfera, 
// calcule e imprima el área y su volumen.
// Consideraciones:  
// • El área de una esfera la calculamos de esta forma: 
//    Área = 4 *π * ( radio )^2
// • El volumen como: 
//    Volumen = 4/3 *π * radio^3

import java.util.Scanner;

public class ejercicio4 {
  public static void main(String[] args) {
    System.out.println("--Bienvenido al programa--");
    double radio, area, volumen;
    final double PI = Math.PI;

    //ingresando datos 
    Scanner teclado = new Scanner(System.in);
    System.out.print("Ingrese el radio: ");
    radio = teclado.nextDouble();

    area = (4*PI)*(radio*radio);
    volumen = ((4*PI)*(radio*radio*radio))/3;

    //mostrando datos 
    System.out.println("El area es: "+area);
    System.out.println("El volumen es: "+volumen);
    
  }
}

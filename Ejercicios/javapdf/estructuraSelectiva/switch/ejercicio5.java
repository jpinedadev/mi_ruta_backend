// La siguiente tabla expresa los costos diarios según el tipo de enfermedad,
// construye un algoritmo que calcule e imprima el costo total que representa
// un paciente, considerando que, si el paciente tiene de 14 a 22 años, se le
// agrega al costo total a pagar un 10% sobre el costo.
//
//Enfermedad   Costo paciente día
//       1            25
      // 2            16
      // 3            20
      // 4            30

import java.util.Scanner;

public class ejercicio5 {
  public static void main(String[] args) {
    String nombre;
    int enfermedad, dias, edad;
    double costo;
    Scanner teclado = new Scanner(System.in);
    Scanner teclado2 = new Scanner(System.in);

    System.out.println("Nombre: ");
    nombre = teclado.next();
    System.out.println("Edad: ");
    edad = teclado2.nextInt();
    System.out.println("Enfermedad [1-4]: ");
    enfermedad = teclado2.nextInt();
    System.out.println("dias internados: ");
    dias= teclado2.nextInt();

    switch (enfermedad) {
      case 1:
        costo = dias*25;
        break;
      case 2:
        costo = dias*16;
        break;
      case 3:
        costo = dias*20;
        break;
      case 4:
        costo = dias*30;
      default:
        costo = dias;
        System.out.println("xxx opcion no valida xxx");
        break;
    }

    //14 a 22 años se le agrega 10%
    if (edad>= 14 && edad <=22) {
      costo = costo + (costo*0.10);
      System.out.println("valor total: "+costo);
    }else{
      System.out.println("valor total: "+costo);
    }
  }
}

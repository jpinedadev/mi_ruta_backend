// Ejercicio vectores:
// En tres vectores diferentes se guardan los nombres, temperaturas minimas
// y maximas de 5 ciudades de la provincia de Misiones.
//  - En el primer vector se guardan los nombres de las ciudades,
//  - en el segundo las temperaturas minimas alcanzada y 
//  - en el tercero las temperaturas maximas alcanzadas en la ultima semana.
// Se necesita un programa que permita: 
//  - la carga de las ciudades
//  - sus temperaturas minimas 
//  - sus temperaturas maximas
//  - informar por pantalla cual fue la ciudad con la temperatura
//    - mas baja
//    - y cual con la mas alta
// ********************************************
// * Oberá		*	16	*	29 *
// * Posadas	*	18	*	32 *
// * L.N. Alem	*	15	*	28 *
// ********************************************

import java.util.Scanner;

public class temperatura {
  public static void main(String[] args) {
    System.out.println("--Bienvenido al programa--");

    //tres vectores 
    String ciudades[] = new String[3];
    int tempMax[] = new int[3];
    int tempMin[] = new int[3];

    Scanner teclado = new Scanner(System.in);

    //cargar ciudades 
    for (int i = 0; i < ciudades.length; i++) {
      System.out.print("Ingrese el nombre de la ciudad "+(i+1)+": ");
      ciudades[i] = teclado.next();
    }
    //cargar temperatura minima 
    for (int i = 0; i < tempMin.length; i++) {
      System.out.print("Ingrese la temperatura minima de la ciudad  "+(i+1)+": ");
      tempMin[i] = teclado.nextInt();
    }
    //cargar temperatura maxima 
    for (int i = 0; i < tempMax.length; i++) {
      System.out.print("Ingrese la temperatura maxima de la ciudad  "+(i+1)+": ");
      tempMax[i] = teclado.nextInt();
    }
//  - informar por pantalla cual fue la ciudad con la temperatura
//    - mas baja
//    - y cual con la mas alta
    System.out.println("---Mostrando Datos---");

    if ((tempMin[0]<tempMin[1]) && (tempMin[0]<tempMin[2])) {
      System.out.println("La ciudad con menor temp es: "+ciudades[0]+" con "+tempMin[0]+"º");
    }else if ((tempMin[1]<tempMin[0]) && (tempMin[1]<tempMin[2])) {
      System.out.println("La ciudad con menor temp es: "+ciudades[1]+" con "+tempMin[1]+"º");
    }else{
      System.out.println("La ciudad con menor temp es: "+ciudades[2]+" con "+tempMin[2]+"º");
    }

    if ((tempMax[0]>tempMax[1]) && (tempMax[0]>tempMax[2])) {
      System.out.println("La ciudad con mayor temp es: "+ciudades[0]+" con "+tempMax[0]+"º");
    }else if ((tempMax[1]>tempMax[0]) && (tempMax[1]>tempMax[2])) {
      System.out.println("La ciudad con mayor temp es: "+ciudades[1]+" con "+tempMax[1]+"º");
    }else{
      System.out.println("La ciudad con mayor temp es: "+ciudades[2]+" con "+tempMax[2]+"º");
    }
    
  }
}

//En la ciudad de Oberá, Misiones se realiza año a año la "Maraton del inmigrante" en marco de la fiesta Nacional del Inmigrante. 
//El evento cuenta con un dia de inscripciones el dia anterior a la carrera, por lo que se desconoce la cantidad exacta de inscriptos que pueda llegar a haber. Desde la Federacion de Colectividades (Organismo que organiza), manifestaron que solicitan los siguientes datos para la inscripcion de cada participante: dni, nombre y edad.
//En cuanto a las categorias posibles para una inscripcion, se manejan las siguientes:
//Menores A (de 5 a 10 años)
//Menores B (de 11 a 17 años)
//Adultos (de 18 a 30 años)
//Adultos mayores (mayores de 50 años)
//Se necesita un programa que, a partir del ingreso de los datos y edad de cada participante, se muestre por pantalla a que categoria debe ser inscripto. Cabe destacar que, al finalizar el dia, para dar fin a las inscripciones, se debe ingresar un dni con el valor 0 y un nombre con la palabra "fin".

import java.util.Scanner;

public class maraton {
  public static void main(String[] args) {
    //pedir datos 
    System.out.println("--Bienvenido al programa--");
    Scanner teclado = new Scanner(System.in);
    int edad, dni=1;
    String categoria, nombre="inicio";

    while (dni != 0 && !nombre.equals("fin")) {
      System.out.println("--Ingreso de nuevo usuario--");
      System.out.print("Ingrese el nombre: ");
      nombre = teclado.next();
      System.out.print("Ingrese la edad: ");
      edad = teclado.nextInt();
      System.out.print("Ingrese el dni: ");
      dni = teclado.nextInt();
    
     //validacion categoria 
      if (edad >= 5 && edad <= 10) {
        categoria = "Menores A";
        System.out.println("Ingresa a la categoria " + categoria);
      } else if (edad <= 11 && edad <=17) {
        categoria = "Menores B";
        System.out.println("Ingresa a la categoria " + categoria);
      }else if (edad <= 18 && edad <= 30) {
        categoria = "Adultos";
        System.out.println("Ingresa a la categoria " + categoria);
      }else{
        categoria = "Adultos Mayores";
        System.out.println("Ingresa a la categoria " + categoria);
      }
    }

    
  }
}

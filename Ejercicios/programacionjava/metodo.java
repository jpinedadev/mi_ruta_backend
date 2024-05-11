import java.util.*;

public class metodo {
  public static void main(String[] args) {
     Scanner entrada = new Scanner(System.in);
     int numero1, numero2, resultado;
     System.out.println("Ingrese el primer numero: ");
     numero1 = entrada.nextInt();
     System.out.println("Ingrese el segundo numero: ");
     numero2 = entrada.nextInt();
     resultado = suma(numero1,numero2);
     //sumar es el metodo 
     System.out.println("Suma: "+resultado);
  }

  public static int suma(int a,int b) {
    int c;
    c = a+b;
    return c;
  }
}

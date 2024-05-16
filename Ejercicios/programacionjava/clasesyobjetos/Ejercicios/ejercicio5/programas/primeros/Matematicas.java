//utilizando la importacion de clases y proyectos, cree un programa que haga
//las operaciones aritmeticas basicas, e incluya los metodos matematicos pow y sqrt.

package ejercicio5.programas.primeros;

public class Matematicas {

  double n1, n2;

  public Matematicas(double n1,double n2){
    this.n1 = n1;
    this.n2 = n2;
  }

  public double sumar(){
    return n1+n2;
  }

  public double restar(){
    return n1-n2;
  }

  public double multiplicar(){
    return n1*n2;
  }

  public double dividir(){
    return n1/n2;
  }

  public double potenciar(){
    return Math.pow(n1,n2);
  }

  public double cuadrada(){
    return Math.sqrt(n1);
  }

  public static void main(String[] args) {
    Matematicas aritmetica = new Matematicas(4,2);

    System.out.println("Suma: "+aritmetica.sumar());
    System.out.println("Resta: "+aritmetica.restar());
    System.out.println("Multiplicacion: "+aritmetica.multiplicar());
    System.out.println("Division: "+aritmetica.dividir());
    System.out.println("Potencia: "+aritmetica.potenciar());
    System.out.println("Raiz cuadrada: "+aritmetica.cuadrada());
    
  }
}

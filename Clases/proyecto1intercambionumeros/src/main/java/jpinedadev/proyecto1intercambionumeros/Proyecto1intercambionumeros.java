

package jpinedadev.proyecto1intercambionumeros;


public class Proyecto1intercambionumeros {

    public static void main(String[] args) {
       int num1, num2, aux;
       num1 = 35;
       num2 = 20;
       aux = num2;
       
        System.out.println("-------Antes------");
        System.out.println("Num1: " + num1);
        System.out.println("Num2: " + num2);
        
        num2 = num1;
        num1 = aux;
        
        System.out.println("-------Después------");
        System.out.println("Num1: " + num1);
        System.out.println("Num2: " + num2);
    }
}

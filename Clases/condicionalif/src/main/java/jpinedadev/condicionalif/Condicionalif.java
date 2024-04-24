

package jpinedadev.condicionalif;

public class Condicionalif {

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        
        if (num1 > num2) {
            System.out.println("num1 es mayor que num2");
        }
        else{
            if (num1 == num2) {
                System.out.println("num1 y num2 son iguales");
            }
            else{
                System.out.println("num2 es mayor que num1");
            }
        }
    }
}

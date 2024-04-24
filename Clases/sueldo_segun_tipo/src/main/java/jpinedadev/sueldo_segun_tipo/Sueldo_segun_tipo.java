package jpinedadev.sueldo_segun_tipo;
import java.util.Scanner;

public class Sueldo_segun_tipo {

    public static void main(String[] args) {
        int categoria;
        double sueldo=0;
        
        System.out.println("---BIENVENIDO AL PROGRAMA---");
        System.out.println("Categoria de empleado: ");
        System.out.println("1.- repositor");
        System.out.println("2.- cajero");
        System.out.println("3.- supervirsor");
        
        System.out.println("Ingrese la categoria: ");
        Scanner teclado = new Scanner (System.in);
        categoria = teclado.nextInt();
        
        if (categoria == 1) {
            sueldo = 15890 + (15890 * 0.10);
        }
        else if (categoria == 2){
            sueldo = 25630.89;
        }
        else if(categoria == 3){
            sueldo = (35560.20 - (35560.20*0.11));
        }
        else{
            System.out.println("Categoria invalida, vuelva a intentar...");
        }
        System.out.println("El sueldo a percibir es: " +  sueldo);
    }
}

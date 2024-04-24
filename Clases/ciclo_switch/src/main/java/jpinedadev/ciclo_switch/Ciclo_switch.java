

package jpinedadev.ciclo_switch;

public class Ciclo_switch {

    public static void main(String[] args) {
        int dia = 1;
        String nombreDia;
        
        switch (dia){
            case 1: 
                  nombreDia = "Lunes";
                  break;
            case 2:
                  nombreDia = "Martes";
                  break;
            case 3:
                  nombreDia = "Miercoles";
                  break;
            case 4:
                  nombreDia = "Jueves";
                  break;
            case 5:
                  nombreDia = "Viernes";
                  break;
            case 7:
                  nombreDia = "Sabado";
                  break;
            case 8:
                  nombreDia = "Domingo";
                  break;
            default:
                  nombreDia = "Dia invalido";
                  break;
                
        }
        System.out.println("El dia es: " + nombreDia);
    }
}

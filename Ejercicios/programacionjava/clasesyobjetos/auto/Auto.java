
public class Auto {

  private int ruedas,ancho,largo,motor,peso;
  private String color;
  int peso_total;
  boolean asientosCuero,aireAcond;

  public Auto(){
    ruedas = 4;
    ancho = 300;
    largo = 2200;
    motor = 1600;
    peso = 600;
  }

  public String cantidad_ruedas(){
    return "La cantidad de ruedas es: "+ruedas;
  }

  public void establecer_color(String color_auto){//setter
    color = color_auto;
  }

  public String unColor(){ //getter
    return "El color del coche es: "+color;
  }

  public void establecer_asientos(String asientos){//setter
    if (asientos.equalsIgnoreCase("si")) {
      this.asientosCuero = true;
    }else{
      this.asientosCuero = false;
    }
  }

  public String tipoAsientos(){//getter
    if (asientosCuero) {
      return "El coche lleva asientos de cuero";
    } else{
      return "El coche lleva asientos normales";
    }
  }

  public static void main(String[] args) {
    Auto mercury = new Auto();
    System.out.println(mercury.cantidad_ruedas());
    mercury.establecer_color("rojo");
/*     mercury.color = "verde"; */
    System.out.println(mercury.unColor());
    mercury.establecer_asientos("no");
    System.out.println(mercury.tipoAsientos());
  }
}

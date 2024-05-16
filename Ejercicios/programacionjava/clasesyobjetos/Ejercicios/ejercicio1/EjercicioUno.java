//cree una clase, luego instancia un objeto en ella usando java

public class EjercicioUno {

  //campos o atributos de la clase
  private int miNumero;
  private String miTexto;

  //constructor de la clase 
  public EjercicioUno(int numero, String texto){
    this.miNumero = numero;
    this.miTexto = texto;
  }

  //metodos 
  public void mostrarDatos(){
    System.out.println("Numero: "+miNumero);
    System.out.println("Texto: "+miTexto);
  }

  //setter 
  public void setMiTexto(String texto){
    this.miTexto = texto;
  }

  //getter
  public int getMiNumero(){
    return this.miNumero;
  }


  public static void main(String[] args) {
    EjercicioUno miObjeto = new EjercicioUno(10,"hola mundo");
    miObjeto.mostrarDatos();
    System.out.println("Actualizando datos...");
    miObjeto.setMiTexto("Hola amigos");
    miObjeto.getMiNumero();
    System.out.println("¡Datos actualizados!");
    miObjeto.mostrarDatos();

  }
}

//cree un metodo y provoque acceso a los miembros de la clase 

public class EjercicioDos {

  private int miNumero;
  public String miTexto;

  //constructor
  public EjercicioDos(int miNumero, String miTexto){
    this.miNumero = miNumero;
    this.miTexto = miTexto;
  }

  //metodos 
  public void acceso() {
    System.out.println("valor de mi numero: "+this.miNumero); //valor privado 
    System.out.println("valor de mi texto: "+this.miTexto);//valor publico 
  }

  public static void main(String[] args) {
    //creando una instancia del objeto 
    EjercicioDos miObjeto = new EjercicioDos(10,"hola mundo");

    //llamando al metodo que permite el acceso 
    miObjeto.acceso();
    
  }
}

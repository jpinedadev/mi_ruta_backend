//cree tres metodos, uno sin parametros, otro con un parametro, y otro con tres parametros,
//luego invoque a esos metodos. 

public class MiClase {
  String producto,marca;
  int codigo;

  public MiClase() { //metodo sin parametros 
    this.producto = "no especifica";
    this.marca = "no especifica";
    this.codigo = 0;
  }

  public MiClase(String producto){//metodo con un parametro 
    this();
    this.producto = producto;
  }

  public MiClase(String producto, String marca, int codigo){//metodo con tres parametros 
    this.producto = producto;
    this.marca = marca;
    this.codigo = codigo;
  }

  //metodo para mostrar datos 
  public String mostrarDatos(){
    return "\nProducto: "+producto+"\nMarca: "+marca+"\nCodigo: "+codigo;
  }

  public static void main(String[] args) {
    MiClase miObjeto1 = new MiClase();
    MiClase miObjeto2 = new MiClase("Lapiz");
    MiClase miObjeto3 = new MiClase("Lapiz","Bic",35);

    System.out.println(miObjeto1.mostrarDatos());
    System.out.println(miObjeto2.mostrarDatos());
    System.out.println(miObjeto3.mostrarDatos());
  }
}

// crea un metodo que reciba dos arrays como parametros,
// y devuelva un array con los valores maximos de cada una
// de las posiciones.

public class ejercicio4 {
  public static void main(String[] args) {
    int[] primerArray = new int[4];
    int[] segundoArray = new int[4];
    int[] maxArray = new int[4];

    primerArray[0] = 4;
    primerArray[1] = 8;
    primerArray[2] = 15;
    primerArray[3] = 1;

    segundoArray[0] = 7;
    segundoArray[1] = 2;
    segundoArray[2] = 11;
    segundoArray[3] = 18;

    for (int i = 0; i < maxArray.length; i++) {
      if (primerArray[i] > segundoArray[i]) {
        maxArray[i] = primerArray[i];
      }else{
        maxArray[i] = segundoArray[i];
      }
      System.out.print("-"+maxArray[i]);
    }

  }
}


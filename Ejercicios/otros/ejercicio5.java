// crear un metodo que dada dos matrices A y B, las compare elemento
// a elemento y muestre otra matriz M. Dicha matriz debe tener el valor
// maximo en cada una de las posiciones.

public class ejercicio5 {
  public static void main(String[] args) {
    int[][] matrizA = new int[3][3];
    int[][] matrizB = new int[3][3];
    int[][] matrizM = new int[3][3];

    matrizA[0][0] = 1;
    matrizA[0][1] = 2;
    matrizA[0][2] = 3;
    matrizA[1][0] = 6;
    matrizA[1][1] = 7;
    matrizA[1][2] = 8;
    matrizA[2][0] = 10;
    matrizA[2][1] = 8;
    matrizA[2][2] = 15;

    matrizB[0][0] = 5;
    matrizB[0][1] = 1;
    matrizB[0][2] = 4;
    matrizB[1][0] = 7;
    matrizB[1][1] = 3;
    matrizB[1][2] = 11;
    matrizB[2][0] = 11;
    matrizB[2][1] = 12;
    matrizB[2][2] = 13;
    
    for (int f = 0; f < 3; f++) {
      for (int c = 0; c < 3; c++) {
        if (matrizA[f][c] > matrizB[f][c]) {
          matrizM[f][c] = matrizA[f][c];
        }else{
          matrizM[f][c] = matrizB[f][c];
        }
      }
    }

    //presentando datos 
    for (int f = 0; f < 3; f++) {
      System.out.println(" ");
      for (int c = 0; c < 3; c++) {
        System.out.print(" "+matrizM[f][c]);
      }
    }


  }
}

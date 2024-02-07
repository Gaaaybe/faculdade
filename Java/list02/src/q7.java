//Questão 7//
import java.util.Scanner;

public class q7 {

    public static final int ORDEM = 2;
    public static Scanner leitor;

    public static void preecheMatriz(int matriz[][]) {

        for(int i=0; i<ORDEM; i++){
            for(int j=0; j<ORDEM; j++){
                System.out.printf("Digite o valor da matriz linha %d, coluna %d: ",(i+1),(j+1));
                matriz[i][j] = leitor.nextInt();
            }
        }
    }

    public static int[][] operaMatriz(int matrizA[][], int matrizB[][], int operador){

        int Total[][] = new int[ORDEM][ORDEM];

        switch(operador){
            case 0:
                for(int i=0; i<ORDEM; i++){
                    for(int j=0; j<ORDEM; j++){
                        Total[i][j] = (matrizA[i][j] + matrizB[i][j]);
                    }

                }
                break;

            case 1:
                for(int i=0; i<ORDEM; i++){
                    for(int j=0; j<ORDEM; j++){
                        Total[i][j] = (matrizA[i][j] - matrizB[i][j]);
                    }

                }
                break;
            default:
            System.out.println("Opção inválida");


        }

        return Total;

    }
        public static void main (String[]args) {

            leitor = new Scanner(System.in);
            int mat1[][] = new int[ORDEM][ORDEM];
            int mat2[][] = new int[ORDEM][ORDEM], i;
            int Total[][] = new int[ORDEM][ORDEM];

            System.out.println("\n---MATRIZ 1---\n");
            preecheMatriz(mat1);

            System.out.println("\n---MATRIZ 2---\n");
            preecheMatriz(mat2);

            System.out.println("\n---SOMA---\n");

            Total = operaMatriz(mat1, mat2, 0);

            for(i=0; i<ORDEM; i++){

                for(int j=0; j<ORDEM; j++){
                    System.out.print("  | "+Total[i][j]+ " | ");
            }
            System.out.println("");
    }

    System.out.println("\n---SUBTRAÇÃO---\n");

    Total = operaMatriz(mat1, mat2, 1);

    for(i=0; i<ORDEM; i++){

        for(int j=0; j<ORDEM; j++){
            System.out.print("  | "+Total[i][j]+ " | ");
    }
    System.out.println("");
}
}
}


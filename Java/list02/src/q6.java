//Questão 6//
import java.util.Scanner;

public class q6 {

    public static final int linha = 3, coluna = 2;
    public static Scanner leitor;

    public static void preecheMatriz(int matriz[][]) {

        for(int i=0; i<linha; i++){
            for(int j=0; j<coluna; j++){
                System.out.printf("Digite o valor da matriz linha %d, coluna %d: ",(i+1),(j+1));
                matriz[i][j] = leitor.nextInt();
            }
        }
    }

        public static void main (String[]args) {

            leitor = new Scanner(System.in);

            int matrix[][] = new int[linha][coluna];
            int matrixT[][] = new int[coluna][linha], i, j;

            System.out.println("\n---Valores da Matriz---\n");

            preecheMatriz(matrix);

            for(i=0; i<coluna; i++){
                for(j=0; j<linha; j++){
                    matrixT[i][j] = matrix[j][i];

                }
            }

            System.out.println("\n---Valores da Matriz Transposta---\n");

        for(i=0; i<coluna; i++){

            for(j=0; j<linha; j++){
                System.out.print("  | "+matrixT[i][j]+ " | ");
            }

        System.out.println("");
        }
        System.out.println("");
    }
}

//Questão 5//
import java.util.Scanner;

public class q5 {

    public static final int quantAlunos = 2, quantNotas = 3;
    public static Scanner leitor;

        public static void main (String[]args) {

            leitor = new Scanner(System.in);
            float medias[] = new float[quantAlunos], somaN=0;
            int i, j;

            for(i=0; i<quantAlunos; i++){
                System.out.printf("\n---Aluno %d---\n", (i+1));
                somaN = 0;

                for(j=0; j<quantNotas; j++){
                    System.out.printf("Digite a %dª Nota: ",(j+1));
                    Float aux = leitor.nextFloat();
                    somaN = somaN + aux;
                }

                medias[i] = (somaN / quantNotas);

                if(medias[i]>=7){
                    System.out.printf("A media do aluno %d foi %.1f e ele foi Aprovado\n",(i+1), medias[i]);
                }

                else{
                    System.out.printf("A media do aluno %d foi %.1f e ele foi Reprovado\n",(i+1), medias[i]);
                }
            }
        }      


}


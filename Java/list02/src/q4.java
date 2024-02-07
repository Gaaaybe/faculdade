//Questão 4//
import java.util.Scanner;

public class q4 {
    public static final int TAM = 10;
    public static Scanner leitor;
        public static void main (String[]args) {

            leitor = new Scanner(System.in);
            int vetorInteiro[] = new int[TAM], i, aux;

            for(i=0; i<TAM; i++){
                System.out.println("Digite um valor inteiro: ");
                vetorInteiro[i] = leitor.nextInt();

            }

            System.out.println("\n---ORDEM CRESCENTE---");

            for(i=0; i<TAM; i++){

                    for(int j=0; j<TAM-1; j++){

                        if(vetorInteiro[j]>vetorInteiro[j+1]){

                            aux = vetorInteiro[j];
                            vetorInteiro[j] = vetorInteiro[j+1];
                            vetorInteiro[j+1] = aux;

                        }
                    }
            }


        for(i=0; i<TAM; i++){
            System.out.print("{"+vetorInteiro[i] + "} ");
        }

        System.out.println("\n---ORDEM DECRESCENTE---");

        for(i=0; i<TAM; i++){

                for(int j=0; j<TAM-1; j++){

                    if(vetorInteiro[j]<vetorInteiro[j+1]){

                        aux = vetorInteiro[j];
                        vetorInteiro[j] = vetorInteiro[j+1];
                        vetorInteiro[j+1] = aux;

                    }
                }
        }


    for(i=0; i<TAM; i++){
        System.out.print("{"+vetorInteiro[i] + "} ");
    }



    }
}
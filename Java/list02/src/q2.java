//Questão 2//
import java.util.Scanner;
public class q2 {
    public static Scanner leitor;
        public static void main (String[]args) {

            leitor = new Scanner(System.in);

            float salario=0, pS=0, media_sal, maior=0;
            int filios, pF=0, media_fil, habitantes=0;

            while(salario != -1){
                habitantes++;

                System.out.println("Quantos filhos: ");
                filios = leitor.nextInt();
                pF = filios + pF;

                System.out.println("Qual o salario: ");
                salario = leitor.nextFloat();

                if(salario>maior){
                    maior = salario;
                }

                pS = salario + pS;

            }
            media_fil = (pF /habitantes);
            media_sal = (pS /habitantes);

            System.out.printf("O maior salario é R$%.2f. A media de salario é R$%.2f. A media de crianças é %d criança(s) por familia.",maior, media_sal, media_fil);
            
        }
}
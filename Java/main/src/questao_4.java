//Questão 4//
import java.util.Scanner;
public class questao_4 {
    public static Scanner leitor;
        public static void main (String[]args) {

            leitor = new Scanner(System.in);
            int num = 0, soma=0;

            while(num>=0){
                System.out.println("Digite um numero inteiro: ");
                num = leitor.nextInt();
                soma = soma+num;

            }
            System.out.println(soma);
        }
}






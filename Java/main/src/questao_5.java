//Questão 5//
import java.util.Scanner;
public class questao_5 {
    public static Scanner leitor;
    public static void main (String[]args) {

        int escolha;
        float preco = 24;
        leitor = new Scanner(System.in);
        System.out.println("\n---Bem vindo ao sistema de igressos do cinema mallox 2.0---\n");
        System.out.println("•Escolha seu ingresso: \n (1) - Estudante.\n (2) - Aposentado.\n (3) - Nenhuma das anteriores. \n>>> ");
        escolha = leitor.nextInt();

        switch (escolha) {
            case 1:
                System.out.println("O valor a ser pago é R$"+(preco*0.5));

                break;
            case 2:
                System.out.println("O valor a ser pago é R$"+(preco*0.3));

                break;
            case 3:
                System.out.println("O valor a ser pago é R$"+ preco);

                break;
            default:
                System.out.println("Comando Invalido...");

                break;
        }
        System.out.println("\nFIM...");
    }

}

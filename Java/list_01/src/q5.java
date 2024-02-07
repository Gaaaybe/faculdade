//Questão 5//
import java.util.Scanner;
public class q5 {
    public static Scanner leitor;
    public static void main (String[]args) {

        leitor = new Scanner(System.in);
        int idade;

        System.out.println("Diga sua idade: ");
        idade = leitor.nextInt();
        
        if (idade<16){
            System.out.println("Não eleitor.");
        }

        else if ( idade < 18 || idade > 65) {
            System.out.println("Eleitor facultativo.");
        }

        else {
            System.out.println("Eleitor obrigatorio.");
        }
    }
}
//Questão 4//
import java.util.Scanner;
public class q4 {
    public static Scanner leitor;
    public static void main (String[]args) {

        leitor = new Scanner(System.in);
        float deposito, juros, rendimento, total;

        System.out.println("\nDigite quanto deseja depositar(R$): ");
        deposito = leitor.nextFloat();
        System.out.println("Digite a taxa de juros(%): ");
        juros = leitor.nextFloat();

        rendimento = ((deposito*juros)/100);
        total = rendimento + deposito;

        System.out.println("Rendimento: R$"+rendimento+"\nTotal: R$"+total);

    }
}

//Questão 1//
import java.util.Scanner;
public class q1 {
    public static Scanner leitor;

    public static void main (String[]args) {


        leitor = new Scanner(System.in);
        int numero, i, result;

        System.out.println("Digite um numero inteiro: ");
        numero = leitor.nextInt();

        System.out.printf("---TABUADA---\n");

        for(i=0; i<11; i++){
            result = numero*(i+1);
            System.out.printf("%d * %d = %d\n", numero, (i+1), result);

        }


    }
}

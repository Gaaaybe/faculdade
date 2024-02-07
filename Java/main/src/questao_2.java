//Questão 2//
import java.util.Scanner;
public class questao_2 {
    public static Scanner leitor;
    public static void main (String[]args) {

        leitor = new Scanner(System.in);
        int num1, num2;
        System.out.println("Digite o Primeiro Valor:");
        num1 = leitor.nextInt();
        System.out.println("Digite o Segundo Valor:");
        num2 = leitor.nextInt();

        if(num1 > num2){
            System.out.println(num1+" é maior que "+num2);
        }
        else if(num2 > num1) {
            System.out.println(num2+" é maior que "+num1);
        }
        else{
            System.out.println("SIM! eles são IGUAIS.");
        }

    }
}

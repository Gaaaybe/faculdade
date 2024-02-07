//Questão 2//
import java.util.Scanner;
public class q2 {
    public static Scanner leitor;

    public static int verificaParImpar(int v){
        if( (v%2) == 0 ){
            return 1;
        }
        else{
            return 0;
        }

    }

    public static void main (String[]args) {


        leitor = new Scanner(System.in);
        int valor; 

        System.out.println("Digite um valor inteiro: ");
        valor = leitor.nextInt();

        System.out.println(verificaParImpar(valor));


    }
}

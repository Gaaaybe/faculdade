//Questão 3//
import java.util.Scanner;
public class q3 {
    public static Scanner leitor;
    public static void main (String[]args) {

        leitor = new Scanner(System.in);
        float cwood[] = new float[3];
        int i;

        for (i=0;i<cwood.length;i++){
            System.out.println("Digite o comprimento da madeira "+(i+1)+":");
            cwood[i] = leitor.nextFloat();
        }
        if (cwood[0] < cwood[1] + cwood[2] || cwood[1] < cwood[0] + cwood[2] || cwood[2] < cwood[0] + cwood[1]){
            System.out.println("Sim, forma um triangulo Δ");
        }
        else {
            System.out.println("Não, não forma um triangulo ;-;");
        }



    }
}

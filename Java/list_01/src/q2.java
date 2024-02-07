//Questão 2//
import java.util.Scanner;
public class q2 {
    public static Scanner leitor;
    public static void main (String[]args) {

        leitor = new Scanner(System.in);
        String alDic[] =new String[2];
        int i;
        float notas[] = new float[4], soma = 0, media;

        System.out.println("Digite o nome do aluno: ");
        alDic[0] = leitor.nextLine();

        System.out.println("Digite a diciplina: ");
        alDic[1] = leitor.nextLine();

        for (i=0;i<notas.length;i++){
            System.out.println("Digite a " +(i+1)+"ª"+ " nota: ");
            notas[i] = leitor.nextFloat();
            soma = soma + notas[i];

        }
        media = (soma/ notas.length);

        System.out.println("----BOLETIM----");
        System.out.println("NOME: "+alDic[0]);
        System.out.println("DICIPLINA: "+alDic[1]);

        for (i=0;i<notas.length;i++){
            System.out.println("NOTA "+(i+1)+":" +(notas[i]));
        }
        System.out.println("MEDIA: "+media);
        }
    }
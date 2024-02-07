//Atividade de Registros//
import java.util.Scanner;
public class atv_registros {
    public static Scanner leitor;

    public static void main (String[]args) {


        leitor = new Scanner(System.in);
        bandas band = new bandas();

        System.out.println("Digite o nome da banda: ");
        band.nome = leitor.next();

        System.out.println("Digite o numero de integrantes da banda: ");
        band.numIntegrantes = leitor.nextInt();

        System.out.println("Digite o estilo da banda: ");
        band.estilo = leitor.next();

        System.out.printf("\n---BANDA---\nNome: %s \nIntegrantes: %d \nEstilo musical: %s",band.nome,band.numIntegrantes, band.estilo);

    }
}

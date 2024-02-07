//Questão 6//
import java.util.Scanner;
public class q6 {
    public static Scanner leitor;
    public static void main (String[]args) {

        leitor = new Scanner(System.in);
        int pratos[] = {750, 342, 545};
        int bebidas[] = {30, 80, 90};

        int esc_prato, esc_bebida = 0;
        String extra;

        System.out.println("\n----RESTAURANTE POMPOSO DE CALORIAS----");
        System.out.print("Escolha um prato entre as opções: \n[1] - Italiano.\n[2] - Japonês.\n[3] - Salvadoreno.\n>>>");
        esc_prato = leitor.nextInt();

        switch (esc_prato) {
            case 1:
                esc_prato = pratos[0];
                System.out.println("Você escolheu o italiano :)!!");
                break;

            case 2:
                esc_prato = pratos[1];
                System.out.println("Você escolheu o Japonês :)!!");
                break;

            case 3:
                esc_prato = pratos[2];
                System.out.println("Você escolheu o Salvadoreno :)!!");
                break;

            default:
                System.out.println("Escolha invalida seu bobaum. ");
                return;
        }
        leitor.nextLine();

        System.out.println("Quer uma bebida?(s/n): ");
        extra = leitor.nextLine();
        if (extra.equals("s")){
            System.out.print("Escolha uma bebida entre as opções: \n[1] - Chá.\n[2] - Suco de laranja.\n[3] - Refrigerante.\n>>>");
            esc_bebida = leitor.nextInt();

            switch (esc_bebida) {
                case 1:
                    esc_bebida = bebidas[0];
                    System.out.println("Você escolheu o Chá :)!!");
                    break;

                case 2:
                    esc_bebida = bebidas[1];
                    System.out.println("Você escolheu o Suco de laranja :)!!");
                    break;

                case 3:
                    esc_bebida = bebidas[2];
                    System.out.println("Você escolheu o Refrigerante :)!!");
                    break;

                default:
                    System.out.println("Escolha invalida seu bobaum. ");
                    return;
            }

            System.out.println("São "+(esc_bebida+esc_prato)+" cal");

        }
        else{
            System.out.println("São "+esc_prato+" cal");
        }

    }
}

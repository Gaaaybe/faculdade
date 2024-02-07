package lista;
import java.util.Scanner;

public class Inicio {
    public static Scanner leitor;

    public void principal(float cc, float po){
        leitor = new Scanner(System.in);
        int choice;
        Conta contaCorrente = new Conta(cc);
        Conta contaPoupança = new Conta(po);


        System.out.printf("\n---BANCO SEITANDER---\n|O que deseja fazer?| \n[1]Sacar. [2]Depositar [3]Sair.\n\n--SALDO ATUAL--\n|Conta corrente: [R$%.2f]| |Poupança: [R$%.2f]|\n >>> ",contaCorrente.getMontante(), contaPoupança.getMontante());
        choice = leitor.nextInt();

        //OPÇÃO 1

        if(choice == 1){


            System.out.println("Deseja sacar da conta corrente[1] ou da poupança[2]?");
            choice = leitor.nextInt();

            if(choice==1){
                System.out.print("Quanto deseja sacar da conta corrente?\n>>> ");
                Float valor = leitor.nextFloat();
                contaCorrente.sacar(valor);

                System.out.printf("\nVocê sacou R$%.2f com sucesso!\n",valor);
                principal(contaCorrente.getMontante(),contaPoupança.getMontante());


            }

            else if(choice == 2){
                System.out.print("Quanto deseja sacar da poupança?\n>>> ");
                Float valor = leitor.nextFloat();
                contaPoupança.sacar(valor);
                System.out.printf("\nVocê sacou R$%.2f com sucesso!\n",valor);
                principal(contaCorrente.getMontante(),contaPoupança.getMontante());

            }

            else{
                System.out.println("Comando Invalido");
                principal(contaCorrente.getMontante(),contaPoupança.getMontante());
            }


        }

            //OPCÃO 2

        else if(choice == 2){

            System.out.println("Deseja depositar na conta corrente[1] ou na poupança[2]?");
            choice = leitor.nextInt();
            if(choice==1){
                System.out.print("Quanto deseja depositar na conta corrente?\n>>> ");
                Float valor = leitor.nextFloat();
                contaCorrente.depositar(valor);
                System.out.printf("\nVocê depositou R$%.2f com sucesso!\n",valor);
                principal(contaCorrente.getMontante(),contaPoupança.getMontante());
            }
            else if(choice == 2){
                System.out.print("Quanto deseja depositar na poupança?\n>>> ");
                Float valor = leitor.nextFloat();
                contaPoupança.depositar(valor);
                System.out.printf("\nVocê depositou R$%.2f com sucesso!\n",valor);
                principal(contaCorrente.getMontante(),contaPoupança.getMontante());

            }

            else{
                System.out.println("Comando Invalido!");
                principal(contaCorrente.getMontante(),contaPoupança.getMontante());
            }

        }


        else if(choice == 3){
            System.out.println("Programa Encerrado!");

        }
        else{
            System.out.println("Comando Invalido!");
            principal(contaCorrente.getMontante(),contaPoupança.getMontante());
        }


    }
    }

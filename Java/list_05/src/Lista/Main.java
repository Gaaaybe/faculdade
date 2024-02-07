
package Lista;
import java.util.Scanner;
public class Main {
    public static Scanner leitor = new Scanner(System.in);
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        Carro carro1 = new Carro();

        System.out.println("Diga seu nome: ");
        pessoa1.nome = leitor.next();
        System.out.println("Diga seu idade: ");
        pessoa1.idade= leitor.next();

        pessoa1.setCarro(carro1);

        System.out.println("Diga a marca do carro: ");
        pessoa1.carro.marca = leitor.next();
        System.out.println("Diga o modelo do carro: ");
        pessoa1.carro.modelo = leitor.next();

        System.out.printf("Dono do carro: %s \n Idade do dono do carro: %s \n Marca do carro: %s \n Modelo do carro: %s ",pessoa1.getNome(), pessoa1.getIdade(),pessoa1.carro.getMarca(),pessoa1.carro.getModelo());


    }

}
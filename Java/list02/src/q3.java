//Questão 3//
import java.util.Scanner;
public class q3 {
    public static Scanner leitor;
        public static void main (String[]args) {

            leitor = new Scanner(System.in);
            String Nomes[] = new String[3];
            int i, As=0, Es=0;

            for(i=0; i<Nomes.length; i++){
                System.out.println("Digite um nome: ");
                Nomes[i]= leitor.next();

            }

            for (String Nome : Nomes) {
                for (i=0; i<Nome.length(); i++){
                    char letra = Nome.charAt(i);

                    if (letra=='a' || letra=='A'){
                        As++;
                    }
                     else if (letra=='e' || letra=='E'){
                        Es++;
                    }
                }
            }
            if(As==0 || Es==0){
                System.out.println("Não tem A nem E nos nomes.");
        
            }
            else{
                System.out.printf("Tem %d ''A'' e %d ''E'' nos 3 nomes.", As, Es);
            }

        }
}

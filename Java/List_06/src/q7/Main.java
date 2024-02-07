package q7;

public class Main {
    public static void main(String[] args) {

        Cabeça cabeça = new Cabeça("Redonda");
        Olho olho = new Olho("Azul", 2);
        Boca boca = new Boca(10);
        Braço braço = new Braço(2, "Direito");
        Perna perna = new Perna(2);
        Monstro monstro = new Monstro(cabeça, olho, boca, braço, perna);

        System.out.println(monstro.toString());
    }

}

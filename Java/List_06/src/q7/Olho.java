package q7;

public class Olho {
    private String cor;
    private int quantidade;

    public Olho() {

    }

    public Olho(String cor, int quantidade) {
        this.cor = cor;
        this.quantidade = quantidade;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Olho{" +
                "cor='" + cor + '\'' +
                ", quantidade=" + quantidade +
                '}';
    }
}

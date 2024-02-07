package q7;

public class Perna {
    private int quantidade;

    public Perna() {

    }

    public Perna(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Perna{" +
                "quantidade=" + quantidade +
                '}';
    }
}

package q7;

public class Boca {
    private int tamanho;

    public Boca() {

    }

    public Boca(int tamanho) {
        this.tamanho = tamanho;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    @Override
    public String toString() {
        return "Boca{" +
                "tamanho=" + tamanho +
                '}';
    }
}

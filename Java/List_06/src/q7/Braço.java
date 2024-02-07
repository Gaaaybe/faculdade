package q7;

public class Braço {
    private int quantidade;
    private String lado;

    public Braço() {

    }

    public Braço(int quantidade, String lado) {
        this.quantidade = quantidade;
        this.lado = lado;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getLado() {
        return lado;
    }

    public void setLado(String lado) {
        this.lado = lado;
    }

    @Override
    public String toString() {
        return "Braço{" +
                "quantidade=" + quantidade +
                ", lado='" + lado + '\'' +
                '}';
    }
}


package q5;

public class Memoria {
    private int velocidade;
    private int capacidade;
    private String forma;

    public Memoria() {

    }

    public Memoria(int velocidade, int capacidade, String forma) {
        this.velocidade = velocidade;
        this.capacidade = capacidade;
        this.forma = forma;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }

    @Override
    public String toString() {
        return "Memoria{" +
                "velocidade=" + velocidade +
                ", capacidade=" + capacidade +
                ", forma='" + forma + '\'' +
                '}';
    }
}
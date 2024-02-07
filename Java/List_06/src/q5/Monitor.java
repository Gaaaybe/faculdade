package q5;

public class Monitor {
    private String marca;
    private int frequencia;
    private String resolucao;

    public Monitor() {

    }

    public Monitor(String marca, int frequencia, String resolucao) {
        this.marca = marca;
        this.frequencia = frequencia;
        this.resolucao = resolucao;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(int frequencia) {
        this.frequencia = frequencia;
    }

    public String getResolucao() {
        return resolucao;
    }

    public void setResolucao(String resolucao) {
        this.resolucao = resolucao;
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "marca='" + marca + '\'' +
                ", frequencia=" + frequencia +
                ", resolucao='" + resolucao + '\'' +
                '}';
    }
}

package q5;

public class Teclado {
    private double preco;
    private String tipo;
    private String modelo;

    public Teclado() {

    }

    public Teclado(double preco, String tipo, String modelo) {
        this.preco = preco;
        this.tipo = tipo;
        this.modelo = modelo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Teclado{" +
                "preco=" + preco +
                ", tipo='" + tipo + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}
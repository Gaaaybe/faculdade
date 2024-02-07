package lista;

public class Conta {

    private float montante;

    public Conta(float base) {
        this.montante = base;
    }

    public void depositar(float valor) {
        setMontante(montante + valor);
    }

    public void sacar(float valor) {
        this.montante = montante - valor;
    }

    public float getMontante() {
        return this.montante;
    }

    public void setMontante(float montante) {
        this.montante = montante;
    }

}
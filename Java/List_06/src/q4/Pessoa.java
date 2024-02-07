package q4;

public class Pessoa {
    private Contato contato;
    private Data nascimento;
    private Endereco endereco;

    public Pessoa() {

    }

    public Pessoa(Contato c, Data n, Endereco e) {
        this.contato = c;
        this.nascimento = n;
        this.endereco = e;
    }

    public Contato getContato() {
        return contato;
    }

    public void setContato(Contato contato) {
        this.contato = contato;
    }

    public Data getNascimento() {
        return nascimento;
    }

    public void setNascimento(Data nascimento) {
        this.nascimento = nascimento;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "contato=" + contato.toString() +
                ", nascimento=" + nascimento.toString() +
                ", endereco=" + endereco.toString() +
                '}';
    }
}
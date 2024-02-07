package Lista;

public class Pessoa {

    String nome;
    String idade;
    Carro carro;

    public void LigarCarro(){
        carro.Ligar();

    }

    public void acelerarCarro(){
        carro.acelerar();

    }

    public void FreiarCarro(){
        carro.Freiar();

    }

    public void desligarCarro(){
        carro.Desligar();

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }
}

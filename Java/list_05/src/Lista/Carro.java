package Lista;

public class Carro {

    String marca;
    String modelo;
    Pessoa pessoa;

    public void Ligar(){
        System.out.println("Ligou :)");
    }

    public void acelerar(){
        System.out.println("VRUUUUUMMMMM!");
    }

    public void Freiar(){
        System.out.println("Stop right there.");
    }

    public void Desligar(){
        System.out.println("Desligou ;-;");
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
}

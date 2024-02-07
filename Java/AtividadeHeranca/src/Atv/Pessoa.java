package Atv;

public class Pessoa {
    protected String nome;
    protected  String CPF;
    protected  String dataNasc;

    public Pessoa(){

    }

    public Pessoa(String nome, String CPF, String dataNasc) {
        super();
        this.nome = nome;
        this.CPF = CPF;
        this.dataNasc = dataNasc;
    }

    public void Trabalhar(){
        System.out.println("Trabalha.");
    }

}

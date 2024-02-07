package Atv;

public class Aluno extends  Pessoa {
    protected String matricula;

    public Aluno(String matricula) {
        this.matricula = matricula;
    }

    public Aluno(String nome, String CPF, String dataNasc, String matricula) {
        super(nome, CPF, dataNasc);
        this.matricula = matricula;
    }


    public void Trabalhar() {
        System.out.println("Não trabalha.");
    }
}

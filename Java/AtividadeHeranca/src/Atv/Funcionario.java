package Atv;

public class Funcionario extends Pessoa{
    protected String matricula;
    protected String dataAdmissao;
    protected double salario;

    public Funcionario() {

    }


    public Funcionario(String matricula, String dataAdmissao, double salario) {
        this.matricula = matricula;
        this.dataAdmissao = dataAdmissao;
        this.salario = salario;
    }

    public Funcionario(String nome, String CPF, String dataNasc, String matricula, String dataAdmissao, double salario) {
        super(nome, CPF, dataNasc);
        this.matricula = matricula;
        this.dataAdmissao = dataAdmissao;
        this.salario = salario;
    }


    public void Trabalhar() {
        System.out.println("Trabalha muito e ganha pouco.");
    }
}

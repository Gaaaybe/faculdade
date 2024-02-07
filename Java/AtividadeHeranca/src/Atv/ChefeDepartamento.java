package Atv;

public class ChefeDepartamento extends Funcionario {
    protected String departamento;
    protected String dataPromocao;
    protected double gratificacao;

    public ChefeDepartamento(){

    }

    public ChefeDepartamento(String departamento, String dataPromocao, double gratificacao) {
        this.departamento = departamento;
        this.dataPromocao = dataPromocao;
        this.gratificacao = gratificacao;
    }

    public ChefeDepartamento(String matricula, String dataAdmissao, double salario, String departamento, String dataPromocao, double gratificacao) {
        super(matricula, dataAdmissao, salario);
        this.departamento = departamento;
        this.dataPromocao = dataPromocao;
        this.gratificacao = gratificacao;
    }

    public ChefeDepartamento(String nome, String CPF, String dataNasc, String matricula, String dataAdmissao, double salario, String departamento, String dataPromocao, double gratificacao) {
        super(nome, CPF, dataNasc, matricula, dataAdmissao, salario);
        this.departamento = departamento;
        this.dataPromocao = dataPromocao;
        this.gratificacao = gratificacao;
    }

    @Override
    public void Trabalhar() {
        System.out.println("Trabalha pouco e ganha muito.");
    }

    @Override
    public String toString() {
        return "ChefeDepartamento{" +
                "departamento='" + departamento + '\'' +
                ", dataPromocao='" + dataPromocao + '\'' +
                ", gratificacao=" + gratificacao +
                ", matricula='" + matricula + '\'' +
                ", dataAdmissao='" + dataAdmissao + '\'' +
                ", salario=" + salario +
                ", nome='" + nome + '\'' +
                ", CPF='" + CPF + '\'' +
                ", dataNasc='" + dataNasc + '\'' +
                '}';
    }
}

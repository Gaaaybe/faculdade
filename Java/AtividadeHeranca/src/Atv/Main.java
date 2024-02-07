package Atv;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Evelyn Beatriz Jaqueline Rocha","973.810.775-07","04/04/1999");
        Pessoa pessoa2 = new Pessoa("Mário Eduardo Augusto Moreira","689.234.688-00","01/04/1968");

        Aluno aluno1 = new Aluno(pessoa1.nome, pessoa1.CPF, pessoa1.dataNasc, "020332135");

        Funcionario funcionario1 = new Funcionario(pessoa2.nome, pessoa2.CPF, pessoa2.dataNasc,"22.124.460-8","23/09/2012",7323.32);
        ChefeDepartamento chefe1 = new ChefeDepartamento(pessoa2.nome, pessoa2.CPF, pessoa2.dataNasc, funcionario1.matricula, funcionario1.dataAdmissao, funcionario1.salario,"Financeiro","28/11/2020", funcionario1.salario);


        System.out.println(chefe1.toString());
        chefe1.Trabalhar();
        aluno1.Trabalhar();
    }
}
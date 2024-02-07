package q4;

public class Main {
    public static void main(String[] args){

        Pessoa p1 = new Pessoa();
        Data date1 = new Data();
        Endereco adr1 = new Endereco();
        Contato contact1 = new Contato();


//Atribuindo valores para data.
        date1.setDia("22");
        date1.setMes("11");
        date1.setAno("2019");

//Atribuindo valores para Endereço.
        adr1.setRua("Rua Taí");
        adr1.setNumero("877");
        adr1.setBairro("Centro");
        adr1.setCidade("Sarandi");
        adr1.setEstado("PR");
        adr1.setCep("87111-130");

//Atribuindo valores para Contato.
        contact1.setCelular("99 91111-1111");
        contact1.setEmail("Tchumtchum98@fakemail.com.br");
        contact1.setNome("Kevin Manuel Rodrigues");

//Atribuindo valores para Pessoa 1.
        p1.setContato(contact1);
        p1.setEndereco(adr1);
        p1.setNascimento(date1);

//Printando tudo possivelmente de forma burra.
        System.out.println(p1.toString());

    }
}
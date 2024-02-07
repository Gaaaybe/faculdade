package Atv;

public class Client extends Person {

    protected String code;


    public Client() {
    }

    public Client(String name, String cpf, String code) {
        super(name, cpf);
        this.code = code;
    }


    public void show(){

        System.out.println("\n\n--CLIENT--");

        System.out.printf("Name: %s\nCPF: %s\nCode: %s\n",name,cpf,code);
        
    }

    
}

package Atv;

public class Person {

    protected String name;
    protected String cpf;


    public Person() {
    }

    public Person(String name, String cpf) {
        super();
        this.name = name;
        this.cpf = cpf;
    }


    public void show(){

        System.out.printf("Name: %s\n CPF: %s",name,cpf);


    }


    
}

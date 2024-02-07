package Atv;

public class Employee extends Person {

    String registry;
    Double salary;

    public Employee() {
    }

    public Employee(String name, String cpf, String registry, Double salary) {
        super(name, cpf);
        this.registry = registry;
        this.salary = salary;
    }


    public void show(){

        System.out.printf("Name: %s\nCPF: %s\nRegistry: %s\nSalary: %s ",name,cpf,registry,salary);
        
    }

    
    
}

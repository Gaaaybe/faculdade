package Atv;

public class Manager extends Employee {

    int area;

    public Manager() {
    }

    public Manager(String name, String cpf, String registry, Double salary, int area) {
        super(name, cpf, registry, salary);
        this.area = area;

    }


    public void show(){

        System.out.println("--EMPLOYEE--");

        System.out.printf("Name: %s\nCPF: %s\nRegistry: %s\nSalary: %s\nArea: %s ",name,cpf,registry,salary,area);
        
    }

    
    
    
}

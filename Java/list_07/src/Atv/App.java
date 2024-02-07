package Atv;

public class App {
    public static void main(String[] args) throws Exception {

        Person per1 = new Person("Francis J Gutierrez", "570-477-3738");

        Employee emp1 = new Employee(per1.name, per1.cpf, "46886-9008", 11.200);

        Manager manag1 = new Manager(per1.name, per1.cpf, emp1.registry, emp1.salary, 45);

        Person per2 = new Person("Jasmine W Bennett", " 270-526-0558");

        Client cli1 = new Client(per2.name, per2.cpf, "188-09");

        System.out.println("\n\n\nSystem Starting Up...\n");

        manag1.show();

        cli1.show();

        // OBs: To testando fazer os codigos em ingreis pra ver como fica, se ficar
        // dificil de entender me avise. :)
        // Obs2: Não sei se o metodo de mostrar ficou da forma que a senhora queria.
    }
}

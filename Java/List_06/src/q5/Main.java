package q5;

public class Main {
    public static void main(String[] args) {
        Teclado teclado = new Teclado();
        Monitor monitor = new Monitor();
        Memoria memoria = new Memoria();
        Placa placa = new Placa();
        Computador desktop = new Computador();

// Atribuindo valores para teclado
        teclado.setPreco(99.99);
        teclado.setTipo("Mecânico");
        teclado.setModelo("K870");

// Atribuindo valores para monitor
        monitor.setMarca("LG");
        monitor.setFrequencia(144);
        monitor.setResolucao("1920x1080");

// Atribuindo valores para memória
        memoria.setVelocidade(3200);
        memoria.setCapacidade(16);
        memoria.setForma("DDR5");

// Atribuindo valores para placa
        placa.setModelo("ASUS Prime");
        placa.setMarca("ASUS");
        placa.setChipset("Z590");


// Atribuindo valores para o desktop
        desktop.setMemoria(memoria);
        desktop.setMonitor(monitor);
        desktop.setPlacaMae(placa);
        desktop.setTeclado(teclado);

// Imprimindo os objetos utilizando o método toString()
        System.out.println(desktop.toString());
    }
}
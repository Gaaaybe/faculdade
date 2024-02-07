package q5;

public class Computador {
    private Teclado teclado;
    private Monitor monitor;
    private Memoria memoria;
    private Placa placaMae;

    public Computador() {

    }

    public Computador(Teclado teclado, Monitor monitor, Memoria memoria, Placa placaMae) {
        this.teclado = teclado;
        this.monitor = monitor;
        this.memoria = memoria;
        this.placaMae = placaMae;
    }

    public Teclado getTeclado() {
        return teclado;
    }

    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Memoria getMemoria() {
        return memoria;
    }

    public void setMemoria(Memoria memoria) {
        this.memoria = memoria;
    }

    public Placa getPlacaMae() {
        return placaMae;
    }

    public void setPlacaMae(Placa placaMae) {
        this.placaMae = placaMae;
    }

    @Override
    public String toString() {
        return "Computador{" +
                "teclado=" + teclado +
                ", monitor=" + monitor +
                ", memoria=" + memoria +
                ", placaMae=" + placaMae +
                '}';
    }
}
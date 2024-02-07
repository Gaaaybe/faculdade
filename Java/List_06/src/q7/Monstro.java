package q7;

public class Monstro {
    private Cabeça cabeça;
    private Olho olho;
    private Boca boca;
    private Braço braço;
    private Perna perna;

    public Monstro() {

    }

    public Monstro(Cabeça cabeça, Olho olho, Boca boca, Braço braço, Perna perna) {
        this.cabeça = cabeça;
        this.olho = olho;
        this.boca = boca;
        this.braço = braço;
        this.perna = perna;
    }

    public Cabeça getCabeça() {
        return cabeça;
    }

    public void setCabeça(Cabeça cabeça) {
        this.cabeça = cabeça;
    }

    public Olho getOlho() {
        return olho;
    }

    public void setOlho(Olho olho) {
        this.olho = olho;
    }

    public Boca getBoca() {
        return boca;
    }

    public void setBoca(Boca boca) {
        this.boca = boca;
    }

    public Braço getBraço() {
        return braço;
    }

    public void setBraço(Braço braço) {
        this.braço = braço;
    }

    public Perna getPerna() {
        return perna;
    }

    public void setPerna(Perna perna) {
        this.perna = perna;
    }

    @Override
    public String toString() {
        return "Monstro{" +
                "cabeça=" + cabeça +
                ", olho=" + olho +
                ", boca=" + boca +
                ", braço=" + braço +
                ", perna=" + perna +
                '}';
    }
}

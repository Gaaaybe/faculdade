package q7;

public class Cabeça {
    private String formato;

    public Cabeça() {

    }

    public Cabeça(String formato) {
        this.formato = formato;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    @Override
    public String toString() {
        return "Cabeça{" +
                "formato='" + formato + '\'' +
                '}';
    }
}

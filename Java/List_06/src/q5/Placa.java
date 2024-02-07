package q5;

public class Placa {
    private String modelo;
    private String marca;
    private String chipset;

    public Placa() {

    }

    public Placa(String modelo, String marca, String chipset) {
        this.modelo = modelo;
        this.marca = marca;
        this.chipset = chipset;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getChipset() {
        return chipset;
    }

    public void setChipset(String chipset) {
        this.chipset = chipset;
    }

    @Override
    public String toString() {
        return "Placa{" +
                "modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", chipset='" + chipset + '\'' +
                '}';
    }
}
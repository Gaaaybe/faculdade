package q4;

public class Data {

    private String dia;
    private String mes;
    private String ano;

    public Data(){

    }

    public Data(String d, String m, String a){
        this.dia = d;
        this.mes = m;
        this.ano = a;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "Data{" +
                "dia='" + dia + '\'' +
                ", mes='" + mes + '\'' +
                ", ano='" + ano + '\'' +
                '}';
    }
}

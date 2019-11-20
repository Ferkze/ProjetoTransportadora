package model;

public class Veiculo {

    private int id;
    private String desc;
    private String numeroPlaca;

    public Veiculo() {

    }

    public Veiculo(int id, String desc, String numeroPlaca) {
        this.id = id;
        this.desc = desc;
        this.numeroPlaca = numeroPlaca;
    }

    public int getId() {
        return id;
    }

    public String getNumeroPlaca() {
        return numeroPlaca;
    }

    public void setNumeroPlaca(String numeroPlaca) {
        this.numeroPlaca = numeroPlaca;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setId(int id) {
        this.id = id;
    }
}
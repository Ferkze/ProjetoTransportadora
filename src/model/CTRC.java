package model;

public class CTRC {

    private int id;
    private String nomeReme;
    private String nomeDest;
    private String dataEmissao;
    private int peso;
    private float valor;

    public CTRC() {

    }

    public CTRC(int id, String nomeReme, String nomeDest, String dataEmissao, int peso, float valor) {
        this.id = id;
        this.nomeReme = nomeReme;
        this.nomeDest = nomeDest;
        this.dataEmissao = dataEmissao;
        this.peso = peso;
        this.valor = valor;
    }

    public int getId() {
        return id;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(String dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    public String getNomeDest() {
        return nomeDest;
    }

    public void setNomeDest(String nomeDest) {
        this.nomeDest = nomeDest;
    }

    public String getNomeReme() {
        return nomeReme;
    }

    public void setNomeReme(String nomeReme) {
        this.nomeReme = nomeReme;
    }

    public void setId(int id) {
        this.id = id;
    }

}
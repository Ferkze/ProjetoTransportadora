package model;

public class CTRC {

    private int id;
    private Cliente cReme;
    private Cliente cDest;
    private Motorista motorista;
    private String dataEmissao;
    private int peso;
    private float valor;

    public CTRC() {

    }

    public CTRC(int id, Cliente reme, Cliente dest, Motorista m, String dataEmissao, int peso, float valor) {
        this.id = id;
        this.cReme = reme;
        this.cDest = dest;
        this.motorista = m;
        this.dataEmissao = dataEmissao;
        this.peso = peso;
        this.valor = valor;
    }

    public CTRC(int id, String dataEmissao, int peso, float valor) {
        this.id = id;
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

    public Cliente getRemetente() {
        return cReme;
    }

    public void setRemetente(Cliente cReme) {
        this.cReme = cReme;
    }

    public Cliente getDestinatario() {
        return cDest;
    }

    public void setcDest(Cliente cDest) {
        this.cDest = cDest;
    }

    public Motorista getMotorista() {
        return motorista;
    }

    public void setMotorista(Motorista motorista) {
        this.motorista = motorista;
    }

    public void setId(int id) {
        this.id = id;
    }

}
package model;

public class CTRCManifesto {

    private int id;
    private String nomeMotorista;
    private String placaVeiculo;
    private String nomeOrigem;
    private String nomeFilialDestino;
    private String nomeFilialRemetente;
    private String nomeDestinatario;
    private int peso;
    private float valor;
    private Motorista motorista;
    private Veiculo veiculo;
    private Manifesto manifesto;
    private ClientesReme cReme;
    private ClientesDest cDest;
    private CTRC ctrc;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeMotorista() {
        return nomeMotorista;
    }

    public void setNomeMotorista(String nomeMotorista) {
        this.nomeMotorista = nomeMotorista;
    }

    public String getPlacaVeiculo() {
        return placaVeiculo;
    }

    public void setPlacaVeiculo(String placaVeiculo) {
        this.placaVeiculo = placaVeiculo;
    }

    public String getNomeOrigem() {
        return nomeOrigem;
    }

    public void setNomeOrigem(String nomeOrigem) {
        this.nomeOrigem = nomeOrigem;
    }

    public String getNomeFilialDestino() {
        return nomeFilialDestino;
    }

    public void setNomeFilialDestino(String nomeFilialDestino) {
        this.nomeFilialDestino = nomeFilialDestino;
    }

    public String getNomeFilialRemetente() {
        return nomeFilialRemetente;
    }

    public void setNomeFilialRemetente(String nomeFilialRemetente) {
        this.nomeFilialRemetente = nomeFilialRemetente;
    }

    public String getNomeDestinatario() {
        return nomeDestinatario;
    }

    public void setNomeDestinatario(String nomeDestinatario) {
        this.nomeDestinatario = nomeDestinatario;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public Motorista getMotorista() {
        return motorista;
    }

    public void setMotorista(Motorista motorista) {
        this.motorista = motorista;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public Manifesto getManifesto() {
        return manifesto;
    }

    public void setManifesto(Manifesto manifesto) {
        this.manifesto = manifesto;
    }

    public ClientesReme getcReme() {
        return cReme;
    }

    public void setcReme(ClientesReme cReme) {
        this.cReme = cReme;
    }

    public ClientesDest getcDest() {
        return cDest;
    }

    public void setcDest(ClientesDest cDest) {
        this.cDest = cDest;
    }

    public CTRC getCtrc() {
        return ctrc;
    }

    public void setCtrc(CTRC ctrc) {
        this.ctrc = ctrc;
    }

    public CTRCManifesto() {
    }

    public CTRCManifesto(int id, String nomeMotorista, String placaVeiculo, String nomeOrigem, String nomeFilialDestino,
            String nomeFilialRemetente, String nomeDestinatario, int peso, float valor, Motorista motorista,
            Veiculo veiculo, Manifesto manifesto, ClientesReme cReme, ClientesDest cDest, CTRC ctrc) {
        this.id = id;
        this.nomeMotorista = nomeMotorista;
        this.placaVeiculo = placaVeiculo;
        this.nomeOrigem = nomeOrigem;
        this.nomeFilialDestino = nomeFilialDestino;
        this.nomeFilialRemetente = nomeFilialRemetente;
        this.nomeDestinatario = nomeDestinatario;
        this.peso = peso;
        this.valor = valor;
        this.motorista = motorista;
        this.veiculo = veiculo;
        this.manifesto = manifesto;
        this.cReme = cReme;
        this.cDest = cDest;
        this.ctrc = ctrc;
    }

}
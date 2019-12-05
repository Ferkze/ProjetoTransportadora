package model;

public class Motorista {

    private int id;
    private String nome;
    private String sexo;
    private String telefone;
    private Motorista ajudante;

    public Motorista() {

    }

    public Motorista(int id, String nome, String sexo, String telefone) {
        this.id = id;
        this.nome = nome;
        this.sexo = sexo;
        this.telefone = telefone;
    }

    public Motorista(int id, String nome, String sexo, String telefone, Motorista ajudante) {
        this.id = id;
        this.nome = nome;
        this.sexo = sexo;
        this.telefone = telefone;
        this.ajudante = ajudante;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Motorista getAjudante() {
        return ajudante;
    }

    public void setAjudante(Motorista ajudante) {
        this.ajudante = ajudante;
    }

}
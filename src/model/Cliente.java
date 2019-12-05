package model;

public class Cliente {
    private int id;
    private String nome;
    private String endereco;
    private String cidade;
    private String uf;
    private String cnpj;
    private String tipoOrg;
    private String cpf;
    private String sexo;
    private String telefone;

    public Cliente() {

    }

    public Cliente(int id, String nome, String endereco, String cidade, String uf, String cnpj, String cpfCliente,
            String telefone) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
        this.cidade = cidade;
        this.uf = uf;
        this.cnpj = cnpj;
        this.cpf = cpfCliente;
        this.telefone = telefone;
    }

    public Cliente(int id, String nome, String endereco, String cidade, String uf, String telefone, String cnpj, String tipoOrg, String cpf,
            String sexo) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
        this.cidade = cidade;
        this.uf = uf;
        this.cnpj = cnpj;
        this.tipoOrg = tipoOrg;
        this.sexo = sexo;
        this.cpf = cpf;
        this.telefone = telefone;
    }

    public String getTipoOrg() {
        return tipoOrg;
    }

    public void setTipoOrg(String tipoOrg) {
        this.tipoOrg = tipoOrg;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getId() {
        return id;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpfCliente) {
        this.cpf = cpfCliente;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setId(int id) {
        this.id = id;
    }

}
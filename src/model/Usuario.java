package model;

public class Usuario {
    private int id;
    private String apelido;
    private String senha;

    public Usuario() {

    }

    public Usuario(int id, String apelido, String senha) {
        this.id = id;
        this.apelido = apelido;
        this.senha = senha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

}
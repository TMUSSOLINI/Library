package br.com.livraria.modelos;

public class Usuario {
    private int id;
    private String nome;
    private String sobrenome;
    private String email;
    private String telefone;
    private boolean usuarioAtivo;



    public Usuario(int id, String nome, String sobrenome, String email, String telefone) {
        this.id = id;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.email = email;
        this.telefone = telefone;
        this.usuarioAtivo = true;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public boolean isUsuarioAtivo() {
        return usuarioAtivo;
    }

    public void setUsuarioAtivo(boolean usuarioAtivo) {
        this.usuarioAtivo = usuarioAtivo;
    }

    @Override
    public String toString() {
        return "ID: " + this.id + "; Nome: " + this.nome + "; Sobrenome: " + this.sobrenome
                + "; Email: " + this.email + "; Telefone: " + this.telefone
                + "; Situação: " + this.usuarioAtivo;
    }
}

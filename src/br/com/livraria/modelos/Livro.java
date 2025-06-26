package br.com.livraria.modelos;

public class Livro {
    private int id;
    private String titulo;
    private String autor;
    private int anoLancamento;
    private String editora;
    private boolean disponivel;

    public Livro(int id, String titulo, String autor, int anoLancamento, String editora) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.anoLancamento = anoLancamento;
        this.editora = editora;
        this.disponivel = true;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    @Override
    public String toString() {
        return "ID: " + this.id + "; Titulo: " + this.titulo + "; Autor: " +
                this.autor + "; Ano: " + this.anoLancamento + "; Editora: " +
                "; Disponivel: " + this.disponivel;
    }
}

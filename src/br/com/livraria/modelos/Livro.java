package br.com.livraria.modelos;

public class Livro {
    private String titulo;
    private String autor;
    private int anoLancamento;
    private String editora;
    private boolean disponivel;

    public Livro(String titulo, String autor, int anoLancamento, String editora, boolean disponivel) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoLancamento = anoLancamento;
        this.editora = editora;
        this.disponivel = disponivel;
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

}

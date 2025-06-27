package br.com.livraria.gerenciadores;

import br.com.livraria.modelos.Livro;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorLivro implements Gerenciador {
    List<Livro> livros;
    List<Livro> solicitacaoEmprestimo;
    private static final int LIMITE_MAXIMO_EMPRESTIMO = 3;

    public GerenciadorLivro() {
        this.livros = new ArrayList<>();
    }

    @Override
    public Livro verificarDuplicidade(int id){
        for (Livro livro : this.livros){
            if (livro.getId() == id){
                return livro;
            }
        }
        return null;
    }

    public void adicionarLivro(Livro novoLivro){
        if (verificarDuplicidade(novoLivro.getId()) != null){
            System.out.println("Erro: Livro ja cadastrado!");
            return;
        }
        this.livros.add(novoLivro);
    }

    public void listarTodosLivros(){
        if (livros.isEmpty()){
            System.out.println("Nenhum livro cadastrado!");
        }
        System.out.println("\n--- Lista de Livros ---");
        for (Livro livro : livros){
            if (livro.isDisponivel()){
                System.out.println(livro.toString());
                System.out.println("-----------------");
            }
        }
    }

    private boolean verificarLimiteDeEmprestimo(String... titulos){
        return titulos.length <= LIMITE_MAXIMO_EMPRESTIMO;
    }

    private Livro encontraLivro(String tituloDesejado){
        for (Livro livro : this.livros){
            if (livro.getTitulo().equals(tituloDesejado)){
                return livro;
            }
        }
        return null;
    }

    private void livroNaoEncontrado(String tituloDesejado){
        System.out.println("Livro: " + tituloDesejado + " não encontrado!");
    }

    private void processarEmprestimo(Livro livro, String tituloDesejado, List<Livro> solicitacao) {
        if (livro.isDisponivel()){
            solicitacao.add(livro);
            livro.setDisponivel(false);
            System.out.println("Livro: " + tituloDesejado + ", emprestado com sucesso!");
        } else {
            System.out.println("Livro: " + tituloDesejado + " indisponível no momento!");
        }
    }


    public List<Livro> emprestarLivro(String... titulosSolicitados){
        this.solicitacaoEmprestimo = new ArrayList<>();
        if (!verificarLimiteDeEmprestimo(titulosSolicitados)) {
            System.out.println("Você só pode solicitar " + LIMITE_MAXIMO_EMPRESTIMO + " Livros por vez!");
            return this.solicitacaoEmprestimo;
        }
        for (String tituloDesejado : titulosSolicitados){
            Livro livroEncontrado = encontraLivro(tituloDesejado);
            if (livroEncontrado != null) {
                processarEmprestimo(livroEncontrado, tituloDesejado, this.solicitacaoEmprestimo);
            } else {
                livroNaoEncontrado(tituloDesejado);
            }
        }
        return this.solicitacaoEmprestimo;
    }

}

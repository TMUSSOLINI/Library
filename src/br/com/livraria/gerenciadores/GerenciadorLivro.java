package br.com.livraria.gerenciadores;

import br.com.livraria.modelos.Livro;
import br.com.livraria.gerenciadores.Gerenciador;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorLivro implements Gerenciador {
    List<Livro> livros;

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
        System.out.println("Livro: " + novoLivro.getTitulo() + " Cadastrado com sucesso!");
    }

    public void listarTodosLivros(){
        if (livros.isEmpty()){
            System.out.println("Nenhum livro cadastrado!");
        }
        System.out.println("\n--- Lista de Livros ---");
        for (Livro livro : livros){
            System.out.println(livro.toString());
            System.out.println("-----------------");
        }
    }

}

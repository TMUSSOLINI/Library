package br.com.livraria.gerenciadores;

import br.com.livraria.modelos.Livro;
import br.com.livraria.modelos.Usuario;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GerenciadorUsuarios implements Gerenciador {
    private List<Usuario> usuarios;
    private List<Livro> livrosSolicitados;

    public GerenciadorUsuarios() {
        this.usuarios = new ArrayList<>();
    }

    @Override
    public Usuario verificarDuplicidade(int id) {
        for (Usuario usuario : this.usuarios) {
            if (usuario.getId() == id) {
                return usuario;
            }
        }
        return null;
    }

    public void adicionarUsuario(Usuario novoUsuario) {
        if (verificarDuplicidade(novoUsuario.getId()) != null) {
            System.out.println("Erro: Usúario ja cadastrado com o ID: " + novoUsuario.getId());
            return;
        }
        this.usuarios.add(novoUsuario);
        System.out.println("Usuario: " + novoUsuario.getNome() + " Cadastrado com sucesso!");
    }

    public void listarTodosUsuarios(){
        if (usuarios.isEmpty()){
            System.out.println("Não há usúarios cadastrados!");
            return;
        }
        System.out.println("\n--- Lista de Usuários ---");
        for (Usuario usuario: usuarios){
            System.out.println(usuario.toString());
            System.out.println("-----------------");
        }
    }

    public static Map<String, String> livrosSolicitados(String... titulos){
        Map<String, String> dictLivros = new HashMap<>();

        for (int i = 0; i < titulos.length; i++) {
            String chave = "livro_" + (i+1);
            dictLivros.put(chave, titulos[i]);
        }

        return dictLivros;
    }
}


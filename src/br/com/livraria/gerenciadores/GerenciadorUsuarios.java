package br.com.livraria.gerenciadores;

import br.com.livraria.modelos.Usuario;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorUsuarios {
    private List<Usuario> usuarios;

    public GerenciadorUsuarios() {
        this.usuarios = new ArrayList<>();
    }

    public Usuario buscarUsuarioPorId(int id) {
        for (Usuario usuario : this.usuarios) {
            if (usuario.getId() == id) {
                return usuario;
            }
        }
        return null;
    }

    public void adicionarUsuario(Usuario novoUsuario) {
        if (buscarUsuarioPorId(novoUsuario.getId()) != null) {
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
}


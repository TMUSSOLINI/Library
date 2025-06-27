import br.com.livraria.gerenciadores.GerenciadorLivro;
import br.com.livraria.gerenciadores.GerenciadorUsuarios;
import br.com.livraria.modelos.Livro;
import br.com.livraria.modelos.Usuario;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        GerenciadorUsuarios gerenciadorUsuario = new GerenciadorUsuarios();
        GerenciadorLivro gerenciadorLivro = new GerenciadorLivro();
        Scanner leitura = new Scanner(System.in);

        gerenciadorUsuario.adicionarUsuario(new Usuario(1, "Thiago", "Mussolini",
                "teste@teste.com", "11 948774793"));
        gerenciadorLivro.adicionarLivro(new Livro(1,"Harry Potter","JK Rolling",
                2001, "Abril"));
        gerenciadorLivro.adicionarLivro(new Livro(2,"Hobbit","JK Rolling",
                2001, "Abril"));
        gerenciadorLivro.adicionarLivro(new Livro(3,"Crepusculo","JK Rolling",
                2001, "Abril"));
        gerenciadorLivro.adicionarLivro(new Livro(4,"Codigo Davinci","JK Rolling",
                2001, "Abril"));
        gerenciadorLivro.adicionarLivro(new Livro(5,"Amanhecer","JK Rolling",
                2001, "Abril"));
        gerenciadorLivro.emprestarLivro("Harry Potter", "teste","Hobbit");

        gerenciadorLivro.listarTodosLivros();

    }
}
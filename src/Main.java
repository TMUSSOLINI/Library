import br.com.livraria.gerenciadores.GerenciadorUsuarios;
import br.com.livraria.modelos.Usuario;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        GerenciadorUsuarios gerenciadorUsuario = new GerenciadorUsuarios();
        Scanner leitura = new Scanner(System.in);

        gerenciadorUsuario.adicionarUsuario(new Usuario(1, "Thiago", "Mussolini",
                "teste@teste.com", "11 948774793"));
        gerenciadorUsuario.adicionarUsuario(new Usuario(2, "Arthur", "Mussolini",
                "teste@teste.com", "11 993876510"));


        gerenciadorUsuario.listarTodosUsuarios();

    }
}
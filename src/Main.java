import br.com.livraria.modelos.Pessoa;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Pessoa usuario = new Pessoa("Thiago", "Mussolini",
                "tmussolini@email.com", "11 948774793");

        System.out.println(usuario.getNome());
    }
}
import java.util.ArrayList;
import java.util.List;

public class Agenda {

    private List<Contato> contatos;

    public Agenda() {
        contatos = new ArrayList<>();
    }

    public void adicionarContato(Contato contato) {
        contatos.add(contato);
    }

    public void buscarContato() {
        System.out.println("Digite o nome do contato: ");
        String nome = Console.lerString();
        boolean encontrado = false;

        for (Contato contato : contatos) {
            if (contato.getNome().equals(nome)) {
                contato.exibirContato();
                encontrado = true;
            }
        }
        if (encontrado == false) {
            System.out.println("Contato nao encontrado");
        }
    }

    public void exibirInfo(){
        System.out.println("\nAgenda: ");
        for (Contato contato : contatos) {
            System.out.println(contato);
        }
    }

    
}

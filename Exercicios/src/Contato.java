public class Contato {
    private String nome;
    private String telefone;

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Contato() {

    }

    public Contato(String nome, String telefone){
        this.nome = nome;
        this.telefone = telefone;
    }

    public void exibirContato(){
        System.out.println("Informacoes do contato:");
        System.out.println("Nome: " + nome);
        System.out.println("Telefone: " + telefone);
    }

    @Override
    public String toString() {
        return "\nInformacoes do Contato:\n" +
        "Nome: " + nome +
        "\nTelefone: " + telefone;
    }
}

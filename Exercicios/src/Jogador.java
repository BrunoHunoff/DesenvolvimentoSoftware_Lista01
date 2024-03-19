public class Jogador {
    
    private String nome;
    private int pontuacao;
    private int nivel;

    public String getNome() {
        return nome;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public Jogador(){

    }

    public Jogador(String nome, int pontuacao, int nivel) {
        this.nome = nome;
        this.pontuacao = pontuacao;
        this.nivel = nivel;
    }

    public void aumentarPontuacao(int valor){
        pontuacao += valor;
    }

    public void subirNivel(int valor){
        nivel += valor;
    }

    public void exibirInfo() {
        System.out.println("\nInfo Jogador: ");
        System.out.println("Nome: " + nome);
        System.out.println("Pontuacao: " + pontuacao);
        System.out.println("Nivel: " + nivel);
    }
}

public class Carro {
    
    private String marca;
    private String modelo;
    private int ano;
    private int velocidade;

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public Carro(){

    }

    public Carro(String marca, String modelo, int ano, int velocidade) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.velocidade = velocidade;
    }

    public void acelerar(int valor){
        velocidade += valor;
    }

    public void frear(int valor){
        velocidade -= valor;
    }

    public void exibirInfo() {
        System.out.println("\nInformacoes carro: ");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Velocidade: "  + velocidade);

    }
}

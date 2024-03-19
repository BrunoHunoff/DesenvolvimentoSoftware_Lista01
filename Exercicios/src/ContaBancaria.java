public class ContaBancaria {
    
    private int numeroConta;
    private String nomeTitular;
    private float saldo;

    public int getNumeroConta() {
        return numeroConta;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public ContaBancaria() {

    }

    public ContaBancaria(int numeroConta, String nomeTitular, float saldo){
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        this.saldo = saldo;
    }

    public void sacar(float valor) {
        saldo -= valor;
    }

    public void depositar(float valor) {
        saldo += valor;
    }

    public void exibirSaldo() {
        System.out.println("\nSaldo atual:");
        System.out.println("R$" + saldo);
    }
}

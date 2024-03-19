public class Exercicios {
    public static void main(String[] args) {
        ex006();
    }
    
    public static void ex001() {
        float n1;
        float n2;
        float resultado = 0;
        int operacao;

        System.out.print("Numero 1: ");
        n1 = Console.lerFloat();

        System.out.print("Numero 2: ");
        n2 = Console.lerFloat();

        System.out.println("1 - Somar");
        System.out.println("2 - Subtrair");
        System.out.println("3 - Multiplicar");
        System.out.println("4 - Dividir");
        System.out.print("Operacao: ");
        operacao = Console.lerInt();


        switch (operacao) {
            case 1:
                resultado = Calculadora.somar(n1, n2);
                break;

            case 2:
                resultado = Calculadora.subtrair(n1, n2);
                break;

            case 3:
                resultado = Calculadora.multiplicar(n1, n2);
                break;

            case 4:
                resultado = Calculadora.dividir(n1, n2);
                break;

            default:
                break;

        }

        System.out.println("Resultado: " + resultado);
    }

    public static void ex002() {
        Livro l1 = new Livro("Dom Quixote", "Miguel de Cervantes", 1605);
        Livro l2 = new Livro("Hábitos Atômicos", "James Clear", 2018);
        Livro l3 = new Livro("Jogador numero 1", "Ernest Cline", 2011);

        l1.exibirInfo();
        l2.exibirInfo();
        l3.exibirInfo();
    }

    public static void ex003() {
        ContaBancaria conta1 = new ContaBancaria(1, "Guilherme", 200.00f);
        ContaBancaria conta2 = new ContaBancaria(2, "Bruno", 0.50f);
        ContaBancaria conta3 = new ContaBancaria(3, "Jason", 1000000.00f);

        conta1.exibirSaldo();
        conta2.exibirSaldo();
        conta3.exibirSaldo();

        conta1.depositar(100);
        conta2.depositar(20);
        conta3.sacar(500000);

        conta1.exibirSaldo();
        conta2.exibirSaldo();
        conta3.exibirSaldo();
    }

    public static void ex004() {
        Jogador j1 = new Jogador("Pedro", 100, 3);
        Jogador j2 = new Jogador("Diego", 1000, 30);
        Jogador j3 = new Jogador("Ana", 500, 5);

        j1.exibirInfo();
        j2.exibirInfo();
        j3.exibirInfo();

        j1.aumentarPontuacao(20);
        j2.subirNivel(1);

        j1.exibirInfo();
        j2.exibirInfo();
        j3.exibirInfo();
    }

    public static void ex005() {
        Carro c1 = new Carro("Jeep", "Renegade", 2024, 30);
        Carro c2 = new Carro("Chevrolet", "Vectra", 2011, 50);
        Carro c3 = new Carro("Renault", "Sandero RS (Bolido)", 2023, 100);

        c1.exibirInfo();
        c2.exibirInfo();
        c3.exibirInfo();

        c1.acelerar(25);
        c2.frear(10);

        c1.exibirInfo();
        c2.exibirInfo();
        c3.exibirInfo();
    }

    public static void ex006() {
        Agenda agenda = new Agenda();
        Contato c1 = new Contato("Guilherme", "(41)9999-9999");
        Contato c2 = new Contato("Bruno", "(41)9999-9999");

        agenda.adicionarContato(c1);
        agenda.adicionarContato(c2);
        
        agenda.buscarContato();

        agenda.exibirInfo();
    }
}

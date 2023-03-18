package Atividade;

//Classe principal que instancia e utiliza as classes anteriores


public class Main {
	public static void main(String[] args) {
        // Teste do polimorfismo com Animal
        Animal cachorro = new Cachorro("Rex", 3);
        Animal gato = new Gato("Frajola", 5);

        System.out.println(cachorro.getNome() + " diz " + cachorro.fazerSom());
        System.out.println(gato.getNome() + " diz " + gato.fazerSom());

        // Teste do encapsulamento com ContaBancaria
        ContaBancaria conta = new ContaBancaria(100.0);
        conta.depositar(50.0);
        System.out.println("Saldo da conta: " + conta.getSaldo());

        // Teste da herança com ContaPoupanca
        ContaPoupanca contaPoupanca = new ContaPoupanca(100.0, 0.01);
        contaPoupanca.calcularJuros();
        System.out.println("Saldo da conta poupaça com juros: " + contaPoupanca.getSaldo());

}

}

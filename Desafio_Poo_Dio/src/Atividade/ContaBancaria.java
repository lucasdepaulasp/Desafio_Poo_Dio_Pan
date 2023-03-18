package Atividade;

//Classe ContaBancaria que encapsula o saldo da conta e permite operações
	// seguras
	public class ContaBancaria {
		private double saldo;

		public ContaBancaria(double saldo) {
			this.saldo = saldo;
		}

		public void depositar(double valor) {
			if (valor <= 0) {
				throw new IllegalArgumentException("O valor a ser depositado deve ser maior que zero.");
			}
			this.saldo += valor;
		}

		public void sacar(double valor) {
			if (valor > this.saldo) {
				throw new IllegalArgumentException("Saldo insuficiente.");
			}
			this.saldo -= valor;
		}

		public double getSaldo() {
			return saldo;
		}
	}

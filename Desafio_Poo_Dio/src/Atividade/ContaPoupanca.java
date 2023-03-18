package Atividade;

//Classe ContaPoupanca que herda de ContaBancaria e adiciona o cálculo de juros
	public class ContaPoupanca extends ContaBancaria {
		private double taxaJuros;

		public ContaPoupanca(double saldo, double taxaJuros) {
			super(saldo);
			this.taxaJuros = taxaJuros;
		}

		public void calcularJuros() {
			double juros = this.getSaldo() * this.taxaJuros;
			this.depositar(juros);
		}
	}

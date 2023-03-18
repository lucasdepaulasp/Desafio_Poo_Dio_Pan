package Atividade;

//Classe Gato que herda de Animal e implementa seu próprio som
	public class Gato extends Animal {
		public Gato(String nome, int idade) {
			super(nome, idade);
		}

		@Override
		public String fazerSom() {
			return "Miau!";
		}
	}

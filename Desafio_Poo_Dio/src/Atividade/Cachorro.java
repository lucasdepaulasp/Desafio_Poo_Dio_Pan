package Atividade;

//Classe Cachorro que herda de Animal e implementa seu próprio som
	public class Cachorro extends Animal {
		public Cachorro(String nome, int idade) {
			super(nome, idade);
		}

		@Override
		public String fazerSom() {
			return "Au Au!";
		}
	}

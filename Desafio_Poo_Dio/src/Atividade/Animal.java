package Atividade;

public abstract class Animal {

	// Classe abstrata Animal que define a estrutura básica de um animal
	private String nome;
	private int idade;

	public Animal(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}

	public abstract String fazerSom();
}

package aula2;

public abstract class Pessoa {
	private String nome;
	private int idade;
	private char sexo;
	private String cpf;
	
	
	public Pessoa(String nome, int idade, char sexo, String cpf) {
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
		this.cpf = cpf;
	}
	
	public Pessoa(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}

	public void falar() {
		System.out.println("Estou falando!");
	}

	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}

	public char getSexo() {
		return sexo;
	}

	public String getCpf() {
		return cpf;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
}

package model;

public abstract class Funcionario {
	private String nome;
	private int idade;
	private String cpf;
	private String setor;
	private double salario;

	public Funcionario(String nome, int idade, String cpf, String setor, double salario) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.cpf = cpf;
		this.setor = setor;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}

	public String getCpf() {
		return cpf;
	}

	public String getSetor() {
		return setor;
	}

	public double getSalario() {
		return salario;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
}

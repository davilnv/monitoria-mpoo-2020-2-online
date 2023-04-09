package br.com.mpoo.model;

public abstract class Animal implements Alimentacao {
	private int id;
	private String nome;
	private String raca;
	private int idade;
	private double peso;
	private String estado;
	
	public Animal(Proprietario proprietario) {
		proprietario.addAnimal(this);
	}
	
	public Animal(Proprietario proprietario, int id, String nome, String raca, int idade, double peso, String estado) {
		super();
		this.id = id;
		this.nome = nome;
		this.raca = raca;
		this.idade = idade;
		this.peso = peso;
		this.estado = estado;
		proprietario.addAnimal(this);
	}

	@Override
	public String informacaoAlimentacao() {
		return "Tipo Alimentação: " + tipoAlimento() + "\r\nQuantidade Alimentação: " + quantidadeAlimento();
	}



	public String tipoAlimento() {
		return "ração";
	}
	
	public int quantidadeAlimento() {
		return 0;
	}
	
	public int getId() {
		return id;
	}
	public String getNome() {
		return nome;
	}
	public String getRaca() {
		return raca;
	}
	public int getIdade() {
		return idade;
	}
	public double getPeso() {
		return peso;
	}
	public String getEstado() {
		return estado;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setRaca(String raca) {
		this.raca = raca;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Animal [id=" + id + ", nome=" + nome + ", raca=" + raca + ", idade=" + idade + ", peso=" + peso
				+ ", estado=" + estado + "]";
	}
	
}

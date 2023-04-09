package model;

public class Fruta {
	private String nome;
	private String cor;
	
	public Fruta(String nome, String cor) {
		super();
		this.nome = nome;
		this.cor = cor;
	}
	public String getNome() {
		return nome;
	}
	public String getCor() {
		return cor;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	
}

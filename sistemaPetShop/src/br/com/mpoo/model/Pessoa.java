package br.com.mpoo.model;

public abstract class Pessoa {
	public String nome;
	private String cpf;
	private String fone;

	public String getCpf() {
		return cpf;
	}

	public String getFone() {
		return fone;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public void setFone(String fone) {
		this.fone = fone;
	}

}

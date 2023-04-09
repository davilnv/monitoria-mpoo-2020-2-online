package model;

import java.util.ArrayList;

public class Gerente extends Funcionario {
	
	private String senhaLiberacao;
	private ArrayList<Vendedor> vendedores;

	public Gerente(String nome, int idade, String cpf, String setor, double salario, String senhaLiberacao) {
		super(nome, idade, cpf, setor, salario);
		this.senhaLiberacao = senhaLiberacao;
		vendedores = new ArrayList<>();
	}
	
	public void aplicarDesconto() {
		
	}
	
	public void fecharCaixa() {
		
	}

	public String getSenhaLiberacao() {
		return senhaLiberacao;
	}

	public void setSenhaLiberacao(String senhaLiberacao) {
		this.senhaLiberacao = senhaLiberacao;
	}

	@Override
	public String toString() {
		return "Gerente [Nome=" + getNome() + ", Idade=" + getIdade()
				+ ", Cpf=" + getCpf() + ", Setor=" + getSetor() + ", Salario=" + getSalario() + "]";
	}

	public ArrayList<Vendedor> getVendedores() {
		return vendedores;
	}
	
}

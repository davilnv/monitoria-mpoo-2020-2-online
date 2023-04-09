package model;

public class Caixa extends Funcionario {
	private double saldoCaixa;
	private boolean aberto;

	public Caixa(String nome, int idade, String cpf, String setor, double salario) {
		super(nome, idade, cpf, setor, salario);
		this.saldoCaixa = 300.00;
	}

	public double getSaldoCaixa() {
		return saldoCaixa;
	}

	public boolean isAberto() {
		return aberto;
	}

	public void setSaldoCaixa(double saldoCaixa) {
		this.saldoCaixa = saldoCaixa;
	}

	public void setAberto(boolean aberto) {
		this.aberto = aberto;
	}

	@Override
	public String toString() {
		return "Caixa [saldoCaixa=" + saldoCaixa + ", aberto=" + aberto + ", Nome=" + getNome() + ", Idade="
				+ getIdade() + ", Cpf=" + getCpf() + ", Setor=" + getSetor() + ", Salario="
				+ getSalario() + "]";
	}

}

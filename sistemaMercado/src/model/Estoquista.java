package model;

public class Estoquista extends Funcionario {

	public Estoquista(String nome, int idade, String cpf, String setor, double salario) {
		super(nome, idade, cpf, setor, salario);
	}

	@Override
	public String toString() {
		return "Estoquista [Nome=" + getNome() + ", Idade=" + getIdade() + ", Cpf=" + getCpf()
				+ ", Setor=" + getSetor() + ", Salario=" + getSalario() + "]";
	}
	
}

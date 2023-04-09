package model;

public class Vendedor extends Funcionario {

	public Vendedor(String nome, int idade, String cpf, String setor, double salario, Gerente gerente) {
		super(nome, idade, cpf, setor, salario);
		gerente.getVendedores().add(this);
	}
	
	public void solicitarDesconto() {
		
	}

	@Override
	public String toString() {
		return "Vendedor [Nome=" + getNome() + ", Idade=" + getIdade() + ", Cpf=" + getCpf()
				+ ", Setor=" + getSetor() + ", Salario=" + getSalario() + "]";
	}
	
}

package model;

import java.util.ArrayList;

public class BaseDados {
	private static ArrayList<Funcionario> funcionarios;
	
	public static void iniciarBase() {
		funcionarios = new ArrayList<>();
	}
	
	public static Funcionario buscarFuncionario(Funcionario funcionario) throws FuncionarioException {
		Funcionario f = buscarFuncionario(funcionario.getCpf());
		if (f != null) {
			return f;
		}
		throw new FuncionarioException("Funcion�rio n�o encontrado!");
	}
	
	public static Funcionario buscarFuncionario(String cpf) throws FuncionarioException {
		for (Funcionario f : funcionarios) {
			if(cpf.equals(f.getCpf())) {
				return f;
			}
		}
		throw new FuncionarioException("Funcion�rio n�o encontrado!");
	}
	
	public static boolean cadastrarFuncionario(Funcionario funcionario) throws FuncionarioException {
		if (funcionario == null) {
			throw new FuncionarioException("Funcion�rio vazio, n�o pode ser cadastrado!");
		}
		
		if (isFuncionario(funcionario)) {
			throw new FuncionarioException("Funcion�rio n�o pode ser cadastrado, pois j� existe na base de dados!");
		}
		return funcionarios.add(funcionario);
	}
	
	public static boolean atualizarFuncinoario(Funcionario funcionario, Funcionario funcionarioNovo) throws FuncionarioException {
		int index = funcionarios.indexOf(buscarFuncionario(funcionario));
		if (funcionarios.get(index).getCpf().equals(funcionarioNovo.getCpf())) {
			return true;
		}
		throw new FuncionarioException("O CPF do funcion�rio n�o pode ser atualizado!");
	}
	
	public static boolean isFuncionario(Funcionario funcionario) {
		for (Funcionario f : funcionarios) {
			if(funcionario.getCpf().equals(f.getCpf())) {
				return true;
			}
		}
		
		return false;
	}

	public static ArrayList<Funcionario> listarFuncionarios() {
		return funcionarios;
	}
	
}

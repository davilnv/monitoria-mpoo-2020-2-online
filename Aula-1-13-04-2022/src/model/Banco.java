package model;

import java.util.ArrayList;

public class Banco {
	private static ArrayList<Conta> contas = new ArrayList<>();
	
	
	//CRUD
	
	public static boolean cadastrar(Conta conta) {
		for (Conta c : contas) {
			if (c.getLogin().equals(conta.getLogin())) {
				return false;
			}
		}
		return contas.add(conta);
	}
	
	public static Conta buscar(String login, String senha) {
		for (Conta c : contas) {
			if (c.getLogin().equals(login) && c.getSenha().equals(senha)) {
				return c;
			}
		}
		return null;
	}
	
	public static Conta buscar(Conta conta) {
		for (Conta c : contas) {
			if (c.getLogin().equals(conta.getLogin())) {
				return c;
			}
		}
		return null;
	}
	
	public static boolean atualizar(Conta conta, String senha) {
		if(buscar(conta) != null) {
			Conta novaConta = new Conta(conta.getConta(), conta.getAgencia(), conta.getSaldo(), conta.getLogin(), senha);
			contas.set(contas.indexOf(conta), novaConta);
			return true;
		}
		return false;
	}
	
	public static boolean remover(Conta conta) {
		if(buscar(conta) != null) {
			contas.remove(contas.indexOf(conta));
			return true;
		}
		return false;
	}
	
}

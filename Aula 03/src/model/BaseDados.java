package model;

import java.util.ArrayList;

public class BaseDados {
	private static ArrayList<Usuario> usuarios = new ArrayList<>();
	
	// CRUD
	
	public static boolean cadastrar(Usuario usuario) {
		for (Usuario user : usuarios) {
			if (user.getLogin().equalsIgnoreCase(usuario.getLogin())) {
				return false;
			}
		}
		return usuarios.add(usuario);
	}
	
	public static Usuario buscar(String nome) {
		for (Usuario user : usuarios) {
			if (user.getNome().equals(nome)) {
				return user;
			}
		}
		return null;
	}
	
	public static Aluno buscar(Aluno aluno) {
		for (Usuario user : usuarios) {
			if (user.getCpf().equals(aluno.getCpf())) {
				return (Aluno) user;
			}
		}
		return null;
	}
	
	public void atualizarCadastro() {
		
	}
	
	public void remover() {
		
	}
}

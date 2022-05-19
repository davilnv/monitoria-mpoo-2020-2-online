package model;

import java.util.ArrayList;

public class BaseDados {
	
	private static ArrayList<Usuario> usuarios;
	
	public static void iniciarBase() {
		usuarios = new ArrayList<>();
		System.out.println("Base de dados iniciada!");
	}
	
	public static Usuario isUsuario(Usuario usuario) {
		for (Usuario user : usuarios) {
			if (user.getLogin().equals(usuario.getLogin())) {
				if (usuarios.contains(user)) {
					return user;
				}
			}
		}
		return null;
	}
	
	public static Usuario buscarUsuario(Usuario usuario) {
		if(isUsuario(usuario) == null) {
			return null;
		}
		return isUsuario(usuario);
	}
	
	public static boolean cadastrar (Usuario usuario) throws CadastrarException {
		if (isUsuario(usuario) == null) {
			return usuarios.add(usuario);
		}
		throw new CadastrarException("Usuário já está cadastrado!!!!!");
	}
	
	public static void mostrarConsole() {
		for (Usuario usuario : usuarios) {
			System.out.println(usuario);
		}
	}
}

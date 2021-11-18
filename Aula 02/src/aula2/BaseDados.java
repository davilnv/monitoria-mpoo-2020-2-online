package aula2;

import java.util.ArrayList;

public class BaseDados {
	public static ArrayList<Usuario> dadosUsuario = new ArrayList<>();
	
	//Create
	//Read
	//Update
	//Delete
	
	//add()
	//remove()
	//set()
	//get()
	
	public static boolean cadastrarUsuario(String login, String senha, String nome, int idade, char sexo, String cpf) {
	
		for (Usuario usuario : dadosUsuario) {
			if (usuario.getLogin().equalsIgnoreCase(login) || usuario.getCpf().equals(cpf)) {
				System.out.println("Não é possível cadastrar");
				return false;
			}
		}
		return dadosUsuario.add(new Usuario(nome, idade, sexo,cpf, login, senha));
	}
	
	public static void listarTodos() {
		for (Usuario user : dadosUsuario) {
			System.out.println(user);
		}
	}
	
}

package aula2;

public class Main {
	public static void main(String[] args) {
//		Usuario usuario = new Usuario("admin", "123");
//		
//		usuario.realizarLogin("admin", "1234");
		
//		Usuario.abrirSistema("José");
		
		BaseDados.cadastrarUsuario("admin", "123", "josé", 21, 'a', "111.111.111-11");
		BaseDados.cadastrarUsuario("admin2", "123", "josé", 21, 'a', "111.111.111-11");
		
		BaseDados.listarTodos();
	}
}

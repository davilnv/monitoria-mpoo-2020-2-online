package aula2;

public class Usuario extends Pessoa{
	private String login;
	private String senha;
	
	
	public Usuario(String nome, int idade, char sexo, String cpf, String login, String senha) {
		super(nome, idade, sexo, cpf);
		this.login = login;
		this.senha = senha;
	}
	
	
	public Usuario(String nome, String cpf, String login, String senha) {
		super(nome, cpf);
		this.login = login;
		this.senha = senha;
	}


	public void realizarLogin(String login, String senha) {
		if(this.login.equalsIgnoreCase(login) && this.senha.equals(senha)) {
			System.out.println("Login realizado com sucesso!");
		} else {			
			System.out.println("Tente novamente");
		}
	}
	
	public static void abrirSistema(String nome) {
		System.out.println("Sistema está aberto, seja bem-vindo " + nome);
	}
	
	@Override
	public void falar() {
		System.out.println("Olá meu nome é " + getNome());
	}

	public String getLogin() {
		return login;
	}

	public String getSenha() {
		return senha;
	}


	@Override
	public String toString() {
		return "Usuario [login=" + login + ", Nome=" + getNome() + ", Idade=" + getIdade() + ", Sexo="
				+ getSexo() + ", CPF=" + getCpf() + "]";
	}
	
	
	
}

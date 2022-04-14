package model;

public class Conta {
	 private int conta;
	 private int agencia;
	 private double saldo;
	 private String login;
	 private String senha;
	 
	 
	public Conta(int conta, int agencia, double saldo, String login, String senha) {
		super();
		this.conta = conta;
		this.agencia = agencia;
		this.saldo = saldo;
		this.login = login;
		this.senha = senha;
	}
	
	public boolean sacar(double valor) {
		if(valor <= saldo) {
			saldo -= valor;
			return true;
		}
		return false;
	}

	public boolean depositar(double valor) {
		if(valor > 0) {
			saldo += valor;
			return true;
		}
		return false;
	}
	
	public boolean transferir(Conta contaDestino, double valor) {
		if(valor <= saldo) {
			sacar(valor);
			contaDestino.depositar(valor);
			return true;
		}
		return false;
	}

	public int getConta() {
		return conta;
	}


	public int getAgencia() {
		return agencia;
	}


	public double getSaldo() {
		return saldo;
	}


	public String getLogin() {
		return login;
	}


	public String getSenha() {
		return senha;
	}


	public void setConta(int conta) {
		this.conta = conta;
	}


	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}


	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}


	public void setLogin(String login) {
		this.login = login;
	}


	public void setSenha(String senha) {
		this.senha = senha;
	}
	
}

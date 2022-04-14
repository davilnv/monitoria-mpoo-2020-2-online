package app;

import controller.Controle;
import model.Banco;
import model.Conta;
import view.TelaBanco;
import view.TelaLogin;

public class App {
	public static void main(String[] args) {
		Conta conta = new Conta(1, 2, 100, "jose", "123");
		
		Banco.cadastrar(conta);
		
		new Controle();
	}
}

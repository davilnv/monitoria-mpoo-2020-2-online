package controller;

import model.BaseDados;
import model.CadastrarException;
import model.Usuario;
import view.TelaBase;

public class Controle implements Runnable{
	
	int cont = 0;
	TelaBase tela;
	private String login;
	private String senha;
	public Controle() {
		tela = new TelaBase("Tela Home", 200, 350);
		BaseDados.iniciarBase();
	}
	
	private void cadastrar() {
		login = tela.getLoginField().getText();
		senha = tela.getSenhaField().getText();
	}

	@Override
	public void run() {
		while (true) {
			
			try {
				System.out.println("--------------------------------------");
				cadastrar();
				BaseDados.cadastrar(new Usuario(login, senha));
				BaseDados.mostrarConsole();
				Thread.sleep(5000);
				cont++;
				if (cont == 50) {
					break;
				}
			} catch (InterruptedException | CadastrarException e) {
				Thread.interrupted();
				break;
			}
		}
	}

}

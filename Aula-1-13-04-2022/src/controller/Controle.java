package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.Banco;
import view.TelaBanco;
import view.TelaLogin;

public class Controle implements ActionListener{
	
	TelaLogin telaLogin;
	TelaBanco telaBanco;
	
	public Controle() {
		telaLogin = new TelaLogin();
		telaBanco = new TelaBanco();
		telaLogin.getOkButton().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == telaLogin.getOkButton()) {
			String login = telaLogin.getLoginField().getText();
			String senha = telaLogin.getSenhaField().getText();
			if (Banco.buscar(login, senha) != null) {
				telaBanco.setVisible(true);
				telaLogin.setVisible(false);
			}
		}
	}
	
}

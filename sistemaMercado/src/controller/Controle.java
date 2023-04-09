package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import model.BaseDados;
import model.Caixa;
import model.FuncionarioException;
import view.TelaPrincipal;
import view.TelaSplash;

public class Controle {
	private TelaSplash telaSplash;
	private TelaPrincipal telaPrincipal;
	public Controle() {
		telaSplash = new TelaSplash("Mercado", 200, 200);
		telaPrincipal = new TelaPrincipal("Principal", 200, 200);
		telaSplash.addKeyListener(new KeyHandler());
		telaPrincipal.getConfirmarButton().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (telaPrincipal.getConfirmarButton() == e.getSource()) {
					String nome = telaPrincipal.getNomeField().getText();
					int idade = Integer.parseInt(telaPrincipal.getIdadeField().getText());
					String cpf = telaPrincipal.getCpfField().getText();
					String setor = telaPrincipal.getSetorField().getText();
					double salario = Double.parseDouble(telaPrincipal.getSalarioField().getText());
					Caixa caixa = new Caixa(nome, idade, cpf, setor, salario);
					
					try {
						BaseDados.cadastrarFuncionario(caixa);
					} catch (FuncionarioException e1) {
						e1.printStackTrace();
					}
					System.out.println(BaseDados.listarFuncionarios());
				}
			}
		});
	}

	private class KeyHandler extends KeyAdapter {
		@Override
		public void keyPressed(KeyEvent e) {
			if (e.getKeyCode() == KeyEvent.VK_ENTER) {
				telaSplash.setVisible(false);
				telaPrincipal.setVisible(true);
			}
		}
		
	}

}

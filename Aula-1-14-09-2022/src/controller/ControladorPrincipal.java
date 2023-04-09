package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import view.TelaPrincipal;

public class ControladorPrincipal{
//	new TelaPrincipal("Principal", 400, 100);
	
	private TelaPrincipal telaPrincipal;
	
	public ControladorPrincipal() {
		telaPrincipal = new TelaPrincipal("Principal", 400, 100);
		
//		ActionControlador action = new ActionControlador();
		
		telaPrincipal.addKeyListener(new KeyHandler());
		
	}

	
	private class KeyHandler extends KeyAdapter {
		@Override
		public void keyPressed(KeyEvent e) {
			System.out.println(e.getKeyCode());
//			if (e.getKeyCode() == KeyEvent.VK_ENTER) {
//				System.out.println("Enter");
//			}
		}
	}
	
//	-- Classe Interna
//	private class ActionControlador implements ActionListener {
//		
//		public void actionPerformed(ActionEvent e) {
//			if (e.getSource() == telaPrincipal.getConfirmarButton()) {
//				System.out.println("Teste");
//			}
//		}
//		
//	}
}

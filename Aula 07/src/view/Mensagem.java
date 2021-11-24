package view;

import javax.swing.JOptionPane;

public interface Mensagem {
	
	
	public static void exibirMensagem(String mensagem) {
		JOptionPane.showMessageDialog(null, mensagem);
	}
	
}

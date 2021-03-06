package view;

import javax.swing.JButton;

import controller.Controle;

public class TelaMenu extends TelaPadrao{
	
	JButton listarProdutoBtn, sairBtn;

	public TelaMenu(Controle controle) {
		super("Menu", 300, 200);
		
		listarProdutoBtn = new JButton("Produto");
		sairBtn = new JButton("Sair");
		
		add(listarProdutoBtn);
		add(sairBtn);
		
		setVisible(true);
	}

	public JButton getListarProdutoBtn() {
		return listarProdutoBtn;
	}

	public JButton getSairBtn() {
		return sairBtn;
	}
	
}

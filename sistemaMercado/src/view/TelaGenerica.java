package view;

import java.awt.FlowLayout;

import javax.swing.JFrame;

public abstract class TelaGenerica extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public TelaGenerica(String titulo, int altura, int largura) {
		super(titulo);
		setSize(largura, altura);
		setLocationRelativeTo(null);
		setResizable(false);
//		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
//		setVisible(true);
	}
	
}

package view;

import java.awt.FlowLayout;

import javax.swing.JFrame;

public class TelaGenerica extends JFrame{
	
	public TelaGenerica(String titulo, int largura, int altura) {
		super(titulo);
		setSize(largura, altura);
		setLocationRelativeTo(null);
		setResizable(false);
		setLayout(new FlowLayout());
		setVisible(true);
	}
	
}

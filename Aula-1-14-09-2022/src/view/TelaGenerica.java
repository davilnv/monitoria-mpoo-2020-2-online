package view;

import java.awt.FlowLayout;

import javax.swing.JFrame;

public class TelaGenerica extends JFrame{
	
	public TelaGenerica(String titulo, int largura, int altura) {
		super(titulo);
//		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		setResizable(false);
		
		setSize(largura, altura);
		
		setLocationRelativeTo(null);
		
//		setVisible(true);
		
	}
}

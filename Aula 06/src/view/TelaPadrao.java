package view;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public abstract class TelaPadrao extends JFrame{
	
	public TelaPadrao(String titulo, int largura, int altura) {
		super(titulo);
		setSize(largura, altura);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setLayout(new FlowLayout());
		
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}
	}
}

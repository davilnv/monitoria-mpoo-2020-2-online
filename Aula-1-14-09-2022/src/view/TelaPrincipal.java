package view;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TelaPrincipal extends TelaGenerica{
	
	private JTextField nomeFrutaField;
	private JLabel nomeFrutaLabel;
	private JButton confirmarButton;

	public TelaPrincipal(String titulo, int largura, int altura) {
		super(titulo, largura, altura);
		
		nomeFrutaField = new JTextField(10);
		nomeFrutaLabel = new JLabel("Nome Fruta: ");
		confirmarButton = new JButton("Confirmar");
		
		add(nomeFrutaLabel);
//		add(nomeFrutaField);
//		add(confirmarButton);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	public JTextField getNomeFrutField() {
		return nomeFrutaField;
	}

	public JButton getConfirmarButton() {
		return confirmarButton;
	}
	
}

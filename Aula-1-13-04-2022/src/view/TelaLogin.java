package view;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class TelaLogin extends TelaGenerica{
	
	private JLabel loginLabel, senhaLabel;
	private JTextField loginField;
	private JPasswordField senhaField;
	private JButton okButton;

	public TelaLogin() {
		super("Login", 200, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		loginLabel = new JLabel("Login: ");
		senhaLabel = new JLabel("Senha: ");
		
		loginField = new JTextField(10);
		senhaField = new JPasswordField(10);
		
		okButton = new JButton("Login");
		
		add(loginLabel);	
		add(loginField);
		add(senhaLabel);
		add(senhaField);
		add(okButton);
		
	}

	public JLabel getLoginLabel() {
		return loginLabel;
	}

	public JLabel getSenhaLabel() {
		return senhaLabel;
	}

	public JTextField getLoginField() {
		return loginField;
	}

	public JPasswordField getSenhaField() {
		return senhaField;
	}

	public JButton getOkButton() {
		return okButton;
	}

}

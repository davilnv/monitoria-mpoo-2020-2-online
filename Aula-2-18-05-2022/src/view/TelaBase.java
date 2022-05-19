package view;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class TelaBase extends JFrame{

	private JLabel headerLabel, footerLabel;
	private JPanel principalPanel;
	private JPanel painelLogin;
	private JLabel loginLabel, senhaLabel;
	private JTextField loginField, senhaField;

	public TelaBase(String titulo, int largura, int altura ) {
		super(titulo);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new GridLayout(3, 1));

		setSize(largura, altura);
		setLocationRelativeTo(null);
//		setResizable(false);

		headerLabel = new JLabel("",JLabel.CENTER);    
		footerLabel = new JLabel("",JLabel.CENTER);        
//		footerLabel.setSize(350,100);

		principalPanel = new JPanel();
		principalPanel.setLayout(new FlowLayout());

		add(headerLabel);
		add(principalPanel);
		add(footerLabel);

		showSpringLayoutDemo();

		setVisible(true);
	}

	private void showSpringLayoutDemo(){

		painelLogin = new JPanel();
		painelLogin.setLayout(new GridLayout(5, 2));
		loginLabel = new JLabel("Login: ");
		senhaLabel = new JLabel("Senha: ");
		loginField = new JTextField("davi", 10);
		senhaField = new JPasswordField(10);
		painelLogin.add(loginLabel);
		painelLogin.add(loginField);
		painelLogin.add(senhaLabel);
		painelLogin.add(senhaField);

		principalPanel.add(painelLogin);
	}

	public JTextField getLoginField() {
		return loginField;
	}

	public JTextField getSenhaField() {
		return senhaField;
	} 
	
	
}

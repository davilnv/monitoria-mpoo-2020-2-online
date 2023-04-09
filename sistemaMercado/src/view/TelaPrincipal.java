package view;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TelaPrincipal extends TelaGenerica {
	
	private JLabel nomeLabel, idadeLabel, cpfLabel, setorLabel, salarioLabel;
	private JTextField nomeField, idadeField, cpfField, setorField, salarioField;
	private JButton confirmarButton;

	public TelaPrincipal(String titulo, int altura, int largura) {
		super(titulo, altura, largura);
		
		nomeLabel = new JLabel("Nome: ");
		idadeLabel = new JLabel("Idade: ");
		cpfLabel = new JLabel("CPF: ");
		setorLabel = new JLabel("Setor: ");
		salarioLabel = new JLabel("Salário: ");
		
		nomeField = new JTextField(10);
		idadeField = new JTextField(10);
		cpfField = new JTextField(10);
		setorField = new JTextField(10);
		salarioField = new JTextField(10);
		
		confirmarButton = new JButton("Confirmar");
		
		add(nomeLabel);
		add(nomeField);
		add(idadeLabel);
		add(idadeField);
		add(cpfLabel);
		add(cpfField);
		add(setorLabel);
		add(setorField);
		add(salarioLabel);
		add(salarioField);
		add(confirmarButton);

		setDefaultCloseOperation(EXIT_ON_CLOSE);
//		setVisible(true);
	}

	public JLabel getNomeLabel() {
		return nomeLabel;
	}

	public JLabel getIdadeLabel() {
		return idadeLabel;
	}

	public JLabel getCpfLabel() {
		return cpfLabel;
	}

	public JLabel getSetorLabel() {
		return setorLabel;
	}

	public JLabel getSalarioLabel() {
		return salarioLabel;
	}

	public JTextField getNomeField() {
		return nomeField;
	}

	public JTextField getIdadeField() {
		return idadeField;
	}

	public JTextField getCpfField() {
		return cpfField;
	}

	public JTextField getSetorField() {
		return setorField;
	}

	public JTextField getSalarioField() {
		return salarioField;
	}

	public JButton getConfirmarButton() {
		return confirmarButton;
	}

}

package view;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class TelaBanco extends TelaGenerica{
	
	private JRadioButton sacarButton, depositarButton, transferirButton;
	
	private JTextField valorField;
	private JButton confirmarButton;

	public TelaBanco() {
		super("Banco", 200, 200);
		
		sacarButton = new JRadioButton("Sacar", true);
		depositarButton = new JRadioButton("Depositar", false);
		transferirButton = new JRadioButton("Transferir", false);
		
		ButtonGroup grupo = new ButtonGroup();
		grupo.add(sacarButton);
		grupo.add(depositarButton);
		grupo.add(transferirButton);
		
		valorField = new JTextField(10);
		confirmarButton = new JButton("Confirmar");
		
		add(sacarButton);
		add(depositarButton);
		add(transferirButton);
		add(valorField);
		add(confirmarButton);
		
		setVisible(false);
	}

	public JRadioButton getSacarButton() {
		return sacarButton;
	}

	public JRadioButton getDepositarButton() {
		return depositarButton;
	}

	public JRadioButton getTransferirButton() {
		return transferirButton;
	}

	public JTextField getValorField() {
		return valorField;
	}

	public JButton getConfirmarButton() {
		return confirmarButton;
	}
	
}

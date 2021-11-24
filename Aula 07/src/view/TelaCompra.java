package view;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TelaCompra extends TelaPadrao{
	
	private JTextField pagamentoField;
	private JButton pagamentoBtn;
	private PainelNota painelNota;

	public TelaCompra() {
		super("Finalização de Compra", 500, 600);
		
		setLayout(null);
		
		pagamentoField = new JTextField(20);
		pagamentoField.setBounds(150, 30, 200, 20);
		pagamentoBtn = new JButton("Pagar");
		pagamentoBtn.setBounds(200, 70, 100, 20);
		painelNota = new PainelNota();
		
		add(pagamentoField);
		add(pagamentoBtn);
		add(painelNota);
		
	}
	
	public class PainelNota extends JPanel {
		public PainelNota() {
			setSize(250, 400);
			setLocation(125, 110);
			setVisible(true);
		}
		
		@Override
		protected void paintComponent(Graphics g) {
			g.setColor(new Color(253, 245, 171));
			g.fillRect(0, 0, 250, 400);
		}
		
		public void exibirNota(String corpo) {
			Graphics g = getGraphics();
			g.drawString(corpo, 5, 5);
		}
	}

	public JTextField getPagamentoField() {
		return pagamentoField;
	}

	public JButton getPagamentoBtn() {
		return pagamentoBtn;
	}

	public PainelNota getPainelNota() {
		return painelNota;
	}
	
	
}

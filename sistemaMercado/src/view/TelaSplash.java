package view;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class TelaSplash extends TelaGenerica{
	
	private JLabel imagem;

	public TelaSplash(String titulo, int altura, int largura) {
		super(titulo, altura, largura);
		
		imagem = new JLabel(new ImageIcon("src\\mercado.png"));
		
		add(imagem);
		
		setVisible(true);
	}

	public JLabel getImagem() {
		return imagem;
	}

}

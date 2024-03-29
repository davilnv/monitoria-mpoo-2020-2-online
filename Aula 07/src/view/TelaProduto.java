package view;

import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import controller.Controle;
import model.Produto;

public class TelaProduto extends TelaPadrao{
	
	private JScrollPane barraRolagem, barraRolagemCarrinho;
	private DefaultTableModel modelo, modeloCarrinho;
	private JTable tabela, tabelaCarrinho;
	
	private JTextField buscaField;
	private JButton buscarBtn, addCarrinhoBtn, finalizarCompraBtn;

	public TelaProduto(Controle controle) {
		super("Produtos", 1500, 600);
		
		buscaField = new JTextField(20);
		buscarBtn = new JButton("Buscar");
		addCarrinhoBtn = new JButton("Add ao Carrinho");
		finalizarCompraBtn = new JButton("Finalizar Compra");
		
		modelo = new DefaultTableModel();
		modeloCarrinho = new DefaultTableModel();
		tabela = new JTable(modelo);
		tabelaCarrinho = new JTable(modeloCarrinho);
		modelo.addColumn("C�d. de Barras");
		modelo.addColumn("Nome");
		modelo.addColumn("Pre�o");
		modelo.addColumn("Dt. Validade");
		modelo.addColumn("Quant.");
		tabela.getColumnModel().getColumn(0).setPreferredWidth(100);
		tabela.getColumnModel().getColumn(1).setPreferredWidth(130);
		tabela.getColumnModel().getColumn(2).setPreferredWidth(100);
		tabela.getColumnModel().getColumn(3).setPreferredWidth(100);
		tabela.getColumnModel().getColumn(4).setPreferredWidth(70);
		
		modeloCarrinho.addColumn("C�d. de Barras");
		modeloCarrinho.addColumn("Nome");
		modeloCarrinho.addColumn("Pre�o");
		modeloCarrinho.addColumn("Quant.");
		tabelaCarrinho.getColumnModel().getColumn(0).setPreferredWidth(100);
		tabelaCarrinho.getColumnModel().getColumn(1).setPreferredWidth(130);
		tabelaCarrinho.getColumnModel().getColumn(2).setPreferredWidth(100);
		tabelaCarrinho.getColumnModel().getColumn(3).setPreferredWidth(100);
		
		barraRolagem = new JScrollPane(tabela);
		barraRolagemCarrinho = new JScrollPane(tabelaCarrinho);
		
		add(buscaField);
		add(buscarBtn);
		add(barraRolagem);
		add(addCarrinhoBtn);
		add(barraRolagemCarrinho);
		add(finalizarCompraBtn);
		
	}
	
	public void criarTabela(ArrayList<Produto> produtos) {
		modelo.setNumRows(0);
		for (Produto p : produtos) {
			modelo.addRow(new Object[]{p.getCodigoBarras(), p.getNome(), p.getPreco(), Produto.transformadorDataParaString(p.getDataValidade()), p.getQuantidade()});
		}
	}
	
	public void criarTabelaCarrinho(ArrayList<Produto> produtos) {
		for (Produto p : produtos) {
			modeloCarrinho.addRow(new Object[]{p.getCodigoBarras(), p.getNome(), p.getPreco(), p.getQuantidade()});
		}
	}

	public JTable getTabela() {
		return tabela;
	}

	public JTextField getBuscaField() {
		return buscaField;
	}

	public JButton getBuscarBtn() {
		return buscarBtn;
	}

	public JButton getAddCarrinhoBtn() {
		return addCarrinhoBtn;
	}

	public JButton getFinalizarCompraBtn() {
		return finalizarCompraBtn;
	}
	
}

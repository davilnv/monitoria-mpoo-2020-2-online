package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;

import model.BaseDados;
import model.Compra;
import model.Produto;
import model.Venda;
import view.TelaCompra;
import view.TelaMenu;
import view.TelaProduto;

public class Controle implements ActionListener{
	
	private TelaMenu telaMenu;
	private TelaProduto telaProduto;
	private TelaCompra telaCompra;
	private ArrayList<Produto> products = new ArrayList<>();
	Compra compra;
	
	public Controle() {
		telaMenu = new TelaMenu(this);
		telaProduto  = new TelaProduto(this);
		telaCompra = new TelaCompra();
		compra = new Compra("dinheiro");
		telaMenu.getListarProdutoBtn().addActionListener(this);
		telaProduto.getBuscarBtn().addActionListener(this);
		telaProduto.getAddCarrinhoBtn().addActionListener(this);
		telaProduto.getFinalizarCompraBtn().addActionListener(this);
		telaCompra.getPagamentoBtn().addActionListener(this);
		
		telaMenu.getSairBtn().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
	}
	
	public ArrayList<Produto> listarProdutos() {
		String pesquisa = telaProduto.getBuscaField().getText();
		ArrayList<Produto> produtos = null;
		if(pesquisa.equals("")) {
			produtos = BaseDados.listarCadastrados();
		} else {
			produtos = BaseDados.buscarProduto(pesquisa);
		}
		return produtos;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == telaMenu.getListarProdutoBtn()) {
			telaProduto.setVisible(true);
			telaMenu.setVisible(false);
		} 
		if (e.getSource() == telaProduto.getBuscarBtn()) {
			telaProduto.criarTabela(listarProdutos());
		}
		
		if(e.getSource() == telaProduto.getAddCarrinhoBtn()) {
			products.clear();
			products.add(listarProdutos().get(telaProduto.getTabela().getSelectedRow()));
			telaProduto.criarTabelaCarrinho(products);
		}
		
		if(e.getSource() == telaProduto.getFinalizarCompraBtn()) {
		
			for (Produto p : products) {
				compra.adicionarProduto(p);
				compra.totalizarCompra();
				telaCompra.setVisible(true);
			}
		}
		
		if (e.getSource() == telaCompra.getPagamentoBtn()) {
			double pagamento = Double.parseDouble(telaCompra.getPagamentoField().getText());
			compra.confirmaPagamento(pagamento);
			for (Venda v : BaseDados.listarVendas()) {
				telaCompra.getPainelNota().exibirNota(v.toString());
			}
		}
	}

}

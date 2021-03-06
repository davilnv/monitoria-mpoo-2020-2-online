package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import model.BaseDados;
import model.Produto;
import view.TelaMenu;
import view.TelaProduto;

public class Controle implements ActionListener{
	
	private TelaMenu telaMenu;
	private TelaProduto telaProduto;
	
	public Controle() {
		telaMenu = new TelaMenu(this);
		telaProduto  = new TelaProduto(this);
		telaMenu.getListarProdutoBtn().addActionListener(this);
		telaProduto.getBuscarBtn().addActionListener(this);
		telaProduto.getAddCarrinhoBtn().addActionListener(this);
		
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
			ArrayList<Produto> products = new ArrayList<>();
			products.add(listarProdutos().get(telaProduto.getTabela().getSelectedRow()));
			telaProduto.criarTabelaCarrinho(products);
		}
	}

}

package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

public class BaseDados {
	private static ArrayList<Produto> produtos = new ArrayList<>();
	private static ArrayList<Venda> vendas = new ArrayList<>();
	
	public static boolean cadastrarProduto(String nome, double preco, String dataValidade, int quantidade) {
		Produto produto = new Produto(nome, preco, dataValidade, quantidade);
		if(produto.getDataValidade().before(new Date())) {
			return false;
		}
		for (Produto p : produtos) {
			if(produto.getCodigoBarras().equals(p.getCodigoBarras())) {
				return false;
			}
		}
		return produtos.add(produto);
	}
	
	public static Produto isProduto(String nome) {
		for (Produto p : produtos) {
			if(nome.equals(p.getNome())) {
				return p;
			}
		}
		return null;
	}
	
	public static boolean atualizarCadastro(Produto produto, Produto produtoAtualizado) {
		Produto p = isProduto(produto.getNome());
		if (p != null) {
			int i = produtos.indexOf(p);
			p.setNome(produtoAtualizado.getNome());
			p.setPreco(produtoAtualizado.getPreco());
			p.setDataValidade(produtoAtualizado.transformadorDataParaString(produtoAtualizado.getDataValidade()));
			p.setQuantidade(produtoAtualizado.getQuantidade());
			produtos.set(i, p);
			return true;
		}
		return false;
	}
	
	public static boolean atualizarCadastro(String nome, double preco, String dataValidade, int quantidade) {
		Produto p = isProduto(nome);
		if (p != null) {
			int i = produtos.indexOf(p);
			p.setPreco(preco);
			p.setDataValidade(dataValidade);
			p.setQuantidade(quantidade);
			produtos.set(i, p);
			return true;
		}
		return false;
	}
	
	public static void listarCadastrados() {
		for (Produto produto : produtos) {
			System.out.println(produto);
		}
	}

	public static ArrayList<Produto> getProdutos() {
		return produtos;
	}
	
	public static boolean registrarVenda(Venda venda) {
		for (Venda v : vendas) {
			if (v.getCodigoVenda() == venda.getCodigoVenda()) {
				return false;
			}
		}
		return vendas.add(venda);
	}
	
	public static void listarVendas() {
		for (Venda venda : vendas) {
			System.out.println(venda);
		}
	}
	
}

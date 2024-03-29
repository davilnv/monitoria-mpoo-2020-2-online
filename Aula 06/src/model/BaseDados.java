package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

public class BaseDados {
	private static ArrayList<Produto> produtos = new ArrayList<>();
	private static ArrayList<Venda> vendas = new ArrayList<>();

	public static boolean cadastrarProduto(String nome, double preco, String dataValidade, int quantidade)
			throws ProdutoException {
		validarCampos(nome, dataValidade, preco, quantidade);
		Produto produto = new Produto(nome, preco, dataValidade, quantidade);
		for (Produto p : produtos) {
			if (produto.getCodigoBarras().equals(p.getCodigoBarras())) {
				throw new ProdutoException(MensagemErro.CODIGO_ERRO);
			}
		}
		return produtos.add(produto);
	}

	public static Produto isProduto(String nome) throws ProdutoException {
		for (Produto p : produtos) {
			if (nome.equals(p.getNome())) {
				return p;
			}
		}
		throw new ProdutoException("N�o foi poss�vel encontrar pois o " + MensagemErro.NULL_ERRO);
	}
	
	public static ArrayList<Produto> buscarProduto(String pesquisa) {
		ArrayList<Produto> produtosEncontrados = new ArrayList<>();
		for (Produto produto : produtos) {
			if(produto.getNome().toUpperCase().contains(pesquisa.toUpperCase())) {
				produtosEncontrados.add(produto);
			}
			if(Produto.transformadorDataParaString(produto.getDataValidade()).toUpperCase().contains(pesquisa.toUpperCase())) {
				produtosEncontrados.add(produto);
			}
			if((produto.getPreco()+"").toUpperCase().contains(pesquisa.toUpperCase())) {
				produtosEncontrados.add(produto);
			}
		}
		return produtosEncontrados; 
	}

	public static boolean atualizarCadastro(Produto produto, Produto produtoAtualizado) throws ProdutoException {
		validarCampos(produtoAtualizado.getNome(),
				Produto.transformadorDataParaString(produtoAtualizado.getDataValidade()), produtoAtualizado.getPreco(),
				produtoAtualizado.getQuantidade());
		Produto p = isProduto(produto.getNome());
		if (p != null) {
			int i = produtos.indexOf(p);
			p.setNome(produtoAtualizado.getNome());
			p.setPreco(produtoAtualizado.getPreco());
			p.setDataValidade(Produto.transformadorDataParaString(produtoAtualizado.getDataValidade()));
			p.setQuantidade(produtoAtualizado.getQuantidade());
			produtos.set(i, p);
			return true;
		}
		throw new ProdutoException("N�o foi poss�vel atualizar o cadastro pois o " + MensagemErro.NULL_ERRO);
	}
	
	

	public static boolean atualizarCadastro(String nome, double preco, String dataValidade, int quantidade)
			throws ProdutoException {
		validarCampos(nome, dataValidade, preco, quantidade);
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

	private static void validarCampos(String nome, String dataValidade, double preco, int quantidade)
			throws ProdutoException {
		if (nome == null || nome.isBlank()) {
			throw new ProdutoException(MensagemErro.NOME_ERRO);
		}
		if (nome.length() > 30) {
			throw new ProdutoException(MensagemErro.NOME_TAMANHO_ERRO);
		}
		if (preco <= 0) {
			throw new ProdutoException(MensagemErro.PRECO_ERRO);
		}
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		Date validade = null;
		try {
			validade = formato.parse(dataValidade);
		} catch (ParseException e) {
			throw new ProdutoException(MensagemErro.VALIDADE_DATA_ERRO);
		}
		if (validade.before(new Date())) {
			throw new ProdutoException(MensagemErro.VALIDADE_ERRO + validade);
		}
		if (quantidade <= 0) {
			throw new ProdutoException(MensagemErro.QUANTIDADE_ERRO);
		}
	}

	public static ArrayList<Produto> listarCadastrados() {
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

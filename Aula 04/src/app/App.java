package app;

import java.util.Date;

import model.BaseDados;
import model.Compra;
import model.Produto;

public class App {
	public static void main(String[] args) {
		BaseDados.cadastrarProduto("Feijão", 8.50, "12/10/2021", 10);
		
//		BaseDados.listarCadastrados();
		
//		BaseDados.atualizarCadastro(BaseDados.getProdutos().get(0), new Produto("Feijão Tipo 1", 7.50, "30/12/2022", 100));
//	
		BaseDados.atualizarCadastro("Feijão", 7.50, "30/12/2022", 100);
		
		BaseDados.listarCadastrados();
		
//		Date data = new Date();
//		
//		System.out.println(data);
		
		Compra compra = new Compra("dinheiro");
		compra.adicionarProduto(BaseDados.isProduto("Feijão"));
		compra.adicionarProduto(BaseDados.isProduto("Feijão"));
		compra.totalizarCompra();
		compra.confirmaPagamento(30);
		
		BaseDados.listarCadastrados();
		
		BaseDados.listarVendas();
	}
}

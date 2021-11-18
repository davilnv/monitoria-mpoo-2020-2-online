package app;

import model.BaseDados;
import model.Compra;
import model.ProdutoException;
import view.Mensagem;

public class App {
	public static void main(String[] args) {
		try {
			BaseDados.cadastrarProduto("Feijao", 8.50, "30/10/2021", 10);
			BaseDados.atualizarCadastro("Feijao", 7.50, "30/10/2021", 100);
			BaseDados.listarCadastrados();
			
			Compra compra = new Compra("dinheiro");
			compra.adicionarProduto(BaseDados.isProduto("Feijao"));
			compra.adicionarProduto(BaseDados.isProduto("Feijao"));
			compra.totalizarCompra();
			compra.confirmaPagamento(30);
			
//			BaseDados.listarCadastrados();
			BaseDados.listarVendas();
		} catch (ProdutoException e) {
			Mensagem.exibirMensagem(e.getMessage());
		}
	}
}

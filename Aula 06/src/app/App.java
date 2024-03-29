package app;

import controller.Controle;
import model.BaseDados;
import model.Compra;
import model.Produto;
import model.ProdutoException;
import view.Mensagem;
import view.TelaMenu;

public class App {
	public static void main(String[] args) {
		try {
			BaseDados.cadastrarProduto("Feijao Panam�", 8.50, "16/10/2022", 10);
//			BaseDados.atualizarCadastro("Feijao Mana�oba", 7.50, "16/11/2022", 100);
			BaseDados.cadastrarProduto("Arroz Panam�", 4.50, "01/11/2022", 10);
			BaseDados.cadastrarProduto("Arroz Mana�oba", 3.50, "05/01/2022", 10);
			BaseDados.cadastrarProduto("Cuscuz Mana�oba", 1.50, "14/07/2023", 10);
			BaseDados.cadastrarProduto("Chocolate Palmerinha", 5.50, "16/09/2023", 10);
			BaseDados.cadastrarProduto("Macarr�o Palmerinha", 2.50, "05/05/2022", 10);
//			BaseDados.listarCadastrados();
			
			new Controle();
			
			Compra compra = new Compra("dinheiro");
//			compra.adicionarProduto(BaseDados.isProduto("Feijao"));
//			compra.adicionarProduto(BaseDados.isProduto("Feijao"));
//			compra.totalizarCompra();
//			compra.confirmaPagamento(30);
			
//			BaseDados.listarCadastrados();
			BaseDados.listarVendas();
		} catch (ProdutoException e) {
			Mensagem.exibirMensagem(e.getMessage());
		}
	}
}

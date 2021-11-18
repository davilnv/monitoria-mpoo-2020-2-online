package model;

import java.util.ArrayList;
import java.util.Date;

public class Compra {
	private ArrayList<Produto> produtos = new ArrayList<>();
	private double total;
	private String formaPagamento;
	private double troco;
	private double valorPago;
	
	public Compra(String formaPagamento) {
		this.formaPagamento = formaPagamento;
	}

	public void adicionarProduto(Produto produto) {
		produtos.add(produto);
		produto.setQuantidadeLegal(produto.getQuantidade()-1);
	}
	
	public void totalizarCompra() {
		for (Produto produto : produtos) {
			total += produto.getPreco();
		}
	}
	
	public void confirmaPagamento(double valor) {
		switch (formaPagamento) {
		case "dinheiro":
			valorPago = valor;
			troco = valorPago-total;
			System.out.println("Seu total foi R$ " + total + " você pagou R$ " + valorPago + " e seu troco é R$" + troco);
			BaseDados.registrarVenda(new Venda(0, this, new Date(), "caixa1"));
			break;
		}
	}

	public ArrayList<Produto> getProdutos() {
		return produtos;
	}

	public double getTotal() {
		return total;
	}

	public String getFormaPagamento() {
		return formaPagamento;
	}

	public void setProdutos(ArrayList<Produto> produtos) {
		this.produtos = produtos;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public void setFormaPagamento(String formaPagamento) {
		this.formaPagamento = formaPagamento;
	}

	public double getTroco() {
		return troco;
	}

	public void setTroco(double troco) {
		this.troco = troco;
	}
	
	public double getValorPago() {
		return valorPago;
	}

	public void setValorPago(double valorPago) {
		this.valorPago = valorPago;
	}

	@Override
	public String toString() {
		String produto = "";
		for(Produto p : produtos) {
			produto += p.getCodigoBarras() + "   ";
			produto += p.getNome() + "   		 ";
			produto += p.getQuantidade() + "   	     ";
			produto += p.getPreco();
			produto += "\r\n";
		}
		return "\r\n" + produto;
	}
	
}

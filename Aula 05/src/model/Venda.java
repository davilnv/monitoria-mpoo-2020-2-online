package model;

import java.util.Date;

public class Venda {
	private int codigoVenda;
	private Compra compra;
	private Date data;
	private String caixa;
	
	public Venda(int codigoVenda, Compra compra, Date data, String caixa) {
		super();
		this.codigoVenda = codigoVenda;
		this.compra = compra;
		this.data = data;
		this.caixa = caixa;
	}
	
	public int getCodigoVenda() {
		return codigoVenda;
	}

	public void setCodigoVenda(int codigoVenda) {
		this.codigoVenda = codigoVenda;
	}

	public Compra getCompra() {
		return compra;
	}

	public Date getData() {
		return data;
	}

	public String getCaixa() {
		return caixa;
	}

	public void setCompra(Compra compra) {
		this.compra = compra;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public void setCaixa(String caixa) {
		this.caixa = caixa;
	}

	@Override
	public String toString() {
		return "	       MERCADINHO MPOO FELIZ\r\n"
				+ "----------------------------------------------------\r\n"
				+ "	  	  NOTA NÃO FISCAL\r\n"
				+ "----------------------------------------------------\r\n"
				+ "   Cód. Venda: " + codigoVenda + " Data: " + Produto.transformadorDataParaString(data) +  " Caixa: " + caixa + "\r\n"
				+ "----------------------------------------------------\r\n"
				+ "Código        Descrição		Quant.	  Preço(R$)"
				+ compra
				+ "----------------------------------------------------\r\n"
				+ "Total                                        " + compra.getTotal() + "\r\n"
				+ "Valor Pago                                   " + compra.getValorPago() + "\r\n"
				+ "Troco                                        " + compra.getTroco() + "\r\n"
				+ "----------------------------------------------------\r\n";
	}
	
}

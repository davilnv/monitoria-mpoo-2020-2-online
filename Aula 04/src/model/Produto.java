package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class Produto {
	private String nome;
	private double preco;
	private String codigoBarras;
	private Date dataValidade;
	private int quantidade;
	private SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
	
	public Produto(String nome, double preco, String dataValidade, int quantidade) {
		super();
		this.nome = nome;
		this.preco = preco;
		
		char lista[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0'};
		
		Random rd = new Random();
		
		codigoBarras = "";
		
		for (int i = 0 ; i <= 10 ; i++ ) {
			codigoBarras += lista[rd.nextInt(35)];
		}
		
		transformadorStringParaData(dataValidade);
		
		this.quantidade = quantidade;
	}
	
	public void transformadorStringParaData(String data) {
		try {
			this.dataValidade = formatador.parse(data);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
	
	public String transformadorDataParaString(Date data) {
		return formatador.format(data);
	}

	public String getNome() {
		return nome;
	}

	public double getPreco() {
		return preco;
	}

	public String getCodigoBarras() {
		return codigoBarras;
	}

	public Date getDataValidade() {
		return dataValidade;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public void setCodigoBarras(String codigoBarras) {
		this.codigoBarras = codigoBarras;
	}

	public void setDataValidade(String dataValidade) {
		transformadorStringParaData(dataValidade);
	}

	public void setQuantidade(int quantidade) {
		if(quantidade > 0) {
			this.quantidade += quantidade;
		} 
	}
	
	public void setQuantidadeLegal(int quantidade) {
		this.quantidade = quantidade;
	}

	@Override
	public String toString() {
		return "Produto [nome=" + nome + ", preco=" + preco + ", codigoBarras=" + codigoBarras + ", dataValidade="
				+ transformadorDataParaString(dataValidade) + ", quantidade=" + quantidade + "]";
	}
	
}

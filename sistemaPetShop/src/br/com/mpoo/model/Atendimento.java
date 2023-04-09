package br.com.mpoo.model;

import java.util.Date;

public class Atendimento {
	private int numero;
	private Date dataAtendimento;
	private Animal cliente;
	private Veterinario veterinario;
	private double valorConsulta;
	private String receitaAnimal;
	
	public void realizarAtendimento() {
		
		if (cliente.getEstado().equals("desnutricao")) {
			veterinario.receitarAnimal(cliente);
		}
		
	}
	public int getNumero() {
		return numero;
	}

	public Date getDataAtendimento() {
		return dataAtendimento;
	}

	public Animal getCliente() {
		return cliente;
	}

	public Veterinario getVeterinario() {
		return veterinario;
	}

	public double getValorConsulta() {
		return valorConsulta;
	}

	public String getReceitaAnimal() {
		return receitaAnimal;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public void setDataAtendimento(Date dataAtendimento) {
		this.dataAtendimento = dataAtendimento;
	}

	public void setCliente(Animal cliente) {
		this.cliente = cliente;
	}

	public void setVeterinario(Veterinario veterinario) {
		this.veterinario = veterinario;
	}

	public void setValorConsulta(double valorConsulta) {
		this.valorConsulta = valorConsulta;
	}

	public void setReceitaAnimal(String receitaAnimal) {
		this.receitaAnimal = receitaAnimal;
	}

}

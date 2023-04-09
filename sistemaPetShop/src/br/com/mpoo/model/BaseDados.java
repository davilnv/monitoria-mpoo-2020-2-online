package br.com.mpoo.model;

import java.util.ArrayList;

public class BaseDados {
	private static ArrayList<Proprietario> proprietarios;
	private static ArrayList<Atendimento> atendimentos;
	private static ArrayList<Animal> animais;
	
	public void criarBaseDados() {
		inicializarBase();
	}
	
	private void inicializarBase() {
		proprietarios = new ArrayList<>();
		atendimentos = new ArrayList<>();
		animais = new ArrayList<>();
	}

	public static ArrayList<Proprietario> getProprietarios() {
		return proprietarios;
	}

	public static ArrayList<Atendimento> getAtendimentos() {
		return atendimentos;
	}

	public static ArrayList<Animal> getAnimais() {
		return animais;
	}
	
}

package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

public class Aluno extends Usuario{
	
	private ArrayList<Float> notas = new ArrayList<>();
	private float mediaGeral;
	private int matricula;
	private Date nascimento;
	
	public Aluno(String login, String senha, String nome, String cpf, String nascimento) {
		super(login, senha, nome, cpf);
		Random rd = new Random();
		matricula = rd.nextInt(10);
		SimpleDateFormat conversor = new SimpleDateFormat("dd/MM/yyyy");
		try {
			this.nascimento = conversor.parse(nascimento);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
	
	public void mostrarDataNascimento() {
		SimpleDateFormat conversor = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println(conversor.format(nascimento));
	}
	
	public void meuAniversario() {
		if(nascimento.equals(nascimento)) {
			System.out.println("Feliz aniversário!");
		}
	}
	
	public void obterMediaGeral() {
		float total = 0;
		for (float nota : notas) {
			total += nota;
		}
		mediaGeral = total / 4;
		System.out.println("Sua média geral foi: " + mediaGeral);
	}
	
	public void exibirNotas() {
		int cont = 1;
		for (Float nota : notas) {
			System.out.println("Nota " + cont +":" + nota);
			cont++;
		}
	}
	
	public ArrayList<Float> getNotas() {
		return notas;
	}

	public int getMatricula() {
		return matricula;
	}

}

package main;

import model.Aluno;
import model.BaseDados;
import model.Professor;

public class Main {
	public static void main(String[] args) {
		Aluno aluno = new Aluno("aluno1", "123", "Jacó", "12345678910", "14/08/1999");
		Professor professor = new Professor("professor", "admon", "Caio", "3333333333", 15, "Matematica");
		
		BaseDados.cadastrar(aluno);
		BaseDados.cadastrar(professor);
		
		professor.atribuirNota(aluno, 10, 1);
		professor.atribuirNota(aluno, 6, 2);
		professor.atribuirNota(aluno, 10, 3);
		professor.atribuirNota(aluno, 10, 4);
		
		BaseDados.buscar(aluno).obterMediaGeral();
		BaseDados.buscar(aluno).exibirNotas();
		BaseDados.buscar(aluno).obterMediaGeral();
		BaseDados.buscar(aluno).mostrarDataNascimento();
		BaseDados.buscar(aluno).meuAniversario();
		
	}
}

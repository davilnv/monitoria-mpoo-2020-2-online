package app;

import controller.Controle;
import model.BaseDados;
import model.Caixa;
import model.Estoquista;
import model.FuncionarioException;
import model.Gerente;
import model.Vendedor;
import view.TelaPrincipal;
import view.TelaSplash;

public class App {
	public static void main(String[] args) {
		
		new Controle();
		
		Caixa caixa1 = new Caixa("José", 25, "111.111.111-11", "COMERCIAL", 1300);
		
		Caixa caixa2 = new Caixa("Maria", 25, "222.222.222-22", "COMERCIAL", 1400);
		
		Gerente gerente = new Gerente("Pedro", 30, "333.333.333-33", "COMERCIAL", 3000, "123@");
		new Vendedor("Caio", 20, "123.123.123-12", "COMERCIAL", 1300, gerente);
		new Vendedor("Palloma", 22, "154.154.154-54", "COMERCIAL", 1300, gerente);
	
		Estoquista estoquista = new Estoquista("Noé", 20, "444.444.444-44", "ESTOQUE", 1200);
		
		BaseDados.iniciarBase();
		
		try {

			System.out.println("================ / CADASTRO DE FUNCIONARIOS / ================");
			
			System.out.println("Caixa1:" + (BaseDados.cadastrarFuncionario(caixa1) ? "Cadastrado!" : "Não cadastrado"));
			System.out.println("Caixa2:" + (BaseDados.cadastrarFuncionario(caixa2) ? "Cadastrado!" : "Não cadastrado"));
			System.out.println("Gerente:" + (BaseDados.cadastrarFuncionario(gerente) ? "Cadastrado!" : "Não cadastrado"));
			System.out.println("Estoquista:" + (BaseDados.cadastrarFuncionario(estoquista) ? "Cadastrado!" : "Não cadastrado"));

			System.out.println("================ / LISTAR FUNCIONARIOS / ================");
			System.out.println(BaseDados.listarFuncionarios() + "\r\n");
			System.out.println("================ // BUSCAR POR CPF // ================");
			
			System.out.println(BaseDados.buscarFuncionario("222.222.222-22") + "\r\n");
			
			System.out.println("================ // BUSCAR POR FUNCIONARIO // ================");
			System.out.println(BaseDados.buscarFuncionario(gerente) + "\r\n");
			
			System.out.println(((Gerente) BaseDados.buscarFuncionario(gerente)).getSenhaLiberacao()); // CAST

			System.out.println("================ // ATUALIZAR POR FUNCIONARIO (CAIXA) // ================");
			System.out.println("ANTES:");
			System.out.println(BaseDados.buscarFuncionario(caixa2) + "\r\n");
			System.out.println("DEPOIS:");
			caixa2.setIdade(26);
			caixa2.setAberto(true);
			caixa2.setSaldoCaixa(500);
			BaseDados.atualizarFuncinoario(caixa2, caixa2);
			System.out.println(BaseDados.buscarFuncionario(caixa2) + "\r\n");
			
			System.out.println("================ // LISTAR VENDORES POR GERENTE // ================");
			System.out.println(((Gerente) BaseDados.buscarFuncionario(gerente)).getVendedores() + "\r\n");
			
			
		} catch (FuncionarioException e) {
			e.printStackTrace();
		}
	}
}
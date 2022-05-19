package app;

import controller.Controle;
import view.TelaBase;

public class App {
	public static void main(String[] args) {
		
		Controle controle = new Controle();
		
		Thread executavel = new Thread(controle);
		
		executavel.start();
	}
}

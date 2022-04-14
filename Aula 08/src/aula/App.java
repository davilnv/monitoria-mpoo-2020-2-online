package aula;

public class App {
	
	public static void main(String[] args) {
		Carro carro = new Carro("Fiat", 1.0f);
		carro.pneuDF.libra = 30.0f;
		carro.pneuDF.marca = "Levorin";
		carro.pneuDF.tamanho = 20;
		
		System.out.println(carro.pneuDF);
	}
	
	
}

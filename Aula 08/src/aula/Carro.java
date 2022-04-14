package aula;

public class Carro {
	String marca;
	float motor;
	Pneu pneuDF;
	Pneu pneuEF;
	Pneu pneuDT;
	Pneu pneuET;
	
	public Carro(String marca, float motor) {
		this.marca = marca;
		this.motor = motor;
		pneuDF =  new Pneu(this);
		pneuEF =  new Pneu(this);
		pneuDT =  new Pneu(this);
		pneuET =  new Pneu(this);
	}
	
	
}

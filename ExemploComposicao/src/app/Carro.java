package app;

import java.util.ArrayList;

public class Carro {
	private String marca;
	private double motor;
	private ArrayList<Pneu> pneus;
	
	public Carro(String marca, double motor) {
		this.marca = marca;
		this.motor = motor;
		pneus = new ArrayList<>();
	}
	
	public String getMarca() {
		return marca;
	}
	public double getMotor() {
		return motor;
	}
	public ArrayList<Pneu> getPneus() {
		return pneus;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public void setMotor(double motor) {
		this.motor = motor;
	}
	public void setPneus(ArrayList<Pneu> pneus) {
		this.pneus = pneus;
	}

	@Override
	public String toString() {
		return "Carro [marca=" + marca + ", motor=" + motor + ", pneus=" + pneus + "]";
	}
	
	
}

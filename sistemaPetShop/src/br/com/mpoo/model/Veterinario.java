package br.com.mpoo.model;

public class Veterinario extends Pessoa{
	
	private int crmv;

	public String receitarAnimal(Animal animal) {
		
		int grama = 0;
		
		if (animal.getPeso() >= 1 && animal.getPeso() < 2) {
			grama = 75;
		} else if (animal.getPeso() >= 2 && animal.getPeso() < 3) {
			grama = 130;
		} else if (animal.getPeso() >= 3 && animal.getPeso() < 4) {
			grama = 175;
		} else if (animal.getPeso() >= 4 && animal.getPeso() < 5) {
			grama = 215;
		} else if (animal.getPeso() >= 5 && animal.getPeso() < 6) {
			grama = 255;
		} else if (animal.getPeso() >= 6 && animal.getPeso() < 8) {
			grama = 295;
		} else if (animal.getPeso() >= 8 && animal.getPeso() < 10) {
			grama = 365;
		} else if (animal.getPeso() >= 10 && animal.getPeso() < 12) {
			grama = 430;
		} else if (animal.getPeso() >= 12 && animal.getPeso() < 14) {
			grama = 495;
		} else if (animal.getPeso() >= 14 && animal.getPeso() < 16) {
			grama = 555;
		} else if (animal.getPeso() >= 16 && animal.getPeso() < 18) {
			grama = 615;
		} else if (animal.getPeso() >= 18 && animal.getPeso() < 20) {
			grama = 670;
		} else if (animal.getPeso() >= 20 && animal.getPeso() < 25) {
			grama = 725;
		} else if (animal.getPeso() >= 25) {
			grama = 855;
		}
		
		return grama+"";
	}
	
	public int getCrmv() {
		return crmv;
	}

	public void setCrmv(int crmv) {
		this.crmv = crmv;
	}
	
	
	
}

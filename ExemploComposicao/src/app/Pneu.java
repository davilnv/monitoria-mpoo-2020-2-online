package app;

public class Pneu {
	
	private int aro;
	
	public Pneu(int aro, Carro carro) {
		this.aro = aro;
		carro.getPneus().add(this);
	}

	public int getAro() {
		return aro;
	}

	public void setAro(int aro) {
		this.aro = aro;
	}

	@Override
	public String toString() {
		return "Pneu [aro=" + aro + "]";
	}
	
}

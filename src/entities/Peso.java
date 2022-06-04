package entities;

public class Peso {
	
	private int valorDoPeso;
	
	public Peso() {
		this.valorDoPeso = 1;
	}
	
	public Peso(int valorDoPeso ) {
		this.valorDoPeso = valorDoPeso;
	}
	
	public int getValorDoPeso() {
		return valorDoPeso;
	}
	
	public void setValorDoPeso(int valorDoPeso) {
		this.valorDoPeso = valorDoPeso;
	}
}

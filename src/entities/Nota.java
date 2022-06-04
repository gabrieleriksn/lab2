package entities;

public class Nota {
	
	private double valorNota;
	
	public Nota() {
	}
	
	public Nota(double valorNota) {
		this.valorNota = valorNota;
	}
	
	public double getValorNota() {
		return valorNota;
	}
	
	public void setValorNota(double valorNota) {
		this.valorNota = valorNota;
	}
	
	@Override
	public String toString() {
		return String.format("%.1f", valorNota);
	}
}

package entities;

public class Estagio {
	
	private int horasDeEstagio;
	
	public Estagio() {
	}
	
	public Estagio(int horasDeEstagio) {
		this.horasDeEstagio = horasDeEstagio;
	}
	
	public int getHorasDeEstagio() {
		return horasDeEstagio;
	}
	
	public void setHorasDeEstagio(int horasDeEstagio) {
		this.horasDeEstagio = horasDeEstagio;
	}
	
	@Override
	public String toString() {
		return "Estagio " + horasDeEstagio;
	}
}

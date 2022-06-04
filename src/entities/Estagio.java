package entities;

public class Estagio {
	
	private int horasDeEstagio;
	private int mesesDeEstagio;
	
	public Estagio() {
		this.mesesDeEstagio = 4;
	}
	
	public Estagio(int horasDeEstagio) {
		this.horasDeEstagio = horasDeEstagio;
		this.mesesDeEstagio = 4;
	}
	
	public Estagio(int horasDeEstagio, int mesesDeEstagio) {
		this.horasDeEstagio = horasDeEstagio;
		this.mesesDeEstagio = mesesDeEstagio;
	}
	
	public int getHorasDeEstagio() {
		return horasDeEstagio;
	}
	
	public void setHorasDeEstagio(int horasDeEstagio) {
		this.horasDeEstagio = horasDeEstagio;
	}
	
	public int getMesesDeEstagio() {
		return mesesDeEstagio;
	}
	
	public void setMesesDeEstagio(int mesesDeEstagio) {
		this.mesesDeEstagio = mesesDeEstagio;
	}
	
	
	@Override
	public String toString() {
		return "Estagio " + horasDeEstagio + " " + mesesDeEstagio;
	}
}

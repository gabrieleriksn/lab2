package entities;

public class Projeto {
	
	private int mesesDeProjeto;
	
	public Projeto() {
	}
	
	public Projeto(int mesesDeProjeto) {
		this.mesesDeProjeto = mesesDeProjeto;
	}
	
	public int getMesesDeProjeto() {
		return mesesDeProjeto;
	}
	
	public void setMesesDeProjeto(int mesesDeProjeto) {
		this.mesesDeProjeto = mesesDeProjeto;
	}
	
	public String toString() {
		return "Projeto " + mesesDeProjeto;
	}
}

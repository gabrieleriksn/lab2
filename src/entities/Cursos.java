package entities;

public class Cursos {
	
	private double horasDeCursos;
	
	public Cursos() {
	}
	
	public Cursos(double horasDeCursos) {
		this.horasDeCursos = horasDeCursos;
	}
	
	public double getHorasDeCursos() {
		return horasDeCursos;
	}
	
	public void adicionarHorasDeCursos(double horasDeCursos) {
		this.horasDeCursos += horasDeCursos;
	}
	
	@Override
	public String toString() {
		return "Cursos " + horasDeCursos;
	}
}

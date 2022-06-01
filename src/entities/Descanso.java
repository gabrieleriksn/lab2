package entities;

public class Descanso {
	
	private int horasDescanso;
	private int numeroSemanas;
	
	public void defineHorasDescanso(int horasDescanso) {
		this.horasDescanso = horasDescanso;
	}
	
	public void defineNumeroSemanas(int numeroSemanas) {
		this.numeroSemanas = numeroSemanas;
	}
	
	public String getStatusGeral() {
		double descansoPorSemana = (double) horasDescanso / numeroSemanas;
		if (descansoPorSemana >= 26) {
			return "descansado";
		}
		
		return "cansado";
	}
}

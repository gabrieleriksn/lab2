package entities;

public class Descanso {
	
	private int horasDescanso;
	private int numeroSemanas;
	private String emoji;
	private boolean descansado;
	
	public void defineHorasDescanso(int horasDescanso) {
		this.horasDescanso = horasDescanso;
	}
	
	public void defineNumeroSemanas(int numeroSemanas) {
		this.numeroSemanas = numeroSemanas;
	}
	
	public void definirEmoji(String emoji) {
		this.emoji = emoji;
	}
	
	private boolean estaDescansado() {
		double descansoPorSemana = (double) horasDescanso / numeroSemanas;
		if (descansoPorSemana >= 26) {
			return true;
		}
		
		return false;
	}
	
	private void checaMudancaNoEstadoGeral() {
		if (descansado != estaDescansado()) {
			this.emoji = null;
		}
	}
	
	public String getStatusGeral() {
		checaMudancaNoEstadoGeral();
		if (estaDescansado()) {
			this.descansado = true;
			if (emoji != null) {
				return "descansado" + " - " + emoji;
			}
			else {
				return "descansado";
			}
		}
		
		else {
			this.descansado = false;
			if (emoji != null) {
				return "cansado" + " - " + emoji;
			}
			else {
				return "cansado";
			}
		}
	}
	
}

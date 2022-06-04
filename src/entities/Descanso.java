package entities;

public class Descanso {
	
	private int horasDescanso;
	private int numeroSemanas;
	private String emoji;
	private boolean descansado = false;
	
	public void defineHorasDescanso(int horasDescanso) {
		this.horasDescanso = horasDescanso;
	}
	
	public void defineNumeroSemanas(int numeroSemanas) {
		this.numeroSemanas = numeroSemanas;
	}
	
	public void definirEmoji(String emoji) {
		this.emoji = emoji;
	}
	
	public String getStatusGeral() {
		mudancaNoEstadoGeral();
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
	
	private boolean estaDescansado() {
		double descansoPorSemana = (double) horasDescanso / numeroSemanas;
		if (descansoPorSemana >= 26) {
			return true;
		}
		
		return false;
	}
	
	private void mudancaNoEstadoGeral() {
		if (descansado != estaDescansado()) {
			this.emoji = null;
		}
	}
}

package entities;

/**
 * A classe Descanso é usada para referenciar e lidar com a rotina de descanso 
 * de um aluno, de modo que, sem contar com as horas que ele passa dormindo, 
 * ele possa ter horas de lazer suficientes.
 * 
 * @author Gabriel Erik Silva Nunes - 121110201
 *
 */

public class Descanso {
	
	/**
	 * Horas de descanso. É um valor inteiro que representa a quantidade
	 * de horas de descanso que um aluno possui para realizar atividades
	 * de lazer.
	 */
	private int horasDescanso;
	/**
	 * Numero de semanas. É um valor inteiro que representa uma quantidade
	 * de semanas nas quais as horas de descanso estão divididas.
	 */
	private int numeroSemanas;
	/**
	 * Emoji. É uma String que representa um Emoji associado ao estado
	 * do indivíduo.
	 */
	private String emoji;
	/**
	 * Descansado. É um valor booleano que representa o estado do indivíduo.
	 * Se o valor for true, então o indivíduo está descansado. Do contrário,
	 * o indivíduo está cansado.
	 */
	private boolean descansado;
	
	/**
	 * O construtor dessa classe, por padrão, inicializa o numero de horasDescanso 
	 * e de numeroSemanas com 0. O emoji, por ainda não ser definido, começa como 
	 * "null" e o atributo "descansado" tem valor inicial false, uma vez que a 
	 * especificação demandada para o programa é que, inicialmente, o aluno 
	 * comece como "cansado" caso ainda não tenha definido horas suficientes de
	 * descanso.
	 */
	public Descanso() {
	}
	
	/**
	 * Esse método atribui ao atributo horasDescanso da Classe um valor.
	 * 
	 * @param horasDescanso Esse parâmetro representa o valor de horas
	 * de descanso que deve ser atribuído ao atributo da classe.
	 */
	public void defineHorasDescanso(int horasDescanso) {
		this.horasDescanso = horasDescanso;
	}
	
	/**
	 * Esse método atribui ao atributo numeroSemanas da Classe um valor.
	 * 
	 * @param numeroSemanas Esse parâmetro representa o valor de
	 * número de semanas que deve ser atribuído ao atributo da classe.
	 */
	public void defineNumeroSemanas(int numeroSemanas) {
		this.numeroSemanas = numeroSemanas;
	}
	
	/**
	 * Esse método é usado para definir um Emoji que representa
	 * de forma mais expressiva o estado do indivíduo.
	 * 
	 * @param emoji Esse parâmetro representa o emoji em forma de String que será
	 * atribuído ao atributo da classe.
	 */
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
	
	/**
	 * Esse método gera uma representação na forma de String para o estado do indivíduo.
	 * 
	 * @return Esse método retorna uma String informando o estado do indivíduo e, se
	 * houver, o emoji que está associado a esse estado.
	 */
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

package entities;

/**
 * Essa classe é responsável por realizar o controle sobre atividades complementares
 * do tipo Estágio.
 *
 * @author Gabriel Erik Silva Nunes - 121110201
 *
 */

public class Estagio {
	
	/**
	 * Horas de estágio. É um valor inteiro que representa a quantidade de horas
	 * de estágioque um objeto do tipo Estagio apresenta.
	 */
	private int horasDeEstagio;
	/**
	 * Meses de estágio. É um inteiro que representa a quantidade de meses de
	 * estágio que um objeto do tipo Estagio apresenta.
	 */
	private int mesesDeEstagio;
	
	/**
	 * Esse construtor inicializa um objeto do tipo Estagio com 0 horas de
	 * de Estágio e, por padrão, com duração de 4 meses.
	 */
	public Estagio() {
		this.mesesDeEstagio = 4;
	}
	
	/**
	 * Esse construtor inicializa um objeto do tipo Estagio com a quantidade
	 * de horas fornecidas e, por padrão, com duração de 4 meses.
	 * 
	 * @param horasDeEstagio Esse parâmetro representa quantidade horas de
	 * estágio que serão atribuídas ao atributo horasDeEstagio da classe.
	 */
	public Estagio(int horasDeEstagio) {
		this.horasDeEstagio = horasDeEstagio;
		this.mesesDeEstagio = 4;
	}
	
	/**
	 * Esse construtor inicializa um objeto do tipo Estagio com a quantidade
	 * de horas fornecidas e a quantidade de meses fornecidos.
	 * 
	 * @param horasDeEstagio Esse parâmetro representa a quantidade horas de
	 * estágio que será atribuída ao atributo horasDeEstagio da classe.
	 * @param mesesDeEstagio Esse parâmetro representa a quantidade meses de
	 * estágio que será atribuída ao atributo mesesDeEstagio da classe.
	 */
	public Estagio(int horasDeEstagio, int mesesDeEstagio) {
		this.horasDeEstagio = horasDeEstagio;
		this.mesesDeEstagio = mesesDeEstagio;
	}
	
	/**
	 * Esse método retorna o atributo horasDeEstagio.
	 * 
	 * @return Esse método retorna um valor inteiro referente à quantidade 
	 * de horas de estágio que forem instanciadas para o objeto.
	 */
	public int getHorasDeEstagio() {
		return horasDeEstagio;
	}
	
	/**
	 * Esse método define a quantidade de horasDeEstagio.
	 * 
	 * @param horasDeEstagio Esse parâmetro representa o valor de horasDeEstagio
	 * que será atribuído ao atributo da classe.
	 */
	public void setHorasDeEstagio(int horasDeEstagio) {
		this.horasDeEstagio = horasDeEstagio;
	}
	
	/**
	 * Esse método retorna o atributo mesesDeEstagio.
	 * 
	 * @return Esse método retorna um valor inteiro referente à quantidade
	 * de meses de estágio que foram instanciados para o objeto.
	 */
	public int getMesesDeEstagio() {
		return mesesDeEstagio;
	}
	
	/**
	 * Esse método define a quantidade de mesesDeEstagio.
	 * 
	 * @param mesesDeEstagio Esse parâmetro representa o valor de mesesDeEstagio
	 * que será atribuído ao atributo da classe.
	 */
	public void setMesesDeEstagio(int mesesDeEstagio) {
		this.mesesDeEstagio = mesesDeEstagio;
	}
	
	/**
	 * Esse método retorna uma representação na forma de String para um objeto
	 * pertencente à classe.
	 * 
	 * @return É uma String no formato Estagio horasDeEstagio mesesDeEstagio.
	 */
	@Override
	public String toString() {
		return "Estagio " + horasDeEstagio + " " + mesesDeEstagio;
	}
}

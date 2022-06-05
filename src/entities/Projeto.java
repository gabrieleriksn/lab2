package entities;

/**
 * Essa classe é responsável por realizar o controle sobre atividades complementares
 * do tipo Projeto.
 * 
 * @author Gabriel Erik Silva Nunes - 121110201
 *
 */

public class Projeto {
	
	/**
	 * Meses de projeto. É uma valor inteiro que representa os meses demandados
	 * para um determinado Projeto.
	 */
	private int mesesDeProjeto;
	
	/**
	 * Esse construtor padrão inicializa um objeto do tipo Projeto com 0 meses
	 * de projeto.
	 */
	public Projeto() {
	}
	
	/**
	 * Esse construtor inicializa um objeto do tipo Projeto com a quantidade
	 * de meses fornecida.
	 * 
	 * @param mesesDeProjeto Esse parâmetro se refere à quantidade de meses
	 * que será atribuída ao atributo mesesDeProjeto da classe.
	 */
	public Projeto(int mesesDeProjeto) {
		this.mesesDeProjeto = mesesDeProjeto;
	}
	
	/**
	 * Esse método retorna o atributo mesesDeProjeto.
	 * 
	 * @return Esse método retorna um valor inteiro referente à quantidade
	 * de meses de projeto instanciados para o objeto.
	 */
	public int getMesesDeProjeto() {
		return mesesDeProjeto;
	}
	
	/**
	 * Esse método define um valor para o atributo mesesDeProjeto da classe.
	 * 
	 * @param mesesDeProjeto Esse parâmetro se refere à quantidade de meses
	 * que será atribuída ao atributo mesesDeProjeto da classe.
	 */
	public void setMesesDeProjeto(int mesesDeProjeto) {
		this.mesesDeProjeto = mesesDeProjeto;
	}
	
	/**
	 * Esse método retorna uma representação na forma de String para um objeto
	 * pertencente à classe.
	 * 
	 * @return É uma String no formato Projeto + mesesDeProjeto.
	 */
	public String toString() {
		return "Projeto " + mesesDeProjeto;
	}
}

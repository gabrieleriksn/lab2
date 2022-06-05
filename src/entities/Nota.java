package entities;

/**
 * Essa classe é usada para representar uma nota.
 * 
 * @author Gabriel Erik Silva Nunes - 121110201
 *
 */
public class Nota {
	
	/**
	 * Valor da nota. É um valor double que representa o valor da nota.
	 */
	private double valorNota;
	
	/**
	 * Esse construtor gera uma nota com valorNota igual a zero.
	 */
	public Nota() {
	}
	
	/**
	 * Esse construtor gera uma nota com o valorNota fornecido na
	 * instanciação.
	 * 
	 * @param valorNota Esse parâmetro representa a nota a ser
	 * atribuída ao atributo valorNota da Classe.
	 */
	public Nota(double valorNota) {
		this.valorNota = valorNota;
	}
	
	/**
	 * Esse método retorna o valor da nota atribuído ao objeto da classe.
	 * 
	 * @return Esse método retorna um valor double que representa o valor da nota 
	 * do objeto.
	 */
	public double getValorNota() {
		return valorNota;
	}
	
	/**
	 * Esse método define o valor da nota do objeto pertencente à classe.
	 * 
	 * @param valorNota Esse parâmetro representa o valor da nota que será
	 * atribuído ao atributo valorNota da classe.
	 */
	public void setValorNota(double valorNota) {
		this.valorNota = valorNota;
	}
	
	/**
	 * Esse método retorna uma representa��o na forma de String para um objeto
	 * pertencent à classe.
	 * 
	 * @return Nota formatada  com uma casa decimal.
	 */
	@Override
	public String toString() {
		return String.format("%.1f", valorNota);
	}
}

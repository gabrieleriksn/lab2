package entities;

/**
 * Essa classe é usada para representar o peso de uma nota.
 * 
 * @author Gabriel Erik Silva Nunes - 121110201
 *
 */
public class Peso {
	
	/**
	 * Valor do peso. É um inteiro que representa o valor do peso.
	 */
	private int valorDoPeso;
	
	/**
	 * Esse construtor inicializa o objeto com atributo valorDoPeso como 1.
	 */
	public Peso() {
		this.valorDoPeso = 1;
	}
	
	/**
	 * Esse construtor inicializa o objeto com atributo valorDoPeso
	 * como o valor passado como parâmetro.
	 * 
	 * @param valorDoPeso Esse parâmetro representa o valor da nota que
	 * será atribuído ao atributo da classe valorDoPeso.
	 */
	public Peso(int valorDoPeso ) {
		this.valorDoPeso = valorDoPeso;
	}
	
	/**
	 * Esse método retorna o atributo valorDoPeso da objeto.
	 * 
	 * @return Esse método retorna o valor do peso atribuído
	 * ao objeto.
	 */
	public int getValorDoPeso() {
		return valorDoPeso;
	}
	
	/**
	 * Esse método define o atributo valorDoPeso do objeto.
	 * 
	 * @param valorDoPeso Esse parâmetro representa o valor inteiro que será
	 * atribuído ao atributo valorDoPeso do objeto. 
	 */
	public void setValorDoPeso(int valorDoPeso) {
		this.valorDoPeso = valorDoPeso;
	}
}

package entities;

/**
 * Essa classe é usada para fazer o controle do tempo online
 * que um aluno qualquer disponibiliza para estudar uma 
 * disciplina qualquer. Ademais, ela faz o controle
 * entre esse tempo e o tempo esperado que o indivíduo
 * disponibiliza para estudá-la.
 * 
 * @author Gabriel Erik Silva Nunes - 121110201
 *
 */

public class RegistroTempoOnline {
	
	/**
	 * Nome da disciplina. Esse atributo é uma String que representa
	 * o nome da disciplina em questão.
	 */
	private String nomeDisciplina;
	/**
	 * Tempo online esperado. É um valor inteiro que representa a
	 * quantidade de horas que se espera que o aluno disponibilize para
	 * estudar a disciplina.
	 */
	private int tempoOnlineEsperado;
	/**
	 * Tempo online. É um valor inteiro que representa a quantidade de horas
	 * que o aluno usou para estudar a disciplina.
	 */
	private int tempoOnline;
	
	/**
	 * Esse construtor inicializa um objeto da classe com o nome da
	 * discilplina fornecido e, por padrão, o tempo online esperado
	 * genérico é de 120 horas.
	 * 
	 * @param nomeDisciplina Esse parâmetro representa o nome da disciplina que será 
	 * atribuído ao atributo da Classe.
	 */
	public RegistroTempoOnline(String nomeDisciplina) {
		this.nomeDisciplina = nomeDisciplina;
		this.tempoOnlineEsperado = 120;
	}
	
	/**
	 * Esse construtor inicializa um objeto da classe com o nome da disciplina
	 * fornecido e com o tempo online esperado de conexão do aluno para que a estude.
	 * 
	 * @param nomeDisciplina Esse parâmetro representa o nome da disciplina que será 
	 * atribuído ao atributo da Classe.
	 * @param tempoOnlineEsperado Esse parâmetro representa o tempo online esperado
	 * que será atribuído ao atributo da Classe.
	 */
	public RegistroTempoOnline(String nomeDisciplina, int tempoOnlineEsperado) {
		this.nomeDisciplina = nomeDisciplina;
		this.tempoOnlineEsperado = tempoOnlineEsperado;
	}
	
	/**
	 * Esse método retorna o nome da disciplina associado ao registro online.
	 * (Foi criado para auxiliar no desenvolvimento do CoisaCLI).
	 * 
	 * @return Uma String contendo o nome da disciplina associada ao registro
	 * online dela.
	 */
	public String getNomeDisciplina() {
		return nomeDisciplina;
	}
	
	/**
	 * Esse método adiciona ao atributo tempoOnline horas de conexão online.
	 * 
	 * @param tempo Esse parâmetro representa o tempo a ser incrementado ao atributo 
	 * tempoOnline da classe.
	 */
	public void adicionaTempoOnline(int tempo) {
		tempoOnline += tempo;
	}

	/**
	 * Esse método verifica se o tempo online demandado pelo indivíduo para 
	 * estudar a disciplina é maior ou igual ao tempo online esperado.
	 * 
	 * @return Esse método retorno um valor lógico que responde à sentença
	 * declarativa "atingiu o tempo online esperado". Caso o resultado seja true
	 * significa que o indivíduo atingiu o tempo online esperado, do contrário
	 * significa que o indivíduo não atingiu.
	 */
	public boolean atingiuMetaTempoOnline() {
		if (tempoOnline >= tempoOnlineEsperado) {
			return true;
		}
		
		return false;
	}
	
	/**
	 * Esse método retorna uma representação na forma de String para um objeto 
	 * pertencente à classe.
	 * 
	 * @return String no formato "nomeDisciplina tempoOnline/tempoOnlineEsperado".
	 */
	@Override
	public String toString() {
		return nomeDisciplina + " " + tempoOnline + "/" + tempoOnlineEsperado;
	}
	
}

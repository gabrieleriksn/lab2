package entities;

/**
 * Essa classe é responsável por realizar o controle sobre atividades complementares
 * do tipo Cursos.
 * 
 * @author Gabriel Erik Silva Nunes - 121110201
 *
 */

public class Cursos {
	
	/**
	 * Horas de cursos. É uma valor inteiro que representa a quantidade
	 * de horas de curso realizadas por um indivíduo.
	 */
	private double horasDeCursos;
	
	/**
	 * Esse construtor padrão inicializa um objeto do tipo Cursos com 0 horas
	 * de cursos;
	 */
	public Cursos() {
	}
	
	/**
	 * Esse construtor inicializa um objeto do tipo Cursos com a quantidade
	 * de horas de cursos fornecida.
	 * 
	 * @param horasDeCursos Esse parâmetro se refere a quantidade de horas de
	 * cursos que será atribuída ao atributo da classe.
	 */
	public Cursos(double horasDeCursos) {
		this.horasDeCursos = horasDeCursos;
	}
	
	/**
	 * Esse método retorna o atributo horasDeCursos.
	 * 
	 * @return Esse método retorna um valor do tipo inteiro que se refere ao
	 * atributo horasDeCurso do objeto pertencente à classe.
	 */
	public double getHorasDeCursos() {
		return horasDeCursos;
	}
	
	/**
	 * Esse método define o atributo horasDeCursos.
	 * 
	 * @param horasDeCursos Esse parâmetro se refere ao valor double que será 
	 * atribuído ao atributo horasDeCursos do objeto instanciado.
	 */
	public void adicionarHorasDeCursos(double horasDeCursos) {
		this.horasDeCursos += horasDeCursos;
	}
	
	/**
	 * Esse método retorna uma representação na forma de String para um objeto
	 * pertencente à classe.
	 * 
	 * @return É uma String no formato Cursos horasDeCursos(formata com 1 casa decimal).
	 */
	@Override
	public String toString() {
		return "Cursos " + String.format("%.1f", horasDeCursos);
	}
}

package entities;

/**
 * Essa classe é responsável por lidar com o controle 
 * das atividades complementares realizadas por um
 * indivíduo qualquer. As atividades complementares 
 * levadas em consideração são estágios, projetos 
 * e cursos.
 * 
 * @author Gabriel Erik Silva Nunes - 121110201
 *
 */

public class AtividadesComplementares {
	/**
	 * Estagios. É um Array de objetos do tipo Estagio que representa
	 * os estagios que um inddivíduo realizou.
	 */
	private Estagio[] estagios;
	/**
	 * Indice Estagios. É uma variável auxiliar inteira para checar a quantidade
	 * de estágios que um indivíduo realizou e indicar, ao mesmo tempo,
	 * a próxima posição livre no Array de estágios para encaixar um novo
	 * Estagio.
	 */
	private int indiceEstagios;
	/**
	 * Projetos. É um Array de objetos do tipo Projeto que representa
	 * os projetos que um indivíduo realizou.
	 */
	private Projeto[] projetos;
	/**
	 * Indice Projetos. É uma variável auxiliar inteira para checar a quantidade
	 * de projetos que um indivíduo realizou e indicar, ao mesmo tempo,
	 * a próxima posição livre no Array de projetos para encaixar um novo
	 * Projeto.
	 */
	private int indiceProjetos;
	/**
	 * Cursos. É um objeto do tipo Cursos usado para lidar com as horas
	 * de curso que um indivíduo realizou.
	 */
	private Cursos cursos; 
	
	/**
	 * Esse construtor incializa os atributos da classe com os valores padrão 
	 * para tipos primitivos e, no caso, dos Arrays de estagios e de projetos, os 
	 * tamanhos são 9 e 16, respectivamente.
	 */
	public AtividadesComplementares() {
		inicializaAtributos();
	}
	
	private void inicializaAtributos() {
		estagios = new Estagio[9];
		for (int i = 0; i < estagios.length; i++) {
			estagios[i] = new Estagio();
		}
		
		projetos = new Projeto[16];
		for (int i = 0; i < projetos.length; i++) {
			projetos[i] = new Projeto();
		}
		
		cursos = new Cursos();
	}
	
	/**
	 * Esse método instancia um objeto do tipo Estagio em uma posição vaga 
	 * no Array de estágios.
	 * 
	 * @param horas Esse parâmetro recebe o valor de horas que será atribuído
	 * ao estágio.
	 */
	public void adicionarEstagio(int horas) {
		estagios[indiceEstagios] = new Estagio(horas);
		indiceEstagios++;
	}
	
	/**
	 * Esse método instancia um objeto do tipo Estagio em uma posição vaga
	 * no Array de estágios.
	 * 
	 * @param horas Esse parâmetro recebe o valor de horas que será atribuído
	 * ao estágio.
	 * @param meses Esse parâmetro recebe o valor de meses que será atribuído ao
	 * estágio.
	 */
	public void adicionarEstagio(int horas, int meses) {
		estagios[indiceEstagios] = new Estagio(horas, meses);
		indiceEstagios++;
	}
	
	/**
	 * Esse método instancia um objeto do tipo Projeto em uma posição vaga
	 * no Array de projetos.
	 * 
	 * @param meses Esse parâmetro recebe o valor de meses que será atribuído ao
	 * projeto.
	 */
	public void adicionarProjeto(int meses) {
		projetos[indiceProjetos] = new Projeto(meses);
		indiceProjetos++;
	}
	
	/**
	 * Esse método adiciona horas de curso ao objeto do tipo Cursos da classe.
	 * 
	 * @param horas Esse parâmetro representa quantidade de horas que será
	 * incrementada ao objeto do tipo Cursos.
	 */
	public void adicionarCurso(double horas) {
		cursos.adicionarHorasDeCursos(horas);
	}
	
	/**
	 * Esse método realiza a contagem de créditos de todas as atividades
	 * complementares registradas.
	 * 
	 * @return Esse método retorna um inteiro representando a soma dos 
	 * créditos de todas as atividades complementares. 
	 */
	public int contaCreditos() {
		int creditos = 0;
		creditos += contaCreditosEstagios();
		creditos += contaCreditosProjetos();
		creditos += contaCreditosCursos();		
		return creditos;
	}
	
	private int contaCreditosEstagios() {
		int creditos = 0;
		for (Estagio estagio : estagios) {
			if (estagio.getMesesDeEstagio() / 4 > estagio.getHorasDeEstagio() / 300) {
				creditos += (estagio.getHorasDeEstagio() / 300) * 5;
			}
			else {
				creditos += (estagio.getMesesDeEstagio() / 4) * 5;
			}
		}
		
		return creditos;
	}
	
	private int contaCreditosProjetos() {
		int creditos = 0;
		for (Projeto projeto : projetos) {
			creditos += (projeto.getMesesDeProjeto() / 3) * 2;
		}
		
		return creditos;
	}
	
	private int contaCreditosCursos() {
		return ((int) cursos.getHorasDeCursos() / 30) * 1;
	}
	
	/**
	 * Esse método é responsável por criar um Array de Strings com todas as atividades 
	 * complementares e características relacionas a elas.
	 * 
	 * @return Esse método retorna um Array de Strings que representa as atividades
	 * complementares.
	 */
	public String[] pegaAtividades() {
		String[] atividadesComplementares = new String[indiceEstagios + indiceProjetos + 4];
		atualizaEstagios(atividadesComplementares);
		atualizaProjetos(atividadesComplementares);
		atualizaCursos(atividadesComplementares);
		atualizaCreditos(atividadesComplementares);
		return atividadesComplementares;
	}
	
	private void atualizaEstagios(String[] atividadesComplementares) {
		for (int i = 0; i < indiceEstagios; i++) {
			atividadesComplementares[i] = estagios[i].toString();
		}
	}
	
	private void atualizaProjetos(String[] atividadesComplementares) {
		int contador = 0;
		for (int i = indiceEstagios; i < indiceEstagios + indiceProjetos; i++) {
			atividadesComplementares[i] = projetos[contador].toString();
			contador++;
		}
	}
	
	private void atualizaCursos(String[] atividadesComplementares) {
		atividadesComplementares[indiceEstagios + indiceProjetos] = cursos.toString();
	}
	
	private void atualizaCreditos(String[] atividadesComplementares) {
		atividadesComplementares[atividadesComplementares.length - 3] = "Creditos_Estagio " + contaCreditosEstagios();
		atividadesComplementares[atividadesComplementares.length - 2] = "Creditos_Projeto " + contaCreditosProjetos();
		atividadesComplementares[atividadesComplementares.length - 1] = "Creditos_Cursos " + contaCreditosCursos();
	}

}

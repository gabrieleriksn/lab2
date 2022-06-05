package entities;

import java.util.Arrays;

/**
 * Essa classe é usada para realizar o controle sobre notas e sobre horas de
 * estudo que um indivíduo qualquer demanda para uma disciplina qualquer.
 * 
 * @author Gabriel Erik Silva Nunes - 121110201
 *
 */

public class Disciplina {
	
	/**
	 * Nome da disciplina. É uma String que representa o nome da disciplina
	 * em questão.
	 */
	private String nomeDisciplina;
	/**
	 * Horas de estudo. É um inteiro que representa quantidade de horas de
	 * estudo que um indivíduo demandou para estudar a disciplina.
	 */
	private int horasDeEstudo;
	/**
	 * Notas. É um Array de objetos do tipo Nota que representa as notas do
	 * indivíduo na disciplina.
	 */
	private Nota[] notas;
	/**
	 * Pesos. É um Array de objetos do tipo Peso que representa os pesos
	 * associados a cada nota da disciplina.
	 */
	private Peso[] pesos;
	
	/**
	 * Esse construtor recebe uma String que representa o nome da disciplina
	 * e inicializa os Arrays de notas e de pesos de forma padrão, isto e,
	 * quando a especificação não é fornecida, é levado em consideração que
	 * a disciplina tem 4 notas e todas essas notas têm peso 1.
	 * 
	 * @param nomeDisciplina Esse parâmetro representa o nome da disciplina
	 * a ser atribupido ao atributo da classe nomeDisciplina.
	 */
	public Disciplina(String nomeDisciplina) {
		this.nomeDisciplina = nomeDisciplina;
		inicializaArrays();
	}
	
	/**
	 * Esse construtor recebe uma String que representa o nome da disciplina
	 * e inicializa os Arrays de notas e de pesos com base na quantidade de
	 * notas especificadas. Como os pesos não são especificados é levado
	 * em consideração que todas as notas possuem peso 1.
	 * 
	 * @param nomeDisciplina Esse parâmetro representa o nome da disciplina
	 * a ser atribuído ao atributo da classe nomeDisciplina. 
	 * @param numeroDeNotas Esse parâmetro representa a quantidade de notas
	 * que uma disciplina contém.
	 */
	public Disciplina(String nomeDisciplina, int numeroDeNotas) {
		this.nomeDisciplina = nomeDisciplina;
		inicializaArrays(numeroDeNotas);
	}
	
	/**
	 * Esse construtor recebe uma String que representa o nome da disciplina
	 * e inicializa os Arrays de notas e de pesos com base na quantidade de
	 * notas especificadas. Como os pesos são especificados ocorre uma
	 * atribuição de cada peso fornecido para o Array que lida com os pesos.
	 * 
	 * @param nomeDisciplina Esse parâmetro representa o nome da disciplina
	 * a ser atribuído ao atributo da classe nomeDisciplina.
	 * @param numeroDeNotas Esse parâmetro representa a quantidade de notas
	 * que uma disciplina contém.
	 * @param pesos Esse parâmetro representa um vetor de inteiros com os
	 * pesos, em ordem, de cada nota, isto é, o peso na posição "0" do
	 * Array equivale ao peso da nota na posição "0" do vetor de notas.
	 */
	public Disciplina(String nomeDisciplina, int numeroDeNotas, int[] pesos) {
		this.nomeDisciplina = nomeDisciplina;
		inicializaArrays(numeroDeNotas, pesos);
	}
	
	private void inicializaArrays() {
		notas = new Nota[4];
		pesos = new Peso[4];
		for (int i = 0; i < notas.length; i++) {
			notas[i] = new Nota();
			pesos[i] = new Peso();
		}
	}

	private void inicializaArrays(int numeroDeNotas) {
		notas = new Nota[numeroDeNotas];
		pesos = new Peso[numeroDeNotas];
		for (int i = 0; i < notas.length; i++) {
			notas[i] = new Nota();
			pesos[i] = new Peso();
		}
	}
	
	private void inicializaArrays(int numeroDeNotas, int[] pesos) {
		notas = new Nota[numeroDeNotas];
		this.pesos = new Peso[numeroDeNotas];
		for (int i = 0; i < notas.length; i++) {
			notas[i] = new Nota();
			this.pesos[i] = new Peso(pesos[i]);
		}
	}
	
	/**
	 * Esse método retorna o nome da disciplina.
	 * (Foi criado para auxiliar no desenvolvimento do CoisaCLI).
	 * 
	 * @return Uma String contendo o nome da disciplina associado ao atributo
	 * da Classe.
	 */
	public String getNomeDisciplina() {
		return nomeDisciplina;
	}
	
	/**
	 * Esse método é responsável por acrescentar horas de estudo
	 * que o indivíduo dispôs para a disciplina. 
	 * 
	 * @param horas Esse parâmetro representa a quantidade de horas
	 * a ser incrementada no atributo horasDeEstudo da Classe.
	 */
	public void cadastraHoras(int horas) {
		horasDeEstudo += horas;
	}
	
	/**
	 * Esse método é responsável por cadastrar notas
	 * no Array de notas.
	 * 
	 * @param nota Esse parâmetro representa a identificação da nota,
	 * isto é, se é a nota "1" ou se é a nota "2", por exemplo.
	 * @param valorNota Esse parâmetro representa o valor a ser atribuído
	 * a essa nota.
	 */
	public void cadastraNota(int nota, double valorNota) {
		notas[nota - 1].setValorNota(valorNota);
	}
	
	/**
	 * Esse método verifica se as notas do aluno são suficientes para
	 * ele ser aprovado na disciplina referenciada. Tal verificação
	 * leva em consideração que a média ponderada deve ser maior ou igual
	 * a 7.
	 * 
	 * @return Retorna um booleano respondendo à sentença declarativa
	 * "o aluno foi aprovado". Caso tenha sido aprovado, o retorno é
	 * "true", do contrário o retorno é "false".
	 */
	public boolean aprovado() {
		if (mediaDoAluno(notas, pesos) >= 7) {
			return true;
		}
		
		return false;
	}
	
	private double mediaDoAluno(Nota[] notas, Peso[] pesos) {
		double soma = 0;
		for (int i = 0; i < notas.length; i++) {
			soma += notas[i].getValorNota() * pesos[i].getValorDoPeso();
		}
		
		int somaDosPesos = 0;
		for (int i = 0; i < pesos.length; i++) {
			somaDosPesos += pesos[i].getValorDoPeso();
		}
		
		return soma / somaDosPesos;
	}
	
	/**
	 * Esse método retorna uma representação na forma de String para um objeto 
	 * pertencente à classe.
	 * 
	 * @return String nome formato nomeDisciplina horasDeEstudo mediaDoAluno ArrayDasNotas.
	 */
	@Override
	public String toString() {
		return nomeDisciplina 
			   + " " 
			   + horasDeEstudo 
			   + " " 
			   + String.format("%.1f", mediaDoAluno(notas, pesos)) 
			   + " " 
			   + Arrays.toString(notas);
	}
}

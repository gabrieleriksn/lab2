package entities;

import java.util.List;
import java.util.ArrayList;

/**
 * Essa classe é responsável por criar um Aluno e possibilitar a manipulação
 * da sua rotina de descanso, dos seus registros de tempo online para as 
 * disciplinas, das suas disciplinas e notas associadas a elas e de suas
 * atividades complementares. (Essa classe foi criada, especificamente,
 * para permitir a implementação do bônus 5.4 (CoisaCLI) de forma mais organizada
 * e elegante).
 * 
 * @author Gabriel Erik Silva Nunes - 121110201
 *
 */

public class Aluno {
	
	/**
	 * Nome. É uma String que representa o nome do aluno.
	 */
	private String nome;
	/**
	 * Matrícula. É um inteiro que representa o número de matrícula
	 * do aluno na instituição.
	 */
	public int matricula;
	/**
	 * rotinaDeDescanso. É um atributo do tipo Descanso.
	 */
	private Descanso rotinaDeDescanso;
	/**
	 * registrosOnline. É uma lista que contém os registros de tempo online
	 * para cada disciplina cadastrada.
	 */
	private List<RegistroTempoOnline> registrosOnline;
	/**
	 * disciplinas. É uma lista que contém as disciplinas cursadas pelo aluno
	 * que forem cadastradas.
	 */
	private List<Disciplina> disciplinas;
	/**
	 * atividadesComplementres. É um atributo do tipo AtividadesComplementares
	 * que faz o controle dos Estágios, Projetos e dos Cursos do aluno.
	 */
	private AtividadesComplementares atividadesComplementares;

	/**
	 * Esse construtor inicializa um objeto do tipo Aluno recebendo um nome
	 * e um número de matrícula. Além disso, ele inicializa as listas instanciadas
	 * como ArraysList.
	 * 
	 * @param nome Este parâmetro é uma String que representa o nome que será
	 * atribuído ao atributo da classe.
	 * @param matricula Este parâmetro é um inteiro que representa o valor que
	 * será atribuído ao atributo da classe.
	 */
	public Aluno(String nome, int matricula) {
		this.nome = nome;
		this.matricula = matricula;
		rotinaDeDescanso = new Descanso();
		registrosOnline = new ArrayList<>();
		disciplinas = new ArrayList<>();
		atividadesComplementares = new AtividadesComplementares();
	}

	/**
	 * Esse método retorna o atributo nome do Aluno.
	 * 
	 * @return Uma String representando o nome do aluno.
	 */
	public String getNome() {
		return nome;
	}
	
	/**
	 * Esse método retorna o atributo matrícula do Aluno.
	 * 
	 * @return Um inteiro representando a matrícula do Aluno.
	 */
	public int getMatricula() {
		return matricula;
	}
	
	/**
	 * Esse método retorna o atríbuto rotinaDeDescanso do Aluno.
	 * 
	 * @return Um objeto do tipo Descanso depresentando a rotina de 
	 * descanso do Aluno.
	 */
	public Descanso getRotinaDeDescanso() {
		return rotinaDeDescanso;
	}
	
	/**
	 * Esse método permite acessar o atributo atividadesComplementares
	 * da Classe.
	 * 
	 * @return Retorna um objeto do tipo AtividadesComplementares.
	 */
	public AtividadesComplementares getAtividadesComplementares() {
		return atividadesComplementares;
	}

	/**
	 * Esse método é responsável por criar e adicionar na lista de registros de tempo
	 * online um novo registro.
	 * 
	 * @param nomeDisciplina É uma string representando o nome da disciplina associada
	 * ao registro de tempo online que será adicionado á lista.
	 * @param tempoOnlineEsperado É um inteiro representando o tempo online esperado
	 * que o aluno se mantenha conectado para essa disciplina.
	 */
	public void adicionarRegistroOnline(String nomeDisciplina, int tempoOnlineEsperado) {
		registrosOnline.add(new RegistroTempoOnline(nomeDisciplina, tempoOnlineEsperado));
	}
	
	/**
	 * Esse método incrementa tempo em um objeto do tipo RegistroTempoOnline que está
	 * presenta na lista de registrosOnline.
	 * 
	 * @param index É um inteiro que representa a posição na lista de registrosOnline
	 * que sofrerá o incremento de tempo online.
	 * @param tempo É um inteiro que representa quantidade de tempo a ser incrementada
	 * no atributo tempoOnline do registro.
	 */
	public void incremetarTempoOnlineRegistro(int index, int tempo) {
		registrosOnline.get(index).adicionaTempoOnline(tempo);
	}
	
	/**
	 * Esse método incrementa tempo em um objeto do tipo RegistroTempoOnline que está
	 * presenta na lista de registrosOnline. (É uma sobrecarga que no lugar de
	 * incrementar pela posição, incrementa baseado no nome da disciplina atribuído
	 * ao registro de tempo online presente na lista).
	 * 
	 * @param nomeDisciplina É uma String que representa o nome da disciplina que
	 * possui um registro de tempo online no qual será incrementado um tempo online.
	 * @param tempo É um inteiro que representa quantidade de tempo a ser incrementada
	 * no atributo tempoOnline do registro.
	 * @return Retorna uma String que exibe uma mensagem que permite identificar se o
	 * processo deu certo.
	 */
	public String incrementarTempoOnlineRegistro(String nomeDisciplina, int tempo) {
		for (int i = 0; i < registrosOnline.size(); i++) {
			if (registrosOnline.get(i).getNomeDisciplina().equals(nomeDisciplina)) {
				registrosOnline.get(i).adicionaTempoOnline(tempo);;
				return "Sucesso!";
			}
		}
		return "Falha! Verifique se a disciplina está cadastrada.";
	}
	
	/**
	 * Esse método verifica se um registro de tempo online presente na lista
	 * de registrosOnline atingiu a meta de tempo necessário para a disciplina cadastrada.
	 * 
	 * @param nomeDisciplina É uma String que representa o nome da disciplina que
	 * possui um registro de tempo online no qual será incrementado um tempo online.
	 * @return Retorna uma String que exibe uma mensagem que permite identificar se o
	 * processo deu certo.
	 */
	public String verificarSeRegistroAtingiuMeta(String nomeDisciplina) {
		for (int i = 0; i < registrosOnline.size(); i++) {
			if (registrosOnline.get(i).getNomeDisciplina().equals(nomeDisciplina)) {
				if (registrosOnline.get(i).atingiuMetaTempoOnline()) {
					return "Meta atingida!";
				}
				else {
					return "Meta não atingida!";
				}
			}
		}
		return "Falha! Verifique se a disciplina está cadastrada.";
	}
	
	/**
	 * Esse método permite obter um Array de Strings que utiliza as representações
	 * na forma de String dos RegistrosTempoOnline de cada disciplina cadastrada.
	 * 
	 * @return Retorna um Array de String que representa os registros de tempo online
	 * de cada disciplina.
	 */
	public String[] pegaRegistrosOnline() {
		String[] registros = new String[this.registrosOnline.size()];
		for (int i = 0; i < registros.length; i++) {
			registros[i] = registrosOnline.get(i).toString();
		}
		
		return registros;
	}
	
	/**
	 * Esse método permite adicionar um objeto do tipo Disciplina à lista de disciplinas
	 * que é um atributo da classe Aluno.
	 * 
	 * @param nomeDisciplina É uma String que representa o nome da disciplina.
	 * @param numeroDeNotas É um inteiro que representa o número de notas que a disciplina
	 * possui.
	 * @param pesos É um Array de inteiros que apresenta os pesos de cada nota.
	 */
	public void adicionarDisciplina(String nomeDisciplina, int numeroDeNotas, int[] pesos) {
		disciplinas.add(new Disciplina(nomeDisciplina, numeroDeNotas, pesos));
	}
	
	/**
	 * Esse método é reponsável por incrementar horas de estudo em disciplinas que
	 * estão presentes na lista disciplinas da Classe.
	 * 
	 * @param nomeDisciplina É uma String que representa o nome da disciplina.
	 * @param horas É um inteiro que representa a quantidade de horas a ser acrescentada
	 * às horas de estudo demandadas pelo Aluno para a disciplina.
	 * @return Retorna uma String que exibe uma mensagem que permite identificar se o
	 * processo deu certo.
	 */
	public String incrementarHorasEmDisciplina(String nomeDisciplina, int horas) {
		for (int i = 0; i < disciplinas.size(); i++) {
			if (disciplinas.get(i).getNomeDisciplina().equals(nomeDisciplina)) {
				disciplinas.get(i).cadastraHoras(horas);
				return "Sucesso!";
			}
		}
		
		return "Falha! Verifique se a disciplina está cadastrada!";
	}
	
	/**
	 * Esse método é reponsável por modificar uma nota de uma disciplina cadastrada na
	 * lista de disciplinas.
	 * 
	 * @param nomeDisciplina É uma String que representa o nome da disciplina.
	 * @param nota É um inteiro que representa identificação da nota, se é a nota 1
	 * ou a nota 2 da disciplina, por exemplo.
	 * @param valorNota É um double que representa o valor que será atribuído à essa nota
	 * específica da disciplina.
	 * @return Retorna uma String que exibe uma mensagem que permite identificar se o
	 * processo deu certo.
	 */
	public String modificarNotaDaDisciplina(String nomeDisciplina, int nota, double valorNota) {
		for (int i = 0; i < disciplinas.size(); i++) {
			if (disciplinas.get(i).getNomeDisciplina().equals(nomeDisciplina)) {
				disciplinas.get(i).cadastraNota(nota, valorNota);
				
				return "Sucesso!";
			}
		}
		
		return "Falha! Verifique se a disciplina está cadastrada!";
	}
	
	/**
	 * Esse método é responsável por gerar um Array de Strings que possui
	 * as representações na forma de String das disciplinas.
	 * 
	 * @return Retorna uma Array de Strings com as representações das
	 * disciplinas presentes na lista das disciplinas.
	 */
	public String[] pegaDisciplinas() {
		String[] stringsDeDisciplinas = new String[disciplinas.size()];
		for (int i = 0; i < stringsDeDisciplinas.length; i++) {
			stringsDeDisciplinas[i] = this.disciplinas.get(i).toString();
		}
		
		return stringsDeDisciplinas;
	}
	
	
}

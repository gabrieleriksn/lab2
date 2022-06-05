package applications;

import java.util.Scanner;
import entities.Aluno;

/**
 * Essa classe é responsável por realizar a interação com o usuário
 * e tornar o processo de lidar com a rotina de descanso, com os
 * registros de tempo online, com as disciplinas e com as atividades
 * complementares mais interativo e facilitado para um usuário final.
 * 
 * @author Gabriel Erik Silva Nunes - 121110201
 *
 */

public class CoisaCLI {

	/**
	 * O método main da classe executa os menus de opções disponibilizados
	 * para o usuário.
	 * 
	 * @param args
	 */
	
	public static void main(String[] args) {
		interacaoInicial();
		menuPrincipal(cadastraAluno());
	}

	private static void interacaoInicial() {
		System.out.println("======================================================");
		System.out.println("Seja bem-vindo(a) ao programa CoISA CLI!");
		System.out.println("======================================================");
		System.out.printf("Detalhes: esse programa foi implementado de modo a%n"
				+ "fazer o controle da rotina de descanso, dos%n" + "registros de tempo online, das disciplinas e%n"
				+ "das atividades complementares de UM aluno.%n" + "Versões futuras poderão implementar um sistema%n"
				+ "mais complexo.%n");
		System.out.println("======================================================");
		System.out.println("Developed by: Gabriel Erik Silva Nunes - UFCG student.");
		System.out.println("======================================================");
		System.out.printf("Para iniciar o sitema é importante que você cadastre%n"
				+ "um aluno. Portanto, forneça os dados que se pedem%n" + "a seguir.%n");
	}
	
	private static Aluno cadastraAluno() {
		Scanner sc = new Scanner(System.in);

		System.out.print("Nome do aluno: ");
		String nome = sc.nextLine();

		System.out.print("Matrícula do aluno: ");
		int matricula = sc.nextInt();

		Aluno aluno = new Aluno(nome, matricula);

		return aluno;
	}
	
	private static int[] gerarArrayDeInteiros(String[] line) {
        int[] vect = new int[line.length];
        for (int i = 0; i < vect.length; i++) {
            int num = Integer.parseInt(line[i]);
            vect[i] = num;
        }
        
        return vect;
    }

	private static void menuPrincipal(Aluno aluno) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("======================================================");
			System.out.println("Escolha umas das opções a seguir:");
			System.out.println("1 - Controlar rotina de descanso.");
			System.out.println("2 - Lidar com registros de tempo online.");
			System.out.println("3 - Lidar com disciplinas.");
			System.out.println("4 - Lidar com atividades complementares.");
			System.out.println("5 - Sair.");
			System.out.print("Digite a opção (1, 2, 3, 4 ou 5): ");
			String opcao = sc.nextLine();
			System.out.println("======================================================");
			if (opcao.equals("1")) {
				menuOpcao_1(aluno);
			} else if (opcao.equals("2")) {
				menuOpcao_2(aluno);
			} else if (opcao.equals("3")) {
				menuOpcao_3(aluno);
			} else if (opcao.equals("4")) {
				menuOpcao_4(aluno);
			} else if (opcao.equals("5")) {
				System.out.printf("Muito obrigado por utilizar o meu programa!!%n"
		                  + "Vale salientar que o programa está em desenvolvimento.%n"
		                  + "Portanto, pode conter alguns erros...%n"
		                  + "Aceito abertamente críticas e sugestões de melhoria!%n"
		                  + "Abraços cordiais!%n"
		                  + "Ass: Gabriel Erik Silva Nunes - Turma I do LAB II.%n"
						  + "Fiz o versionamento do código e disponibilizarei de forma%n"
						  + "pública, quando o prazo acabar, no link: %n"
						  + "https://github.com/gabrieleriksn/lab2%n");
				System.out.println("======================================================");
				break;
			} else {
				System.out.println("Opção inválida.");
			}
		}
	}

	private static void menuOpcao_1(Aluno aluno) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.printf("Você está na seção 'rotina de descanso', o que deseja%n" 
		                      + "fazer?%n");
			System.out.println("======================================================");
			System.out.println("1 - Definir horas de descanso.");
			System.out.println("2 - Definir número de semanas.");
			System.out.println("3 - Definir Emoji.");
			System.out.println("4 - Obter o status geral do aluno.");
			System.out.println("5 - Voltar ao menu principal.");
			System.out.print("Digite a opção (1, 2, 3, 4 ou 5): ");
			String opcao = sc.nextLine();
			System.out.println("======================================================");
			if (opcao.equals("1")) {
				System.out.print("Forneça a quantidade de horas de descanso: ");
				int horas = sc.nextInt();
				sc.nextLine();
				aluno.getRotinaDeDescanso().defineHorasDescanso(horas);
				System.out.println("======================================================");
				System.out.println("Sucesso!");
				System.out.println("======================================================");
			} else if (opcao.equals("2")) {
				System.out.print("Forneça a quantidade de semanas: ");
				int semanas = sc.nextInt();
				sc.nextLine();
				aluno.getRotinaDeDescanso().defineNumeroSemanas(semanas);
				System.out.println("======================================================");
				System.out.println("Sucesso!");
				System.out.println("======================================================");
			} else if (opcao.equals("3")) {
				System.out.print("Forneça o Emoji: ");
				String emoji = sc.nextLine();
				aluno.getRotinaDeDescanso().definirEmoji(emoji);
				System.out.println("======================================================");
				System.out.println("Sucesso!");
				System.out.println("======================================================");
			} else if (opcao.equals("4")) {
				System.out.println("Status: " + aluno.getRotinaDeDescanso().getStatusGeral());
				System.out.println("======================================================");
			} else if (opcao.equals("5")) {
				break;
			} else {
				System.out.println("Opção inválida.");
				System.out.println("======================================================");
			}
		}
	}

	private static void menuOpcao_2(Aluno aluno) {
		Scanner sc = new Scanner(System.in);
		int contador = 0;
		while (true) {
			System.out.printf("Você está na seção 'lidar com registros de tempo%n"
					          + "online', o que deseja fazer?%n");
			System.out.println("======================================================");
			System.out.println("1 - Cadastrar registro pra uma disciplina.");
			System.out.println("2 - Vizualizar registros cadastrados.");
			System.out.printf("3 - Incrementar tempo online em uma disciplina%n"
					           + "cadastrada.%n");
			System.out.printf("4 - Verificar se o tempo online esperado foi alcançado%n"
					            + "para uma disciplina.%n");
			System.out.println("5 - Voltar ao menu principal.");
			System.out.print("Digite a opção (1, 2, 3, 4 ou 5): ");
			String opcao = sc.nextLine();
			System.out.println("======================================================");
			if (opcao.equals("1")) {
				System.out.print("Forneça o nome da disciplina: ");
				String nomeDisciplina = sc.nextLine();
				System.out.print("Forneça o tempo online esperado: ");
				int tempoOnlineEsperado = sc.nextInt();
				System.out.print("Forneça o tempo online, até então, gasto para ela: ");
				int tempoOnline = sc.nextInt();
				sc.nextLine();
				aluno.adicionarRegistroOnline(nomeDisciplina, tempoOnlineEsperado);
				aluno.incremetarTempoOnlineRegistro(contador, tempoOnline);
				contador++;
				System.out.println("======================================================");
				System.out.println("Sucesso!");
				System.out.println("======================================================");
			} else if (opcao.equals("2")) {
				String[] registros = aluno.pegaRegistrosOnline();
				for (String registro : registros) {
					System.out.println(registro);
				}
				System.out.println("======================================================");
			} else if (opcao.equals("3")) {
				System.out.print("Forneça o nome da disciplina: ");
				String nomeDisciplina = sc.nextLine();
				System.out.print("Forneça o tempo online a ser incrementado: ");
				int tempoOnline = sc.nextInt();
				sc.nextLine();
				System.out.println("======================================================");
				System.out.println(aluno.incrementarTempoOnlineRegistro(nomeDisciplina, tempoOnline));
				System.out.println("======================================================");
			} else if (opcao.equals("4")) {
				System.out.print("Forneça o nome da disciplina: ");
				String nomeDisciplina = sc.nextLine();
				System.out.println("======================================================");
				System.out.println(aluno.verificarSeRegistroAtingiuMeta(nomeDisciplina));
				System.out.println("======================================================");
			} else if (opcao.equals("5")){
				break;
			} else {
				System.out.println("Opção inválida.");
				System.out.println("======================================================");
			}
		}
	}
	
	private static void menuOpcao_3(Aluno aluno) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.printf("Você está na seção 'lidar com disciplinas', o que deseja%n"
					           + "fazer?%n");
			System.out.println("======================================================");
			System.out.println("1 - Cadastrar uma nova disciplina.");
			System.out.println("2 - Vizualizar disciplinas cadastradas.");
			System.out.println("3 - Incrementar horas de estudo em uma disciplina");
			System.out.println("4 - Modificar nota de uma disciplina");
			System.out.println("5 - Voltar ao menu principal.");
			System.out.print("Digite a opção (1, 2, 3, 4 ou 5): ");
			String opcao = sc.nextLine();
			System.out.println("======================================================");
			if (opcao.equals("1")) {
				System.out.print("Forneça o nome da disciplina: ");
				String nomeDisciplina = sc.nextLine();
				System.out.print("Forneça a quantidade de notas dessa disciplina: ");
				int numeroDeNotas = sc.nextInt();
				sc.nextLine();
				System.out.printf("Forneça os pesos de cada nota dessa disciplina%n"
						         + "separados por espaço. (Por exemplo, se a disciplina%n"
						         + "possui 4 notas e todas têm peso 1 você deve%n"
						         + "digitar 1 1 1 1): ");
				int[] pesos = gerarArrayDeInteiros(sc.nextLine().split(" "));
				aluno.adicionarDisciplina(nomeDisciplina, numeroDeNotas, pesos);
				System.out.println("======================================================");
				System.out.println("Sucesso!");
				System.out.println("======================================================");
			} else if (opcao.equals("2")) {
				String[] disciplinas = aluno.pegaDisciplinas();
				for (String disciplina : disciplinas) {
					System.out.println(disciplina);
				}
				System.out.println("======================================================");
			} else if (opcao.equals("3")) {
				System.out.print("Forneça o nome da disciplina: ");
				String nomeDisciplina = sc.nextLine();
				System.out.print("Forneça a quantidade de horas a ser incrementada: ");
				int horas = sc.nextInt();
				sc.nextLine();
				System.out.println("======================================================");
				System.out.println(aluno.incrementarHorasEmDisciplina(nomeDisciplina, horas));
				System.out.println("======================================================");
			} else if (opcao.equals("4")) {
				System.out.print("Forneça o nome da disciplina: ");
				String nomeDisciplina = sc.nextLine();
				System.out.print("Forneça o número da nota a ser modificada: ");
				int nota = sc.nextInt();
				System.out.print("Forneça a nova nota: ");
				double valorNota = sc.nextDouble();
				sc.nextLine();
				System.out.println("======================================================");
				System.out.println(aluno.modificarNotaDaDisciplina(nomeDisciplina, nota, valorNota));
				System.out.println("======================================================");
			} else if (opcao.equals("5")){
				break;
			} else {
				System.out.println("Opção inválida.");
				System.out.println("======================================================");
			}
		}
	}
	
	private static void menuOpcao_4(Aluno aluno) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.printf("Você está na seção 'lidar com atividades complementares'%n"
					           + ", o que deseja fazer?%n");
			System.out.println("======================================================");
			System.out.println("1 - Adicionar estágio (Limite de 9)");
			System.out.println("2 - Adicionar projeto (Limite de 16)");
			System.out.println("3 - Adicionar curso");
			System.out.println("4 - Contar créditos");
			System.out.println("5 - Vizualizar atividades complementares cadastradas.");
			System.out.println("6 - Voltar ao menu principal.");
			System.out.print("Digite a opção (1, 2, 3, 4, 5 ou 6): ");
			String opcao = sc.nextLine();
			System.out.println("======================================================");
			if (opcao.equals("1")) {
				System.out.print("Forneça a quantidade de horas do estágio: ");
				int horas = sc.nextInt();
				System.out.print("Forneça a quantidade de meses do estágio: ");
				int meses = sc.nextInt();
				sc.nextLine();
				aluno.getAtividadesComplementares().adicionarEstagio(horas, meses);
				System.out.println("======================================================");
				System.out.println("Sucesso!");
				System.out.println("======================================================");
			} else if (opcao.equals("2")) {
				System.out.print("Forneça a quantidade de meses do projeto: ");
				int meses = sc.nextInt();
				sc.nextLine();
				aluno.getAtividadesComplementares().adicionarProjeto(meses);
				System.out.println("======================================================");
				System.out.println("Sucesso!");
				System.out.println("======================================================");
			} else if (opcao.equals("3")) {
				System.out.print("Forneça a quantidade de horas de cursos: ");
				int horas = sc.nextInt();
				sc.nextLine();
				aluno.getAtividadesComplementares().adicionarCurso(horas);
				System.out.println("======================================================");
				System.out.println("Sucesso!");
				System.out.println("======================================================");
			} else if (opcao.equals("4")) {
				System.out.println("A quantidade de créditos até então é igual a " + aluno.getAtividadesComplementares().contaCreditos());
				System.out.println("======================================================");
			} else if (opcao.equals("5")) {
				String[] atividades = aluno.getAtividadesComplementares().pegaAtividades();
				for (String atividade : atividades) {
					System.out.println(atividade);
				}
				System.out.println("======================================================");
			} else if (opcao.equals("6")){
				break;
			} else {
				System.out.println("Opção inválida.");
				System.out.println("======================================================");
			}
		}
	}

}

package applications;

import entities.Descanso;
import entities.Disciplina;
import entities.AtividadesComplementares;

public class CoisaBonus {

	public static void main(String[] args) {
		System.out.println("Implementação do Bônus 5.1");
		System.out.println();
		testesBonus5_1();
		System.out.println();
		System.out.println("Implementação do Bônus 5.2");
		System.out.println();
		testesBonus5_2();
		System.out.println();
		System.out.println("Implementação do Bônus 5.3");
		System.out.println();
		testesBonus5_3();
	}

	private static void testesBonus5_1() {
		System.out.println("Construtor com nome da disciplina");
		Disciplina d1 = new Disciplina("Prog II");
		System.out.println(d1.aprovado());
		System.out.println(d1.toString());
		d1.cadastraHoras(58);
		System.out.println(d1.toString());
		d1.cadastraNota(1, 7);
		d1.cadastraNota(2, 8);
		d1.cadastraNota(3, 8.7);
		d1.cadastraNota(4, 9);
		System.out.println(d1.toString());
		System.out.println(d1.aprovado());
		System.out.println();
		System.out.println("Construtor com nome da disciplina, qtd de notas e especificação dos pesos");
		int[] pesos = new int[] { 1, 2, 3, 1 };
		Disciplina d2 = new Disciplina("Prog II", 4, pesos);
		System.out.println(d2.aprovado());
		System.out.println(d2.toString());
		d2.cadastraHoras(58);
		System.out.println(d1.toString());
		d2.cadastraNota(1, 7);
		d2.cadastraNota(2, 8);
		d2.cadastraNota(3, 8.7);
		d2.cadastraNota(4, 9);
		System.out.println(d2.toString());
		System.out.println(d2.aprovado());
		System.out.println();
		System.out.println("Construtor com nome da disciplina e qtd de notas");
		Disciplina d3 = new Disciplina("Prog II", 6);
		System.out.println(d3.aprovado());
		System.out.println(d3.toString());
		d3.cadastraHoras(58);
		System.out.println(d3.toString());
		d3.cadastraNota(1, 7);
		d3.cadastraNota(2, 8);
		d3.cadastraNota(3, 8.7);
		d3.cadastraNota(4, 3);
		d3.cadastraNota(5, 6);
		d3.cadastraNota(6, 2);
		System.out.println(d3.toString());
		System.out.println(d3.aprovado());
	}
	
	private static void testesBonus5_2() {
		AtividadesComplementares a1 = new AtividadesComplementares();
		a1.adicionarEstagio(600, 4); // deve incrementar 5
		a1.adicionarEstagio(300, 8); // deve incrementar 5
		a1.adicionarEstagio(298); // nao deve incrementar nada
		a1.adicionarEstagio(600, 8); // deve incrementar 10
		a1.adicionarEstagio(598, 8); // deve incrementar 5
		String[] atividades = a1.pegaAtividades();
		for (String atividade : atividades) {
			System.out.println(atividade);
		}
	}
	
	private static void testesBonus5_3() {
		Descanso d1 = new Descanso();
		System.out.println(d1.getStatusGeral());
		d1.defineHorasDescanso(52);
		d1.defineNumeroSemanas(1);
		System.out.println(d1.getStatusGeral());
		d1.definirEmoji(":D");
		System.out.println(d1.getStatusGeral());
		d1.defineNumeroSemanas(2);
		System.out.println(d1.getStatusGeral());
		d1.defineHorasDescanso(26);
		System.out.println(d1.getStatusGeral());
		d1.definirEmoji(":(");
		System.out.println(d1.getStatusGeral());
		d1.defineNumeroSemanas(1);
		System.out.println(d1.getStatusGeral());
	}
	
}

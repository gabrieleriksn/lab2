package applications;

import entities.Descanso;
import entities.RegistroTempoOnline;
import entities.Disciplina;
import entities.AtividadesComplementares;

public class CoisaBonus {

	public static void main(String[] args) {
		// Implementação do Bônus 5.1
		testesBonus5_1();
		// Implementação do Bônus 5.2
		testesBonus5_2();
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
		
	}
	
}

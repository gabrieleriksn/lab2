package applications;

import entities.Descanso;
import entities.RegistroTempoOnline;
import entities.Disciplina;
import entities.AtividadesComplementares;

public class CoisaBonus {

	public static void main(String[] args) {
		// Implementação do Bônus 5.1
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
		int[] pesos = new int[] {1, 2, 3, 1};
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
		
	}

}

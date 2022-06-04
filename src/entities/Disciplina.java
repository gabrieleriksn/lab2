package entities;

import java.util.Arrays;

public class Disciplina {
	
	private String nomeDisciplina;
	private int horasDeEstudo;
	private Nota[] notas = new Nota[4];
	
	public Disciplina(String nomeDisciplina) {
		this.nomeDisciplina = nomeDisciplina;
		for (int i = 0; i < notas.length; i++) {
			notas[i] = new Nota();
		}
	}
	
	public void cadastraHoras(int horas) {
		horasDeEstudo += horas;
	}
	
	public void cadastraNota(int nota, double valorNota) {
		notas[nota - 1] = new Nota(valorNota);
	}
	
	public boolean aprovado() {
		if (mediaDoAluno(notas) >= 7) {
			return true;
		}
		
		return false;
	}
	
	private double mediaDoAluno(Nota[] notas) {
		double soma = 0;
		for (Nota nota : notas) {
			soma += nota.getValorNota();
		}
		
		return soma / notas.length;
	}
	
	@Override
	public String toString() {
		return nomeDisciplina 
			   + " " 
			   + horasDeEstudo 
			   + " " 
			   + mediaDoAluno(notas) 
			   + " " 
			   + Arrays.toString(notas);
	}
}

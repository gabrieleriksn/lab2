package entities;

import java.util.Arrays;

public class Disciplina {
	
	private String nomeDisciplina;
	private int horasDeEstudo;
	private double[] notas = new double[4];
	
	public Disciplina(String nomeDisciplina) {
		this.nomeDisciplina = nomeDisciplina;
	}
	
	public void cadastraHoras(int horas) {
		horasDeEstudo += horas;
	}
	
	public void cadastraNota(int nota, double valorNota) {
		notas[nota - 1] = valorNota;
	}
	
	public boolean aprovado() {
		if (mediaDoAluno(notas) >= 7) {
			return true;
		}
		
		return false;
	}
	
	private double mediaDoAluno(double[] nums) {
		double sum = 0;
		for (double num : nums) {
			sum += num;
		}
		
		return sum / nums.length;
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

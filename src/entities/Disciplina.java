package entities;

import java.util.Arrays;

public class Disciplina {
	
	private String nomeDisciplina;
	private int horasDeEstudo;
	private Nota[] notas;
	private Peso[] pesos;
	
	public Disciplina(String nomeDisciplina) {
		this.nomeDisciplina = nomeDisciplina;
		inicializaArrays();
	}
	
	public Disciplina(String nomeDisciplina, int numeroDeNotas) {
		this.nomeDisciplina = nomeDisciplina;
		inicializaArrays(numeroDeNotas);
	}
	
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
	
	public void cadastraHoras(int horas) {
		horasDeEstudo += horas;
	}
	
	public void cadastraNota(int nota, double valorNota) {
		notas[nota - 1].setValorNota(valorNota);
	}
	
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

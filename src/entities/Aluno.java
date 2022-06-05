package entities;

import java.util.List;
import java.util.ArrayList;

public class Aluno {
	
	private String nome;
	public int matricula;
	private Descanso rotinaDeDescanso;
	private List<RegistroTempoOnline> registrosOnline;
	private List<Disciplina> disciplinas;
	private AtividadesComplementares atividadesComplementares;

	public Aluno(String nome, int matricula) {
		this.nome = nome;
		this.matricula = matricula;
		rotinaDeDescanso = new Descanso();
		registrosOnline = new ArrayList<>();
		disciplinas = new ArrayList<>();
		atividadesComplementares = new AtividadesComplementares();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getMatricula() {
		return matricula;
	}
	
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public Descanso getRotinaDeDescanso() {
		return rotinaDeDescanso;
	}

	public void setRotinaDeDescanso(Descanso rotinaDeDescanso) {
		this.rotinaDeDescanso = rotinaDeDescanso;
	}

	public void adicionarRegistroOnline(String nomeDisciplina, int tempoOnlineEsperado) {
		registrosOnline.add(new RegistroTempoOnline(nomeDisciplina, tempoOnlineEsperado));
	}
	
	public void incremetarTempoOnlineRegistro(int index, int tempo) {
		registrosOnline.get(index).adicionaTempoOnline(tempo);
	}
	
	public String incrementarTempoOnlineRegistro(String nomeDisciplina, int tempo) {
		for (int i = 0; i < registrosOnline.size(); i++) {
			if (registrosOnline.get(i).getNomeDisciplina().equals(nomeDisciplina)) {
				registrosOnline.get(i).adicionaTempoOnline(tempo);;
				return "Sucesso!";
			}
		}
		return "Falha! Verifique se a disciplina está cadastrada.";
	}
	
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
	
	public void exibirRegistrosOnline() {
		for (RegistroTempoOnline registro : registrosOnline) {
			System.out.println(registro);
		}
	}
	
	public void adicionarDisciplina(String nomeDisciplina, int numeroDeNotas, int[] pesos) {
		disciplinas.add(new Disciplina(nomeDisciplina, numeroDeNotas, pesos));
	}
	
	public String incrementarHorasEmDisciplina(String nomeDisciplina, int horas) {
		for (int i = 0; i < disciplinas.size(); i++) {
			if (disciplinas.get(i).getNomeDisciplina().equals(nomeDisciplina)) {
				disciplinas.get(i).cadastraHoras(horas);
				return "Sucesso!";
			}
		}
		
		return "Falha! Verifique se a disciplina está cadastrada!";
	}
	
	public String modificarNotaDaDisciplina(String nomeDisciplina, int nota, double valorNota) {
		for (int i = 0; i < disciplinas.size(); i++) {
			if (disciplinas.get(i).getNomeDisciplina().equals(nomeDisciplina)) {
				disciplinas.get(i).cadastraNota(nota, valorNota);
				
				return "Sucesso!";
			}
		}
		
		return "Falha! Verifique se a disciplina está cadastrada!";
	}
	
	public void exibirDisciplinas() {
		for (Disciplina disciplina : disciplinas) {
			System.out.println(disciplina);
		}
	}
	
	public AtividadesComplementares getAtividadesComplementares() {
		return atividadesComplementares;
	}

	public void setAtividadesComplementares(AtividadesComplementares atividadesComplementares) {
		this.atividadesComplementares = atividadesComplementares;
	}
	
	public void exibirAtividadesComplementares() {
		for (String atividade : atividadesComplementares.pegaAtividades()) {
			System.out.println(atividade);
		}
	}
	
	
}

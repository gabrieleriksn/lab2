package entities;

public class AtividadesComplementares {
	
	private int[] estagios = new int[9];
	private int[] projetos = new int[16];
	private double horasDeCursos; 
	
	public void adicionarEstagio(int horas) {
		for (int i=0; i < estagios.length; i++) {
			if (estagios[i] == 0) {
				estagios[i] = horas;
				return;
			}
		}
	}
	
	public void adicionarProjeto(int meses) {
		for (int i=0; i < projetos.length; i++) {
			if (projetos[i] == 0) {
				projetos[i] = meses;
				return;
			}
		}
	}
	
	public void adicionarCurso(double horas) {
		horasDeCursos += horas;
	}
	
	public int contaCreditos() {
		int creditos = 0;
		creditos += contaCreditosEstagios();
		creditos += contaCreditosProjetos();
		creditos += contaCreditosCursos();		
		return creditos;
	}
	
	private int contaCreditosEstagios() {
		int creditos = 0;
		for (int horasDeEstagio : estagios) {
			creditos += ((int) horasDeEstagio / 300) * 5;
		}
		
		return creditos;
	}
	
	private int contaCreditosProjetos() {
		int creditos = 0;
		for (int mesesDeProjetos : projetos) {
			creditos += ((int) mesesDeProjetos / 3) * 2;
		}
		
		return creditos;
	}
	
	private int contaCreditosCursos() {
		return ((int) horasDeCursos / 30) * 1;
	}
	
	public String[] pegaAtividades() {
		String[] atividades = new String[qtdDeEstagiosEfetivados() 
		                                 + qtdDeProjetosEfetivados() 
		                                 + 4];
		int contador = 0;
		
		for (int horasDeEstagios : estagios) {
			if (horasDeEstagios != 0) {
				atividades[contador] = "Estagio " + horasDeEstagios;
				contador += 1;
			}
			else {
				break;
			}
		}
		
		for (int mesesDeProjetos : projetos) {
			if (mesesDeProjetos != 0) {
				atividades[contador] = "Projeto " + mesesDeProjetos;
				contador += 1;
			}
			else {
				break;
			}
		}
		
		atividades[contador] = "Cursos " + horasDeCursos;
		contador += 1;
		
		atividades[contador] = "Creditos_Estagio " + contaCreditosEstagios();
		contador += 1;
		atividades[contador] = "Creditos_Projeto " + contaCreditosProjetos();
		contador += 1;
		atividades[contador] = "Creditos_Cursos " + contaCreditosCursos();
		
		return atividades;
	}
	
	private int qtdDeEstagiosEfetivados() {
		int contador = 0;
		for (int horasDeEstagios : estagios) {
			if (horasDeEstagios != 0) {
				contador += 1;
			}
			else {
				break;
			}
		}
		return contador;
	}
	
	private int qtdDeProjetosEfetivados() {
		int contador = 0;
		for (int mesesDeProjetos : projetos) {
			if (mesesDeProjetos != 0) {
				contador += 1;
			}
			else {
				break;
			}
		}
		return contador;
	}
	
}

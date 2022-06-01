package entities;

public class AtividadesComplementares {
	
	private int[] estagios;
	private int indiceEstagios;
	private int[] projetos;
	private int indiceProjetos;
	private double horasDeCursos; 
	
	public AtividadesComplementares() {
		estagios = new int[9];
		projetos = new int[16];
		indiceEstagios = 0;
		indiceProjetos = 0;
	}
	
	public void adicionarEstagio(int horas) {
		estagios[indiceEstagios] = horas;
		indiceEstagios++;
	}
	
	public void adicionarProjeto(int meses) {
		projetos[indiceProjetos] = meses;
		indiceProjetos++;
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
			creditos += (horasDeEstagio / 300) * 5;
		}
		
		return creditos;
	}
	
	private int contaCreditosProjetos() {
		int creditos = 0;
		for (int mesesDeProjetos : projetos) {
			creditos += (mesesDeProjetos / 3) * 2;
		}
		
		return creditos;
	}
	
	private int contaCreditosCursos() {
		return ((int) horasDeCursos / 30) * 1;
	}
	
	public String[] pegaAtividades() {
		String[] atividadesComplementares = new String[indiceEstagios + indiceProjetos + 4];
		atualizaEstagios(atividadesComplementares);
		atualizaProjetos(atividadesComplementares);
		atualizaCursos(atividadesComplementares);
		atualizaCreditos(atividadesComplementares);
		return atividadesComplementares;
	}
	
	private void atualizaEstagios(String[] atividadesComplementares) {
		for (int i = 0; i < indiceEstagios; i++) {
			atividadesComplementares[i] = "Estagio " + estagios[i];
		}
	}
	
	private void atualizaProjetos(String[] atividadesComplementares) {
		int contador = 0;
		for (int i = indiceEstagios; i < indiceEstagios + indiceProjetos; i++) {
			atividadesComplementares[i] = "Projeto " + projetos[contador];
			contador++;
		}
	}
	
	private void atualizaCursos(String[] atividadesComplementares) {
		atividadesComplementares[indiceEstagios + indiceProjetos] = "Cursos " + horasDeCursos;
	}
	
	private void atualizaCreditos(String[] atividadesComplementares) {
		atividadesComplementares[atividadesComplementares.length - 1] = "Creditos_Cursos " + contaCreditosCursos();
		atividadesComplementares[atividadesComplementares.length - 2] = "Creditos_Projeto " + contaCreditosProjetos();
		atividadesComplementares[atividadesComplementares.length - 3] = "Creditos_Estagio " + contaCreditosEstagios();
	}

}

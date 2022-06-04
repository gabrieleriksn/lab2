package entities;

public class AtividadesComplementares {
	
	private Estagio[] estagios;
	private int indiceEstagios;
	private Projeto[] projetos;
	private int indiceProjetos;
	private Cursos cursos; 
	
	public AtividadesComplementares() {
		inicializaAtributos();
	}
	
	private void inicializaAtributos() {
		estagios = new Estagio[9];
		for (int i = 0; i < estagios.length; i++) {
			estagios[i] = new Estagio();
		}
		
		projetos = new Projeto[16];
		for (int i = 0; i < projetos.length; i++) {
			projetos[i] = new Projeto();
		}
		
		cursos = new Cursos();
		
		indiceEstagios = 0;
		indiceProjetos = 0;
	}
	
	public void adicionarEstagio(int horas) {
		estagios[indiceEstagios] = new Estagio(horas);
		indiceEstagios++;
	}
	
	public void adicionarEstagio(int horas, int meses) {
		estagios[indiceEstagios] = new Estagio(horas, meses);
		indiceEstagios++;
	}
	
	public void adicionarProjeto(int meses) {
		projetos[indiceProjetos] = new Projeto(meses);
		indiceProjetos++;
	}
	
	public void adicionarCurso(double horas) {
		cursos.adicionarHorasDeCursos(horas);
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
		for (Estagio estagio : estagios) {
			if (estagio.getMesesDeEstagio() / 4 > estagio.getHorasDeEstagio() / 300) {
				creditos += (estagio.getHorasDeEstagio() / 300) * 5;
			}
			else {
				creditos += (estagio.getMesesDeEstagio() / 4) * 5;
			}
		}
		
		return creditos;
	}
	
	private int contaCreditosProjetos() {
		int creditos = 0;
		for (Projeto projeto : projetos) {
			creditos += (projeto.getMesesDeProjeto() / 3) * 2;
		}
		
		return creditos;
	}
	
	private int contaCreditosCursos() {
		return ((int) cursos.getHorasDeCursos() / 30) * 1;
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
			atividadesComplementares[i] = estagios[i].toString();
		}
	}
	
	private void atualizaProjetos(String[] atividadesComplementares) {
		int contador = 0;
		for (int i = indiceEstagios; i < indiceEstagios + indiceProjetos; i++) {
			atividadesComplementares[i] = projetos[contador].toString();
			contador++;
		}
	}
	
	private void atualizaCursos(String[] atividadesComplementares) {
		atividadesComplementares[indiceEstagios + indiceProjetos] = cursos.toString();
	}
	
	private void atualizaCreditos(String[] atividadesComplementares) {
		atividadesComplementares[atividadesComplementares.length - 3] = "Creditos_Estagio " + contaCreditosEstagios();
		atividadesComplementares[atividadesComplementares.length - 2] = "Creditos_Projeto " + contaCreditosProjetos();
		atividadesComplementares[atividadesComplementares.length - 1] = "Creditos_Cursos " + contaCreditosCursos();
	}

}

package listas_duplamente_encadeadas;

public class ListaDuplamenteEncadeada {
	private Nodo inicio;
	private Nodo fim;
	
	public void inserirInicio(int dado) {
		Nodo novo = new Nodo(dado);
		if (inicio != null) {
			inicio.setAnt(novo);
			novo.setProx(inicio);
		}
		inicio = novo;
		if (fim == null) {
			fim = novo;
		}
	}
	
	public void inserirFinal(int dado) {
		Nodo novo = new Nodo(dado);
		if (fim != null) {
			fim.setProx(novo);
			novo.setAnt(fim);
		} 
		fim = novo;
		if (inicio == null)
			inicio = novo;
	}
	
	public void removeInicio() {
		if (inicio == null) return;
		
		Nodo nodoRemovido = inicio;
		inicio = inicio.getProx();
		if (inicio != null) {
			inicio.setAnt(null);
		}
		if (nodoRemovido == fim) {
			removeFinal();
		}
	}
	
	public void removeFinal() {
		if (fim == null) return;
		
		Nodo nodoRemovido = fim;
		if (fim != null)
			fim.setProx(null);
		if (nodoRemovido == inicio) {
			removeInicio();
		}
	}
	
	public String mostrarLista() {
		String lista = "";
		if(inicio == null) return lista;
		Nodo aux = inicio;
		while (aux != null) {
			lista += aux.getDado() + "\n";
			aux = aux.getProx();
		}
		return lista;
	}
}

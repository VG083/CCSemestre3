import java.util.LinkedList;

public class Principal {
	
	static Elemento inicio = null;
	static Elemento fim = null;
	
	public static void main(String[] args) {
		inserirOrdenado(new Aluno(321, "A", 10, 10));
		inserirOrdenado(new Aluno(123, "B", 8, 5));
		inserirOrdenado(new Aluno(222, "C", 5, 5));
		
		inserirOrdenado(new Aluno(111, "D", 6, 10));
		inserirOrdenado(new Aluno(444, "F", 9, 10));
		
		//remover(321);
		
		listar();
		
		//c - b - a - d - f
	}
	
	static void inserirOrdenado(Aluno aluno) {
		Elemento novoElemento = new Elemento();
		aluno.calcularMedia();
		novoElemento.aluno = aluno;
		
		if(inicio == null) {
			inicio = novoElemento;
			fim = novoElemento;
			novoElemento.proxElemento = null;
		}else {
			Elemento aux = inicio;
			Elemento anterior = null;
			
			//1 - Alternativa
			/*while(aux != null && aluno.rgm > aux.aluno.rgm) {
				anterior = aux;
				aux = aux.proxElemento;
			}*/
			//2 - Alternativa
			while(aux != null) {
				if(aluno.rgm < aux.aluno.rgm) {
					break;
				}
				anterior = aux;
				aux = aux.proxElemento;
			}
			if(aux == inicio) {
				novoElemento.proxElemento = inicio;
				inicio = novoElemento;
			}else {
				anterior.proxElemento = novoElemento;
				novoElemento.proxElemento = aux;
			}
		}
	}
	
	static void inserirInicio(Aluno aluno) {
		Elemento novoElemento = new Elemento();
		aluno.calcularMedia();
		novoElemento.aluno = aluno;
		
		if(inicio == null) {
			inicio = novoElemento;
			fim = novoElemento;
			novoElemento.proxElemento = null;
		}else {
			novoElemento.proxElemento = inicio;
			inicio = novoElemento;
		}
	}
	
	static void inserirFim(Aluno aluno) {
		Elemento novoElemento = new Elemento();
		aluno.calcularMedia();
		novoElemento.aluno = aluno;
		                    
		if(inicio == null) {
			inicio = novoElemento;
			fim = novoElemento;
			novoElemento.proxElemento = null;
		}else {
			fim.proxElemento = novoElemento;
			fim = novoElemento;
			novoElemento.proxElemento = null;
		}
	}
	
	static void listar() {
		if(inicio == null) {
			System.out.println("Lista Vazia!");
			return;
		}
		Elemento aux = inicio;
		while(aux != null) {
			System.out.println("--------------------------------");
			System.out.println("RGM: " + aux.aluno.rgm);
			System.out.println("Nome: " + aux.aluno.nome);
			System.out.println("Média: " + aux.aluno.getMedia());
			aux = aux.proxElemento;
		}
	}
	
	static void remover(int rgm) {
		Elemento aux = inicio;
		Elemento anterior = null;
		while(aux != null) {
			if(aux.aluno.rgm == rgm) {
				if(aux == inicio) {
					inicio = inicio.proxElemento;
					aux = inicio;
				}else if(aux == fim) {
					anterior.proxElemento = null;
					fim = anterior;
					aux = null;
				}else {
					anterior.proxElemento = aux.proxElemento;
					aux = anterior.proxElemento;
				}
			}else {
				anterior = aux;
				aux = aux.proxElemento;
			}
		}
	}
}	

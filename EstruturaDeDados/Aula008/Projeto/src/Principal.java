import java.util.LinkedList;
import java.util.Scanner;

public class Principal {
	
	static Elemento inicio = null;
	static Elemento fim = null;
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		inserirFim(new Produto("Produto1", 1, 501, 10));
		inserirFim(new Produto("Produto2", 2, 500, 21));
		inserirFim(new Produto("Produto3", 3, 800, 17));
		inserirFim(new Produto("Produto4", 4, 500, 5));
		inserirFim(new Produto("Produto5", 5, 666, 13));
		listar();
		listarQuantidadeAcima500();
		
		int desconto;
		System.out.println("Digite o desconto para aplicar: ");
		desconto = entrada.nextInt();
		System.out.println("");
		
		aplicardesconto(desconto);
		
		listar();
		listarQuantidadeAcima500();
		
		entrada.close();
	}
	
	static void inserirFim(Produto produto) {
		Elemento novoElemento = new Elemento();
		novoElemento.produto = produto;
		                    
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
			System.out.println("Código: " + aux.produto.codigo);
			System.out.println("Estoque: " + aux.produto.quantidade);
			System.out.println("Nome: " + aux.produto.nome);
			System.out.println("Preço: " + aux.produto.preco);
			aux = aux.proxElemento;
		}
		System.out.println("--------------------------------");
	}
	
	static void listarQuantidadeAcima500() {
		if(inicio == null) {
			System.out.println("Lista Vazia!");
			return;
		}
		Elemento aux = inicio;
		int contador = 0;
		while(aux != null) {
			if(aux.produto.quantidade > 500) {
				contador += 1;
			}
			aux = aux.proxElemento;
		}
		System.out.println("\nHá " + contador + " produtos com mais de 500 quantidades em estoque.\n");
	}
	
	static void aplicardesconto(int desconto) {
		float valordescontado;
		if(inicio == null) {
			System.out.println("Lista Vazia!");
			return;
		}
		Elemento aux = inicio;
		while(aux != null) {
			valordescontado = (aux.produto.preco/100)*desconto;
			aux.produto.preco = aux.produto.preco - valordescontado;
			//Alterou apenas o auxiliar, precisa mudar o elemento real do nó
			aux = aux.proxElemento;
		}
	}

}
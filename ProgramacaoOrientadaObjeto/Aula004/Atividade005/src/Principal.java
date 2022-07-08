import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String nome;
		
		System.out.println("Digite um nome: ");
		nome = entrada.nextLine();
		
		if(nome.equals("Seiya")) System.out.println("\nSeiya é o Cavaleiro de Pégasus");
		else if(nome.equals("Hyoga")) System.out.println("\nHyoga é o Cavaleiro de Cisne");
		else if(nome.equals("Shiryu")) System.out.println("\nShiryu é o Cavaleiro do Dragão");
		else if(nome.equals("Shun")) System.out.println("\nShun é o Cavaleiro de Andrômeda");
		else if(nome.equals("Ikki"))System.out.println("\nIkki é o Cavaleiro de Fênix");
	
		entrada.close();
	}

}

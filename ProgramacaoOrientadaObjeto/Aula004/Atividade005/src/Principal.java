import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String nome;
		
		System.out.println("Digite um nome: ");
		nome = entrada.nextLine();
		
		if(nome.equals("Seiya")) System.out.println("\nSeiya � o Cavaleiro de P�gasus");
		else if(nome.equals("Hyoga")) System.out.println("\nHyoga � o Cavaleiro de Cisne");
		else if(nome.equals("Shiryu")) System.out.println("\nShiryu � o Cavaleiro do Drag�o");
		else if(nome.equals("Shun")) System.out.println("\nShun � o Cavaleiro de Andr�meda");
		else if(nome.equals("Ikki"))System.out.println("\nIkki � o Cavaleiro de F�nix");
	
		entrada.close();
	}

}

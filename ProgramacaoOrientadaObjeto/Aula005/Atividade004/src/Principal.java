import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		String nome,primeiro, ultimo;
		System.out.println("Digite seu nome completo: ");
		nome = entrada.nextLine(); 
		primeiro = nome.substring(0,nome.indexOf(" "));
		ultimo = nome.substring(nome.lastIndexOf(" ")+1);
		System.out.println("Nome completo: "+nome);
		System.out.println("Primeiro nome: "+primeiro);
		System.out.println("Último nome: "+ultimo);
 
		entrada.close();
	}

}

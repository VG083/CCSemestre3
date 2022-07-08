import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int codigo, quantidade;
		
		System.out.println("Digite o código do produto e a quantidade: ");
		codigo = entrada.nextInt();
		quantidade = entrada.nextInt();
		
		switch(codigo) {
			case 0:
				System.out.println("Cachorro quente");
				System.out.println("Total: R$ "+(1.50*quantidade));
				break;
			case 1:
				System.out.println("Refrigerante");
				System.out.println("Total: R$ "+(2.00*quantidade));
				break;
			default:
				System.out.println("Produto inexistente");
		}
		
	}

}

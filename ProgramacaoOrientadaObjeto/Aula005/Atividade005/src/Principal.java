import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite sua escolha: ");
		int escolha = entrada.nextInt();
		
		switch(escolha) {
		case 1:
			System.out.println("Pizza");
			break;
		case 2:
			System.out.println("Hamburguer");
			break;
		case 3:
			System.out.println("Refrigerante");
			break;
		case 4:
			System.out.println("Batata frita");
			break;
		default:
			System.out.println("Opção inválida");
		}
		
		entrada.close();
	}

}

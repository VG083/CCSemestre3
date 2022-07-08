import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite dois números: ");
		double a = entrada.nextDouble();
		double b = entrada.nextDouble();
		
		System.out.println("\n1. Adição");
		System.out.println("2. Subtração");
		System.out.println("3. Multiplicação");
		System.out.println("4. Divisão");
		System.out.println("\nQual operação deseja executar?");
		int codigo = entrada.nextInt();
		
		switch(codigo) {
			case 1:
				System.out.println("Adição: "+(a+b));
				break;
			case 2:
				System.out.println("Subtração: "+(a-b));
				break;
			case 3:
				System.out.println("Multiplicação: "+(a*b));
				break;
			case 4:
				System.out.println("Divisão: "+(a/b));
				break;
			default:
				System.out.println("Opção inválida");
		}
		
		entrada.close();
	}

}

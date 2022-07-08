import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite dois n�meros: ");
		double a = entrada.nextDouble();
		double b = entrada.nextDouble();
		
		System.out.println("\n1. Adi��o");
		System.out.println("2. Subtra��o");
		System.out.println("3. Multiplica��o");
		System.out.println("4. Divis�o");
		System.out.println("\nQual opera��o deseja executar?");
		int codigo = entrada.nextInt();
		
		switch(codigo) {
			case 1:
				System.out.println("Adi��o: "+(a+b));
				break;
			case 2:
				System.out.println("Subtra��o: "+(a-b));
				break;
			case 3:
				System.out.println("Multiplica��o: "+(a*b));
				break;
			case 4:
				System.out.println("Divis�o: "+(a/b));
				break;
			default:
				System.out.println("Op��o inv�lida");
		}
		
		entrada.close();
	}

}

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o primeiro n�mero: ");
		int n1 = entrada.nextInt();
		System.out.println("Digite o segundo n�mero: ");
		int n2 = entrada.nextInt();
		
		System.out.println("\nSoma dos n�meros: " + (n1+n2));
		System.out.println("Subtra��o dos n�meros: " + (n1-n2));
		System.out.println("Multiplica��o dos n�meros: " + (n1*n2));
		System.out.println("Divis�o dos n�meros: " + (n1/n2));
	
		entrada.close();
	}

}

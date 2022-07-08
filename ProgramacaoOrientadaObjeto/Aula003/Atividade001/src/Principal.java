import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o primeiro número: ");
		int n1 = entrada.nextInt();
		System.out.println("Digite o segundo número: ");
		int n2 = entrada.nextInt();
		
		System.out.println("\nSoma dos números: " + (n1+n2));
		System.out.println("Subtração dos números: " + (n1-n2));
		System.out.println("Multiplicação dos números: " + (n1*n2));
		System.out.println("Divisão dos números: " + (n1/n2));
	
		entrada.close();
	}

}

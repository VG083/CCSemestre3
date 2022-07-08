import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o primeiro número: ");
		int n1 = entrada.nextInt();
		System.out.println("Digite o segundo número: ");
		int n2 = entrada.nextInt();
		System.out.println("Digite o terceiro número: ");
		int n3 = entrada.nextInt();
		
		int auxiliar = (n1<n2?n1:n2);
		int menor = (auxiliar<n3?auxiliar:n3);
		System.out.println("O maior número é: " + (menor));
		
		entrada.close();
	}

}

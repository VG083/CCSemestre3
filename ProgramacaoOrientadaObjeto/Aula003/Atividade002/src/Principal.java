import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double n1, n2, n3;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o primeiro número: ");
		n1 = Double.parseDouble(entrada.nextLine());
		System.out.println("Digite o segundo número: ");
		n2 = Double.parseDouble(entrada.nextLine());
		System.out.println("Digite o terceiro número: ");
		n3 = Double.parseDouble(entrada.nextLine());
		
		System.out.println("Média: " + ((n1+n2+n3)/3));
		
		entrada.close();
	}

}

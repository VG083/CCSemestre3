import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double n1, n2, n3;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o primeiro n�mero: ");
		n1 = Double.parseDouble(entrada.nextLine());
		System.out.println("Digite o segundo n�mero: ");
		n2 = Double.parseDouble(entrada.nextLine());
		System.out.println("Digite o terceiro n�mero: ");
		n3 = Double.parseDouble(entrada.nextLine());
		
		System.out.println("M�dia: " + ((n1+n2+n3)/3));
		
		entrada.close();
	}

}

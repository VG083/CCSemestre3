import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double n1,n2;
		
		System.out.println("Digite a 1ª número: ");
		n1 = Double.parseDouble(entrada.nextLine());
		System.out.println("Digite a 2ª número: ");
		n2 = Double.parseDouble(entrada.nextLine());
		
		if(n1>n2) System.out.println("O primeiro é maior que o segundo");
			else if(n2>n1) System.out.println("O segundo é maior que o primeiro");
				else System.out.println("Os números são iguais");
		
		entrada.close();
	}

}

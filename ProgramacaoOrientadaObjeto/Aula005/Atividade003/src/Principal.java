import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double n1,n2;
		
		System.out.println("Digite a 1� n�mero: ");
		n1 = Double.parseDouble(entrada.nextLine());
		System.out.println("Digite a 2� n�mero: ");
		n2 = Double.parseDouble(entrada.nextLine());
		
		if(n1>n2) System.out.println("O primeiro � maior que o segundo");
			else if(n2>n1) System.out.println("O segundo � maior que o primeiro");
				else System.out.println("Os n�meros s�o iguais");
		
		entrada.close();
	}

}

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int i, numero, soma = 0;
		
		for(i=1; i<=10; i++) {
			System.out.println("Digite um n�mero");
			numero = entrada.nextInt();
			soma += numero;
		}
		System.out.println("M�dia: "+(soma/10));
		
		entrada.close();
	}

}

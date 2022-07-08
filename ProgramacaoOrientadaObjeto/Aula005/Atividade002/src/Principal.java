import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um número: ");
		double numero = entrada.nextDouble();
		
		if(numero > 0) {
			System.out.println("O número é maior que 0");
		}else {
			System.out.println("O número é menor ou igual a 0");
		}
		
		entrada.close();
	}

}

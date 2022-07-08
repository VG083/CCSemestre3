import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		System.out.println("Digite seu peso: ");
		Scanner entrada = new Scanner(System.in);
		double peso = entrada.nextDouble();
		System.out.println("Digite sua altura: ");
		double altura = entrada.nextDouble();
		
		System.out.println("\nPeso: " + peso + " | Altura: " + altura);
		entrada.close();
	}

}

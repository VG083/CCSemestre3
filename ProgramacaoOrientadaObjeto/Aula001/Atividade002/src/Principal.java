import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double inicio = System.currentTimeMillis();
		System.out.println("Qual seu ano de nascimento?");
		Scanner teclado = new Scanner(System.in);
		int idade = teclado.nextInt();
		System.out.print("Sua idade é " + (2022-idade));
		teclado.close();
		double fim = System.currentTimeMillis();
		double total = fim - inicio;
		System.out.println("\nO tempo de execução foi " + total);
	}

}

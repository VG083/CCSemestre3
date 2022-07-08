import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double inicio = System.currentTimeMillis();
		System.out.println("Bom dia. Qual seu nome?");
		Scanner teclado = new Scanner(System.in);
		String nome = teclado.nextLine();
		System.out.println("Bom dia " + nome);
		teclado.close();
		double fim = System.currentTimeMillis();
		double total = fim - inicio;
		System.out.println("O tempo de execução foi " + total);
	}

}

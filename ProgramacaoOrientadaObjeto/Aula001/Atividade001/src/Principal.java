import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		System.out.println("digite um numero: ");
		int n1 = teclado.nextInt();
		System.out.println("digite agora um nome: ");
		teclado.nextLine();
		String nome = teclado.nextLine();
		System.out.println("O número digitado foi "+ n1 + " e o nome foi " + nome);
		teclado.close();
	}

}

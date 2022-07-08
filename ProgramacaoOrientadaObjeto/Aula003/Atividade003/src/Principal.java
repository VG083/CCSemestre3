import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o nome do funcionário: ");
		String nome = entrada.nextLine();
		System.out.println("Valor da hora de trabalho: ");
		double valor = Double.parseDouble(entrada.next());
		System.out.println("Horas trabalhadas: ");
		double hora = Double.parseDouble(entrada.next());
		
		System.out.println("\nFuncionário: " + nome);
		System.out.println("Valor da hora: " + valor + " | Horas trabalhadas: " + hora);
		System.out.println("\nTotal a receber: " + (valor*hora));
		
		entrada.close();
	}

}

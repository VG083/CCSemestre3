import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double num1, num2;
		String continua;
		
		do {
			System.out.println("Digite o primeiro número: ");
			num1 = entrada.nextDouble();
			System.out.println("Digite o segundo número: ");
			num2 = entrada.nextDouble();
			
			System.out.println("Soma: "+(num1+num2));
			System.out.println("Subtração: "+(num1-num2));
			System.out.println("Multiplicação: "+(num1*num2));
			System.out.println("Divisão: "+(num1/num2));
			
			System.out.println("Deseja continuar? (sim ou nao)");
			continua = entrada.next();
		}while(!continua.equals("nao"));
		
		System.out.println("\nFIM DO PROGRAMA");
	}

}

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double num1, num2;
		String continua;
		
		do {
			System.out.println("Digite o primeiro n�mero: ");
			num1 = entrada.nextDouble();
			System.out.println("Digite o segundo n�mero: ");
			num2 = entrada.nextDouble();
			
			System.out.println("Soma: "+(num1+num2));
			System.out.println("Subtra��o: "+(num1-num2));
			System.out.println("Multiplica��o: "+(num1*num2));
			System.out.println("Divis�o: "+(num1/num2));
			
			System.out.println("Deseja continuar? (sim ou nao)");
			continua = entrada.next();
		}while(!continua.equals("nao"));
		
		System.out.println("\nFIM DO PROGRAMA");
	}

}

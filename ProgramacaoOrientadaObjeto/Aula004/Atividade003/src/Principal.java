import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int num;
		
		System.out.println("Digite um número: ");
		num = entrada.nextInt();
		
		if(num >= 0) {
			System.out.println("Positivo");
		}else{
			System.out.println("Negativo");
		}
		
		entrada.close();
	}

}
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um n�mero: ");
		double numero = entrada.nextDouble();
		
		if(numero > 0) {
			System.out.println("O n�mero � maior que 0");
		}else {
			System.out.println("O n�mero � menor ou igual a 0");
		}
		
		entrada.close();
	}

}

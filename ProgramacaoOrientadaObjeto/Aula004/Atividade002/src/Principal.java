import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int idade;
		
		System.out.println("Digite sua idade: ");
		idade = entrada.nextInt();
		
		if(idade >= 18) {
			System.out.println("Pode dirigir");
		}else{
			System.out.println("N�o pode dirigir");
		}
		
		entrada.close();
	}

}

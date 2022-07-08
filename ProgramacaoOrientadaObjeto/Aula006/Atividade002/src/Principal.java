import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int i, idade, maior = 0;
		
		for(i=1; i<=10; i++) {
			System.out.println("Digite uma idade");
			idade = entrada.nextInt();
			if(maior < idade){
				maior = idade;
			}
			
		}
		System.out.println("Maior idade: "+maior);
		
		entrada.close();
	}

}
